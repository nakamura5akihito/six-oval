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
package jp.go.aist.six.oval.model.windows;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.sc.EntityItemStringType;
import jp.go.aist.six.oval.model.sc.ItemType;



/**
 * The Windows group_sid item allows the different users and subgroups,
 * that directly belong to specific groups (identified by SID), to be collected.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: GroupSidItem.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
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
