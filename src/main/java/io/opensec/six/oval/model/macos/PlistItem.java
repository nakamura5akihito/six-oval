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
package io.opensec.six.oval.model.macos;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.sc.EntityItemAnySimpleType;
import io.opensec.six.oval.model.sc.EntityItemIntType;
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.ItemType;
import io.opensec.six.oval.model.sc.StatusEnumeration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



/**
 * The plist item holds information about an individual property list preference key
 * found on a system.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class PlistItem
    extends ItemType
{

    //{0..1}

    private EntityItemStringType       key;
    //{nillable="true"}

    private EntityItemStringType       app_id;
    private EntityItemStringType       filepath;
    private EntityItemIntType          instance;
    private EntityItemPlistTypeType    type;
    private final Collection<EntityItemAnySimpleType>  value = new ArrayList<EntityItemAnySimpleType>();



    /**
     * Constructor.
     */
    public PlistItem()
    {
        this( 0 );
    }


    public PlistItem(
                    final int id
                    )
    {
        this( id, null );
    }


    public PlistItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        super( id, status );

        _oval_family = Family.MACOS;
        _oval_component = ComponentType.PLIST;
    }



    /**
     */
    public void setKey(
                    final EntityItemStringType key
                    )
    {
        this.key = key;
    }


    public EntityItemStringType getKey()
    {
        return key;
    }



    /**
     */
    public void setAppId(
                    final EntityItemStringType app_id
                    )
    {
        this.app_id = app_id;
    }


    public EntityItemStringType getAppId()
    {
        return app_id;
    }



    /**
     */
    public void setFilepath(
                    final EntityItemStringType filepath
                    )
    {
        this.filepath = filepath;
    }


    public EntityItemStringType getFilepath()
    {
        return filepath;
    }



    /**
     */
    public void setInstance(
                    final EntityItemIntType instance
                    )
    {
        this.instance = instance;
    }


    public EntityItemIntType getInstance()
    {
        return instance;
    }



    /**
     */
    public void setType(
                    final EntityItemPlistTypeType type
                    )
    {
        this.type = type;
    }


    public EntityItemPlistTypeType getType()
    {
        return type;
    }



    /**
     */
    public void setValue(
                    final Collection<? extends EntityItemAnySimpleType> value_list
                    )
    {
        if (value != value_list) {
            value.clear();
            if (value_list != null  &&  value_list.size() > 0) {
                value.addAll( value_list );
            }
        }
    }


    public boolean addValue(
                    final EntityItemAnySimpleType value
                    )
    {
        if (value == null) {
            return false;
        }

        return this.value.add( value );
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
    public int hashCode()
    {
        return super.hashCode();
    }



    @Override
    public boolean equals(
                    final Object obj
                    )
    {
        if (!(obj instanceof PlistItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "plist_item[" + super.toString()
                        + ", key="         + getKey()
                        + ", app_id="      + getAppId()
                        + ", filepath="    + getFilepath()
                        + ", instance="    + getInstance()
                        + ", type="        + getType()
                        + ", value="       + getValue()
             + "]";
    }
}
//
