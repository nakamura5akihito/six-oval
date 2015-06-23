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

import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.ElementType;



/**
 * The ObjectComponent type defines a specific value or set of values
 * on the local system to obtain.
 *
 * @author	Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class ObjectComponentType
    extends ComponentGroup
    implements ElementRef
{

    private String  object_ref;
    //{required, oval:ObjectIDPattern}


    private String  item_field;
    //{required, oval:NonEmptyStringType}


    private String  record_field;
    //{optional, oval:NonEmptyStringType}



    /**
     * Constructor.
     */
    public ObjectComponentType()
    {
    }


    public ObjectComponentType(
                    final String object_ref,
                    final String item_field
                    )
    {
        setObjectRef( object_ref );
        setItemField( item_field );
    }



    /**
     */
    public void setObjectRef(
                    final String object_ref
                    )
    {
        this.object_ref = object_ref;
    }


    public String getObjectRef()
    {
        return object_ref;
    }



    /**
     */
    public void setItemField(
                    final String item_field
                    )
    {
        this.item_field = item_field;
    }


    public String getItemField()
    {
        return item_field;
    }



    /**
     */
    public void setRecordField(
                    final String record_field
                    )
    {
        this.record_field = record_field;
    }


    public String getRecordField()
    {
        return record_field;
    }



    //*********************************************************************
    //  ElementRef
    //*********************************************************************

    public String ovalGetRefId()
    {
        return getObjectRef();
    }



    public ElementType ovalGetRefType()
    {
        return ElementType.OBJECT;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "[object_ref="       + getObjectRef()
             + ", item_field="      + getItemField()
             + ", record_field="    + getRecordField()
             + "]";
    }

}
// ObjectComponentType
