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
package io.opensec.six.oval.model.esx;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.sc.EntityItemAnySimpleType;
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.ItemType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



/**
 * The visdkmanagedobject item is used to represent information
 * about Managed Objects in the VMware Infrastructure.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class ViSdkManagedObjectItem
    extends ItemType
{

    private EntityItemStringType  property;
    //{0..1}


    private final Collection<EntityItemAnySimpleType>  value =
        new ArrayList<EntityItemAnySimpleType>();
    //{0..*}



    /**
     * Constructor.
     */
    public ViSdkManagedObjectItem()
    {
        this( 0 );
    }


    public ViSdkManagedObjectItem(
                    final int id
                    )
    {
        super( id );

        _oval_family = Family.ESX;
        _oval_component = ComponentType.VISDKMANAGEDOBJECT;
    }



    /**
     */
    public void setProperty(
                    final EntityItemStringType property
                    )
    {
        this.property = property;
    }


    public EntityItemStringType getProperty()
    {
        return property;
    }



    /**
     */
    public void setValue(
                    final Collection<? extends EntityItemAnySimpleType> value
                    )
    {
        if (this.value != value) {
            this.value.clear();
            if (value != null  &&  value.size() > 0) {
                this.value.addAll( value );
            }
        }
    }


    public Collection<EntityItemAnySimpleType> getValue()
    {
        return value;
    }


    public Iterator<EntityItemAnySimpleType> iterateValue()
    {
        return value.iterator();
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "visdkmanagedobject_item[" + super.toString()
             + ", property="    + getProperty()
             + ", value="       + getValue()
             + "]";
    }

}
//
