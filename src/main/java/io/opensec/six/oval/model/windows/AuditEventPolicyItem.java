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
import io.opensec.six.oval.model.sc.ItemType;
import io.opensec.six.oval.model.sc.StatusEnumeration;



/**
 * The auditeventpolicy item enumerates the different types of events
 * the system should audit.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class AuditEventPolicyItem
    extends ItemType
{

    private EntityItemAuditType  account_logon;
    //{0..1}

    private EntityItemAuditType  account_management;
    //{0..1}

    private EntityItemAuditType  detailed_tracking;
    //{0..1}

    private EntityItemAuditType  directory_service_access;
    //{0..1}

    private EntityItemAuditType  logon;
    //{0..1}

    private EntityItemAuditType  object_access;
    //{0..1}

    private EntityItemAuditType  policy_change;
    //{0..1}

    private EntityItemAuditType  privilege_use;
    //{0..1}

    private EntityItemAuditType  system;
    //{0..1}



    /**
     * Constructor.
     */
    public AuditEventPolicyItem()
    {
        this( 0 );
    }


    public AuditEventPolicyItem(
                    final int id
                    )
    {
        this( id, null );
    }


    public AuditEventPolicyItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        super( id, status );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.auditeventpolicy;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.AUDITEVENTPOLICY;
    }



    /**
     */
    public void setAccountLogon(
                    final EntityItemAuditType account_logon
                    )
    {
        this.account_logon = account_logon;
    }


    public EntityItemAuditType getAccountLogon()
    {
        return account_logon;
    }



    /**
     */
    public void setAccountManagement(
                    final EntityItemAuditType account_management
                    )
    {
        this.account_management = account_management;
    }


    public EntityItemAuditType getAccountManagement()
    {
        return account_management;
    }



    /**
     */
    public void setDetailedTracking(
                    final EntityItemAuditType detailed_tracking
                    )
    {
        this.detailed_tracking = detailed_tracking;
    }


    public EntityItemAuditType getDetailedTracking()
    {
        return detailed_tracking;
    }



    /**
     */
    public void setDirectoryServiceAccess(
                    final EntityItemAuditType directory_service_access
                    )
    {
        this.directory_service_access = directory_service_access;
    }


    public EntityItemAuditType getDirectoryServiceAccess()
    {
        return directory_service_access;
    }



    /**
     */
    public void setLogon(
                    final EntityItemAuditType logon
                    )
    {
        this.logon = logon;
    }


    public EntityItemAuditType getLogon()
    {
        return logon;
    }



    /**
     */
    public void setObjectAccess(
                    final EntityItemAuditType object_access
                    )
    {
        this.object_access = object_access;
    }


    public EntityItemAuditType getObjectAccess()
    {
        return object_access;
    }



    /**
     */
    public void setPolicyChange(
                    final EntityItemAuditType policy_change
                    )
    {
        this.policy_change = policy_change;
    }


    public EntityItemAuditType getPolicyChange()
    {
        return policy_change;
    }



    /**
     */
    public void setPrivilegeUse(
                    final EntityItemAuditType privilege_use
                    )
    {
        this.privilege_use = privilege_use;
    }


    public EntityItemAuditType getPrivilegeUse()
    {
        return privilege_use;
    }



    /**
     */
    public void setSystem(
                    final EntityItemAuditType system
                    )
    {
        this.system = system;
    }


    public EntityItemAuditType getSystem()
    {
        return system;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "auditeventpolicy_item[" + super.toString()
            + ", account_logon="            + getAccountLogon()
            + ", access_management="        + getAccountManagement()
            + ", detailed_tracking="        + getDetailedTracking()
            + ", directory_service_access=" + getDirectoryServiceAccess()
            + ", logon="                    + getLogon()
            + ", object_access="            + getObjectAccess()
            + ", policy_change="            + getPolicyChange()
            + ", privilege_use="            + getPrivilegeUse()
            + ", system="                   + getSystem()
             + "]";
    }

}
//AuditEventPolicyItem
