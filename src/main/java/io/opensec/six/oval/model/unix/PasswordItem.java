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
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.sc.EntityItemIntType;
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.ItemType;



/**
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class PasswordItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType   username;
    private EntityItemStringType   password;
    private EntityItemIntType      user_id;
    private EntityItemIntType      group_id;
    private EntityItemStringType   gcos;
    private EntityItemStringType   home_dir;
    private EntityItemStringType   login_shell;
    private EntityItemIntType      last_login;



    /**
     * Constructor.
     */
    public PasswordItem()
    {
        this( 0 );
    }


    public PasswordItem(
                    final int id
                    )
    {
        super( id );

//        _oval_platform_type = OvalPlatformType.unix;
//        _oval_component_type = OvalComponentType.password;
        _oval_family = Family.UNIX;
        _oval_component = ComponentType.PASSWORD;
    }



    /**
     */
    public void setUsername(
                    final EntityItemStringType username
                    )
    {
        this.username = username;
    }


    public EntityItemStringType getUsername()
    {
        return username;
    }



    /**
     */
    public void setPassword(
                    final EntityItemStringType password
                    )
    {
        this.password = password;
    }


    public EntityItemStringType getPassword()
    {
        return password;
    }



    /**
     */
    public void setUserId(
                    final EntityItemIntType user_id
                    )
    {
        this.user_id = user_id;
    }


    public EntityItemIntType getUserId()
    {
        return user_id;
    }



    /**
     */
    public void setGroupId(
                    final EntityItemIntType group_id
                    )
    {
        this.group_id = group_id;
    }


    public EntityItemIntType getGroupId()
    {
        return group_id;
    }



    /**
     */
    public void setGcos(
                    final EntityItemStringType gcos
                    )
    {
        this.gcos = gcos;
    }


    public EntityItemStringType getGcos()
    {
        return gcos;
    }



    /**
     */
    public void setHomeDir(
                    final EntityItemStringType home_dir
                    )
    {
        this.home_dir = home_dir;
    }


    public EntityItemStringType getHomeDir()
    {
        return home_dir;
    }



    /**
     */
    public void setLoginShell(
                    final EntityItemStringType login_shell
                    )
    {
        this.login_shell = login_shell;
    }


    public EntityItemStringType getLoginShell()
    {
        return login_shell;
    }



    /**
     */
    public void setLastLogin(
                    final EntityItemIntType last_login
                    )
    {
        this.last_login = last_login;
    }


    public EntityItemIntType getLastLogin()
    {
        return last_login;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "password_item[" + super.toString()
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
//passwordItem
