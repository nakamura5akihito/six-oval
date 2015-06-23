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
 * This item stores the effective rights of a file
 * that a discretionary access control list (DACL) structure
 * grants to a specified trustee.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class FileEffectiveRightsItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType   filepath;
    private EntityItemStringType   path;

    //{nillable="true"}
    private EntityItemStringType   filename;

    private EntityItemStringType   trustee_sid;
    private EntityItemStringType   trustee_name;
    private EntityItemBoolType    standard_delete;
    private EntityItemBoolType    standard_read_control;
    private EntityItemBoolType    standard_write_dac;
    private EntityItemBoolType    standard_write_owner;
    private EntityItemBoolType    standard_syncronize;
    private EntityItemBoolType    access_system_security;
    private EntityItemBoolType    generic_read;
    private EntityItemBoolType    generic_write;
    private EntityItemBoolType    generic_execute;
    private EntityItemBoolType    generic_all;
    private EntityItemBoolType    file_read_data;
    private EntityItemBoolType    file_write_data;
    private EntityItemBoolType    file_append_data;
    private EntityItemBoolType    file_read_ea;
    private EntityItemBoolType    file_write_ea;
    private EntityItemBoolType    file_execute;
    private EntityItemBoolType    file_delete_child;
    private EntityItemBoolType    file_read_attributes;
    private EntityItemBoolType    file_write_attributes;

    private EntityItemWindowsViewType  windows_view;
    //{0..1}



    /**
     * Constructor.
     */
    public FileEffectiveRightsItem()
    {
        this( 0 );
    }


    public FileEffectiveRightsItem(
                    final int id
                    )
    {
        this( id, null );
    }


    public FileEffectiveRightsItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        super( id, status );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.fileeffectiverights;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.FILEEFFECTIVERIGHTS;
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
                    final EntityItemBoolType standard_delete
                    )
    {
        this.standard_delete = standard_delete;
    }


    public EntityItemBoolType getStandardDelete()
    {
        return standard_delete;
    }



    /**
     */
    public void setStandardReadControl(
                    final EntityItemBoolType standard_read_control
                    )
    {
        this.standard_read_control = standard_read_control;
    }


    public EntityItemBoolType getStandardReadControl()
    {
        return standard_read_control;
    }



    /**
     */
    public void setStandardWriteDac(
                    final EntityItemBoolType standard_write_dac
                    )
    {
        this.standard_write_dac = standard_write_dac;
    }


    public EntityItemBoolType getStandardWriteDac()
    {
        return standard_write_dac;
    }



    /**
     */
    public void setStandardWriteOwner(
                    final EntityItemBoolType standard_write_owner
                    )
    {
        this.standard_write_owner = standard_write_owner;
    }


    public EntityItemBoolType getStandardWriteOwner()
    {
        return standard_write_owner;
    }



    /**
     */
    public void setStandardSyncronize(
                    final EntityItemBoolType standard_syncronize
                    )
    {
        this.standard_syncronize = standard_syncronize;
    }


    public EntityItemBoolType getStandardSyncronize()
    {
        return standard_syncronize;
    }



    /**
     */
    public void setAccessSystemSecurity(
                    final EntityItemBoolType access_system_security
                    )
    {
        this.access_system_security = access_system_security;
    }


    public EntityItemBoolType getAccessSystemSecurity()
    {
        return access_system_security;
    }



    /**
     */
    public void setGenericRead(
                    final EntityItemBoolType generic_read
                    )
    {
        this.generic_read = generic_read;
    }


    public EntityItemBoolType getGenericRead()
    {
        return generic_read;
    }



    /**
     */
    public void setGenericWrite(
                    final EntityItemBoolType generic_write
                    )
    {
        this.generic_write = generic_write;
    }


    public EntityItemBoolType getGenericWrite()
    {
        return generic_write;
    }



    /**
     */
    public void setGenericExecute(
                    final EntityItemBoolType generic_execute
                    )
    {
        this.generic_execute = generic_execute;
    }


    public EntityItemBoolType getGenericExecute()
    {
        return generic_execute;
    }



    /**
     */
    public void setGenericAll(
                    final EntityItemBoolType generic_all
                    )
    {
        this.generic_all = generic_all;
    }


    public EntityItemBoolType getGenericAll()
    {
        return generic_all;
    }



    /**
     */
    public void setFileReadData(
                    final EntityItemBoolType file_read_data
                    )
    {
        this.file_read_data = file_read_data;
    }


    public EntityItemBoolType getFileReadData()
    {
        return file_read_data;
    }



    /**
     */
    public void setFileWriteData(
                    final EntityItemBoolType file_write_data
                    )
    {
        this.file_write_data = file_write_data;
    }


    public EntityItemBoolType getFileWriteData()
    {
        return file_write_data;
    }



    /**
     */
    public void setFileAppendData(
                    final EntityItemBoolType file_append_data
                    )
    {
        this.file_append_data = file_append_data;
    }


    public EntityItemBoolType getFileAppendData()
    {
        return file_append_data;
    }



    /**
     */
    public void setFileReadEa(
                    final EntityItemBoolType file_read_ea
                    )
    {
        this.file_read_ea = file_read_ea;
    }


    public EntityItemBoolType getFileReadEa()
    {
        return file_read_ea;
    }



    /**
     */
    public void setFileWriteEa(
                    final EntityItemBoolType file_write_ea
                    )
    {
        this.file_write_ea = file_write_ea;
    }


    public EntityItemBoolType getFileWriteEa()
    {
        return file_write_ea;
    }



    /**
     */
    public void setFileExecute(
                    final EntityItemBoolType file_execute
                    )
    {
        this.file_execute = file_execute;
    }


    public EntityItemBoolType getFileExecute()
    {
        return file_execute;
    }



    /**
     */
    public void setFileDeleteChild(
                    final EntityItemBoolType file_delete_child
                    )
    {
        this.file_delete_child = file_delete_child;
    }


    public EntityItemBoolType getFileDeleteChild()
    {
        return file_delete_child;
    }



    /**
     */
    public void setFileReadAttributes(
                    final EntityItemBoolType file_read_attributes
                    )
    {
        this.file_read_attributes = file_read_attributes;
    }


    public EntityItemBoolType getFileReadAttributes()
    {
        return file_read_attributes;
    }



    /**
     */
    public void setFileWriteAttributes(
                    final EntityItemBoolType file_write_attributes
                    )
    {
        this.file_write_attributes = file_write_attributes;
    }


    public EntityItemBoolType getFileWriteAttributes()
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
        if (!(obj instanceof FileEffectiveRightsItem)) {
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
