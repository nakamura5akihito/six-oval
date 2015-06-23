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

import io.opensec.six.oval.model.common.CheckEnumeration;
import io.opensec.six.oval.model.common.DatatypeEnumeration;
import io.opensec.six.oval.model.common.OperationEnumeration;



/**
 * The EntityStateIOSVersionType type is extended by the entities of an individual OVAL State.
 * This specific type represents the version string related to CISCO IOS.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class EntityStateIOSVersionType
    extends EntityStateSimpleBaseType
{

//    public static final DatatypeEnumeration  DEFAULT_DATATYPE = DatatypeEnumeration.STRING;
    //{optional, default="string"}



    /**
     * Constructor.
     */
    public EntityStateIOSVersionType()
    {
    }


    public EntityStateIOSVersionType(
                    final String content
                    )
    {
        super( content );
    }


    public EntityStateIOSVersionType(
                    final DatatypeEnumeration datatype,
                    final OperationEnumeration operation,
                    final Boolean mask,
                    final String var_ref,
                    final CheckEnumeration var_check,
                    final String content
                    )
    {
        super( datatype, operation, mask, var_ref, var_check, content );
    }


    public EntityStateIOSVersionType(
                    final String datatype,
                    final String operation,
                    final Boolean mask,
                    final String var_ref,
                    final String var_check,
                    final String content
                    )
    {
        super( datatype, operation, mask, var_ref, var_check, content );
    }



    //**************************************************************
    //  EntityBase
    //**************************************************************

    @Override
    public void setDatatype(
                    final DatatypeEnumeration datatype
                    )
    {
        if (datatype != null) {
            if (datatype == DatatypeEnumeration.IOS_VERSION
                            ||  datatype == DEFAULT_DATATYPE
                            ) {
                // xsd:restriction satisfied.
            } else {
                throw new IllegalArgumentException( "invalid datatype: " + datatype);
            }
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

        if (!(obj instanceof EntityStateIOSVersionType)) {
            return false;
        }

        return super.equals( obj );
    }

}
//
