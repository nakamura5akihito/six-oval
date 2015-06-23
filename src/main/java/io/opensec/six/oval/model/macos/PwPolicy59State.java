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
import io.opensec.six.oval.model.definitions.EntityStateBoolType;
import io.opensec.six.oval.model.definitions.EntityStateIntType;
import io.opensec.six.oval.model.definitions.EntityStateStringType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;



/**
 * The pwpolicy59 state defines the different information that can be used to evaluate
 * the password policy for the target user in the specified directory node.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class PwPolicy59State
    extends StateType
{

    //{0..1}
    private EntityStateStringType   target_user;
    private EntityStateStringType   username;
    private EntityStateStringType   userpass;
    private EntityStateStringType   directory_node;
    private EntityStateIntType      maxChars;
    private EntityStateIntType      maxFailedLoginAttempts;
    private EntityStateIntType      minChars;
    private EntityStateBoolType     passwordCannotBeName;
    private EntityStateBoolType     requiresAlpha;
    private EntityStateBoolType     requiresNumeric;

    private EntityStateIntType      maxMinutesUntilChangePassword;
    private EntityStateIntType      minMinutesUntilChangePassword;
    private EntityStateBoolType     requiresMixedCase;
    private EntityStateBoolType     requiresSymbol;
    private EntityStateIntType      minutesUntilFailedLoginReset;
    private EntityStateIntType      usingHistory;
    private EntityStateBoolType     canModifyPasswordforSelf;
    private EntityStateBoolType     usingExpirationDate;
    private EntityStateBoolType     usingHardExpirationDate;
    private EntityStateStringType   expirationDateGMT;
    private EntityStateStringType   hardExpireDateGMT;
    private EntityStateIntType      maxMinutesUntilDisabled;
    private EntityStateIntType      maxMinutesOfNonUse;
    private EntityStateBoolType     newPasswordRequired;
    private EntityStateBoolType     notGuessablePattern;



    /**
     * Constructor.
     */
    public PwPolicy59State()
    {
        this( null, 0 );
    }


    public PwPolicy59State(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public PwPolicy59State(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.MACOS;
        _oval_component = ComponentType.PWPOLICY59;
    }



    /**
     */
    public void setTargetUser(
                    final EntityStateStringType target_user
                    )
    {
        this.target_user = target_user;
    }


    public EntityStateStringType getTargetUser()
    {
        return target_user;
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
    public void setUserpass(
                    final EntityStateStringType userpass
                    )
    {
        this.userpass = userpass;
    }


    public EntityStateStringType getUserpass()
    {
        return userpass;
    }



    /**
     */
    public void setDirectoryNode(
                    final EntityStateStringType directory_node
                    )
    {
        this.directory_node = directory_node;
    }


    public EntityStateStringType getDirectoryNode()
    {
        return directory_node;
    }



    /**
     */
    public void setMaxChars(
                    final EntityStateIntType maxChars
                    )
    {
        this.maxChars = maxChars;
    }


    public EntityStateIntType getMaxChars()
    {
        return maxChars;
    }



    /**
     */
    public void setMaxFailedLoginAttempts(
                    final EntityStateIntType maxFailedLoginAttempts
                    )
    {
        this.maxFailedLoginAttempts = maxFailedLoginAttempts;
    }


    public EntityStateIntType getMaxFailedLoginAttempts()
    {
        return maxFailedLoginAttempts;
    }



    /**
     */
    public void setMinChars(
                    final EntityStateIntType minChars
                    )
    {
        this.minChars = minChars;
    }


    public EntityStateIntType getMinChars()
    {
        return minChars;
    }



    /**
     */
    public void setPasswordCannotBeName(
                    final EntityStateBoolType passwordCannotBeName
                    )
    {
        this.passwordCannotBeName = passwordCannotBeName;
    }


    public EntityStateBoolType getPasswordCannotBeName()
    {
        return passwordCannotBeName;
    }



    /**
     */
    public void setRequiresAlpha(
                    final EntityStateBoolType requiresAlpha
                    )
    {
        this.requiresAlpha = requiresAlpha;
    }


    public EntityStateBoolType getRequiresAlpha()
    {
        return requiresAlpha;
    }



    /**
     */
    public void setRequiresNumeric(
                    final EntityStateBoolType requiresNumeric
                    )
    {
        this.requiresNumeric = requiresNumeric;
    }


    public EntityStateBoolType getRequiresNumeric()
    {
        return requiresNumeric;
    }



    /**
     */
    public void setMaxMinutesUntilChangePassword(
                    final EntityStateIntType maxMinutesUntilChangePassword
                    )
    {
        this.maxMinutesUntilChangePassword = maxMinutesUntilChangePassword;
    }


    public EntityStateIntType getMaxMinutesUntilChangePassword()
    {
        return maxMinutesUntilChangePassword;
    }



    /**
     */
    public void setMinMinutesUntilChangePassword(
                    final EntityStateIntType minMinutesUntilChangePassword
                    )
    {
        this.minMinutesUntilChangePassword = minMinutesUntilChangePassword;
    }


    public EntityStateIntType getMinMinutesUntilChangePassword()
    {
        return minMinutesUntilChangePassword;
    }



    /**
     */
    public void setRequiresMixedCase(
                    final EntityStateBoolType requiresMixedCase
                    )
    {
        this.requiresMixedCase = requiresMixedCase;
    }


    public EntityStateBoolType getRequiresMixedCase()
    {
        return requiresMixedCase;
    }



    /**
     */
    public void setRequiresSymbol(
                    final EntityStateBoolType requiresSymbol
                    )
    {
        this.requiresSymbol = requiresSymbol;
    }


    public EntityStateBoolType getRequiresSymbol()
    {
        return requiresSymbol;
    }



    /**
     */
    public void setMinutesUntilFailedLoginReset(
                    final EntityStateIntType minutesUntilFailedLoginReset
                    )
    {
        this.minutesUntilFailedLoginReset = minutesUntilFailedLoginReset;
    }


    public EntityStateIntType getMinutesUntilFailedLoginReset()
    {
        return minutesUntilFailedLoginReset;
    }



    /**
     */
    public void setUsingHistory(
                    final EntityStateIntType usingHistory
                    )
    {
        this.usingHistory = usingHistory;
    }


    public EntityStateIntType getUsingHistory()
    {
        return usingHistory;
    }



    /**
     */
    public void setCanModifyPasswordforSelf(
                    final EntityStateBoolType canModifyPasswordforSelf
                    )
    {
        this.canModifyPasswordforSelf = canModifyPasswordforSelf;
    }


    public EntityStateBoolType getCanModifyPasswordforSelf()
    {
        return canModifyPasswordforSelf;
    }



    /**
     */
    public void setUsingExpirationDate(
                    final EntityStateBoolType usingExpirationDate
                    )
    {
        this.usingExpirationDate = usingExpirationDate;
    }


    public EntityStateBoolType getUsingExpirationDate()
    {
        return usingExpirationDate;
    }



    /**
     */
    public void setUsingHardExpirationDate(
                    final EntityStateBoolType usingHardExpirationDate
                    )
    {
        this.usingHardExpirationDate = usingHardExpirationDate;
    }


    public EntityStateBoolType getUsingHardExpirationDate()
    {
        return usingHardExpirationDate;
    }



    /**
     */
    public void setExpirationDateGMT(
                    final EntityStateStringType expirationDateGMT
                    )
    {
        this.expirationDateGMT = expirationDateGMT;
    }


    public EntityStateStringType getExpirationDateGMT()
    {
        return expirationDateGMT;
    }



    /**
     */
    public void setHardExpireDateGMT(
                    final EntityStateStringType hardExpireDateGMT
                    )
    {
        this.hardExpireDateGMT = hardExpireDateGMT;
    }


    public EntityStateStringType getHardExpireDateGMT()
    {
        return hardExpireDateGMT;
    }



    /**
     */
    public void setMaxMinutesUntilDisabled(
                    final EntityStateIntType maxMinutesUntilDisabled
                    )
    {
        this.maxMinutesUntilDisabled = maxMinutesUntilDisabled;
    }


    public EntityStateIntType getMaxMinutesUntilDisabled()
    {
        return maxMinutesUntilDisabled;
    }



    /**
     */
    public void setMaxMinutesOfNonUse(
                    final EntityStateIntType maxMinutesOfNonUse
                    )
    {
        this.maxMinutesOfNonUse = maxMinutesOfNonUse;
    }


    public EntityStateIntType getMaxMinutesOfNonUse()
    {
        return maxMinutesOfNonUse;
    }



    /**
     */
    public void setNewPasswordRequired(
                    final EntityStateBoolType newPasswordRequired
                    )
    {
        this.newPasswordRequired = newPasswordRequired;
    }


    public EntityStateBoolType getNewPasswordRequired()
    {
        return newPasswordRequired;
    }



    /**
     */
    public void setNotGuessablePattern(
                    final EntityStateBoolType notGuessablePattern
                    )
    {
        this.notGuessablePattern = notGuessablePattern;
    }


    public EntityStateBoolType getNotGuessablePattern()
    {
        return notGuessablePattern;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();

        ref_list.add( getTargetUser() );
        ref_list.add( getUsername() );
        ref_list.add( getUserpass() );
        ref_list.add( getDirectoryNode() );
        ref_list.add( getMaxChars() );
        ref_list.add( getMaxFailedLoginAttempts() );
        ref_list.add( getMinChars() );
        ref_list.add( getPasswordCannotBeName() );
        ref_list.add( getRequiresAlpha() );
        ref_list.add( getRequiresNumeric() );
        ref_list.add( getMaxMinutesUntilChangePassword() );
        ref_list.add( getMinMinutesUntilChangePassword() );
        ref_list.add( getRequiresMixedCase() );
        ref_list.add( getRequiresSymbol() );
        ref_list.add( getMinutesUntilFailedLoginReset() );
        ref_list.add( getUsingHistory() );
        ref_list.add( getCanModifyPasswordforSelf() );
        ref_list.add( getUsingExpirationDate() );
        ref_list.add( getUsingHardExpirationDate() );
        ref_list.add( getExpirationDateGMT() );
        ref_list.add( getHardExpireDateGMT() );
        ref_list.add( getMaxMinutesUntilDisabled() );
        ref_list.add( getMaxMinutesOfNonUse() );
        ref_list.add( getNewPasswordRequired() );
        ref_list.add( getNotGuessablePattern() );

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
        if (!(obj instanceof PwPolicy59State)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "pwpolicy59_state[" + super.toString()
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
