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

import io.opensec.six.oval.model.common.DatatypeEnumeration;



/**
 * The EntityBoolType type is extended by the entities of an individual OVAL Object.
 * This specific type describes simple boolean data.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class EntityObjectBoolType
    extends EntitySimpleBaseType
{

    public static final DatatypeEnumeration  FIXED_DATATYPE = DatatypeEnumeration.BOOLEAN;



    /**
     * Constructor.
     */
    public EntityObjectBoolType()
    {
    }


    public EntityObjectBoolType(
                    final String data
                    )
    {
        super( data );
    }
//
//
//    public EntityObjectStringType(
//                    final String data,
//                    final Operation operation
//                    )
//    {
//        this( data, FIXED_DATATYPE, operation );
//    }
//
//
//    public EntityObjectStringType(
//                    final String data,
//                    final Datatype datatype,
//                    final Operation operation
//                    )
//    {
//        super( data, datatype, operation );
//    }
//
//
//    public EntityObjectStringType(
//                    final String varRef,
//                    final Check varCheck
//                    )
//    {
//        super( varRef, varCheck );
//    }



    //**************************************************************
    //  EntityBase
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


//    @Override
//    public DatatypeEnumeration getDatatype()
//    {
//        return FIXED_DATATYPE;
//    }



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

        if (!(obj instanceof EntityObjectBoolType)) {
            return false;
        }

        return super.equals( obj );
    }

}
//
