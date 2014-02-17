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
 * The pwpolicy59 item holds the password policy information for a particular user
 * specified by the target_user element.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: PwPolicy59Item.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class PwPolicy59Item
    extends ItemType
{

    //{0..1}
    private EntityItemStringType   target_user;

    //{nillable="true"}
    private EntityItemStringType   username;
    private EntityItemStringType   userpass;
    private EntityItemStringType   directory_node;

    private EntityItemIntType      maxChars;
    private EntityItemIntType      maxFailedLoginAttempts;
    private EntityItemIntType      minChars;
    private EntityItemBoolType     passwordCannotBeName;
    private EntityItemBoolType     requiresAlpha;
    private EntityItemBoolType     requiresNumeric;

    private EntityItemIntType      maxMinutesUntilChangePassword;
    private EntityItemIntType      minMinutesUntilChangePassword;
    private EntityItemBoolType     requiresMixedCase;
    private EntityItemBoolType     requiresSymbol;
    private EntityItemIntType      minutesUntilFailedLoginReset;
    private EntityItemIntType      usingHistory;
    private EntityItemBoolType     canModifyPasswordforSelf;
    private EntityItemBoolType     usingExpirationDate;
    private EntityItemBoolType     usingHardExpirationDate;
    private EntityItemStringType   expirationDateGMT;
    private EntityItemStringType   hardExpireDateGMT;
    private EntityItemIntType      maxMinutesUntilDisabled;
    private EntityItemIntType      maxMinutesOfNonUse;
    private EntityItemBoolType     newPasswordRequired;
    private EntityItemBoolType     notGuessablePattern;



    /**
     * Constructor.
     */
    public PwPolicy59Item()
    {
        this( 0 );
    }


    public PwPolicy59Item(
                    final int id
                    )
    {
        this( id, null );
    }


    public PwPolicy59Item(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        super( id, status );

        _oval_family = Family.MACOS;
        _oval_component = ComponentType.PWPOLICY59;
    }



    /**
     */
    public void setTargetUser(
                    final EntityItemStringType target_user
                    )
    {
        this.target_user = target_user;
    }


    public EntityItemStringType getTargetUser()
    {
        return target_user;
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



    /**
     */
    public void setMaxMinutesUntilChangePassword(
                    final EntityItemIntType maxMinutesUntilChangePassword
                    )
    {
        this.maxMinutesUntilChangePassword = maxMinutesUntilChangePassword;
    }


    public EntityItemIntType getMaxMinutesUntilChangePassword()
    {
        return maxMinutesUntilChangePassword;
    }



    /**
     */
    public void setMinMinutesUntilChangePassword(
                    final EntityItemIntType minMinutesUntilChangePassword
                    )
    {
        this.minMinutesUntilChangePassword = minMinutesUntilChangePassword;
    }


    public EntityItemIntType getMinMinutesUntilChangePassword()
    {
        return minMinutesUntilChangePassword;
    }



    /**
     */
    public void setRequiresMixedCase(
                    final EntityItemBoolType requiresMixedCase
                    )
    {
        this.requiresMixedCase = requiresMixedCase;
    }


    public EntityItemBoolType getRequiresMixedCase()
    {
        return requiresMixedCase;
    }



    /**
     */
    public void setRequiresSymbol(
                    final EntityItemBoolType requiresSymbol
                    )
    {
        this.requiresSymbol = requiresSymbol;
    }


    public EntityItemBoolType getRequiresSymbol()
    {
        return requiresSymbol;
    }



    /**
     */
    public void setMinutesUntilFailedLoginReset(
                    final EntityItemIntType minutesUntilFailedLoginReset
                    )
    {
        this.minutesUntilFailedLoginReset = minutesUntilFailedLoginReset;
    }


    public EntityItemIntType getMinutesUntilFailedLoginReset()
    {
        return minutesUntilFailedLoginReset;
    }



    /**
     */
    public void setUsingHistory(
                    final EntityItemIntType usingHistory
                    )
    {
        this.usingHistory = usingHistory;
    }


    public EntityItemIntType getUsingHistory()
    {
        return usingHistory;
    }



    /**
     */
    public void setCanModifyPasswordforSelf(
                    final EntityItemBoolType canModifyPasswordforSelf
                    )
    {
        this.canModifyPasswordforSelf = canModifyPasswordforSelf;
    }


    public EntityItemBoolType getCanModifyPasswordforSelf()
    {
        return canModifyPasswordforSelf;
    }



    /**
     */
    public void setUsingExpirationDate(
                    final EntityItemBoolType usingExpirationDate
                    )
    {
        this.usingExpirationDate = usingExpirationDate;
    }


    public EntityItemBoolType getUsingExpirationDate()
    {
        return usingExpirationDate;
    }



    /**
     */
    public void setUsingHardExpirationDate(
                    final EntityItemBoolType usingHardExpirationDate
                    )
    {
        this.usingHardExpirationDate = usingHardExpirationDate;
    }


    public EntityItemBoolType getUsingHardExpirationDate()
    {
        return usingHardExpirationDate;
    }



    /**
     */
    public void setExpirationDateGMT(
                    final EntityItemStringType expirationDateGMT
                    )
    {
        this.expirationDateGMT = expirationDateGMT;
    }


    public EntityItemStringType getExpirationDateGMT()
    {
        return expirationDateGMT;
    }



    /**
     */
    public void setHardExpireDateGMT(
                    final EntityItemStringType hardExpireDateGMT
                    )
    {
        this.hardExpireDateGMT = hardExpireDateGMT;
    }


    public EntityItemStringType getHardExpireDateGMT()
    {
        return hardExpireDateGMT;
    }



    /**
     */
    public void setMaxMinutesUntilDisabled(
                    final EntityItemIntType maxMinutesUntilDisabled
                    )
    {
        this.maxMinutesUntilDisabled = maxMinutesUntilDisabled;
    }


    public EntityItemIntType getMaxMinutesUntilDisabled()
    {
        return maxMinutesUntilDisabled;
    }



    /**
     */
    public void setMaxMinutesOfNonUse(
                    final EntityItemIntType maxMinutesOfNonUse
                    )
    {
        this.maxMinutesOfNonUse = maxMinutesOfNonUse;
    }


    public EntityItemIntType getMaxMinutesOfNonUse()
    {
        return maxMinutesOfNonUse;
    }



    /**
     */
    public void setNewPasswordRequired(
                    final EntityItemBoolType newPasswordRequired
                    )
    {
        this.newPasswordRequired = newPasswordRequired;
    }


    public EntityItemBoolType getNewPasswordRequired()
    {
        return newPasswordRequired;
    }



    /**
     */
    public void setNotGuessablePattern(
                    final EntityItemBoolType notGuessablePattern
                    )
    {
        this.notGuessablePattern = notGuessablePattern;
    }


    public EntityItemBoolType getNotGuessablePattern()
    {
        return notGuessablePattern;
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
        if (!(obj instanceof PwPolicy59Item)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "pwpolicy59_item[" + super.toString()
                        + ", target_user="             + getTargetUser()
                        + ", username="                + getUsername()
                        + ", userpass="                + getUserpass()
                        + ", directory_node="          + getDirectoryNode()
                        + ", maxChars="                + getMaxChars()
                        + ", maxFailedLoginAttempts="  + getMaxFailedLoginAttempts()
                        + ", minChars="                + getMinChars()
                        + ", passwordCannotBeName="    + getPasswordCannotBeName()
                        + ", requiresAlpha="           + getRequiresAlpha()
                        + ", requiresNumeric="         + getRequiresNumeric()

                        + ", maxMinutesUntilChangePassword="   + getMaxMinutesUntilChangePassword()
                        + ", minMinutesUntilChangePassword="   + getMinMinutesUntilChangePassword()
                        + ", requiresMixedCase="               + getRequiresMixedCase()
                        + ", requiresSymbol="                  + getRequiresSymbol()
                        + ", minutesUntilFailedLoginReset="    + getMinutesUntilFailedLoginReset()
                        + ", usingHistory="                    + getUsingHistory()
                        + ", canModifyPasswordforSelf="        + getCanModifyPasswordforSelf()
                        + ", usingExpirationDate="             + getUsingExpirationDate()
                        + ", usingHardExpirationDate="         + getUsingHardExpirationDate()
                        + ", expirationDateGMT="               + getExpirationDateGMT()
                        + ", hardExpireDateGMT="               + getHardExpireDateGMT()
                        + ", maxMinutesUntilDisabled="         + getMaxMinutesUntilDisabled()
                        + ", maxMinutesOfNonUse="              + getMaxMinutesOfNonUse()
                        + ", newPasswordRequired="             + getNewPasswordRequired()
                        + ", notGuessablePattern="             + getNotGuessablePattern()
             + "]";
    }
}
//
