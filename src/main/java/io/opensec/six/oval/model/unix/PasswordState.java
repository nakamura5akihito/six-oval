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
import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.definitions.EntityStateIntType;
import io.opensec.six.oval.model.definitions.EntityStateStringType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;



/**
 * The password state defines the different information associated with the system passwords.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class PasswordState
    extends StateType
{

    //{0..1}
    private EntityStateStringType   username;
    private EntityStateStringType   password;
    private EntityStateIntType      user_id;
    private EntityStateIntType      group_id;
    private EntityStateStringType   gcos;
    private EntityStateStringType   home_dir;
    private EntityStateStringType   login_shell;
    private EntityStateIntType      last_login;




    /**
     * Constructor.
     */
    public PasswordState()
    {
        this( null, 0 );
    }


    public PasswordState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public PasswordState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.unix;
//        _oval_component_type = OvalComponentType.password;
        _oval_family = Family.UNIX;
        _oval_component = ComponentType.PASSWORD;
    }



    /**
     */
    public void setUsername(
                    final EntityStateStringType username
                    )
    {
        this.username = username;
    }


    public EntityStateStringType getUsername()
    {
        return username;
    }



    /**
     */
    public void setPassword(
                    final EntityStateStringType password
                    )
    {
        this.password = password;
    }


    public EntityStateStringType getPassword()
    {
        return password;
    }



    /**
     */
    public void setUserId(
                    final EntityStateIntType user_id
                    )
    {
        this.user_id = user_id;
    }


    public EntityStateIntType getUserId()
    {
        return user_id;
    }



    /**
     */
    public void setGroupId(
                    final EntityStateIntType group_id
                    )
    {
        this.group_id = group_id;
    }


    public EntityStateIntType getGroupId()
    {
        return group_id;
    }



    /**
     */
    public void setGcos(
                    final EntityStateStringType gcos
                    )
    {
        this.gcos = gcos;
    }


    public EntityStateStringType getGcos()
    {
        return gcos;
    }



    /**
     */
    public void setHomeDir(
                    final EntityStateStringType home_dir
                    )
    {
        this.home_dir = home_dir;
    }


    public EntityStateStringType getHomeDir()
    {
        return home_dir;
    }



    /**
     */
    public void setLoginShell(
                    final EntityStateStringType login_shell
                    )
    {
        this.login_shell = login_shell;
    }


    public EntityStateStringType getLoginShell()
    {
        return login_shell;
    }



    /**
     */
    public void setLastLogin(
                    final EntityStateIntType last_login
                    )
    {
        this.last_login = last_login;
    }


    public EntityStateIntType getLastLogin()
    {
        return last_login;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getUsername() );
        ref_list.add( getPassword() );
        ref_list.add( getUserId() );
        ref_list.add( getGroupId() );
        ref_list.add( getGcos() );
        ref_list.add( getHomeDir() );
        ref_list.add( getLoginShell() );
        ref_list.add( getLastLogin() );

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
        if (!(obj instanceof PasswordState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "password_state[" + super.toString()
             + ", username="        + getUsername()
             + ", password="        + getPassword()
             + ", user_id="         + getUserId()
             + ", group_id="        + getGroupId()
             + ", gcos="            + getGcos()
             + ", home_dir="        + getHomeDir()
             + ", login_shell="     + getLoginShell()
             + ", last_login="      + getLastLogin()
             + "]";
    }

}
//PasswordState
