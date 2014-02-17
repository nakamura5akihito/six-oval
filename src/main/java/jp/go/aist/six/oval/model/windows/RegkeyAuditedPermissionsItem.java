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
import jp.go.aist.six.oval.model.sc.EntityItemStringType;
import jp.go.aist.six.oval.model.sc.ItemType;
import jp.go.aist.six.oval.model.sc.StatusEnumeration;



/**
 * This item stores the audited access rights of a registry key
 * that a system access control list (SACL) structure grants to a specified trustee.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: RegkeyAuditedPermissionsItem.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class RegkeyAuditedPermissionsItem
    extends ItemType
{

    //{0..1}
    private EntityItemRegistryHiveType  hive;

    //{nillable="true"}
    private EntityItemStringType        key;

    private EntityItemStringType        trustee_sid;
    private EntityItemAuditType         standard_delete;
    private EntityItemAuditType         standard_read_control;
    private EntityItemAuditType         standard_write_dac;
    private EntityItemAuditType         standard_write_owner;
    private EntityItemAuditType         standard_syncronize;
    private EntityItemAuditType         access_system_security;
    private EntityItemAuditType         generic_read;
    private EntityItemAuditType         generic_write;
    private EntityItemAuditType         generic_execute;
    private EntityItemAuditType         generic_all;
    private EntityItemAuditType         key_query_value;
    private EntityItemAuditType         key_set_value;
    private EntityItemAuditType         key_create_sub_key;
    private EntityItemAuditType         key_enumerate_sub_keys;
    private EntityItemAuditType         key_notify;
    private EntityItemAuditType         key_create_link;
    private EntityItemAuditType         key_wow64_64key;
    private EntityItemAuditType         key_wow64_32key;
    private EntityItemAuditType         key_wow64_res;

    private EntityItemWindowsViewType   windows_view;
    //{0..1}



    /**
     * Constructor.
     */
    public RegkeyAuditedPermissionsItem()
    {
        this( 0 );
    }


    public RegkeyAuditedPermissionsItem(
                    final int id
                    )
    {
        this( id, null );
    }


    public RegkeyAuditedPermissionsItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        super( id, status );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.regkeyauditedpermissions;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.REGKEYAUDITEDPERMISSIONS;
    }



    /**
     */
    public void setHive(
                    final EntityItemRegistryHiveType hive
                    )
    {
        this.hive = hive;
    }


    public EntityItemRegistryHiveType getHive()
    {
        return hive;
    }



    /**
     */
    public void setKey(
                    final EntityItemStringType key
                    )
    {
        this.key = key;
    }


    public EntityItemStringType getKey()
    {
        return key;
    }



    /**
     */
    public void setTrusteeSid(
                    final EntityItemStringType trustee_sid
                    )
    {
        this.trustee_sid = trustee_sid;
    }


    public EntityItemStringType getTrusteeSid()
    {
        return trustee_sid;
    }



    /**
     */
    public void setStandardDelete(
                    final EntityItemAuditType standard_delete
                    )
    {
        this.standard_delete = standard_delete;
    }


    public EntityItemAuditType getStandardDelete()
    {
        return standard_delete;
    }



    /**
     */
    public void setStandardReadControl(
                    final EntityItemAuditType standard_read_control
                    )
    {
        this.standard_read_control = standard_read_control;
    }


    public EntityItemAuditType getStandardReadControl()
    {
        return standard_read_control;
    }



    /**
     */
    public void setStandardWriteDac(
                    final EntityItemAuditType standard_write_dac
                    )
    {
        this.standard_write_dac = standard_write_dac;
    }


    public EntityItemAuditType getStandardWriteDac()
    {
        return standard_write_dac;
    }



    /**
     */
    public void setStandardWriteOwner(
                    final EntityItemAuditType standard_write_owner
                    )
    {
        this.standard_write_owner = standard_write_owner;
    }


    public EntityItemAuditType getStandardWriteOwner()
    {
        return standard_write_owner;
    }



    /**
     */
    public void setStandardSyncronize(
                    final EntityItemAuditType standard_syncronize
                    )
    {
        this.standard_syncronize = standard_syncronize;
    }


    public EntityItemAuditType getStandardSyncronize()
    {
        return standard_syncronize;
    }



    /**
     */
    public void setAccessSystemSecurity(
                    final EntityItemAuditType access_system_security
                    )
    {
        this.access_system_security = access_system_security;
    }


    public EntityItemAuditType getAccessSystemSecurity()
    {
        return access_system_security;
    }



    /**
     */
    public void setGenericRead(
                    final EntityItemAuditType generic_read
                    )
    {
        this.generic_read = generic_read;
    }


    public EntityItemAuditType getGenericRead()
    {
        return generic_read;
    }



    /**
     */
    public void setGenericWrite(
                    final EntityItemAuditType generic_write
                    )
    {
        this.generic_write = generic_write;
    }


    public EntityItemAuditType getGenericWrite()
    {
        return generic_write;
    }



    /**
     */
    public void setGenericExecute(
                    final EntityItemAuditType generic_execute
                    )
    {
        this.generic_execute = generic_execute;
    }


    public EntityItemAuditType getGenericExecute()
    {
        return generic_execute;
    }



    /**
     */
    public void setGenericAll(
                    final EntityItemAuditType generic_all
                    )
    {
        this.generic_all = generic_all;
    }


    public EntityItemAuditType getGenericAll()
    {
        return generic_all;
    }



    /**
     */
    public void setKeyQueryValue(
                    final EntityItemAuditType key_query_value
                    )
    {
        this.key_query_value = key_query_value;
    }


    public EntityItemAuditType getKeyQueryValue()
    {
        return key_query_value;
    }



    /**
     */
    public void setKeySetValue(
                    final EntityItemAuditType key_set_value
                    )
    {
        this.key_set_value = key_set_value;
    }


    public EntityItemAuditType getKeySetValue()
    {
        return key_set_value;
    }



    /**
     */
    public void setKeyCreateSubKey(
                    final EntityItemAuditType key_create_sub_key
                    )
    {
        this.key_create_sub_key = key_create_sub_key;
    }


    public EntityItemAuditType getKeyCreateSubKey()
    {
        return key_create_sub_key;
    }



    /**
     */
    public void setKeyEnumerateSubKeys(
                    final EntityItemAuditType key_enumerate_sub_keys
                    )
    {
        this.key_enumerate_sub_keys = key_enumerate_sub_keys;
    }


    public EntityItemAuditType getKeyEnumerateSubKeys()
    {
        return key_enumerate_sub_keys;
    }



    /**
     */
    public void setKeyNotify(
                    final EntityItemAuditType key_notify
                    )
    {
        this.key_notify = key_notify;
    }


    public EntityItemAuditType getKeyNotify()
    {
        return key_notify;
    }



    /**
     */
    public void setKeyCreateLink(
                    final EntityItemAuditType key_create_link
                    )
    {
        this.key_create_link = key_create_link;
    }


    public EntityItemAuditType getKeyCreateLink()
    {
        return key_create_link;
    }



    /**
     */
    public void setKeyWow6464key(
                    final EntityItemAuditType key_wow64_64key
                    )
    {
        this.key_wow64_64key = key_wow64_64key;
    }


    public EntityItemAuditType getKeyWow6464key()
    {
        return key_wow64_64key;
    }



    /**
     */
    public void setKeyWow6432key(
                    final EntityItemAuditType key_wow64_32key
                    )
    {
        this.key_wow64_32key = key_wow64_32key;
    }


    public EntityItemAuditType getKeyWow6432key()
    {
        return key_wow64_32key;
    }



    /**
     */
    public void setKeyWow64Res(
                    final EntityItemAuditType key_wow64_res
                    )
    {
        this.key_wow64_res = key_wow64_res;
    }


    public EntityItemAuditType getKeyWow64Res()
    {
        return key_wow64_res;
    }



    /**
     */
    public void setWindowsView(
                    final EntityItemWindowsViewType windows_view
                    )
    {
        this.windows_view = windows_view;
    }


    public EntityItemWindowsViewType getWindowsView()
    {
        return windows_view;
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
        if (!(obj instanceof RegkeyAuditedPermissionsItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "fileauditedpermissions_item[" + super.toString()
                        + ", hive="                + getHive()
                        + ", key="                    + getKey()
                        + ", trustee_sid="             + getTrusteeSid()
                        + ", standard_delete="         + getStandardDelete()
                        + ", standard_read_control="   + getStandardReadControl()
                        + ", standard_write_dac="      + getStandardWriteDac()
                        + ", standard_write_owner="    + getStandardWriteOwner()
                        + ", standard_syncronize="     + getStandardSyncronize()
                        + ", access_system_security="  + getAccessSystemSecurity()
                        + ", generic_read="            + getGenericRead()
                        + ", generic_write="           + getGenericWrite()
                        + ", generic_execute="         + getGenericExecute()
                        + ", generic_all="             + getGenericAll()
                        + ", key_query_value="         + getKeyQueryValue()
                        + ", key_set_value="           + getKeySetValue()
                        + ", key_create_sub_key="      + getKeyCreateSubKey()
                        + ", key_enumerate_sub_keys="  + getKeyEnumerateSubKeys()
                        + ", key_notify="              + getKeyNotify()
                        + ", key_create_link="         + getKeyCreateLink()
                        + ", key_wow64_64key="         + getKeyWow6464key()
                        + ", key_wow64_32key="         + getKeyWow6432key()
                        + ", key_wow64_res="           + getKeyWow64Res()
                        + ", windows_view="            + getWindowsView()
             + "]";
    }
}
//RegkeyAuditedPermissionsItem
