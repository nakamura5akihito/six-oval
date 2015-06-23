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
 * The EntityStateComplexBaseType complex type is an abstract type
 * that extends the EntityComplexBaseType and is used by some entities within an OVAL State.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class EntityObjectRecordType
    extends EntityComplexBaseType
{

    private final Collection<EntityObjectFieldType>  field =
            new ArrayList<EntityObjectFieldType>();
    //{0..*}



    /**
     * Constructor.
     */
    public EntityObjectRecordType()
    {
    }


    public EntityObjectRecordType(
                    final DatatypeEnumeration datatype,
                    final OperationEnumeration operation,
                    final Boolean mask,
                    final String var_ref,
                    final CheckEnumeration var_check
                    )
    {
        super( datatype, operation, mask, var_ref, var_check );
    }


    public EntityObjectRecordType(
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
                    final Collection<? extends EntityObjectFieldType> fields
                    )
    {
        if (field != fields) {
            field.clear();
            if (fields != null  &&  fields.size() > 0) {
                for (EntityObjectFieldType  p : fields) {
                    addField( p );
                }
            }
        }
    }


    public boolean addField(
                    final EntityObjectFieldType field
                    )
    {
        if (field == null) {
            throw new IllegalArgumentException( "empty field" );
        }

        return this.field.add( field );
    }


    public Collection<EntityObjectFieldType> getField()
    {
        return field;
    }


    public Iterator<EntityObjectFieldType> iterateField()
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

        Collection<EntityObjectFieldType>  field = getField();
        result = prime * result + ((field == null) ? 0 : field.hashCode());

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

        if (!(obj instanceof EntityObjectRecordType)) {
            return false;
        }

        EntityObjectRecordType  other = (EntityObjectRecordType)obj;
        Collection<EntityObjectFieldType>  other_field = other.getField();
        Collection<EntityObjectFieldType>   this_field =  this.getField();
        if (this_field == other_field
                        ||  (this_field != null  &&  other_field != null
                                        &&  this_field.size() == other_field.size()
                                        &&  this_field.containsAll( other_field ))) {
            return true;
        }

        return super.equals( obj );
    }

}
//
