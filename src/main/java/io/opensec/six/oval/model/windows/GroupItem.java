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
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.ItemType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



/**
 * The Windows group item allows the different users and subgroups,
 * that directly belong to specific groups (identified by name), to be collected.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class GroupItem
    extends ItemType
{

    private EntityItemStringType  group;
    //{0..1}

    private final Collection<EntityItemStringType>  user =
        new ArrayList<EntityItemStringType>();
    //{0..*}

    private final Collection<EntityItemStringType>  subgroup =
                    new ArrayList<EntityItemStringType>();
    //{0..*}



    /**
     * Constructor.
     */
    public GroupItem()
    {
        this( 0 );
    }


    public GroupItem(
                    final int id
                    )
    {
        super( id );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.group;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.GROUP;
    }



    /**
     */
    public EntityItemStringType getGroup()
    {
        return group;
    }


    public void setGroup(
                    final EntityItemStringType group
                    )
    {
        this.group = group;
    }



    /**
     */
    public void setUser(
                    final Collection<? extends EntityItemStringType> users
                    )
    {
        if (user != users) {
            user.clear();
            if (users != null  &&  users.size() > 0) {
                user.addAll( users );
            }
        }
    }


    public Collection<EntityItemStringType> getUser()
    {
        return user;
    }


    public Iterator<EntityItemStringType> iterateUser()
    {
        return user.iterator();
    }



    /**
     */
    public void setSubgroup(
                    final Collection<? extends EntityItemStringType> subgroups
                    )
    {
        if (subgroup != subgroups) {
            subgroup.clear();
            if (subgroups != null  &&  subgroups.size() > 0) {
                subgroup.addAll( subgroups );
            }
        }
    }


    public Collection<EntityItemStringType> getSubgroup()
    {
        return subgroup;
    }


    public Iterator<EntityItemStringType> iterateSubgroup()
    {
        return subgroup.iterator();
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "group_item[" + super.toString()
             + ", group="       + getGroup()
             + ", user="        + getUser()
             + ", subgroup="    + getSubgroup()
             + "]";
    }

}
//GroupItem
