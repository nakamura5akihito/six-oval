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
package io.opensec.six.oval.core.repository.morphia.results;

import io.opensec.six.oval.model.definitions.OvalDefinitions;
import io.opensec.six.oval.model.results.OvalResults;
import io.opensec.six.oval.model.results.ResultsType;
import io.opensec.six.oval.model.results.SystemType;
import io.opensec.six.oval.model.sc.OvalSystemCharacteristics;
import io.opensec.util.core.repository.morphia.BaseDAO;
import java.util.Collection;
import java.util.UUID;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.DAO;



/**
 * @author  Akihito Nakamura, AIST
 */
public class OvalResultsDAO
    extends BaseDAO<OvalResults, String>
{

    /**
     */
    public OvalResultsDAO(
                    final Datastore ds
                    )
    {
        super( OvalResults.class, ds );
    }



    //*********************************************************************
    //  DAO
    //*********************************************************************

    @Override
    public Key<OvalResults> save(
                    final OvalResults oval_results
                    )
    {
        String  pid = oval_results.getPersistentID();
        if (pid == null) {
            pid = UUID.randomUUID().toString();
            oval_results.setPersistentID( pid );
        }


        //oval_definitions
        OvalDefinitions  oval_definitions = oval_results.getOvalDefinitions();
        if (oval_definitions != null) {
            DAO<OvalDefinitions, String>  defs_dao = _getForwardingDAO( OvalDefinitions.class );
            defs_dao.save( oval_definitions );
        }

        //oval_system_characteristics
        ResultsType  results = oval_results.getResults();
        if (results != null) {
            Collection<SystemType> systems = results.getSystem();
            if (systems != null) {
                DAO<OvalSystemCharacteristics, String>  sc_dao = _getForwardingDAO( OvalSystemCharacteristics.class );
                for (SystemType  s : systems) {
                    OvalSystemCharacteristics  oval_sc = s.getOvalSystemCharacteristics();
                    sc_dao.save( oval_sc );
                }
            }
        }

        return super.save( oval_results );
    }

}
//

