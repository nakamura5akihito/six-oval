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
package io.opensec.six.oval.core.repository.morphia.sc;

import io.opensec.six.oval.model.sc.OvalSystemCharacteristics;
import io.opensec.util.core.repository.morphia.BaseDAO;
import java.util.UUID;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;



/**
 * @author  Akihito Nakamura, AIST
 */
public class OvalSystemCharacteristicsDAO
    extends BaseDAO<OvalSystemCharacteristics, String>
{

    /**
     */
    public OvalSystemCharacteristicsDAO(
                    final Datastore ds
                    )
    {
        super( OvalSystemCharacteristics.class, ds );
    }



    //*********************************************************************
    //  DAO
    //*********************************************************************

    @Override
    public Key<OvalSystemCharacteristics> save(
                    final OvalSystemCharacteristics oval_sc
                    )
    {
        String  pid = oval_sc.getPersistentID();
        if (pid == null) {
            pid = UUID.randomUUID().toString();
            oval_sc.setPersistentID( pid );
        }

        return super.save( oval_sc );
    }

}
//

