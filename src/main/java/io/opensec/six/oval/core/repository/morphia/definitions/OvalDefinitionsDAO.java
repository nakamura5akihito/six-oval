/**
 * SIX OVAL - https://nakamura5akihito.github.io/
 * Copyright (C) 2010 Akihito Nakamura
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.opensec.six.oval.core.repository.morphia.definitions;

import io.opensec.six.oval.model.common.GeneratorType;
import io.opensec.six.oval.model.definitions.DefinitionType;
import io.opensec.six.oval.model.definitions.DefinitionsType;
import io.opensec.six.oval.model.definitions.OvalDefinitions;
import io.opensec.six.oval.model.definitions.StateType;
import io.opensec.six.oval.model.definitions.StatesType;
import io.opensec.six.oval.model.definitions.SystemObjectType;
import io.opensec.six.oval.model.definitions.SystemObjectsType;
import io.opensec.six.oval.model.definitions.TestType;
import io.opensec.six.oval.model.definitions.TestsType;
import io.opensec.six.oval.model.definitions.VariableType;
import io.opensec.six.oval.model.definitions.VariablesType;
import io.opensec.util.core.repository.morphia.BaseDAO;
import java.util.UUID;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.DAO;
import org.mongodb.morphia.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * @author  Akihito Nakamura, AIST
 */
public class OvalDefinitionsDAO
    extends BaseDAO<OvalDefinitions, String>
{

    /**
     * Logger.
     */
    private static final Logger  _LOG_ = LoggerFactory.getLogger( OvalDefinitionsDAO.class );



    /**
     */
    public OvalDefinitionsDAO(
                    final Datastore ds
                    )
    {
        super( OvalDefinitions.class, ds );
    }



    protected Key<OvalDefinitions> _findUniqueKey(
                    final OvalDefinitions oval_definitions
                    )
    {
        Query<OvalDefinitions>  q = createQuery();

        GeneratorType  generator = oval_definitions.getGenerator();
        q.filter( "generator.timestamp",      generator.getTimestamp() );
        q.filter( "generator.schema_version", generator.getSchemaVersion() );

        String  digest = oval_definitions.getDefinitionsDigest();
        q.filter( "definitions_digest", digest );

        _LOG_.debug( "find unique: query=" + q );
        Key<OvalDefinitions>  id = find( q ).getKey();
        _LOG_.debug( "find unique: id=" + id );

        return id;
    }



    protected Key<OvalDefinitions> _findExistingKey(
                    final OvalDefinitions oval_definitions
                    )
    {
        Query<OvalDefinitions>  q = createQuery();

        String  pid = oval_definitions.getPersistentID();
        if (pid == null) {
            GeneratorType  generator = oval_definitions.getGenerator();
            q.filter( "generator.timestamp",      generator.getTimestamp() );
            q.filter( "generator.schema_version", generator.getSchemaVersion() );

            String  digest = oval_definitions.getDefinitionsDigest();
            q.filter( "definitions_digest", digest );

        } else {
            q.filter( "_id", oval_definitions.getPersistentID() );
        }

        _LOG_.debug( "find existing key: query=" + q );
        Key<OvalDefinitions>  key = find( q ).getKey();
        _LOG_.debug( "find existing key: found key=" + key );

        return key;
    }



    //*********************************************************************
    //  DAO
    //*********************************************************************

    @Override
    public Key<OvalDefinitions> save(
                    final OvalDefinitions oval_definitions
                    )
    {
        Key<OvalDefinitions>  key = _findExistingKey( oval_definitions );
        if (key != null) {
            oval_definitions.setPersistentID( String.valueOf( key.getId() ) );
            _LOG_.debug( "equivalent OvalDefinitions already exists: ID=" + oval_definitions.getPersistentID() );
            return key;
        }

        String  pid = oval_definitions.getPersistentID();
        if (pid == null) {
            pid = UUID.randomUUID().toString();
            oval_definitions.setPersistentID( pid );
        }


        VariablesType  variables = oval_definitions.getVariables();
        if (variables != null) {
            DAO<VariableType, String>  dao = _getForwardingDAO( VariableType.class );
            for (VariableType  variable : variables.getVariable()) {
                _LOG_.debug( "saving Variable: OVAL ID=" + variable.getOvalId() );
                variable.ovalSetGenerator( oval_definitions.getGenerator() );
                dao.save( variable );
            }
        }

        StatesType  states = oval_definitions.getStates();
        if (states != null) {
            DAO<StateType, String>  dao = _getForwardingDAO( StateType.class );
            for (StateType  state : states.getState()) {
                _LOG_.debug( "saving State: OVAL ID=" + state.getOvalId() );
                state.ovalSetGenerator( oval_definitions.getGenerator() );
                dao.save( state );
            }
        }

        SystemObjectsType  objects = oval_definitions.getObjects();
        if (objects != null) {
            DAO<SystemObjectType, String>  dao = _getForwardingDAO( SystemObjectType.class );
            for (SystemObjectType  object : objects.getObject()) {
                _LOG_.debug( "saving Object: OVAL ID=" + object.getOvalId() );
                object.ovalSetGenerator( oval_definitions.getGenerator() );
                dao.save( object );
            }
        }

        TestsType  tests = oval_definitions.getTests();
        if (tests != null) {
            DAO<TestType, String>  dao = _getForwardingDAO( TestType.class );
            for (TestType  test : tests.getTest()) {
                _LOG_.debug( "saving Test: OVAL ID=" + test.getOvalId() );
                test.ovalSetGenerator( oval_definitions.getGenerator() );
                dao.save( test );
            }
        }

        DefinitionsType  definitions = oval_definitions.getDefinitions();
        if (definitions != null) {
            DAO<DefinitionType, String>  dao = _getForwardingDAO( DefinitionType.class );
            for (DefinitionType  definition : definitions.getDefinition()) {
                _LOG_.debug( "saving Definition: OVAL ID=" + definition.getOvalId() );

                //TODO: for NETSAP2013, deprecated Definitions are ignored.
                // If deprecated definitions are NOT saved, they must be removed
                // from the Definitions list.
                // Otherwise, saving oval_definitions cause ERROR because
                // some Definitions have NULL @Id _id values.
                // For example, the Mitre's Solaris vuln XML contains
                // deprecated Definitions, e.g. oval:org.mitre.oval:def:1163.
//                if (definition.getDeprecated() == Boolean.TRUE) {
//                    continue;
//                }

                definition.ovalSetGenerator( oval_definitions.getGenerator() );
                dao.save( definition );
            }
        }

        //compute the digest!!!
        oval_definitions.getDefinitionsDigest();

        _LOG_.debug( "saving OvalDefinitions: ID=" + oval_definitions.getPersistentID() );
        return super.save( oval_definitions );
    }

//    @Override
//    public Key<OvalDefinitions> save(
//                    final OvalDefinitions oval_definitions
//                    )
//    {
//        Key<OvalDefinitions>  key = _findUniqueKey( oval_definitions );
//        if (key != null) {
//            oval_definitions.setPersistentID( String.valueOf( key.getId() ) );
//            return key;
//        }
//
//
//        VariablesType  variables = oval_definitions.getVariables();
//        if (variables != null) {
//            DAO<VariableType, String>  dao = _getForwardingDAO( VariableType.class );
//            for (VariableType  variable : variables.getVariable()) {
//                variable.generator( oval_definitions.getGenerator() );
//                dao.save( variable );
//            }
//        }
//
//        StatesType  states = oval_definitions.getStates();
//        if (states != null) {
//            DAO<StateType, String>  dao = _getForwardingDAO( StateType.class );
//            for (StateType  state : states.getState()) {
//                state.generator( oval_definitions.getGenerator() );
//                dao.save( state );
//            }
//        }
//
//        SystemObjectsType  objects = oval_definitions.getObjects();
//        if (objects != null) {
//            DAO<SystemObjectType, String>  dao = _getForwardingDAO( SystemObjectType.class );
//            for (SystemObjectType  object : objects.getObject()) {
//                object.generator( oval_definitions.getGenerator() );
//                dao.save( object );
//            }
//        }
//
//        TestsType  tests = oval_definitions.getTests();
//        if (tests != null) {
//            DAO<TestType, String>  dao = _getForwardingDAO( TestType.class );
//            for (TestType  test : tests.getTest()) {
//                test.generator( oval_definitions.getGenerator() );
//                dao.save( test );
//            }
//        }
//
//        DefinitionsType  definitions = oval_definitions.getDefinitions();
//        if (definitions != null) {
//            DAO<DefinitionType, String>  dao = _getForwardingDAO( DefinitionType.class );
//            for (DefinitionType  definition : definitions.getDefinition()) {
//                definition.generator( oval_definitions.getGenerator() );
//                dao.save( definition );
//            }
//        }
//
//        //compute the digest!!!
//        oval_definitions.getDefinitionsDigest();
//
//        return super.save( oval_definitions );
//    }
}
// OvalDefinitionsDAO

