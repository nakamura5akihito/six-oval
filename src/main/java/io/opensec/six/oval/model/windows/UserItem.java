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
package io.opensec.six.oval.model.windows;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.sc.EntityItemBoolType;
import io.opensec.six.oval.model.sc.EntityItemIntType;
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.ItemType;
import io.opensec.six.oval.model.sc.StatusEnumeration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



/**
 * The windows user item allows the different groups (identified by name)
 * that a user belongs to be collected.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class UserItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType       user;
    private EntityItemBoolType         enabled;

//  private EntityItemStringType       group;
    private final Collection<EntityItemStringType>  group = new ArrayList<EntityItemStringType>();
    //{0..*}

    private EntityItemIntType          last_logon;



    /**
     * Constructor.
     */
    public UserItem()
    {
        this( 0 );
    }


    public UserItem(
                    final int id
                    )
    {
        this( id, null );
    }


    public UserItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        super( id, status );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.user;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.USER;
    }



    /**
     */
    public void setUser(
                    final EntityItemStringType user
                    )
    {
        this.user = user;
    }


    public EntityItemStringType getUser()
    {
        return user;
    }



    /**
     */
    public void setEnabled(
                    final EntityItemBoolType enabled
                    )
    {
        this.enabled = enabled;
    }


    public EntityItemBoolType getEnabled()
    {
        return enabled;
    }



//    /**
//     */
//    public void setGroup(
//                    final EntityItemStringType group
//                    )
//    {
//        this.group = group;
//    }
//
//
//    public EntityItemStringType getGroup()
//    {
//        return group;
//    }

    /**
     */
    public void setGroup(
                    final Collection<? extends EntityItemStringType> group
                    )
    {
        if (this.group != group) {
            this.group.clear();
            if (group != null  &&  group.size() > 0) {
                this.group.addAll( group );
            }
        }
    }


    public Collection<EntityItemStringType> getGroup()
    {
        return group;
    }


    public Iterator<EntityItemStringType> iterateGroup()
    {
        return group.iterator();
    }



    /**
     */
    public void setLastLogon(
                    final EntityItemIntType last_logon
                    )
    {
        this.last_logon = last_logon;
    }


    public EntityItemIntType getLastLogon()
    {
        return last_logon;
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
        if (!(obj instanceof UserItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "user_item[" + super.toString()
                        + ", user="         + getUser()
                        + ", enabled="      + getEnabled()
                        + ", group="        + getGroup()
                        + ", last_logon="   + getLastLogon()
             + "]";
    }
}
//UserItem
