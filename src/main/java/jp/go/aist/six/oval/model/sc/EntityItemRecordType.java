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
package jp.go.aist.six.oval.model.sc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



/**
 * The EntityItemRecordType defines an entity that consists of a number of named fields.
 * This structure is used for representing a record from a database query
 * and other similar structures where multiple related fields must be collected at once.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: EntityItemRecordType.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class EntityItemRecordType
    extends EntityItemComplexBaseType
{

    private final Collection<EntityItemFieldType>  field =
                    new ArrayList<EntityItemFieldType>();
    //{0..*}



    /**
     * Constructor.
     */
    public EntityItemRecordType()
    {
    }



    /**
     */
    public void setField(
                    final Collection<? extends EntityItemFieldType> field_list
                    )
    {
        if (field != field_list) {
            field.clear();
            if (field_list != null  &&  field_list.size() > 0) {
                for (EntityItemFieldType  p : field_list) {
                    addField( p );
                }
            }
        }
    }


    public boolean addField(
                    final EntityItemFieldType field
                    )
    {
        if (field == null) {
            throw new IllegalArgumentException( "empty field" );
        }

        return this.field.add( field );
    }


    public Collection<EntityItemFieldType> getField()
    {
        return field;
    }


    public Iterator<EntityItemFieldType> iterateField()
    {
        return getField().iterator();
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

        if (!(obj instanceof EntityItemRecordType)) {
            return false;
        }

        return super.equals( obj );
    }



//    @Override
//    public String toString()
//    {
//        return "[" + super.toString() + "]";
//    }

}
//
