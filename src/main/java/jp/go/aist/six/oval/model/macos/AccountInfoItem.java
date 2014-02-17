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
package jp.go.aist.six.oval.model.macos;

import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.sc.EntityItemIntType;
import jp.go.aist.six.oval.model.sc.EntityItemStringType;
import jp.go.aist.six.oval.model.sc.ItemType;



/**
 * This item stores sser account information (username, uid, gid, etc.).
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: AccountInfoItem.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class AccountInfoItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType   username;
    private EntityItemStringType   password;
    private EntityItemIntType      uid;
    private EntityItemIntType      gid;
    private EntityItemStringType   realname;
    private EntityItemStringType   home_dir;
    private EntityItemStringType   login_shell;



    /**
     * Constructor.
     */
    public AccountInfoItem()
    {
        this( 0 );
    }


    public AccountInfoItem(
                    final int id
                    )
    {
        super( id );

        _oval_family = Family.MACOS;
        _oval_component = ComponentType.ACCOUNTINFO;
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
    public void setUid(
                    final EntityItemIntType uid
                    )
    {
        this.uid = uid;
    }


    public EntityItemIntType getUid()
    {
        return uid;
    }



    /**
     */
    public void setGid(
                    final EntityItemIntType gid
                    )
    {
        this.gid = gid;
    }


    public EntityItemIntType getGid()
    {
        return gid;
    }



    /**
     */
    public void setRealname(
                    final EntityItemStringType realname
                    )
    {
        this.realname = realname;
    }


    public EntityItemStringType getRealname()
    {
        return realname;
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



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "accountinfo_item[" + super.toString()
                        + ", username="     + getUsername()
                        + ", password="     + getPassword()
                        + ", uid="          + getUid()
                        + ", gid="          + getGid()
                        + ", realname="     + getRealname()
                        + ", home_dir="     + getHomeDir()
                        + ", login_shell="  + getLoginShell()
             + "]";
    }

}
//
