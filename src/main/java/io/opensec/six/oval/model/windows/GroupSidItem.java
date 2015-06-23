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
 * The Windows group_sid item allows the different users and subgroups,
 * that directly belong to specific groups (identified by SID), to be collected.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class GroupSidItem
    extends ItemType
{

    private EntityItemStringType  group_sid;
    //{0..1}

    private final Collection<EntityItemStringType>  user_sid =
        new ArrayList<EntityItemStringType>();
    //{0..*}

    private final Collection<EntityItemStringType>  subgroup_sid =
                    new ArrayList<EntityItemStringType>();
    //{0..*}



    /**
     * Constructor.
     */
    public GroupSidItem()
    {
        this( 0 );
    }


    public GroupSidItem(
                    final int id
                    )
    {
        super( id );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.group_sid;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.GROUP_SID;
    }



    /**
     */
    public EntityItemStringType getGroupSid()
    {
        return group_sid;
    }


    public void setGroupSid(
                    final EntityItemStringType group_sid
                    )
    {
        this.group_sid = group_sid;
    }



    /**
     */
    public void setUserSid(
                    final Collection<? extends EntityItemStringType> user_sids
                    )
    {
        if (user_sid != user_sids) {
            user_sid.clear();
            if (user_sids != null  &&  user_sids.size() > 0) {
                user_sid.addAll( user_sids );
            }
        }
    }


    public Collection<EntityItemStringType> getUserSid()
    {
        return user_sid;
    }


    public Iterator<EntityItemStringType> iterateUserSid()
    {
        return user_sid.iterator();
    }



    /**
     */
    public void setSubgroupSid(
                    final Collection<? extends EntityItemStringType> subgroup_sids
                    )
    {
        if (subgroup_sid != subgroup_sids) {
            subgroup_sid.clear();
            if (subgroup_sids != null  &&  subgroup_sids.size() > 0) {
                subgroup_sid.addAll( subgroup_sids );
            }
        }
    }


    public Collection<EntityItemStringType> getSubgroupSid()
    {
        return subgroup_sid;
    }


    public Iterator<EntityItemStringType> iterateSubgroupSid()
    {
        return subgroup_sid.iterator();
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "group_sid_item[" + super.toString()
             + ", group_sid="       + getGroupSid()
             + ", user_sid="        + getUserSid()
             + ", subgroup_sid="    + getSubgroupSid()
             + "]";
    }

}
//GroupSidItem
