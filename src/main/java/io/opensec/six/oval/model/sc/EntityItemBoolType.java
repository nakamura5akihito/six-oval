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
package io.opensec.six.oval.model.sc;

import io.opensec.six.oval.model.common.DatatypeEnumeration;



/**
 * The EntityItemBoolType is extended by the entities of an individual item.
 * This type provides uniformity to each entity by including the attributes
 * found in the EntityItemSimpleBaseType.
 * This specific type describes simple boolean data.
 * The empty string is also allowed for cases where there was an error
 * in the data collection of an entity and a status needs to be reported.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class EntityItemBoolType
    extends EntityItemSimpleBaseType
{

    public static final DatatypeEnumeration  FIXED_DATATYPE =
        DatatypeEnumeration.BOOLEAN;
    //{required, fixed="boolean"}



    /**
     * Constructor.
     */
    public EntityItemBoolType()
    {
    }


    public EntityItemBoolType(
                    final String content
                    )
    {
        super( content );
    }



    //**************************************************************
    //  EntityItemBase
    //**************************************************************

    @Override
    public void setDatatype(
                    final DatatypeEnumeration datatype
                    )
    {
        if (datatype != null  &&  datatype != FIXED_DATATYPE) {
            throw new IllegalArgumentException( "invalid datatype: " + datatype);
        }

        super.setDatatype( datatype );
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public int hashCode()
    {
        return super.hashCode();
    }



    @Override
    public boolean equals(
                    final Object obj
                    )
    {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityItemBoolType)) {
            return false;
        }

        return super.equals( obj );
    }

}
// EntityItemBoolType
