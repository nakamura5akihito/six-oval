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
import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.definitions.EntityStateStringType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;



/**
 * The group_sid state enumerates the different users and subgroups
 * directly associated with a Windows group.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class GroupSidState
    extends StateType
{

    //{0..1}
    private EntityStateStringType   group_sid;
    private EntityStateStringType   user_sid;
    private EntityStateStringType   subgroup_sid;



    /**
     * Constructor.
     */
    public GroupSidState()
    {
        this( null, 0 );
    }


    public GroupSidState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public GroupSidState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.group_sid;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.GROUP_SID;
    }



    /**
     */
    public void setGroupSid(
                    final EntityStateStringType group_sid
                    )
    {
        this.group_sid = group_sid;
    }


    public EntityStateStringType getGroupSid()
    {
        return group_sid;
    }



    /**
     */
    public void setUserSid(
                    final EntityStateStringType user_sid
                    )
    {
        this.user_sid = user_sid;
    }


    public EntityStateStringType getUserSid()
    {
        return user_sid;
    }



    /**
     */
    public void setSubgroupSid(
                    final EntityStateStringType subgroup_sid
                    )
    {
        this.subgroup_sid = subgroup_sid;
    }


    public EntityStateStringType getSubgroupSid()
    {
        return subgroup_sid;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getGroupSid() );
        ref_list.add( getUserSid() );
        ref_list.add( getSubgroupSid() );

        return ref_list;
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
        if (!(obj instanceof GroupSidState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "group_sid_state[" + super.toString()
             + ", group_sid="       + getGroupSid()
             + ", user_sid="        + getUserSid()
             + ", subgroup_sid="    + getSubgroupSid()
             + "]";
    }
}
//GroupSidState
