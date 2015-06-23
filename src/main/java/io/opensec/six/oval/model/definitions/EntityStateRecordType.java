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
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



/**
 * The EntityStateRecordType defines an entity that
 * consists of a number of uniquely named fields.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class EntityStateRecordType
    extends EntityStateComplexBaseType
{

    private final Collection<EntityStateFieldType>  field =
        new ArrayList<EntityStateFieldType>();



    /**
     * Constructor.
     */
    public EntityStateRecordType()
    {
    }


    public EntityStateRecordType(
                    final DatatypeEnumeration datatype,
                    final OperationEnumeration operation,
                    final Boolean mask,
                    final String var_ref,
                    final CheckEnumeration var_check
                    )
    {
        super( datatype, operation, mask, var_ref, var_check );
    }


    public EntityStateRecordType(
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
    public void setField(
                    final Collection<? extends EntityStateFieldType> fieldList
                    )
    {
        if (field != fieldList) {
            field.clear();
            if (fieldList != null  &&  fieldList.size() > 0) {
                for (EntityStateFieldType  p : fieldList) {
                    addField( p );
                }
            }
        }
    }


    public boolean addField(
                    final EntityStateFieldType field
                    )
    {
        if (field == null) {
            throw new IllegalArgumentException( "empty field" );
        }

        return this.field.add( field );
    }


    public Collection<EntityStateFieldType> getField()
    {
        return field;
    }


    public Iterator<EntityStateFieldType> iterateField()
    {
        return getField().iterator();
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public int hashCode()
    {
        final int  prime = 37;
        int  result = super.hashCode();

        Collection<EntityStateFieldType>  field = getField();
        result = prime * result + ((field == null) ? 0 : field.hashCode());

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

        if (!(obj instanceof EntityStateRecordType)) {
            return false;
        }

        EntityStateRecordType  other = (EntityStateRecordType)obj;
        Collection<EntityStateFieldType>  other_field = other.getField();
        Collection<EntityStateFieldType>   this_field =  this.getField();
        if (this_field == other_field
                        ||  (this_field != null  &&  other_field != null
                                        &&  this_field.size() == other_field.size()
                                        &&  this_field.containsAll( other_field ))) {
            return true;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return super.toString()
                        + ", field=" + getField()
                        ;
    }

}
//EntityStateRecordType
