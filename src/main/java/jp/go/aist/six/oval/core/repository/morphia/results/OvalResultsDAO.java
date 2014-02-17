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
package jp.go.aist.six.oval.core.repository.morphia.results;

import java.util.Collection;
import java.util.UUID;
import jp.go.aist.six.oval.model.definitions.OvalDefinitions;
import jp.go.aist.six.oval.model.results.OvalResults;
import jp.go.aist.six.oval.model.results.ResultsType;
import jp.go.aist.six.oval.model.results.SystemType;
import jp.go.aist.six.oval.model.sc.OvalSystemCharacteristics;
import jp.go.aist.six.util.core.repository.morphia.BaseDAO;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.DAO;



/**
 * @author  Akihito Nakamura, AIST
 * @version $Id: OvalResultsDAO.java 3110 2013-04-26 10:41:44Z nakamura5akihito@gmail.com $
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

