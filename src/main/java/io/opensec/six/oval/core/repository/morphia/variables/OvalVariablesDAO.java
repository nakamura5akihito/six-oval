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
package io.opensec.six.oval.core.repository.morphia.variables;

import io.opensec.six.oval.model.variables.OvalVariables;
import io.opensec.six.oval.model.variables.VariableType;
import io.opensec.six.oval.model.variables.VariablesType;
import io.opensec.util.core.repository.morphia.BaseDAO;
import java.util.UUID;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.DAO;



/**
 * @author  Akihito Nakamura, AIST
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

