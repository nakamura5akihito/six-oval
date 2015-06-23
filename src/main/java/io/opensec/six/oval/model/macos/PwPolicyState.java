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
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 * @deprecated Deprecated as of version 5.9:
 *             Replaced by the pwpolicy59 state and
 *             will be removed in a future version of the language.
 */
@Deprecated
public class PwPolicyState
    extends StateType
{

    //{0..1}
    private EntityStateStringType   username;
    private EntityStateStringType   userpass;
    private EntityStateStringType   directory_node;
    private EntityStateIntType      maxChars;
    private EntityStateIntType      maxFailedLoginAttempts;
    private EntityStateIntType      minChars;
    private EntityStateBoolType     passwordCannotBeName;
    private EntityStateBoolType     requiresAlpha;
    private EntityStateBoolType     requiresNumeric;



    /**
     * Constructor.
     */
    public PwPolicyState()
    {
        this( null, 0 );
    }


    public PwPolicyState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public PwPolicyState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.MACOS;
        _oval_component = ComponentType.PWPOLICY;
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



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();

        ref_list.add( getUsername() );
        ref_list.add( getUserpass() );
        ref_list.add( getDirectoryNode() );
        ref_list.add( getMaxChars() );
        ref_list.add( getMaxFailedLoginAttempts() );
        ref_list.add( getMinChars() );
        ref_list.add( getPasswordCannotBeName() );
        ref_list.add( getRequiresAlpha() );
        ref_list.add( getRequiresNumeric() );

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
        if (!(obj instanceof PwPolicyState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "pwpolicy_state[" + super.toString()
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
