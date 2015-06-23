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

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.sc.EntityItemBoolType;
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.ItemType;
import io.opensec.six.oval.model.sc.StatusEnumeration;



/**
 * This item describes the current and pending status of a SELinux boolean.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class SelinuxBooleanItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType           name;
    private EntityItemBoolType             current_status;
    private EntityItemBoolType             pending_status;



    /**
     * Constructor.
     */
    public SelinuxBooleanItem()
    {
        this( 0 );
    }


    public SelinuxBooleanItem(
                    final int id
                    )
    {
        this( id, null );
    }


    public SelinuxBooleanItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        super( id, status );

//        _oval_platform_type = OvalPlatformType.linux;
//        _oval_component_type = OvalComponentType.selinuxboolean;
        _oval_family = Family.LINUX;
        _oval_component = ComponentType.SELINUXBOOLEAN;
    }



    /**
     */
    public void setName(
                    final EntityItemStringType name
                    )
    {
        this.name = name;
    }


    public EntityItemStringType getName()
    {
        return name;
    }



    /**
     */
    public void setCurrentStatus(
                    final EntityItemBoolType current_status
                    )
    {
        this.current_status = current_status;
    }


    public EntityItemBoolType getCurrentStatus()
    {
        return current_status;
    }



    /**
     */
    public void setPendingStatus(
                    final EntityItemBoolType pending_status
                    )
    {
        this.pending_status = pending_status;
    }


    public EntityItemBoolType getPendingStatus()
    {
        return pending_status;
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
        if (!(obj instanceof SelinuxBooleanItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "selinuxboolean_item[" + super.toString()
                        + ", name="             + getName()
                        + ", current_status="   + getCurrentStatus()
                        + ", pending_status="   + getPendingStatus()
             + "]";
    }

}
//SelinuxBooleanItem
