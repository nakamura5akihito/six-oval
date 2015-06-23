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
package io.opensec.six.oval.model.unix;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.sc.EntityItemAnySimpleType;
import io.opensec.six.oval.model.sc.EntityItemBoolType;
import io.opensec.six.oval.model.sc.EntityItemIntType;
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.ItemType;
import io.opensec.six.oval.model.sc.StatusEnumeration;



/**
 * The gconf_item holds information about an individual GConf preference key found on a system.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class GconfItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType        key;
    private EntityItemStringType        source;
    private EntityItemGconfTypeType     type;
    private EntityItemBoolType          is_writable;
    private EntityItemStringType        mod_user;
    private EntityItemIntType           mod_time;
    private EntityItemBoolType          is_default;
    private EntityItemAnySimpleType     value;



    /**
     * Constructor.
     */
    public GconfItem()
    {
        this( 0 );
    }


    public GconfItem(
                    final int id
                    )
    {
        this( id, null );
    }


    public GconfItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        super( id, status );

        _oval_family = Family.UNIX;
        _oval_component = ComponentType.GCONF;
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
    public void setSource(
                    final EntityItemStringType source
                    )
    {
        this.source = source;
    }


    public EntityItemStringType getSource()
    {
        return source;
    }



    /**
     */
    public void setType(
                    final EntityItemGconfTypeType type
                    )
    {
        this.type = type;
    }


    public EntityItemGconfTypeType getType()
    {
        return type;
    }



    /**
     */
    public void setIsWritable(
                    final EntityItemBoolType is_writable
                    )
    {
        this.is_writable= is_writable;
    }


    public EntityItemBoolType getIsWritable()
    {
        return is_writable;
    }



    /**
     */
    public void setModUser(
                    final EntityItemStringType mod_user
                    )
    {
        this.mod_user = mod_user;
    }


    public EntityItemStringType getModUser()
    {
        return mod_user;
    }



    /**
     */
    public void setModTime(
                    final EntityItemIntType mod_time
                    )
    {
        this.mod_time = mod_time;
    }


    public EntityItemIntType getModTime()
    {
        return mod_time;
    }



    /**
     */
    public void setIsDefault(
                    final EntityItemBoolType is_default
                    )
    {
        this.is_default= is_default;
    }


    public EntityItemBoolType getIsDefault()
    {
        return is_default;
    }



    /**
     */
    public void setValue(
                    final EntityItemAnySimpleType value
                    )
    {
        this.value = value;
    }


    public EntityItemAnySimpleType getValue()
    {
        return value;
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
        if (!(obj instanceof GconfItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "gconf_item[" + super.toString()
             + ", key="         + getKey()
             + ", source="      + getSource()
             + ", type="        + getType()
             + ", is_writable=" + getIsWritable()
             + ", mod_user="    + getModUser()
             + ", mod_time="    + getModTime()
             + ", is_default="  + getIsDefault()
             + ", value="       + getValue()
             + "]";
    }

}
//
