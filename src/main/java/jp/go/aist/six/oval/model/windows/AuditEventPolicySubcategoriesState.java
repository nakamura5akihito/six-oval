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
 * The auditeventpolicysubcategories state specifies
 * the different system activities that can be audited.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: AuditEventPolicySubcategoriesState.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class AuditEventPolicySubcategoriesState
    extends StateType
{

    //{0..1}
    private EntityStateAuditType  credential_validation;
    private EntityStateAuditType  kerberos_authentication_service;
    private EntityStateAuditType  kerberos_service_ticket_operations;
    private EntityStateAuditType  kerberos_ticket_events;
    private EntityStateAuditType  other_account_logon_events;
    private EntityStateAuditType  application_group_management;
    private EntityStateAuditType  computer_account_management;
    private EntityStateAuditType  distribution_group_management;
    private EntityStateAuditType  other_account_management_events;
    private EntityStateAuditType  security_group_management;
    private EntityStateAuditType  user_account_management;
    private EntityStateAuditType  dpapi_activity;
    private EntityStateAuditType  process_creation;
    private EntityStateAuditType  process_termination;
    private EntityStateAuditType  rpc_events;
    private EntityStateAuditType  directory_service_access;
    private EntityStateAuditType  directory_service_changes;
    private EntityStateAuditType  directory_service_replication;
    private EntityStateAuditType  detailed_directory_service_replication;
    private EntityStateAuditType  account_lockout;
    private EntityStateAuditType  ipsec_extended_mode;
    private EntityStateAuditType  ipsec_main_mode;
    private EntityStateAuditType  ipsec_quick_mode;
    private EntityStateAuditType  logoff;
    private EntityStateAuditType  logon;
    private EntityStateAuditType  network_policy_server;
    private EntityStateAuditType  other_logon_logoff_events;
    private EntityStateAuditType  special_logon;
    private EntityStateAuditType  application_generated;
    private EntityStateAuditType  certification_services;
    private EntityStateAuditType  detailed_file_share;
    private EntityStateAuditType  file_share;
    private EntityStateAuditType  file_system;
    private EntityStateAuditType  filtering_platform_connection;
    private EntityStateAuditType  filtering_platform_packet_drop;
    private EntityStateAuditType  handle_manipulation;
    private EntityStateAuditType  kernel_object;
    private EntityStateAuditType  other_object_access_events;
    private EntityStateAuditType  registry;
    private EntityStateAuditType  sam;
    private EntityStateAuditType  audit_policy_change;
    private EntityStateAuditType  authentication_policy_change;
    private EntityStateAuditType  authorization_policy_change;
    private EntityStateAuditType  filtering_platform_policy_change;
    private EntityStateAuditType  mpssvc_rule_level_policy_change;
    private EntityStateAuditType  other_policy_change_events;
    private EntityStateAuditType  non_sensitive_privilege_use;
    private EntityStateAuditType  other_privilege_use_events;
    private EntityStateAuditType  sensitive_privilege_use;
    private EntityStateAuditType  ipsec_driver;
    private EntityStateAuditType  other_system_events;
    private EntityStateAuditType  security_state_change;
    private EntityStateAuditType  security_system_extension;
    private EntityStateAuditType  system_integrity;




    /**
     * Constructor.
     */
    public AuditEventPolicySubcategoriesState()
    {
        this( null, 0 );
    }


    public AuditEventPolicySubcategoriesState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public AuditEventPolicySubcategoriesState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.auditeventpolicysubcategories;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.AUDITEVENTPOLICYSUBCATEGORIES;
    }



    /**
     */
    public void setCredentialValidation(
                    final EntityStateAuditType credential_validation
                    )
    {
        this.credential_validation = credential_validation;
    }


    public EntityStateAuditType getCredentialValidation()
    {
        return credential_validation;
    }



    /**
     */
    public void setKerberosAuthenticationService(
                    final EntityStateAuditType kerberos_authentication_service
                    )
    {
        this.kerberos_authentication_service = kerberos_authentication_service;
    }


    public EntityStateAuditType getKerberosAuthenticationService()
    {
        return kerberos_authentication_service;
    }



    /**
     */
    public void setKerberosServiceTicketOperations(
                    final EntityStateAuditType kerberos_service_ticket_operations
                    )
    {
        this.kerberos_service_ticket_operations = kerberos_service_ticket_operations;
    }


    public EntityStateAuditType getKerberosServiceTicketOperations()
    {
        return kerberos_service_ticket_operations;
    }



    /**
     */
    public void setKerberosTicketEvents(
                    final EntityStateAuditType kerberos_ticket_events
                    )
    {
        this.kerberos_ticket_events = kerberos_ticket_events;
    }


    public EntityStateAuditType getKerberosTicketEvents()
    {
        return kerberos_ticket_events;
    }



    /**
     */
    public void setOtherAccountLogonEvents(
                    final EntityStateAuditType other_account_logon_events
                    )
    {
        this.other_account_logon_events = other_account_logon_events;
    }


    public EntityStateAuditType getOtherAccountLogonEvents()
    {
        return other_account_logon_events;
    }



    /**
     */
    public void setApplicationGroupManagement(
                    final EntityStateAuditType application_group_management
                    )
    {
        this.application_group_management = application_group_management;
    }


    public EntityStateAuditType getApplicationGroupManagement()
    {
        return application_group_management;
    }



    /**
     */
    public void setComputerAccountManagement(
                    final EntityStateAuditType computer_account_management
                    )
    {
        this.computer_account_management = computer_account_management;
    }


    public EntityStateAuditType getComputerAccountManagement()
    {
        return computer_account_management;
    }



    /**
     */
    public void setDistributionGroupManagement(
                    final EntityStateAuditType distribution_group_management
                    )
    {
        this.distribution_group_management = distribution_group_management;
    }


    public EntityStateAuditType getDistributionGroupManagement()
    {
        return distribution_group_management;
    }



    /**
     */
    public void setOtherAccountManagementEvents(
                    final EntityStateAuditType other_account_management_events
                    )
    {
        this.other_account_management_events = other_account_management_events;
    }


    public EntityStateAuditType getOtherAccountManagementEvents()
    {
        return other_account_management_events;
    }



    /**
     */
    public void setSecurityGroupManagement(
                    final EntityStateAuditType security_group_management
                    )
    {
        this.security_group_management = security_group_management;
    }


    public EntityStateAuditType getSecurityGroupManagement()
    {
        return security_group_management;
    }



    /**
     */
    public void setUserAccountManagement(
                    final EntityStateAuditType user_account_management
                    )
    {
        this.user_account_management = user_account_management;
    }


    public EntityStateAuditType getUserAccountManagement()
    {
        return user_account_management;
    }



    /**
     */
    public void setDpapiActivity(
                    final EntityStateAuditType dpapi_activity
                    )
    {
        this.dpapi_activity = dpapi_activity;
    }


    public EntityStateAuditType getDpapiActivity()
    {
        return dpapi_activity;
    }



    /**
     */
    public void setProcessCreation(
                    final EntityStateAuditType process_creation
                    )
    {
        this.process_creation = process_creation;
    }


    public EntityStateAuditType getProcessCreation()
    {
        return process_creation;
    }



    /**
     */
    public void setProcessTermination(
                    final EntityStateAuditType process_termination
                    )
    {
        this.process_termination = process_termination;
    }


    public EntityStateAuditType getProcessTermination()
    {
        return process_termination;
    }



    /**
     */
    public void setRpcEvents(
                    final EntityStateAuditType rpc_events
                    )
    {
        this.rpc_events = rpc_events;
    }


    public EntityStateAuditType getRpcEvents()
    {
        return rpc_events;
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
    public void setDirectoryServiceChanges(
                    final EntityStateAuditType directory_service_changes
                    )
    {
        this.directory_service_changes = directory_service_changes;
    }


    public EntityStateAuditType getDirectoryServiceChanges()
    {
        return directory_service_changes;
    }



    /**
     */
    public void setDirectoryServiceReplication(
                    final EntityStateAuditType directory_service_replication
                    )
    {
        this.directory_service_replication = directory_service_replication;
    }


    public EntityStateAuditType getDirectoryServiceReplication()
    {
        return directory_service_replication;
    }



    /**
     */
    public void setDetailedDirectoryServiceReplication(
                    final EntityStateAuditType detailed_directory_service_replication
                    )
    {
        this.detailed_directory_service_replication = detailed_directory_service_replication;
    }


    public EntityStateAuditType getDetailedDirectoryServiceReplication()
    {
        return detailed_directory_service_replication;
    }



    /**
     */
    public void setAccountLockout(
                    final EntityStateAuditType account_lockout
                    )
    {
        this.account_lockout = account_lockout;
    }


    public EntityStateAuditType getAccountLockout()
    {
        return account_lockout;
    }



    /**
     */
    public void setIpsecExtendedMode(
                    final EntityStateAuditType ipsec_extended_mode
                    )
    {
        this.ipsec_extended_mode = ipsec_extended_mode;
    }


    public EntityStateAuditType getIpsecExtendedMode()
    {
        return ipsec_extended_mode;
    }



    /**
     */
    public void setIpsecMainMode(
                    final EntityStateAuditType ipsec_main_mode
                    )
    {
        this.ipsec_main_mode = ipsec_main_mode;
    }


    public EntityStateAuditType getIpsecMainMode()
    {
        return ipsec_main_mode;
    }



    /**
     */
    public void setIpsecQuickMode(
                    final EntityStateAuditType ipsec_quick_mode
                    )
    {
        this.ipsec_quick_mode = ipsec_quick_mode;
    }


    public EntityStateAuditType getIpsecQuickMode()
    {
        return ipsec_quick_mode;
    }



    /**
     */
    public void setLogoff(
                    final EntityStateAuditType logoff
                    )
    {
        this.logoff = logoff;
    }


    public EntityStateAuditType getLogoff()
    {
        return logoff;
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
    public void setNetworkPolicyServer(
                    final EntityStateAuditType network_policy_server
                    )
    {
        this.network_policy_server = network_policy_server;
    }


    public EntityStateAuditType getNetworkPolicyServer()
    {
        return network_policy_server;
    }



    /**
     */
    public void setOtherLogonLogoffEvents(
                    final EntityStateAuditType other_logon_logoff_events
                    )
    {
        this.other_logon_logoff_events = other_logon_logoff_events;
    }


    public EntityStateAuditType getOtherLogonLogoffEvents()
    {
        return other_logon_logoff_events;
    }



    /**
     */
    public void setSpecialLogon(
                    final EntityStateAuditType special_logon
                    )
    {
        this.special_logon = special_logon;
    }


    public EntityStateAuditType getSpecialLogon()
    {
        return special_logon;
    }



    /**
     */
    public void setApplicationGenerated(
                    final EntityStateAuditType application_generated
                    )
    {
        this.application_generated = application_generated;
    }


    public EntityStateAuditType getApplicationGenerated()
    {
        return application_generated;
    }



    /**
     */
    public void setCertificationServices(
                    final EntityStateAuditType certification_services
                    )
    {
        this.certification_services = certification_services;
    }


    public EntityStateAuditType getCertificationServices()
    {
        return certification_services;
    }



    /**
     */
    public void setDetailedFileShare(
                    final EntityStateAuditType detailed_file_share
                    )
    {
        this.detailed_file_share = detailed_file_share;
    }


    public EntityStateAuditType getDetailedFileShare()
    {
        return detailed_file_share;
    }



    /**
     */
    public void setFileShare(
                    final EntityStateAuditType file_share
                    )
    {
        this.file_share = file_share;
    }


    public EntityStateAuditType getFileShare()
    {
        return file_share;
    }



    /**
     */
    public void setFileSystem(
                    final EntityStateAuditType file_system
                    )
    {
        this.file_system = file_system;
    }


    public EntityStateAuditType getFileSystem()
    {
        return file_system;
    }



    /**
     */
    public void setFilteringPlatformConnection(
                    final EntityStateAuditType filtering_platform_connection
                    )
    {
        this.filtering_platform_connection = filtering_platform_connection;
    }


    public EntityStateAuditType getFilteringPlatformConnection()
    {
        return filtering_platform_connection;
    }



    /**
     */
    public void setFilteringPlatformPacketDrop(
                    final EntityStateAuditType filtering_platform_packet_drop
                    )
    {
        this.filtering_platform_packet_drop = filtering_platform_packet_drop;
    }


    public EntityStateAuditType getFilteringPlatformPacketDrop()
    {
        return filtering_platform_packet_drop;
    }



    /**
     */
    public void setHandleManipulation(
                    final EntityStateAuditType handle_manipulation
                    )
    {
        this.handle_manipulation = handle_manipulation;
    }


    public EntityStateAuditType getHandleManipulation()
    {
        return handle_manipulation;
    }



    /**
     */
    public void setKernelObject(
                    final EntityStateAuditType kernel_object
                    )
    {
        this.kernel_object = kernel_object;
    }


    public EntityStateAuditType getKernelObject()
    {
        return kernel_object;
    }



    /**
     */
    public void setOtherObjectAccessEvents(
                    final EntityStateAuditType other_object_access_events
                    )
    {
        this.other_object_access_events = other_object_access_events;
    }


    public EntityStateAuditType getOtherObjectAccessEvents()
    {
        return other_object_access_events;
    }



    /**
     */
    public void setRegistry(
                    final EntityStateAuditType registry
                    )
    {
        this.registry = registry;
    }


    public EntityStateAuditType getRegistry()
    {
        return registry;
    }



    /**
     */
    public void setSam(
                    final EntityStateAuditType sam
                    )
    {
        this.sam = sam;
    }


    public EntityStateAuditType getSam()
    {
        return sam;
    }



    /**
     */
    public void setAuditPolicyChange(
                    final EntityStateAuditType audit_policy_change
                    )
    {
        this.audit_policy_change = audit_policy_change;
    }


    public EntityStateAuditType getAuditPolicyChange()
    {
        return audit_policy_change;
    }



    /**
     */
    public void setAuthenticationPolicyChange(
                    final EntityStateAuditType authentication_policy_change
                    )
    {
        this.authentication_policy_change = authentication_policy_change;
    }


    public EntityStateAuditType getAuthenticationPolicyChange()
    {
        return authentication_policy_change;
    }



    /**
     */
    public void setAuthorizationPolicyChange(
                    final EntityStateAuditType authorization_policy_change
                    )
    {
        this.authorization_policy_change = authorization_policy_change;
    }


    public EntityStateAuditType getAuthorizationPolicyChange()
    {
        return authorization_policy_change;
    }



    /**
     */
    public void setFilteringPlatformPolicyChange(
                    final EntityStateAuditType filtering_platform_policy_change
                    )
    {
        this.filtering_platform_policy_change = filtering_platform_policy_change;
    }


    public EntityStateAuditType getFilteringPlatformPolicyChange()
    {
        return filtering_platform_policy_change;
    }



    /**
     */
    public void setMpssvcRuleLevelPolicyChange(
                    final EntityStateAuditType mpssvc_rule_level_policy_change
                    )
    {
        this.mpssvc_rule_level_policy_change = mpssvc_rule_level_policy_change;
    }


    public EntityStateAuditType getMpssvcRuleLevelPolicyChange()
    {
        return mpssvc_rule_level_policy_change;
    }



    /**
     */
    public void setOtherPolicyChangeEvents(
                    final EntityStateAuditType other_policy_change_events
                    )
    {
        this.other_policy_change_events = other_policy_change_events;
    }


    public EntityStateAuditType getOtherPolicyChangeEvents()
    {
        return other_policy_change_events;
    }



    /**
     */
    public void setNonSensitivePrivilegeUse(
                    final EntityStateAuditType non_sensitive_privilege_use
                    )
    {
        this.non_sensitive_privilege_use = non_sensitive_privilege_use;
    }


    public EntityStateAuditType getNonSensitivePrivilegeUse()
    {
        return non_sensitive_privilege_use;
    }



    /**
     */
    public void setOtherPrivilegeUseEvents(
                    final EntityStateAuditType other_privilege_use_events
                    )
    {
        this.other_privilege_use_events = other_privilege_use_events;
    }


    public EntityStateAuditType getOtherPrivilegeUseEvents()
    {
        return other_privilege_use_events;
    }



    /**
     */
    public void setSensitivePrivilegeUse(
                    final EntityStateAuditType sensitive_privilege_use
                    )
    {
        this.sensitive_privilege_use = sensitive_privilege_use;
    }


    public EntityStateAuditType getSensitivePrivilegeUse()
    {
        return sensitive_privilege_use;
    }



    /**
     */
    public void setIpsecDriver(
                    final EntityStateAuditType ipsec_driver
                    )
    {
        this.ipsec_driver = ipsec_driver;
    }


    public EntityStateAuditType getIpsecDriver()
    {
        return ipsec_driver;
    }



    /**
     */
    public void setOtherSystemEvents(
                    final EntityStateAuditType other_system_events
                    )
    {
        this.other_system_events = other_system_events;
    }


    public EntityStateAuditType getOtherSystemEvents()
    {
        return other_system_events;
    }



    /**
     */
    public void setSecurityStateChange(
                    final EntityStateAuditType security_state_change
                    )
    {
        this.security_state_change = security_state_change;
    }


    public EntityStateAuditType getSecurityStateChange()
    {
        return security_state_change;
    }



    /**
     */
    public void setSecuritySystemExtension(
                    final EntityStateAuditType security_system_extension
                    )
    {
        this.security_system_extension = security_system_extension;
    }


    public EntityStateAuditType getSecuritySystemExtension()
    {
        return security_system_extension;
    }



    /**
     */
    public void setSystemIntegrity(
                    final EntityStateAuditType system_integrity
                    )
    {
        this.system_integrity = system_integrity;
    }


    public EntityStateAuditType getSystemIntegrity()
    {
        return system_integrity;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();

        ref_list.add( getCredentialValidation() );
        ref_list.add( getKerberosAuthenticationService() );
        ref_list.add( getKerberosServiceTicketOperations() );
        ref_list.add( getKerberosTicketEvents() );
        ref_list.add( getOtherAccountLogonEvents() );
        ref_list.add( getApplicationGroupManagement() );
        ref_list.add( getComputerAccountManagement() );
        ref_list.add( getDistributionGroupManagement() );
        ref_list.add( getOtherAccountManagementEvents() );
        ref_list.add( getSecurityGroupManagement() );
        ref_list.add( getUserAccountManagement() );
        ref_list.add( getDpapiActivity() );
        ref_list.add( getProcessCreation() );
        ref_list.add( getProcessTermination() );
        ref_list.add( getRpcEvents() );
        ref_list.add( getDirectoryServiceAccess() );
        ref_list.add( getDirectoryServiceChanges() );
        ref_list.add( getDirectoryServiceReplication() );
        ref_list.add( getDetailedDirectoryServiceReplication() );
        ref_list.add( getAccountLockout() );
        ref_list.add( getIpsecExtendedMode() );
        ref_list.add( getIpsecMainMode() );
        ref_list.add( getIpsecQuickMode() );
        ref_list.add( getLogoff() );
        ref_list.add( getLogon() );
        ref_list.add( getNetworkPolicyServer() );
        ref_list.add( getOtherLogonLogoffEvents() );
        ref_list.add( getSpecialLogon() );
        ref_list.add( getApplicationGenerated() );
        ref_list.add( getCertificationServices() );
        ref_list.add( getDetailedFileShare() );
        ref_list.add( getFileShare() );
        ref_list.add( getFileSystem() );
        ref_list.add( getFilteringPlatformConnection() );
        ref_list.add( getFilteringPlatformPacketDrop() );
        ref_list.add( getHandleManipulation() );
        ref_list.add( getKernelObject() );
        ref_list.add( getOtherObjectAccessEvents() );
        ref_list.add( getRegistry() );
        ref_list.add( getSam() );
        ref_list.add( getAuditPolicyChange() );
        ref_list.add( getAuthenticationPolicyChange() );
        ref_list.add( getAuthorizationPolicyChange() );
        ref_list.add( getFilteringPlatformPolicyChange() );
        ref_list.add( getMpssvcRuleLevelPolicyChange() );
        ref_list.add( getOtherPolicyChangeEvents() );
        ref_list.add( getNonSensitivePrivilegeUse() );
        ref_list.add( getOtherPrivilegeUseEvents() );
        ref_list.add( getSensitivePrivilegeUse() );
        ref_list.add( getIpsecDriver() );
        ref_list.add( getOtherSystemEvents() );
        ref_list.add( getSecurityStateChange() );
        ref_list.add( getSecuritySystemExtension() );
        ref_list.add( getSystemIntegrity() );

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
        if (!(obj instanceof AuditEventPolicySubcategoriesState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "auditeventpolicysubcategories_state[" + super.toString()
                        + ", credential_validation="                    + getCredentialValidation()
                        + ", kerberos_authentication_service="          + getKerberosAuthenticationService()
                        + ", kerberos_service_ticket_operations="       + getKerberosServiceTicketOperations()
                        + ", kerberos_ticket_events="                   + getKerberosTicketEvents()
                        + ", other_account_logon_events="               + getOtherAccountLogonEvents()
                        + ", application_group_management="             + getApplicationGroupManagement()
                        + ", computer_account_management="              + getComputerAccountManagement()
                        + ", distribution_group_management="            + getDistributionGroupManagement()
                        + ", other_account_management_events="          + getOtherAccountManagementEvents()
                        + ", security_group_management="                + getSecurityGroupManagement()
                        + ", user_account_management="                  + getUserAccountManagement()
                        + ", dpapi_activity="                           + getDpapiActivity()
                        + ", process_creation="                         + getProcessCreation()
                        + ", process_termination="                      + getProcessTermination()
                        + ", rpc_events="                               + getRpcEvents()
                        + ", directory_service_access="                 + getDirectoryServiceAccess()
                        + ", directory_service_changes="                + getDirectoryServiceChanges()
                        + ", directory_service_replication="            + getDirectoryServiceReplication()
                        + ", detailed_directory_service_replication="   + getDetailedDirectoryServiceReplication()
                        + ", account_lockout="                          + getAccountLockout()
                        + ", ipsec_extended_mode="                      + getIpsecExtendedMode()
                        + ", ipsec_main_mode="                          + getIpsecMainMode()
                        + ", ipsec_quick_mode="                         + getIpsecQuickMode()
                        + ", logoff="                                   + getLogoff()
                        + ", logon="                                    + getLogon()
                        + ", network_policy_server="                    + getNetworkPolicyServer()
                        + ", other_logon_logoff_events="                + getOtherLogonLogoffEvents()
                        + ", special_logon="                            + getSpecialLogon()
                        + ", application_generated="                    + getApplicationGenerated()
                        + ", certification_services="                   + getCertificationServices()
                        + ", detailed_file_share="                      + getDetailedFileShare()
                        + ", file_share="                               + getFileShare()
                        + ", file_system="                              + getFileSystem()
                        + ", filtering_platform_connection="            + getFilteringPlatformConnection()
                        + ", filtering_platform_packet_drop="           + getFilteringPlatformPacketDrop()
                        + ", handle_manipulation="                      + getHandleManipulation()
                        + ", kernel_object="                            + getKernelObject()
                        + ", other_object_access_events="               + getOtherObjectAccessEvents()
                        + ", registry="                                 + getRegistry()
                        + ", sam="                                      + getSam()
                        + ", audit_policy_change="                      + getAuditPolicyChange()
                        + ", authentication_policy_change="             + getAuthenticationPolicyChange()
                        + ", authorization_policy_change="              + getAuthorizationPolicyChange()
                        + ", filtering_platform_policy_change="         + getFilteringPlatformPolicyChange()
                        + ", mpssvc_rule_level_policy_change="          + getMpssvcRuleLevelPolicyChange()
                        + ", other_policy_change_events="               + getOtherPolicyChangeEvents()
                        + ", non_sensitive_privilege_use="              + getNonSensitivePrivilegeUse()
                        + ", other_privilege_use_events="               + getOtherPrivilegeUseEvents()
                        + ", sensitive_privilege_use="                  + getSensitivePrivilegeUse()
                        + ", ipsec_driver="                             + getIpsecDriver()
                        + ", other_system_events="                      + getOtherSystemEvents()
                        + ", security_state_change="                    + getSecurityStateChange()
                        + ", security_system_extension="                + getSecuritySystemExtension()
                        + ", system_integrity="                         + getSystemIntegrity()
                        + "]";
    }

}
//AuditEventPolicySubcategoriesState
