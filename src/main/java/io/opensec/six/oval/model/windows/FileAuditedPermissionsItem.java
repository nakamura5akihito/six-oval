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
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.ItemType;
import io.opensec.six.oval.model.sc.StatusEnumeration;



/**
 * The fileauditedpermissions53_state defines the different audit permissions
 * that can be associated with a given fileauditedpermissions53_object.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class FileAuditedPermissionsItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType   filepath;
    private EntityItemStringType   path;

    //{nillable="true"}
    private EntityItemStringType   filename;

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
    private EntityItemAuditType    file_read_data;
    private EntityItemAuditType    file_write_data;
    private EntityItemAuditType    file_append_data;
    private EntityItemAuditType    file_read_ea;
    private EntityItemAuditType    file_write_ea;
    private EntityItemAuditType    file_execute;
    private EntityItemAuditType    file_delete_child;
    private EntityItemAuditType    file_read_attributes;
    private EntityItemAuditType    file_write_attributes;

    private EntityItemWindowsViewType  windows_view;
    //{0..1}



    /**
     * Constructor.
     */
    public FileAuditedPermissionsItem()
    {
        this( 0 );
    }


    public FileAuditedPermissionsItem(
                    final int id
                    )
    {
        this( id, null );
    }


    public FileAuditedPermissionsItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        super( id, status );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.fileauditedpermissions;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.FILEAUDITEDPERMISSIONS;
    }



    /**
     */
    public void setFilepath(
                    final EntityItemStringType filepath
                    )
    {
        this.filepath = filepath;
    }


    public EntityItemStringType getFilepath()
    {
        return filepath;
    }



    /**
     */
    public void setPath(
                    final EntityItemStringType path
                    )
    {
        this.path = path;
    }


    public EntityItemStringType getPath()
    {
        return path;
    }



    /**
     */
    public void setFilename(
                    final EntityItemStringType filename
                    )
    {
        this.filename = filename;
    }


    public EntityItemStringType getFilename()
    {
        return filename;
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



    /**
     */
    public void setFileReadData(
                    final EntityItemAuditType file_read_data
                    )
    {
        this.file_read_data = file_read_data;
    }


    public EntityItemAuditType getFileReadData()
    {
        return file_read_data;
    }



    /**
     */
    public void setFileWriteData(
                    final EntityItemAuditType file_write_data
                    )
    {
        this.file_write_data = file_write_data;
    }


    public EntityItemAuditType getFileWriteData()
    {
        return file_write_data;
    }



    /**
     */
    public void setFileAppendData(
                    final EntityItemAuditType file_append_data
                    )
    {
        this.file_append_data = file_append_data;
    }


    public EntityItemAuditType getFileAppendData()
    {
        return file_append_data;
    }



    /**
     */
    public void setFileReadEa(
                    final EntityItemAuditType file_read_ea
                    )
    {
        this.file_read_ea = file_read_ea;
    }


    public EntityItemAuditType getFileReadEa()
    {
        return file_read_ea;
    }



    /**
     */
    public void setFileWriteEa(
                    final EntityItemAuditType file_write_ea
                    )
    {
        this.file_write_ea = file_write_ea;
    }


    public EntityItemAuditType getFileWriteEa()
    {
        return file_write_ea;
    }



    /**
     */
    public void setFileExecute(
                    final EntityItemAuditType file_execute
                    )
    {
        this.file_execute = file_execute;
    }


    public EntityItemAuditType getFileExecute()
    {
        return file_execute;
    }



    /**
     */
    public void setFileDeleteChild(
                    final EntityItemAuditType file_delete_child
                    )
    {
        this.file_delete_child = file_delete_child;
    }


    public EntityItemAuditType getFileDeleteChild()
    {
        return file_delete_child;
    }



    /**
     */
    public void setFileReadAttributes(
                    final EntityItemAuditType file_read_attributes
                    )
    {
        this.file_read_attributes = file_read_attributes;
    }


    public EntityItemAuditType getFileReadAttributes()
    {
        return file_read_attributes;
    }



    /**
     */
    public void setFileWriteAttributes(
                    final EntityItemAuditType file_write_attributes
                    )
    {
        this.file_write_attributes = file_write_attributes;
    }


    public EntityItemAuditType getFileWriteAttributes()
    {
        return file_write_attributes;
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
        if (!(obj instanceof FileAuditedPermissionsItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "fileauditedpermissions_item[" + super.toString()
             + ", filepath="                + getFilepath()
             + ", path="                    + getPath()
             + ", filename="                + getFilename()
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
             + ", file_read_data="          + getFileReadData()
             + ", file_write_data="         + getFileWriteData()
             + ", file_append_data="        + getFileAppendData()
             + ", file_read_ea="            + getFileReadEa()
             + ", file_write_ea="           + getFileWriteEa()
             + ", file_execute="            + getFileExecute()
             + ", file_delete_child="       + getFileDeleteChild()
             + ", file_read_attributes="    + getFileReadAttributes()
             + ", file_write_attributes="   + getFileWriteAttributes()
             + ", windows_view="            + getWindowsView()
             + "]";
    }
}
//FileAuditedPermissionsItem
