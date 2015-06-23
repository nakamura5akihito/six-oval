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
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.sc.EntityItemBoolType;
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.ItemType;
import io.opensec.six.oval.model.sc.StatusEnumeration;



/**
 * The access token item holds information about the individual privileges
 * and rights associated with a specific access token.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class AccessTokenItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType    security_principle;

    private EntityItemBoolType     seassignprimarytokenprivilege;
    private EntityItemBoolType     sechangenotifyprivilege;
    private EntityItemBoolType     secreateglobalprivilege;
    private EntityItemBoolType     secreatepagefileprivilege;
    private EntityItemBoolType     secreatepermanentprivilege;
    private EntityItemBoolType     secreatesymboliclinkprivilege;
    private EntityItemBoolType     secreatetokenprivilege;
    private EntityItemBoolType     sedebugprivilege;
    private EntityItemBoolType     seenabledelegationprivilege;
    private EntityItemBoolType     seimpersonateprivilege;
    private EntityItemBoolType     seincreasebasepriorityprivilege;
    private EntityItemBoolType     seincreasequotaprivilege;
    private EntityItemBoolType     seincreaseworkingsetprivilege;
    private EntityItemBoolType     seloaddriverprivilege;
    private EntityItemBoolType     selockmemoryprivilege;
    private EntityItemBoolType     semachineaccountprivilege;
    private EntityItemBoolType     semanagevolumeprivilege;
    private EntityItemBoolType     seprofilesingleprocessprivilege;
    private EntityItemBoolType     serelabelprivilege;
    private EntityItemBoolType     seremoteshutdownprivilege;
    private EntityItemBoolType     serestoreprivilege;
    private EntityItemBoolType     sesecurityprivilege;
    private EntityItemBoolType     seshutdownprivilege;
    private EntityItemBoolType     sesyncagentprivilege;
    private EntityItemBoolType     sesystemenvironmentprivilege;
    private EntityItemBoolType     sesystemprofileprivilege;
    private EntityItemBoolType    sesystemtimeprivilege;
    private EntityItemBoolType    setakeownershipprivilege;
    private EntityItemBoolType    setcbprivilege;
    private EntityItemBoolType    setimezoneprivilege;
    private EntityItemBoolType    seundockprivilege;
    private EntityItemBoolType    seunsolicitedinputprivilege;
    private EntityItemBoolType    sebatchlogonright;
    private EntityItemBoolType    seinteractivelogonright;
    private EntityItemBoolType    senetworklogonright;
    private EntityItemBoolType    seremoteinteractivelogonright;
    private EntityItemBoolType    seservicelogonright;
    private EntityItemBoolType    sedenybatchLogonright;
    private EntityItemBoolType    sedenyinteractivelogonright;
    private EntityItemBoolType    sedenynetworklogonright;
    private EntityItemBoolType    sedenyremoteInteractivelogonright;
    private EntityItemBoolType    sedenyservicelogonright;
    private EntityItemBoolType    setrustedcredmanaccessnameright;



    /**
     * Constructor.
     */
    public AccessTokenItem()
    {
        this( 0 );
    }


    public AccessTokenItem(
                    final int id
                    )
    {
        this( id, null );
    }


    public AccessTokenItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        super( id, status );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.accesstoken;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.ACCESSTOKEN;
    }



    /**
     */
    public void setSecurityPrinciple(
                    final EntityItemStringType security_principle
                    )
    {
        this.security_principle = security_principle;
    }


    public EntityItemStringType getSecurityPrinciple()
    {
        return security_principle;
    }



    /**
     */
    public void setSeassignprimarytokenprivilege(
                    final EntityItemBoolType seassignprimarytokenprivilege
                    )
    {
        this.seassignprimarytokenprivilege = seassignprimarytokenprivilege;
    }


    public EntityItemBoolType getSeassignprimarytokenprivilege()
    {
        return seassignprimarytokenprivilege;
    }



    /**
     */
    public void setSechangenotifyprivilege(
                    final EntityItemBoolType sechangenotifyprivilege
                    )
    {
        this.sechangenotifyprivilege = sechangenotifyprivilege;
    }


    public EntityItemBoolType getSechangenotifyprivilege()
    {
        return sechangenotifyprivilege;
    }



    /**
     */
    public void setSecreateglobalprivilege(
                    final EntityItemBoolType secreateglobalprivilege
                    )
    {
        this.secreateglobalprivilege = secreateglobalprivilege;
    }


    public EntityItemBoolType getSecreateglobalprivilege()
    {
        return secreateglobalprivilege;
    }



    /**
     */
    public void setSecreatepagefileprivilege(
                    final EntityItemBoolType secreatepagefileprivilege
                    )
    {
        this.secreatepagefileprivilege = secreatepagefileprivilege;
    }


    public EntityItemBoolType getSecreatepagefileprivilege()
    {
        return secreatepagefileprivilege;
    }



    /**
     */
    public void setSecreatepermanentprivilege(
                    final EntityItemBoolType secreatepermanentprivilege
                    )
    {
        this.secreatepermanentprivilege = secreatepermanentprivilege;
    }


    public EntityItemBoolType getSecreatepermanentprivilege()
    {
        return secreatepermanentprivilege;
    }



    /**
     */
    public void setSecreatesymboliclinkprivilege(
                    final EntityItemBoolType secreatesymboliclinkprivilege
                    )
    {
        this.secreatesymboliclinkprivilege = secreatesymboliclinkprivilege;
    }


    public EntityItemBoolType getSecreatesymboliclinkprivilege()
    {
        return secreatesymboliclinkprivilege;
    }



    /**
     */
    public void setSecreatetokenprivilege(
                    final EntityItemBoolType secreatetokenprivilege
                    )
    {
        this.secreatetokenprivilege = secreatetokenprivilege;
    }


    public EntityItemBoolType getSecreatetokenprivilege()
    {
        return secreatetokenprivilege;
    }



    /**
     */
    public void setSedebugprivilege(
                    final EntityItemBoolType sedebugprivilege
                    )
    {
        this.sedebugprivilege = sedebugprivilege;
    }


    public EntityItemBoolType getSedebugprivilege()
    {
        return sedebugprivilege;
    }



    /**
     */
    public void setSeenabledelegationprivilege(
                    final EntityItemBoolType seenabledelegationprivilege
                    )
    {
        this.seenabledelegationprivilege = seenabledelegationprivilege;
    }


    public EntityItemBoolType getSeenabledelegationprivilege()
    {
        return seenabledelegationprivilege;
    }



    /**
     */
    public void setSeimpersonateprivilege(
                    final EntityItemBoolType seimpersonateprivilege
                    )
    {
        this.seimpersonateprivilege = seimpersonateprivilege;
    }


    public EntityItemBoolType getSeimpersonateprivilege()
    {
        return seimpersonateprivilege;
    }



    /**
     */
    public void setSeincreasebasepriorityprivilege(
                    final EntityItemBoolType seincreasebasepriorityprivilege
                    )
    {
        this.seincreasebasepriorityprivilege = seincreasebasepriorityprivilege;
    }


    public EntityItemBoolType getSeincreasebasepriorityprivilege()
    {
        return seincreasebasepriorityprivilege;
    }



    /**
     */
    public void setSeincreasequotaprivilege(
                    final EntityItemBoolType seincreasequotaprivilege
                    )
    {
        this.seincreasequotaprivilege = seincreasequotaprivilege;
    }


    public EntityItemBoolType getSeincreasequotaprivilege()
    {
        return seincreasequotaprivilege;
    }



    /**
     */
    public void setSeincreaseworkingsetprivilege(
                    final EntityItemBoolType seincreaseworkingsetprivilege
                    )
    {
        this.seincreaseworkingsetprivilege = seincreaseworkingsetprivilege;
    }


    public EntityItemBoolType getSeincreaseworkingsetprivilege()    {
        return seincreaseworkingsetprivilege;
    }



    /**
     */
    public void setSeloaddriverprivilege(
                    final EntityItemBoolType seloaddriverprivilege
                    )
    {
        this.seloaddriverprivilege = seloaddriverprivilege;
    }


    public EntityItemBoolType getSeloaddriverprivilege()    {
        return seloaddriverprivilege;
    }



    /**
     */
    public void setSelockmemoryprivilege(
                    final EntityItemBoolType selockmemoryprivilege
                    )
    {
        this.selockmemoryprivilege = selockmemoryprivilege;
    }


    public EntityItemBoolType getSelockmemoryprivilege()    {
        return selockmemoryprivilege;
    }



    /**
     */
    public void setSemachineaccountprivilege(
                    final EntityItemBoolType semachineaccountprivilege
                    )
    {
        this.semachineaccountprivilege = semachineaccountprivilege;
    }


    public EntityItemBoolType getSemachineaccountprivilege()    {
        return semachineaccountprivilege;
    }



    /**
     */
    public void setSemanagevolumeprivilege(
                    final EntityItemBoolType semanagevolumeprivilege
                    )
    {
        this.semanagevolumeprivilege = semanagevolumeprivilege;
    }


    public EntityItemBoolType getSemanagevolumeprivilege()    {
        return semanagevolumeprivilege;
    }



    /**
     */
    public void setSeprofilesingleprocessprivilege(
                    final EntityItemBoolType seprofilesingleprocessprivilege
                    )
    {
        this.seprofilesingleprocessprivilege = seprofilesingleprocessprivilege;
    }


    public EntityItemBoolType getSeprofilesingleprocessprivilege()    {
        return seprofilesingleprocessprivilege;
    }



    /**
     */
    public void setSerelabelprivilege(
                    final EntityItemBoolType serelabelprivilege
                    )
    {
        this.serelabelprivilege = serelabelprivilege;
    }


    public EntityItemBoolType getSerelabelprivilege()    {
        return serelabelprivilege;
    }



    /**
     */
    public void setSeremoteshutdownprivilege(
                    final EntityItemBoolType seremoteshutdownprivilege
                    )
    {
        this.seremoteshutdownprivilege = seremoteshutdownprivilege;
    }


    public EntityItemBoolType getSeremoteshutdownprivilege()    {
        return seremoteshutdownprivilege;
    }



    /**
     */
    public void setSerestoreprivilege(
                    final EntityItemBoolType serestoreprivilege
                    )
    {
        this.serestoreprivilege = serestoreprivilege;
    }


    public EntityItemBoolType getSerestoreprivilege()    {
        return serestoreprivilege;
    }



    /**
     */
    public void setSesecurityprivilege(
                    final EntityItemBoolType sesecurityprivilege
                    )
    {
        this.sesecurityprivilege = sesecurityprivilege;
    }


    public EntityItemBoolType getSesecurityprivilege()    {
        return sesecurityprivilege;
    }



    /**
     */
    public void setSeshutdownprivilege(
                    final EntityItemBoolType seshutdownprivilege
                    )
    {
        this.seshutdownprivilege = seshutdownprivilege;
    }


    public EntityItemBoolType getSeshutdownprivilege()    {
        return seshutdownprivilege;
    }



    /**
     */
    public void setSesyncagentprivilege(
                    final EntityItemBoolType sesyncagentprivilege
                    )
    {
        this.sesyncagentprivilege = sesyncagentprivilege;
    }


    public EntityItemBoolType getSesyncagentprivilege()    {
        return sesyncagentprivilege;
    }



    /**
     */
    public void setSesystemenvironmentprivilege(
                    final EntityItemBoolType sesystemenvironmentprivilege
                    )
    {
        this.sesystemenvironmentprivilege = sesystemenvironmentprivilege;
    }


    public EntityItemBoolType getSesystemenvironmentprivilege()    {
        return sesystemenvironmentprivilege;
    }



    /**
     */
    public void setSesystemprofileprivilege(
                    final EntityItemBoolType sesystemprofileprivilege
                    )
    {
        this.sesystemprofileprivilege = sesystemprofileprivilege;
    }


    public EntityItemBoolType getSesystemprofileprivilege()    {
        return sesystemprofileprivilege;
    }



    /**
     */
    public void setSesystemtimeprivilege(
                    final EntityItemBoolType sesystemtimeprivilege
                    )
    {
        this.sesystemtimeprivilege = sesystemtimeprivilege;
    }


    public EntityItemBoolType getSesystemtimeprivilege()    {
        return sesystemtimeprivilege;
    }



    /**
     */
    public void setSetakeownershipprivilege(
                    final EntityItemBoolType setakeownershipprivilege
                    )
    {
        this.setakeownershipprivilege = setakeownershipprivilege;
    }


    public EntityItemBoolType getSetakeownershipprivilege()    {
        return setakeownershipprivilege;
    }



    /**
     */
    public void setSetcbprivilege(
                    final EntityItemBoolType setcbprivilege
                    )
    {
        this.setcbprivilege = setcbprivilege;
    }


    public EntityItemBoolType getSetcbprivilege()    {
        return setcbprivilege;
    }



    /**
     */
    public void setSetimezoneprivilege(
                    final EntityItemBoolType setimezoneprivilege
                    )
    {
        this.setimezoneprivilege = setimezoneprivilege;
    }


    public EntityItemBoolType getSetimezoneprivilege()    {
        return setimezoneprivilege;
    }



    /**
     */
    public void setSeundockprivilege(
                    final EntityItemBoolType seundockprivilege
                    )
    {
        this.seundockprivilege = seundockprivilege;
    }


    public EntityItemBoolType getSeundockprivilege()    {
        return seundockprivilege;
    }



    /**
     */
    public void setSeunsolicitedinputprivilege(
                    final EntityItemBoolType seunsolicitedinputprivilege
                    )
    {
        this.seunsolicitedinputprivilege = seunsolicitedinputprivilege;
    }


    public EntityItemBoolType getSeunsolicitedinputprivilege()    {
        return seunsolicitedinputprivilege;
    }



    /**
     */
    public void setSebatchlogonright(
                    final EntityItemBoolType sebatchlogonright
                    )
    {
        this.sebatchlogonright = sebatchlogonright;
    }


    public EntityItemBoolType getSebatchlogonright()    {
        return sebatchlogonright;
    }



    /**
     */
    public void setSeinteractivelogonright(
                    final EntityItemBoolType seinteractivelogonright
                    )
    {
        this.seinteractivelogonright = seinteractivelogonright;
    }


    public EntityItemBoolType getSeinteractivelogonright()    {
        return seinteractivelogonright;
    }



    /**
     */
    public void setSenetworklogonright(
                    final EntityItemBoolType senetworklogonright
                    )
    {
        this.senetworklogonright = senetworklogonright;
    }


    public EntityItemBoolType getSenetworklogonright()    {
        return senetworklogonright;
    }



    /**
     */
    public void setSeremoteinteractivelogonright(
                    final EntityItemBoolType seremoteinteractivelogonright
                    )
    {
        this.seremoteinteractivelogonright = seremoteinteractivelogonright;
    }


    public EntityItemBoolType getSeremoteinteractivelogonright()    {
        return seremoteinteractivelogonright;
    }



    /**
     */
    public void setSeservicelogonright(
                    final EntityItemBoolType seservicelogonright
                    )
    {
        this.seservicelogonright = seservicelogonright;
    }


    public EntityItemBoolType getSeservicelogonright()    {
        return seservicelogonright;
    }



    /**
     */
    public void setSedenybatchLogonright(
                    final EntityItemBoolType sedenybatchLogonright
                    )
    {
        this.sedenybatchLogonright = sedenybatchLogonright;
    }


    public EntityItemBoolType getSedenybatchLogonright()    {
        return sedenybatchLogonright;
    }



    /**
     */
    public void setSedenyinteractivelogonright(
                    final EntityItemBoolType sedenyinteractivelogonright
                    )
    {
        this.sedenyinteractivelogonright = sedenyinteractivelogonright;
    }


    public EntityItemBoolType getSedenyinteractivelogonright()    {
        return sedenyinteractivelogonright;
    }



    /**
     */
    public void setSedenynetworklogonright(
                    final EntityItemBoolType sedenynetworklogonright
                    )
    {
        this.sedenynetworklogonright = sedenynetworklogonright;
    }


    public EntityItemBoolType getSedenynetworklogonright()    {
        return sedenynetworklogonright;
    }



    /**
     */
    public void setSedenyremoteInteractivelogonright(
                    final EntityItemBoolType sedenyremoteInteractivelogonright
                    )
    {
        this.sedenyremoteInteractivelogonright = sedenyremoteInteractivelogonright;
    }


    public EntityItemBoolType getSedenyremoteInteractivelogonright()    {
        return sedenyremoteInteractivelogonright;
    }



    /**
     */
    public void setSedenyservicelogonright(
                    final EntityItemBoolType sedenyservicelogonright
                    )
    {
        this.sedenyservicelogonright = sedenyservicelogonright;
    }


    public EntityItemBoolType getSedenyservicelogonright()    {
        return sedenyservicelogonright;
    }



    /**
     */
    public void setSetrustedcredmanaccessnameright(
                    final EntityItemBoolType setrustedcredmanaccessnameright
                    )
    {
        this.setrustedcredmanaccessnameright = setrustedcredmanaccessnameright;
    }


    public EntityItemBoolType getSetrustedcredmanaccessnameright()    {
        return setrustedcredmanaccessnameright;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "accesstoken_item[" + super.toString()
             + ", security_principle="  + getSecurityPrinciple()
             + ", seassignprimarytokenprivilege" + getSeassignprimarytokenprivilege()
             + ", sechangenotifyprivilege" + getSechangenotifyprivilege()
             + ", secreateglobalprivilege" + getSecreateglobalprivilege()
             + ", secreatepagefileprivilege" + getSecreatepagefileprivilege()
             + ", secreatepermanentprivilege" + getSecreatepermanentprivilege()
             + ", secreatesymboliclinkprivilege" + getSecreatesymboliclinkprivilege()
             + ", secreatetokenprivilege" + getSecreatetokenprivilege()
             + ", sedebugprivilege" + getSedebugprivilege()
             + ", seenabledelegationprivilege" + getSeenabledelegationprivilege()
             + ", seimpersonateprivilege" + getSeimpersonateprivilege()
             + ", seincreasebasepriorityprivilege" + getSeincreasebasepriorityprivilege()
             + ", seincreasequotaprivilege" + getSeincreasequotaprivilege()
             + ", seincreaseworkingsetprivilege" + getSeincreaseworkingsetprivilege()
             + ", seloaddriverprivilege" + getSeloaddriverprivilege()
             + ", selockmemoryprivilege" + getSelockmemoryprivilege()
             + ", semachineaccountprivilege" + getSemachineaccountprivilege()
             + ", semanagevolumeprivilege" + getSemanagevolumeprivilege()
             + ", seprofilesingleprocessprivilege" + getSeprofilesingleprocessprivilege()
             + ", serelabelprivilege" + getSerelabelprivilege()
             + ", seremoteshutdownprivilege" + getSeremoteshutdownprivilege()
             + ", serestoreprivilege" + getSerestoreprivilege()
             + ", sesecurityprivilege" + getSesecurityprivilege()
             + ", seshutdownprivilege" + getSeshutdownprivilege()
             + ", sesyncagentprivilege" + getSesyncagentprivilege()
             + ", sesystemenvironmentprivilege" + getSesystemenvironmentprivilege()
             + ", sesystemprofileprivilege" + getSesystemprofileprivilege()
             + ", sesystemtimeprivilege" + getSesystemtimeprivilege()
             + ", setakeownershipprivilege" + getSetakeownershipprivilege()
             + ", setcbprivilege" + getSetcbprivilege()
             + ", setimezoneprivilege" + getSetimezoneprivilege()
             + ", seundockprivilege" + getSeundockprivilege()
             + ", seunsolicitedinputprivilege" + getSeunsolicitedinputprivilege()
             + ", sebatchlogonright" + getSebatchlogonright()
             + ", seinteractivelogonright" + getSeinteractivelogonright()
             + ", senetworklogonright" + getSenetworklogonright()
             + ", seremoteinteractivelogonright" + getSeremoteinteractivelogonright()
             + ", seservicelogonright" + getSeservicelogonright()
             + ", sedenybatchLogonright" + getSedenybatchLogonright()
             + ", sedenyinteractivelogonright" + getSedenyinteractivelogonright()
             + ", sedenynetworklogonright" + getSedenynetworklogonright()
             + ", sedenyremoteInteractivelogonright" + getSedenyremoteInteractivelogonright()
             + ", sedenyservicelogonright" + getSedenyservicelogonright()
             + ", setrustedcredmanaccessnameright" + getSetrustedcredmanaccessnameright()
             + "]";
    }

}
//AccesstokenItem
