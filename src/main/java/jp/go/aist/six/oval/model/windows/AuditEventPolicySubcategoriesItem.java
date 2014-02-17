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
import jp.go.aist.six.oval.model.sc.ItemType;



/**
 * The auditeventpolicysubcategories item is used to hold information
 * about the audit event policy settings on a Windows system.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: AuditEventPolicySubcategoriesItem.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class AuditEventPolicySubcategoriesItem
    extends ItemType
{

    //{0..1}
    private EntityItemAuditType  credential_validation;
    private EntityItemAuditType  kerberos_authentication_service;
    private EntityItemAuditType  kerberos_service_ticket_operations;
    private EntityItemAuditType  kerberos_ticket_events;
    private EntityItemAuditType  other_account_logon_events;
    private EntityItemAuditType  application_group_management;
    private EntityItemAuditType  computer_account_management;
    private EntityItemAuditType  distribution_group_management;
    private EntityItemAuditType  other_account_management_events;
    private EntityItemAuditType  security_group_management;
    private EntityItemAuditType  user_account_management;
    private EntityItemAuditType  dpapi_activity;
    private EntityItemAuditType  process_creation;
    private EntityItemAuditType  process_termination;
    private EntityItemAuditType  rpc_events;
    private EntityItemAuditType  directory_service_access;
    private EntityItemAuditType  directory_service_changes;
    private EntityItemAuditType  directory_service_replication;
    private EntityItemAuditType  detailed_directory_service_replication;
    private EntityItemAuditType  account_lockout;
    private EntityItemAuditType  ipsec_extended_mode;
    private EntityItemAuditType  ipsec_main_mode;
    private EntityItemAuditType  ipsec_quick_mode;
    private EntityItemAuditType  logoff;
    private EntityItemAuditType  logon;
    private EntityItemAuditType  network_policy_server;
    private EntityItemAuditType  other_logon_logoff_events;
    private EntityItemAuditType  special_logon;
    private EntityItemAuditType  application_generated;
    private EntityItemAuditType  certification_services;
    private EntityItemAuditType  detailed_file_share;
    private EntityItemAuditType  file_share;
    private EntityItemAuditType  file_system;
    private EntityItemAuditType  filtering_platform_connection;
    private EntityItemAuditType  filtering_platform_packet_drop;
    private EntityItemAuditType  handle_manipulation;
    private EntityItemAuditType  kernel_object;
    private EntityItemAuditType  other_object_access_events;
    private EntityItemAuditType  registry;
    private EntityItemAuditType  sam;
    private EntityItemAuditType  audit_policy_change;
    private EntityItemAuditType  authentication_policy_change;
    private EntityItemAuditType  authorization_policy_change;
    private EntityItemAuditType  filtering_platform_policy_change;
    private EntityItemAuditType  mpssvc_rule_level_policy_change;
    private EntityItemAuditType  other_policy_change_events;
    private EntityItemAuditType  non_sensitive_privilege_use;
    private EntityItemAuditType  other_privilege_use_events;
    private EntityItemAuditType  sensitive_privilege_use;
    private EntityItemAuditType  ipsec_driver;
    private EntityItemAuditType  other_system_events;
    private EntityItemAuditType  security_state_change;
    private EntityItemAuditType  security_system_extension;
    private EntityItemAuditType  system_integrity;



    /**
     * Constructor.
     */
    public AuditEventPolicySubcategoriesItem()
    {
        this( 0 );
    }


    public AuditEventPolicySubcategoriesItem(
                    final int id
                    )
    {
        super( id );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.auditeventpolicysubcategories;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.AUDITEVENTPOLICYSUBCATEGORIES;
    }



    /**
     */
    public void setCredentialValidation(
                    final EntityItemAuditType credential_validation
                    )
    {
        this.credential_validation = credential_validation;
    }


    public EntityItemAuditType getCredentialValidation()
    {
        return credential_validation;
    }



    /**
     */
    public void setKerberosAuthenticationService(
                    final EntityItemAuditType kerberos_authentication_service
                    )
    {
        this.kerberos_authentication_service = kerberos_authentication_service;
    }


    public EntityItemAuditType getKerberosAuthenticationService()
    {
        return kerberos_authentication_service;
    }



    /**
     */
    public void setKerberosServiceTicketOperations(
                    final EntityItemAuditType kerberos_service_ticket_operations
                    )
    {
        this.kerberos_service_ticket_operations = kerberos_service_ticket_operations;
    }


    public EntityItemAuditType getKerberosServiceTicketOperations()
    {
        return kerberos_service_ticket_operations;
    }



    /**
     */
    public void setKerberosTicketEvents(
                    final EntityItemAuditType kerberos_ticket_events
                    )
    {
        this.kerberos_ticket_events = kerberos_ticket_events;
    }


    public EntityItemAuditType getKerberosTicketEvents()
    {
        return kerberos_ticket_events;
    }



    /**
     */
    public void setOtherAccountLogonEvents(
                    final EntityItemAuditType other_account_logon_events
                    )
    {
        this.other_account_logon_events = other_account_logon_events;
    }


    public EntityItemAuditType getOtherAccountLogonEvents()
    {
        return other_account_logon_events;
    }



    /**
     */
    public void setApplicationGroupManagement(
                    final EntityItemAuditType application_group_management
                    )
    {
        this.application_group_management = application_group_management;
    }


    public EntityItemAuditType getApplicationGroupManagement()
    {
        return application_group_management;
    }



    /**
     */
    public void setComputerAccountManagement(
                    final EntityItemAuditType computer_account_management
                    )
    {
        this.computer_account_management = computer_account_management;
    }


    public EntityItemAuditType getComputerAccountManagement()
    {
        return computer_account_management;
    }



    /**
     */
    public void setDistributionGroupManagement(
                    final EntityItemAuditType distribution_group_management
                    )
    {
        this.distribution_group_management = distribution_group_management;
    }


    public EntityItemAuditType getDistributionGroupManagement()
    {
        return distribution_group_management;
    }



    /**
     */
    public void setOtherAccountManagementEvents(
                    final EntityItemAuditType other_account_management_events
                    )
    {
        this.other_account_management_events = other_account_management_events;
    }


    public EntityItemAuditType getOtherAccountManagementEvents()
    {
        return other_account_management_events;
    }



    /**
     */
    public void setSecurityGroupManagement(
                    final EntityItemAuditType security_group_management
                    )
    {
        this.security_group_management = security_group_management;
    }


    public EntityItemAuditType getSecurityGroupManagement()
    {
        return security_group_management;
    }



    /**
     */
    public void setUserAccountManagement(
                    final EntityItemAuditType user_account_management
                    )
    {
        this.user_account_management = user_account_management;
    }


    public EntityItemAuditType getUserAccountManagement()
    {
        return user_account_management;
    }



    /**
     */
    public void setDpapiActivity(
                    final EntityItemAuditType dpapi_activity
                    )
    {
        this.dpapi_activity = dpapi_activity;
    }


    public EntityItemAuditType getDpapiActivity()
    {
        return dpapi_activity;
    }



    /**
     */
    public void setProcessCreation(
                    final EntityItemAuditType process_creation
                    )
    {
        this.process_creation = process_creation;
    }


    public EntityItemAuditType getProcessCreation()
    {
        return process_creation;
    }



    /**
     */
    public void setProcessTermination(
                    final EntityItemAuditType process_termination
                    )
    {
        this.process_termination = process_termination;
    }


    public EntityItemAuditType getProcessTermination()
    {
        return process_termination;
    }



    /**
     */
    public void setRpcEvents(
                    final EntityItemAuditType rpc_events
                    )
    {
        this.rpc_events = rpc_events;
    }


    public EntityItemAuditType getRpcEvents()
    {
        return rpc_events;
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
    public void setDirectoryServiceChanges(
                    final EntityItemAuditType directory_service_changes
                    )
    {
        this.directory_service_changes = directory_service_changes;
    }


    public EntityItemAuditType getDirectoryServiceChanges()
    {
        return directory_service_changes;
    }



    /**
     */
    public void setDirectoryServiceReplication(
                    final EntityItemAuditType directory_service_replication
                    )
    {
        this.directory_service_replication = directory_service_replication;
    }


    public EntityItemAuditType getDirectoryServiceReplication()
    {
        return directory_service_replication;
    }



    /**
     */
    public void setDetailedDirectoryServiceReplication(
                    final EntityItemAuditType detailed_directory_service_replication
                    )
    {
        this.detailed_directory_service_replication = detailed_directory_service_replication;
    }


    public EntityItemAuditType getDetailedDirectoryServiceReplication()
    {
        return detailed_directory_service_replication;
    }



    /**
     */
    public void setAccountLockout(
                    final EntityItemAuditType account_lockout
                    )
    {
        this.account_lockout = account_lockout;
    }


    public EntityItemAuditType getAccountLockout()
    {
        return account_lockout;
    }



    /**
     */
    public void setIpsecExtendedMode(
                    final EntityItemAuditType ipsec_extended_mode
                    )
    {
        this.ipsec_extended_mode = ipsec_extended_mode;
    }


    public EntityItemAuditType getIpsecExtendedMode()
    {
        return ipsec_extended_mode;
    }



    /**
     */
    public void setIpsecMainMode(
                    final EntityItemAuditType ipsec_main_mode
                    )
    {
        this.ipsec_main_mode = ipsec_main_mode;
    }


    public EntityItemAuditType getIpsecMainMode()
    {
        return ipsec_main_mode;
    }



    /**
     */
    public void setIpsecQuickMode(
                    final EntityItemAuditType ipsec_quick_mode
                    )
    {
        this.ipsec_quick_mode = ipsec_quick_mode;
    }


    public EntityItemAuditType getIpsecQuickMode()
    {
        return ipsec_quick_mode;
    }



    /**
     */
    public void setLogoff(
                    final EntityItemAuditType logoff
                    )
    {
        this.logoff = logoff;
    }


    public EntityItemAuditType getLogoff()
    {
        return logoff;
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
    public void setNetworkPolicyServer(
                    final EntityItemAuditType network_policy_server
                    )
    {
        this.network_policy_server = network_policy_server;
    }


    public EntityItemAuditType getNetworkPolicyServer()
    {
        return network_policy_server;
    }



    /**
     */
    public void setOtherLogonLogoffEvents(
                    final EntityItemAuditType other_logon_logoff_events
                    )
    {
        this.other_logon_logoff_events = other_logon_logoff_events;
    }


    public EntityItemAuditType getOtherLogonLogoffEvents()
    {
        return other_logon_logoff_events;
    }



    /**
     */
    public void setSpecialLogon(
                    final EntityItemAuditType special_logon
                    )
    {
        this.special_logon = special_logon;
    }


    public EntityItemAuditType getSpecialLogon()
    {
        return special_logon;
    }



    /**
     */
    public void setApplicationGenerated(
                    final EntityItemAuditType application_generated
                    )
    {
        this.application_generated = application_generated;
    }


    public EntityItemAuditType getApplicationGenerated()
    {
        return application_generated;
    }



    /**
     */
    public void setCertificationServices(
                    final EntityItemAuditType certification_services
                    )
    {
        this.certification_services = certification_services;
    }


    public EntityItemAuditType getCertificationServices()
    {
        return certification_services;
    }



    /**
     */
    public void setDetailedFileShare(
                    final EntityItemAuditType detailed_file_share
                    )
    {
        this.detailed_file_share = detailed_file_share;
    }


    public EntityItemAuditType getDetailedFileShare()
    {
        return detailed_file_share;
    }



    /**
     */
    public void setFileShare(
                    final EntityItemAuditType file_share
                    )
    {
        this.file_share = file_share;
    }


    public EntityItemAuditType getFileShare()
    {
        return file_share;
    }



    /**
     */
    public void setFileSystem(
                    final EntityItemAuditType file_system
                    )
    {
        this.file_system = file_system;
    }


    public EntityItemAuditType getFileSystem()
    {
        return file_system;
    }



    /**
     */
    public void setFilteringPlatformConnection(
                    final EntityItemAuditType filtering_platform_connection
                    )
    {
        this.filtering_platform_connection = filtering_platform_connection;
    }


    public EntityItemAuditType getFilteringPlatformConnection()
    {
        return filtering_platform_connection;
    }



    /**
     */
    public void setFilteringPlatformPacketDrop(
                    final EntityItemAuditType filtering_platform_packet_drop
                    )
    {
        this.filtering_platform_packet_drop = filtering_platform_packet_drop;
    }


    public EntityItemAuditType getFilteringPlatformPacketDrop()
    {
        return filtering_platform_packet_drop;
    }



    /**
     */
    public void setHandleManipulation(
                    final EntityItemAuditType handle_manipulation
                    )
    {
        this.handle_manipulation = handle_manipulation;
    }


    public EntityItemAuditType getHandleManipulation()
    {
        return handle_manipulation;
    }



    /**
     */
    public void setKernelObject(
                    final EntityItemAuditType kernel_object
                    )
    {
        this.kernel_object = kernel_object;
    }


    public EntityItemAuditType getKernelObject()
    {
        return kernel_object;
    }



    /**
     */
    public void setOtherObjectAccessEvents(
                    final EntityItemAuditType other_object_access_events
                    )
    {
        this.other_object_access_events = other_object_access_events;
    }


    public EntityItemAuditType getOtherObjectAccessEvents()
    {
        return other_object_access_events;
    }



    /**
     */
    public void setRegistry(
                    final EntityItemAuditType registry
                    )
    {
        this.registry = registry;
    }


    public EntityItemAuditType getRegistry()
    {
        return registry;
    }



    /**
     */
    public void setSam(
                    final EntityItemAuditType sam
                    )
    {
        this.sam = sam;
    }


    public EntityItemAuditType getSam()
    {
        return sam;
    }



    /**
     */
    public void setAuditPolicyChange(
                    final EntityItemAuditType audit_policy_change
                    )
    {
        this.audit_policy_change = audit_policy_change;
    }


    public EntityItemAuditType getAuditPolicyChange()
    {
        return audit_policy_change;
    }



    /**
     */
    public void setAuthenticationPolicyChange(
                    final EntityItemAuditType authentication_policy_change
                    )
    {
        this.authentication_policy_change = authentication_policy_change;
    }


    public EntityItemAuditType getAuthenticationPolicyChange()
    {
        return authentication_policy_change;
    }



    /**
     */
    public void setAuthorizationPolicyChange(
                    final EntityItemAuditType authorization_policy_change
                    )
    {
        this.authorization_policy_change = authorization_policy_change;
    }


    public EntityItemAuditType getAuthorizationPolicyChange()
    {
        return authorization_policy_change;
    }



    /**
     */
    public void setFilteringPlatformPolicyChange(
                    final EntityItemAuditType filtering_platform_policy_change
                    )
    {
        this.filtering_platform_policy_change = filtering_platform_policy_change;
    }


    public EntityItemAuditType getFilteringPlatformPolicyChange()
    {
        return filtering_platform_policy_change;
    }



    /**
     */
    public void setMpssvcRuleLevelPolicyChange(
                    final EntityItemAuditType mpssvc_rule_level_policy_change
                    )
    {
        this.mpssvc_rule_level_policy_change = mpssvc_rule_level_policy_change;
    }


    public EntityItemAuditType getMpssvcRuleLevelPolicyChange()
    {
        return mpssvc_rule_level_policy_change;
    }



    /**
     */
    public void setOtherPolicyChangeEvents(
                    final EntityItemAuditType other_policy_change_events
                    )
    {
        this.other_policy_change_events = other_policy_change_events;
    }


    public EntityItemAuditType getOtherPolicyChangeEvents()
    {
        return other_policy_change_events;
    }



    /**
     */
    public void setNonSensitivePrivilegeUse(
                    final EntityItemAuditType non_sensitive_privilege_use
                    )
    {
        this.non_sensitive_privilege_use = non_sensitive_privilege_use;
    }


    public EntityItemAuditType getNonSensitivePrivilegeUse()
    {
        return non_sensitive_privilege_use;
    }



    /**
     */
    public void setOtherPrivilegeUseEvents(
                    final EntityItemAuditType other_privilege_use_events
                    )
    {
        this.other_privilege_use_events = other_privilege_use_events;
    }


    public EntityItemAuditType getOtherPrivilegeUseEvents()
    {
        return other_privilege_use_events;
    }



    /**
     */
    public void setSensitivePrivilegeUse(
                    final EntityItemAuditType sensitive_privilege_use
                    )
    {
        this.sensitive_privilege_use = sensitive_privilege_use;
    }


    public EntityItemAuditType getSensitivePrivilegeUse()
    {
        return sensitive_privilege_use;
    }



    /**
     */
    public void setIpsecDriver(
                    final EntityItemAuditType ipsec_driver
                    )
    {
        this.ipsec_driver = ipsec_driver;
    }


    public EntityItemAuditType getIpsecDriver()
    {
        return ipsec_driver;
    }



    /**
     */
    public void setOtherSystemEvents(
                    final EntityItemAuditType other_system_events
                    )
    {
        this.other_system_events = other_system_events;
    }


    public EntityItemAuditType getOtherSystemEvents()
    {
        return other_system_events;
    }



    /**
     */
    public void setSecurityStateChange(
                    final EntityItemAuditType security_state_change
                    )
    {
        this.security_state_change = security_state_change;
    }


    public EntityItemAuditType getSecurityStateChange()
    {
        return security_state_change;
    }



    /**
     */
    public void setSecuritySystemExtension(
                    final EntityItemAuditType security_system_extension
                    )
    {
        this.security_system_extension = security_system_extension;
    }


    public EntityItemAuditType getSecuritySystemExtension()
    {
        return security_system_extension;
    }



    /**
     */
    public void setSystemIntegrity(
                    final EntityItemAuditType system_integrity
                    )
    {
        this.system_integrity = system_integrity;
    }


    public EntityItemAuditType getSystemIntegrity()
    {
        return system_integrity;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "auditeventpolicysubcategories_item[" + super.toString()
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
//AuditEventPolicySubcategoriesItem
