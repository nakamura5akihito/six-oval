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
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.EntityStateStringType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 * The group state enumerates the different users and subgroups
 * directly associated with a Windows group.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: GroupState.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class GroupState
    extends StateType
{

    //{0..1}
    private EntityStateStringType   group;
    private EntityStateStringType   user;
    private EntityStateStringType   subgroup;



    /**
     * Constructor.
     */
    public GroupState()
    {
        this( null, 0 );
    }


    public GroupState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public GroupState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.group;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.GROUP;
    }



    /**
     */
    public void setGroup(
                    final EntityStateStringType group
                    )
    {
        this.group = group;
    }


    public EntityStateStringType getGroup()
    {
        return group;
    }



    /**
     */
    public void setUser(
                    final EntityStateStringType user
                    )
    {
        this.user = user;
    }


    public EntityStateStringType getUser()
    {
        return user;
    }



    /**
     */
    public void setSubgroup(
                    final EntityStateStringType subgroup
                    )
    {
        this.subgroup = subgroup;
    }


    public EntityStateStringType getSubgroup()
    {
        return subgroup;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getGroup() );
        ref_list.add( getUser() );
        ref_list.add( getSubgroup() );

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
        if (!(obj instanceof GroupState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "group_state[" + super.toString()
             + ", group="       + getGroup()
             + ", user="        + getUser()
             + ", subgroup="    + getSubgroup()
             + "]";
    }
}
//GroupState
