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
package jp.go.aist.six.oval.model.unix;

import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.sc.EntityItemIntType;
import jp.go.aist.six.oval.model.sc.EntityItemStringType;
import jp.go.aist.six.oval.model.sc.ItemType;



/**
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: ShadowItem.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class ShadowItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType           username;
    private EntityItemStringType           password;
    private EntityItemIntType              chg_lst;
    private EntityItemIntType              chg_allow;
    private EntityItemIntType              chg_req;
    private EntityItemIntType              exp_warn;
    private EntityItemIntType              exp_inact;
    private EntityItemIntType              exp_date;
    private EntityItemStringType           flag;
    private EntityItemEncryptMethodType    encrypt_method;



    /**
     * Constructor.
     */
    public ShadowItem()
    {
        this( 0 );
    }


    public ShadowItem(
                    final int id
                    )
    {
        super( id );

//        _oval_platform_type = OvalPlatformType.unix;
//        _oval_component_type = OvalComponentType.shadow;
        _oval_family = Family.UNIX;
        _oval_component = ComponentType.SHADOW;
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
    public void setChgLst(
                    final EntityItemIntType chg_lst
                    )
    {
        this.chg_lst = chg_lst;
    }


    public EntityItemIntType getChgLst()
    {
        return chg_lst;
    }



    /**
     */
    public void setChgAllow(
                    final EntityItemIntType chg_allow
                    )
    {
        this.chg_allow = chg_allow;
    }


    public EntityItemIntType getChgAllow()
    {
        return chg_allow;
    }



    /**
     */
    public void setChgReq(
                    final EntityItemIntType chg_req
                    )
    {
        this.chg_req = chg_req;
    }


    public EntityItemIntType getChgReq()
    {
        return chg_req;
    }



    /**
     */
    public void setExpWarn(
                    final EntityItemIntType exp_warn
                    )
    {
        this.exp_warn = exp_warn;
    }


    public EntityItemIntType getExpWarn()
    {
        return exp_warn;
    }



    /**
     */
    public void setExpInact(
                    final EntityItemIntType exp_inact
                    )
    {
        this.exp_inact = exp_inact;
    }


    public EntityItemIntType getExpInact()
    {
        return exp_inact;
    }



    /**
     */
    public void setExpDate(
                    final EntityItemIntType exp_date
                    )
    {
        this.exp_date = exp_date;
    }


    public EntityItemIntType getExpDate()
    {
        return exp_date;
    }



    /**
     */
    public void setFlag(
                    final EntityItemStringType flag
                    )
    {
        this.flag = flag;
    }


    public EntityItemStringType getFlag()
    {
        return flag;
    }



    /**
     */
    public void setEncryptMethod(
                    final EntityItemEncryptMethodType encrypt_method
                    )
    {
        this.encrypt_method = encrypt_method;
    }


    public EntityItemEncryptMethodType getEncryptMethod()
    {
        return encrypt_method;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "shadow_item[" + super.toString()
                        + ", username="        + getUsername()
                        + ", password="        + getPassword()
                        + ", chg_lst="         + getChgLst()
                        + ", chg_allow="       + getChgAllow()
                        + ", chg_req="         + getChgReq()
                        + ", exp_warn="        + getExpWarn()
                        + ", exp_inact="       + getExpInact()
                        + ", exp_date="        + getExpDate()
                        + ", flag="            + getFlag()
                        + ", encrypt_method="  + getEncryptMethod()
             + "]";
    }

}
//ShadowItem
