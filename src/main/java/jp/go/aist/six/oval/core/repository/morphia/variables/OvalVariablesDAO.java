/**
 * SIX OVAL - http://code.google.com/p/six-oval/
 * Copyright (C) 2010
 *   National Institute of Advanced Industrial Science and Technology (AIST)
 *   Registration Number: H22PRO-1124
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
package jp.go.aist.six.oval.core.repository.morphia.variables;

import java.util.UUID;
import jp.go.aist.six.oval.model.variables.OvalVariables;
import jp.go.aist.six.oval.model.variables.VariableType;
import jp.go.aist.six.oval.model.variables.VariablesType;
import jp.go.aist.six.util.core.repository.morphia.BaseDAO;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.DAO;



/**
 * @author  Akihito Nakamura, AIST
 * @version $Id: OvalVariablesDAO.java 3110 2013-04-26 10:41:44Z nakamura5akihito@gmail.com $
 */
public class OvalVariablesDAO
    extends BaseDAO<OvalVariables, String>
{

    /**
     */
    public OvalVariablesDAO(
                    final Datastore ds
                    )
    {
        super( OvalVariables.class, ds );
    }



    //*********************************************************************
    //  DAO
    //*********************************************************************

    @Override
    public Key<OvalVariables> save(
                    final OvalVariables oval_variables
                    )
    {
        String  pid = oval_variables.getPersistentID();
        if (pid == null) {
            pid = UUID.randomUUID().toString();
            oval_variables.setPersistentID( pid );
        }

        VariablesType  variables = oval_variables.getVariables();
        if (variables != null) {
            DAO<VariableType, String>  dao = _getForwardingDAO( VariableType.class );
            for (VariableType  variable : variables.getVariable()) {
//                variable.ovalSetGenerator( oval_variables.getGenerator() );
                dao.save( variable );
            }
        }

        return super.save( oval_variables );
    }

}
//

