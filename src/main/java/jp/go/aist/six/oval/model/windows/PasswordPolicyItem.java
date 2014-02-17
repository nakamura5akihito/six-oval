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

import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.sc.EntityItemBoolType;
import jp.go.aist.six.oval.model.sc.EntityItemIntType;
import jp.go.aist.six.oval.model.sc.ItemType;



/**
 * The password policy item specific policy items associated with passwords.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: PasswordPolicyItem.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class PasswordPolicyItem
    extends ItemType
{

    //{0..1}
    private EntityItemIntType  max_passwd_age;
    private EntityItemIntType  min_passwd_age;
    private EntityItemIntType  min_passwd_len;
    private EntityItemIntType  password_hist_len;
    private EntityItemBoolType  password_complexity;
    private EntityItemBoolType  reversible_encryption;



    /**
     * Constructor.
     */
    public PasswordPolicyItem()
    {
        this( 0 );
    }


    public PasswordPolicyItem(
                    final int id
                    )
    {
        super( id );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.passwordpolicy;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.PASSWORDPOLICY;
    }



    /**
     */
    public void setMaxPasswdAge(
                    final EntityItemIntType max_passwd_age
                    )
    {
        this.max_passwd_age = max_passwd_age;
    }


    public EntityItemIntType getMaxPasswdAge()
    {
        return max_passwd_age;
    }



    /**
     */
    public void setMinPasswdAge(
                    final EntityItemIntType min_passwd_age
                    )
    {
        this.min_passwd_age = min_passwd_age;
    }


    public EntityItemIntType getMinPasswdAge()
    {
        return min_passwd_age;
    }



    /**
     */
    public void setMinPasswdLen(
                    final EntityItemIntType min_passwd_len
                    )
    {
        this.min_passwd_len = min_passwd_len;
    }


    public EntityItemIntType getMinPasswdLen()
    {
        return min_passwd_len;
    }



    /**
     */
    public void setPasswordHistLen(
                    final EntityItemIntType password_hist_len
                    )
    {
        this.password_hist_len = password_hist_len;
    }


    public EntityItemIntType getPasswordHistLen()
    {
        return password_hist_len;
    }



    /**
     */
    public void setPasswordComplexity(
                    final EntityItemBoolType password_complexity
                    )
    {
        this.password_complexity = password_complexity;
    }


    public EntityItemBoolType getPasswordComplexity()
    {
        return password_complexity;
    }



    /**
     */
    public void setReversibleEncryption(
                    final EntityItemBoolType reversible_encryption
                    )
    {
        this.reversible_encryption = reversible_encryption;
    }


    public EntityItemBoolType getReversibleEncryption()
    {
        return reversible_encryption;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "passwordpolicy_item[" + super.toString()
                        + ", max_passwd_age="           + getMaxPasswdAge()
                        + ", min_passwd_age="           + getMinPasswdAge()
                        + ", min_passwd_len="           + getMinPasswdLen()
                        + ", password_hist_len="        + getPasswordHistLen()
                        + ", password_complexity="      + getPasswordComplexity()
                        + ", reversible_encryption="    + getReversibleEncryption()
             + "]";
    }

}
//PasswordPolicyItem
