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
package io.opensec.six.oval.model.linux;

import io.opensec.six.oval.model.definitions.EntityStateStringType;



/**
 * The EntityStateRpmVerifyResultType restricts a string value
 * to the set of possible outcomes of checking an attribute of a file
 * included in an RPM against the actual value of that attribute in the RPM database.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class EntityStateRpmVerifyResultType
    extends EntityStateStringType
{

    /**
     * Constructor.
     */
    public EntityStateRpmVerifyResultType()
    {
    }


//    public EntityStateRegistryTypeType(
//                    final String data
//                    )
//    {
//        this( data, DEFAULT_OPERATION );
//    }
//
//
//    public EntityStateRegistryTypeType(
//                    final String data,
//                    final OperationEnumeration operation
//                    )
//    {
//        this( data, FIXED_DATATYPE, operation );
//    }
//
//
//    public EntityStateRegistryTypeType(
//                    final String data,
//                    final DatatypeEnumeration datatype,
//                    final OperationEnumeration operation
//                    )
//    {
//        super( data, datatype, operation );
//    }
//
//
//    public EntityStateRegistryTypeType(
//                    final RegistryTypeEnumeration data
//                    )
//    {
//        this( data, DEFAULT_OPERATION );
//    }
//
//
//    public EntityStateRegistryTypeType(
//                    final RegistryTypeEnumeration data,
//                    final Operation operation
//                    )
//    {
//        this( (data == null ? null : data.getName()), operation );
//    }



    //**************************************************************
    //  EntitySimpleBaseType
    //**************************************************************

    @Override
    public void setContent(
                    final String content
                    )
    {
        if (content != null) {
            RpmVerifyResultEnumeration.fromValue( content );
        }

        super.setContent( content );
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

        if (!(obj instanceof EntityStateRpmVerifyResultType)) {
            return false;
        }

        return super.equals( obj );
    }

}
//
