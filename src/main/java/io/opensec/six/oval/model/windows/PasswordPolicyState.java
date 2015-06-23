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
package io.opensec.six.oval.model.windows;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.definitions.EntityStateBoolType;
import io.opensec.six.oval.model.definitions.EntityStateIntType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;



/**
 * The passwordpolicy state specifies the various policies associated with passwords.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class PasswordPolicyState
    extends StateType
{

    //{0..1}
    private EntityStateIntType  max_passwd_age;
    private EntityStateIntType  min_passwd_age;
    private EntityStateIntType  min_passwd_len;
    private EntityStateIntType  password_hist_len;
    private EntityStateBoolType  password_complexity;
    private EntityStateBoolType  reversible_encryption;



    /**
     * Constructor.
     */
    public PasswordPolicyState()
    {
        this( null, 0 );
    }


    public PasswordPolicyState(
                    final String id,
                    final int version
                    )
    {
        super( id, version );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.passwordpolicy;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.PASSWORDPOLICY;
    }



    /**
     */
    public void setMaxPasswdAge(
                    final EntityStateIntType max_passwd_age
                    )
    {
        this.max_passwd_age = max_passwd_age;
    }


    public EntityStateIntType getMaxPasswdAge()
    {
        return max_passwd_age;
    }



    /**
     */
    public void setMinPasswdAge(
                    final EntityStateIntType min_passwd_age
                    )
    {
        this.min_passwd_age = min_passwd_age;
    }


    public EntityStateIntType getMinPasswdAge()
    {
        return min_passwd_age;
    }



    /**
     */
    public void setMinPasswdLen(
                    final EntityStateIntType min_passwd_len
                    )
    {
        this.min_passwd_len = min_passwd_len;
    }


    public EntityStateIntType getMinPasswdLen()
    {
        return min_passwd_len;
    }



    /**
     */
    public void setPasswordHistLen(
                    final EntityStateIntType password_hist_len
                    )
    {
        this.password_hist_len = password_hist_len;
    }


    public EntityStateIntType getPasswordHistLen()
    {
        return password_hist_len;
    }



    /**
     */
    public void setPasswordComplexity(
                    final EntityStateBoolType password_complexity
                    )
    {
        this.password_complexity = password_complexity;
    }


    public EntityStateBoolType getPasswordComplexity()
    {
        return password_complexity;
    }



    /**
     */
    public void setReversibleEncryption(
                    final EntityStateBoolType reversible_encryption
                    )
    {
        this.reversible_encryption = reversible_encryption;
    }


    public EntityStateBoolType getReversibleEncryption()
    {
        return reversible_encryption;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();

        ref_list.add( getMaxPasswdAge() );
        ref_list.add( getMinPasswdAge() );
        ref_list.add( getMinPasswdLen() );
        ref_list.add( getPasswordHistLen() );
        ref_list.add( getPasswordComplexity() );
        ref_list.add( getReversibleEncryption() );

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
        if (!(obj instanceof PasswordPolicyState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "passwordpolicy_state[" + super.toString()
                        + ", max_passwd_age="           + getMaxPasswdAge()
                        + ", min_passwd_age="           + getMinPasswdAge()
                        + ", min_passwd_len="           + getMinPasswdLen()
                        + ", password_hist_len="        + getPasswordHistLen()
                        + ", password_complexity="      + getPasswordComplexity()
                        + ", reversible_encryption="    + getReversibleEncryption()
                        + "]";
    }

}
//PasswordPolicyState
