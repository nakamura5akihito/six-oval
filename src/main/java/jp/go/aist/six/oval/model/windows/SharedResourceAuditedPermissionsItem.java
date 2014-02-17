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
 * This item stores the audited access rights of a shared resource that
 * a system access control list (SACL) structure grants to a specified trustee.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: SharedResourceAuditedPermissionsItem.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class SharedResourceAuditedPermissionsItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType   netname;
    private EntityItemStringType   trustee_sid;
    private EntityItemStringType   trustee_name;
    private EntityItemAuditType    standard_delete;
    private EntityItemAuditType    standard_read_control;
    private EntityItemAuditType    standard_write_dac;
    private EntityItemAuditType    standard_write_owner;
    private EntityItemAuditType    standard_syncronize;
    private EntityItemAuditType    access_system_security;
    private EntityItemAuditType    generic_read;
    private EntityItemAuditType    generic_write;
    private EntityItemAuditType    generic_execute;
    private EntityItemAuditType    generic_all;



    /**
     * Constructor.
     */
    public SharedResourceAuditedPermissionsItem()
    {
        this( 0 );
    }


    public SharedResourceAuditedPermissionsItem(
                    final int id
                    )
    {
        this( id, null );
    }


    public SharedResourceAuditedPermissionsItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        super( id, status );

        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.SHAREDRESOURCEAUDITEDPERMISSIONS;
    }



    /**
     */
    public void setNetname(
                    final EntityItemStringType netname
                    )
    {
        this.netname = netname;
    }


    public EntityItemStringType getNetname()
    {
        return netname;
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
    public void setTrusteeName(
                    final EntityItemStringType trustee_name
                    )
    {
        this.trustee_name = trustee_name;
    }


    public EntityItemStringType getTrusteeName()
    {
        return trustee_name;
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
        if (!(obj instanceof SharedResourceAuditedPermissionsItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "sharedresourceauditedpermissions_item[" + super.toString()
                        + ", netname="                 + getNetname()
                        + ", trustee_sid="             + getTrusteeSid()
                        + ", trustee_name="            + getTrusteeName()
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
             + "]";
    }
}
//
