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
package io.opensec.six.oval.model.macos;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.definitions.EntityStateIntType;
import io.opensec.six.oval.model.definitions.EntityStateStringType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;



/**
 * The accountinfo state defines the different information that can be used to evaluate
 * the specified accounts.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class AccountInfoState
    extends StateType
{

    //{0..1}
    private EntityStateStringType   username;
    private EntityStateStringType   password;
    private EntityStateIntType      uid;
    private EntityStateIntType      gid;
    private EntityStateStringType   realname;
    private EntityStateStringType   home_dir;
    private EntityStateStringType   login_shell;




    /**
     * Constructor.
     */
    public AccountInfoState()
    {
        this( null, 0 );
    }


    public AccountInfoState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public AccountInfoState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.MACOS;
        _oval_component = ComponentType.ACCOUNTINFO;
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
    public void setUid(
                    final EntityStateIntType uid
                    )
    {
        this.uid = uid;
    }


    public EntityStateIntType getUid()
    {
        return uid;
    }



    /**
     */
    public void setGid(
                    final EntityStateIntType gid
                    )
    {
        this.gid = gid;
    }


    public EntityStateIntType getGid()
    {
        return gid;
    }



    /**
     */
    public void setRealname(
                    final EntityStateStringType realname
                    )
    {
        this.realname = realname;
    }


    public EntityStateStringType getRealname()
    {
        return realname;
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



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getUsername() );
        ref_list.add( getPassword() );
        ref_list.add( getUid() );
        ref_list.add( getGid() );
        ref_list.add( getRealname() );
        ref_list.add( getHomeDir() );
        ref_list.add( getLoginShell() );

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
        if (!(obj instanceof AccountInfoState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "password_state[" + super.toString()
             + ", username="    + getUsername()
             + ", password="    + getPassword()
             + ", uid="         + getUid()
             + ", gid="         + getGid()
             + ", realname="    + getRealname()
             + ", home_dir="    + getHomeDir()
             + ", login_shell=" + getLoginShell()
             + "]";
    }

}
//
