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
import jp.go.aist.six.oval.model.definitions.EntityStateStringType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 * The user_sid55 state enumerates the different groups (identified by SID)
 * that a Windows user might belong to.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: UserSid55State.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class UserSid55State
    extends StateType
{

    //{0..1}
    private EntityStateStringType       user_sid;
    private EntityStateBoolType         enabled;
    private EntityStateStringType       group_sid;



    /**
     * Constructor.
     */
    public UserSid55State()
    {
        this( null, 0 );
    }


    public UserSid55State(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public UserSid55State(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.user_sid55;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.USER_SID55;
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



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();

        ref_list.add( getUserSid() );
        ref_list.add( getEnabled() );
        ref_list.add( getGroupSid() );

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
        if (!(obj instanceof UserSid55State)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "user_sid55_state[" + super.toString()
                        + ", user_sid="     + getUserSid()
                        + ", enabled="      + getEnabled()
                        + ", group_sid="    + getGroupSid()
             + "]";
    }

}
//UserSid55State
