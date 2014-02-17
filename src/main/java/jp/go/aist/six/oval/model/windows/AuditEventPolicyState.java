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

import java.util.ArrayList;
import java.util.Collection;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 * The auditeventpolicy state specifies the different system activities
 * that can be audited.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: AuditEventPolicyState.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class AuditEventPolicyState
    extends StateType
{

    private EntityStateAuditType  account_logon;
    //{0..1}

    private EntityStateAuditType  account_management;
    //{0..1}

    private EntityStateAuditType  detailed_tracking;
    //{0..1}

    private EntityStateAuditType  directory_service_access;
    //{0..1}

    private EntityStateAuditType  logon;
    //{0..1}

    private EntityStateAuditType  object_access;
    //{0..1}

    private EntityStateAuditType  policy_change;
    //{0..1}

    private EntityStateAuditType  privilege_use;
    //{0..1}

    private EntityStateAuditType  system;
    //{0..1}



//    private final EntityPropertyMap<RegistryProperty>  _properties =
//        RegistryProperty.createPropertyMap();



    /**
     * Constructor.
     */
    public AuditEventPolicyState()
    {
        this( null, 0 );
    }


    public AuditEventPolicyState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public AuditEventPolicyState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.auditeventpolicy;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.AUDITEVENTPOLICY;
    }



    /**
     */
    public void setAccountLogon(
                    final EntityStateAuditType account_logon
                    )
    {
        this.account_logon = account_logon;
    }


    public EntityStateAuditType getAccountLogon()
    {
        return account_logon;
    }



    /**
     */
    public void setAccountManagement(
                    final EntityStateAuditType account_management
                    )
    {
        this.account_management = account_management;
    }


    public EntityStateAuditType getAccountManagement()
    {
        return account_management;
    }



    /**
     */
    public void setDetailedTracking(
                    final EntityStateAuditType detailed_tracking
                    )
    {
        this.detailed_tracking = detailed_tracking;
    }


    public EntityStateAuditType getDetailedTracking()
    {
        return detailed_tracking;
    }



    /**
     */
    public void setDirectoryServiceAccess(
                    final EntityStateAuditType directory_service_access
                    )
    {
        this.directory_service_access = directory_service_access;
    }


    public EntityStateAuditType getDirectoryServiceAccess()
    {
        return directory_service_access;
    }



    /**
     */
    public void setLogon(
                    final EntityStateAuditType logon
                    )
    {
        this.logon = logon;
    }


    public EntityStateAuditType getLogon()
    {
        return logon;
    }



    /**
     */
    public void setObjectAccess(
                    final EntityStateAuditType object_access
                    )
    {
        this.object_access = object_access;
    }


    public EntityStateAuditType getObjectAccess()
    {
        return object_access;
    }



    /**
     */
    public void setPolicyChange(
                    final EntityStateAuditType policy_change
                    )
    {
        this.policy_change = policy_change;
    }


    public EntityStateAuditType getPolicyChange()
    {
        return policy_change;
    }



    /**
     */
    public void setPrivilegeUse(
                    final EntityStateAuditType privilege_use
                    )
    {
        this.privilege_use = privilege_use;
    }


    public EntityStateAuditType getPrivilegeUse()
    {
        return privilege_use;
    }



    /**
     */
    public void setSystem(
                    final EntityStateAuditType system
                    )
    {
        this.system = system;
    }


    public EntityStateAuditType getSystem()
    {
        return system;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();

        ref_list.add( getAccountLogon() );
        ref_list.add( getAccountManagement() );
        ref_list.add( getDetailedTracking() );
        ref_list.add( getDirectoryServiceAccess() );
        ref_list.add( getLogon() );
        ref_list.add( getObjectAccess() );
        ref_list.add( getPolicyChange() );
        ref_list.add( getPrivilegeUse() );
        ref_list.add( getSystem() );

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
        if (!(obj instanceof AuditEventPolicyState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "auditeventpolicy_state[" + super.toString()
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
//AuditEventPolicyState
