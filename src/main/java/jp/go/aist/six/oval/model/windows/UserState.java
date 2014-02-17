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
import jp.go.aist.six.oval.model.definitions.EntityStateBoolType;
import jp.go.aist.six.oval.model.definitions.EntityStateIntType;
import jp.go.aist.six.oval.model.definitions.EntityStateStringType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 * The user state enumerates the different groups (identified by name)
 * that a Windows user might belong to.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: UserState.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class UserState
    extends StateType
{

    //{0..1}
    private EntityStateStringType       user;
    private EntityStateBoolType         enabled;
    private EntityStateStringType       group;
    private EntityStateIntType          last_logon;



    /**
     * Constructor.
     */
    public UserState()
    {
        this( null, 0 );
    }


    public UserState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public UserState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.user;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.USER;
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
    public void setEnabled(
                    final EntityStateBoolType enabled
                    )
    {
        this.enabled = enabled;
    }


    public EntityStateBoolType getEnabled()
    {
        return enabled;
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
    public void setLastLogon(
                    final EntityStateIntType last_logon
                    )
    {
        this.last_logon = last_logon;
    }


    public EntityStateIntType getLastLogon()
    {
        return last_logon;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();

        ref_list.add( getUser() );
        ref_list.add( getEnabled() );
        ref_list.add( getGroup() );
        ref_list.add( getLastLogon() );

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
        if (!(obj instanceof UserState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "user_state[" + super.toString()
                        + ", user="         + getUser()
                        + ", enabled="      + getEnabled()
                        + ", group="        + getGroup()
                        + ", last_logon="   + getLastLogon()
             + "]";
    }

}
//UserState
