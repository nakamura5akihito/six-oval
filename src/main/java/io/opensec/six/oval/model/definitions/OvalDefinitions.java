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
package io.opensec.six.oval.model.definitions;

import io.opensec.six.oval.model.common.AbstractDocument;
import io.opensec.six.oval.model.common.GeneratorType;
import org.mongodb.morphia.annotations.Entity;



/**
 * An OVAL Definition Document.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
@Entity( "oval.def.oval_definitions" )
public class OvalDefinitions
    extends AbstractDocument
{

//    private GeneratorType  generator = new GeneratorType();
//    //{1..1}


    private DefinitionsType  definitions;
    //{0..1}


    private TestsType  tests;
    //{0..1}


    private SystemObjectsType  objects;
    //{0..1}


    private StatesType  states;
    //{0..1}


    private VariablesType  variables;
    //{0..1}


    private String  definitions_digest;



    /**
     * Constructor.
     */
    public OvalDefinitions()
    {
    }


    public OvalDefinitions(
                    final GeneratorType generator
                    )
    {
        super( generator );
//        setGenerator( generator );
    }



//    /**
//     */
//    public void setGenerator(
//                    final GeneratorType generator
//                    )
//    {
//        this.generator = generator;
//    }
//
//
//    public GeneratorType getGenerator()
//    {
//        return this.generator;
//    }



//    /**
//     */
//    public void setDefinitions(
//                    final Collection<? extends DefinitionType> definitionList
//                    )
//    {
//        if (this.definitions != definitionList) {
//            this.definitions.clear();
//            if (definitionList != null  &&  definitionList.size() > 0) {
//                this.definitions.addAll( definitionList );
//            }
//        }
//    }
//
//
//    public Collection<DefinitionType> getDefinitions()
//    {
//        return this.definitions;
//    }
//
//
//    public Iterator<DefinitionType> iterateDefinitions()
//    {
//        return this.definitions.iterator();
//    }

    /**
     */
    public void setDefinitions(
                    final DefinitionsType definitions
                    )
    {
        this.definitions = definitions;
    }


    public DefinitionsType getDefinitions()
    {
        return definitions;
    }


    public OvalDefinitions definition(
                    final DefinitionType definition
                    )
    {
        DefinitionsType  defs = getDefinitions();
        if (defs == null) {
            defs = new DefinitionsType();
            setDefinitions( defs );
        }
        defs.add( definition );

        return this;
    }



    /**
     */
    public void setTests(
                    final TestsType tests
                    )
    {
        this.tests = tests;
    }


    public TestsType getTests()
    {
        return tests;
    }


    public OvalDefinitions test(
                    final TestType test
                    )
    {
        TestsType  tests = getTests();
        if (tests == null) {
            tests = new TestsType();
            setTests( tests );
        }
        tests.add( test );

        return this;
    }



    /**
     */
    public void setObjects(
                    final SystemObjectsType objects
                    )
    {
        this.objects = objects;
    }


    public SystemObjectsType getObjects()
    {
        return objects;
    }


    public OvalDefinitions object(
                    final SystemObjectType object
                    )
    {
        SystemObjectsType  objects = getObjects();
        if (objects == null) {
            objects = new SystemObjectsType();
            setObjects( objects );
        }
        objects.add( object );

        return this;
    }



    /**
     */
    public void setStates(
                    final StatesType states
                    )
    {
        this.states = states;
    }


    public StatesType getStates()
    {
        return states;
    }


    public OvalDefinitions state(
                    final StateType state
                    )
    {
        StatesType  states = getStates();
        if (states == null) {
            states = new StatesType();
            setStates( states );
        }
        states.add( state );

        return this;
    }



    /**
     */
    public void setVariables(
                    final VariablesType variables
                    )
    {
        this.variables = variables;
    }


    public VariablesType getVariables()
    {
        return variables;
    }


    public OvalDefinitions variable(
                    final VariableType variable
                    )
    {
        VariablesType  variables = getVariables();
        if (variables == null) {
            variables = new VariablesType();
            setVariables( variables );
        }
        variables.add( variable );

        return this;
    }



    /**
     */
    public void setDefinitionsDigest(
                    final String digest
                    )
    {
        // Do nothing!!! - the value is computed and cached in OvalElementContainer.
//        this._definitions_digest = digest;
    }


    public String getDefinitionsDigest()
    {
        //Morphia
        definitions_digest =
            (definitions == null ? null : definitions.getDigest());

        return definitions_digest;
    }



//    public Definition getDefinition(
//                    final String id
//                    )
//    {
//        Definitions  definitions = getDefinitions();
//        return (definitions == null ? null : definitions.find( id ));
//    }



//    public Test getTest(
//                    final String id
//                    )
//    {
//        Tests  tests = getTests();
//        return (tests == null ? null : tests.find( id ));
//    }
//
//
//
//    public SystemObject getObject(
//                    final String id
//                    )
//    {
//        SystemObjects  objects = getObjects();
//        return (objects == null ? null : objects.find( id ));
//    }
//
//
//
//    public State getState(
//                    final String id
//                    )
//    {
//        States  states = getStates();
//        return (states == null ? null : states.find( id ));
//    }



    //**************************************************************
    //  OvalDocument
    //**************************************************************

//    @Override
//    public String getSchemaLocation()
//    {
//        return DEFINITIONS_SCHEMA_LOCATION;
//    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        DefinitionsType  definitions = getDefinitions();
        TestsType  tests = getTests();
        SystemObjectsType  objects = getObjects();
        StatesType  states = getStates();
        VariablesType  variables = getVariables();

        return "oval_definitions[generator=" + getGenerator()
                        + ", #definitions="
                        + (definitions == null ? 0 : definitions.size())
//                        + ", definitions=" + String.valueOf( definitions )
                        + ", #tests="
                        + (tests == null ? 0 : tests.getTest().size())
//                        + ", tests=" + String.valueOf( tests )
                        + ", #objects="
                        + (objects == null ? 0 : objects.size())
//                        + ", objects=" + String.valueOf( objects )
                        + ", #states="
                        + (states == null ? 0 : states.size())
                        + ", #variables="
                        + (variables == null ? 0 : variables.size())
                        + "]";
    }

}
//OvalDefinitions
