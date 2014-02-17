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
import jp.go.aist.six.oval.model.sc.EntityItemBoolType;
import jp.go.aist.six.oval.model.sc.EntityItemIntType;
import jp.go.aist.six.oval.model.sc.EntityItemStringType;
import jp.go.aist.six.oval.model.sc.ItemType;
import jp.go.aist.six.oval.model.sc.StatusEnumeration;



/**
 * This item stores output of 'pwpolicy -getpolicy'.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: PwPolicyItem.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 * @deprecated Deprecated as of version 5.9:
 *             Replaced by the pwpolicy59 item and
 *             will be removed in a future version of the language.
 */
@Deprecated
public class PwPolicyItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType   username;
    private EntityItemStringType   userpass;
    private EntityItemStringType   directory_node;
    private EntityItemIntType      maxChars;
    private EntityItemIntType      maxFailedLoginAttempts;
    private EntityItemIntType      minChars;
    private EntityItemBoolType     passwordCannotBeName;
    private EntityItemBoolType     requiresAlpha;
    private EntityItemBoolType     requiresNumeric;



    /**
     * Constructor.
     */
    public PwPolicyItem()
    {
        this( 0 );
    }


    public PwPolicyItem(
                    final int id
                    )
    {
        this( id, null );
    }


    public PwPolicyItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        super( id, status );

        _oval_family = Family.MACOS;
        _oval_component = ComponentType.PWPOLICY;
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
    public void setUserpass(
                    final EntityItemStringType userpass
                    )
    {
        this.userpass = userpass;
    }


    public EntityItemStringType getUserpass()
    {
        return userpass;
    }



    /**
     */
    public void setDirectoryNode(
                    final EntityItemStringType directory_node
                    )
    {
        this.directory_node = directory_node;
    }


    public EntityItemStringType getDirectoryNode()
    {
        return directory_node;
    }



    /**
     */
    public void setMaxChars(
                    final EntityItemIntType maxChars
                    )
    {
        this.maxChars = maxChars;
    }


    public EntityItemIntType getMaxChars()
    {
        return maxChars;
    }



    /**
     */
    public void setMaxFailedLoginAttempts(
                    final EntityItemIntType maxFailedLoginAttempts
                    )
    {
        this.maxFailedLoginAttempts = maxFailedLoginAttempts;
    }


    public EntityItemIntType getMaxFailedLoginAttempts()
    {
        return maxFailedLoginAttempts;
    }



    /**
     */
    public void setMinChars(
                    final EntityItemIntType minChars
                    )
    {
        this.minChars = minChars;
    }


    public EntityItemIntType getMinChars()
    {
        return minChars;
    }



    /**
     */
    public void setPasswordCannotBeName(
                    final EntityItemBoolType passwordCannotBeName
                    )
    {
        this.passwordCannotBeName = passwordCannotBeName;
    }


    public EntityItemBoolType getPasswordCannotBeName()
    {
        return passwordCannotBeName;
    }



    /**
     */
    public void setRequiresAlpha(
                    final EntityItemBoolType requiresAlpha
                    )
    {
        this.requiresAlpha = requiresAlpha;
    }


    public EntityItemBoolType getRequiresAlpha()
    {
        return requiresAlpha;
    }



    /**
     */
    public void setRequiresNumeric(
                    final EntityItemBoolType requiresNumeric
                    )
    {
        this.requiresNumeric = requiresNumeric;
    }


    public EntityItemBoolType getRequiresNumeric()
    {
        return requiresNumeric;
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
        if (!(obj instanceof PwPolicyItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "pwpolicy_item[" + super.toString()
                        + ", username="                + getUsername()
                        + ", userpass="                + getUserpass()
                        + ", directory_node="          + getDirectoryNode()
                        + ", maxChars="                + getMaxChars()
                        + ", maxFailedLoginAttempts="  + getMaxFailedLoginAttempts()
                        + ", minChars="                + getMinChars()
                        + ", passwordCannotBeName="    + getPasswordCannotBeName()
                        + ", requiresAlpha="           + getRequiresAlpha()
                        + ", requiresNumeric="         + getRequiresNumeric()
             + "]";
    }
}
//
