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

import io.opensec.six.oval.model.definitions.DefinitionType;
import io.opensec.six.oval.model.definitions.DefinitionsElementAssoc;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.DAO;



/**
 * @author  Akihito Nakamura, AIST
 */
public class DefinitionDAO
    extends DefinitionsElementDAO<DefinitionType>
{

    /**
     */
    public DefinitionDAO(
                    final Datastore ds
                    )
    {
        super( DefinitionType.class, ds );
    }



    //*********************************************************************
    //  DAO
    //*********************************************************************

    @Override
    public Key<DefinitionType> save(
                    final DefinitionType def
                    )
    {
        DAO<DefinitionsElementAssoc, String>  assoc_dao = _getForwardingDAO( DefinitionsElementAssoc.class );
        DefinitionsElementAssoc  assoc = new DefinitionsElementAssoc( def );
        assoc_dao.save( assoc );

        return super.save( def );
    }

}
//

