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
 * The EntityStateComplexBaseType complex type is an abstract type
 * that extends the EntityComplexBaseType and is used by some entities within an OVAL State.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public abstract class EntityStateComplexBaseType
    extends EntityComplexBaseType
{

    public static final CheckEnumeration  DEFAULT_ENTITY_CHECK =
        CheckEnumeration.ALL;

    private CheckEnumeration  entity_check;
    //{optional, default="all"}



    /**
     * Constructor.
     */
    public EntityStateComplexBaseType()
    {
    }


    public EntityStateComplexBaseType(
                    final DatatypeEnumeration datatype,
                    final OperationEnumeration operation,
                    final Boolean mask,
                    final String var_ref,
                    final CheckEnumeration var_check
                    )
    {
        super( datatype, operation, mask, var_ref, var_check );
    }


    public EntityStateComplexBaseType(
                    final String datatype,
                    final String operation,
                    final Boolean mask,
                    final String var_ref,
                    final String var_check
                    )
    {
        super( datatype, operation, mask, var_ref, var_check );
    }



    /**
     */
    public void setEntityCheck(
                    final CheckEnumeration entity_check
                    )
    {
        this.entity_check = entity_check;
    }


    public CheckEnumeration getEntityCheck()
    {
        return entity_check;
    }


    public static CheckEnumeration entityCheck(
                    final EntityStateComplexBaseType obj
                    )
    {
        if (obj == null) {
            throw new IllegalArgumentException( "null EntityStateComplexBaseType" );
        }

        CheckEnumeration  entity_check = obj.getEntityCheck();
        return (entity_check == null ? DEFAULT_ENTITY_CHECK : entity_check);
    }




    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public int hashCode()
    {
        final int  prime = 37;
        int  result = super.hashCode();

        result = prime * result + entityCheck( this ).hashCode();

        return result;
    }



    @Override
    public boolean equals(
                    final Object obj
                    )
    {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityStateComplexBaseType)) {
            return false;
        }

        if (super.equals( obj )) {
            EntityStateComplexBaseType  other = (EntityStateComplexBaseType)obj;
            if (entityCheck( this ) == entityCheck( other )) {
                return true;
            }
        }

        return false;
    }



    @Override
    public String toString()
    {
        return super.toString()
                        + ", entity_check=" + getEntityCheck()
                        ;
    }

}
//EntityStateComplexBaseType
