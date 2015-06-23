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
import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.definitions.EntityStateStringType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;



/**
 * The fileauditedpermissions53_state defines the different audit permissions
 * that can be associated with a given fileauditedpermissions53_object.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 * @deprecated Deprecated as of version 5.3:
 *             Replaced by the fileauditedpermissions53 state and
 *             will be removed in version 6.0 of the language.
 */
@Deprecated
public class FileAuditedPermissionsState
    extends StateType
{

    //{0..1}
    private EntityStateStringType   path;
    private EntityStateStringType   filename;
    private EntityStateStringType   trustee_name;
    private EntityStateAuditType    standard_delete;
    private EntityStateAuditType    standard_read_control;
    private EntityStateAuditType    standard_write_dac;
    private EntityStateAuditType    standard_write_owner;
    private EntityStateAuditType    standard_syncronize;
    private EntityStateAuditType    access_system_security;
    private EntityStateAuditType    generic_read;
    private EntityStateAuditType    generic_write;
    private EntityStateAuditType    generic_execute;
    private EntityStateAuditType    generic_all;
    private EntityStateAuditType    file_read_data;
    private EntityStateAuditType    file_write_data;
    private EntityStateAuditType    file_append_data;
    private EntityStateAuditType    file_read_ea;
    private EntityStateAuditType    file_write_ea;
    private EntityStateAuditType    file_execute;
    private EntityStateAuditType    file_delete_child;
    private EntityStateAuditType    file_read_attributes;
    private EntityStateAuditType    file_write_attributes;

    private EntityStateWindowsViewType  windows_view;
    //{0..1}



    /**
     * Constructor.
     */
    public FileAuditedPermissionsState()
    {
        this( null, 0 );
    }


    public FileAuditedPermissionsState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public FileAuditedPermissionsState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.fileauditedpermissions;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.FILEAUDITEDPERMISSIONS;
    }



    /**
     */
    public void setPath(
                    final EntityStateStringType path
                    )
    {
        this.path = path;
    }


    public EntityStateStringType getPath()
    {
        return path;
    }



    /**
     */
    public void setFilename(
                    final EntityStateStringType filename
                    )
    {
        this.filename = filename;
    }


    public EntityStateStringType getFilename()
    {
        return filename;
    }



    /**
     */
    public void setTrusteeName(
                    final EntityStateStringType trustee_name
                    )
    {
        this.trustee_name = trustee_name;
    }


    public EntityStateStringType getTrusteeName()
    {
        return trustee_name;
    }



    /**
     */
    public void setStandardDelete(
                    final EntityStateAuditType standard_delete
                    )
    {
        this.standard_delete = standard_delete;
    }


    public EntityStateAuditType getStandardDelete()
    {
        return standard_delete;
    }



    /**
     */
    public void setStandardReadControl(
                    final EntityStateAuditType standard_read_control
                    )
    {
        this.standard_read_control = standard_read_control;
    }


    public EntityStateAuditType getStandardReadControl()
    {
        return standard_read_control;
    }



    /**
     */
    public void setStandardWriteDac(
                    final EntityStateAuditType standard_write_dac
                    )
    {
        this.standard_write_dac = standard_write_dac;
    }


    public EntityStateAuditType getStandardWriteDac()
    {
        return standard_write_dac;
    }



    /**
     */
    public void setStandardWriteOwner(
                    final EntityStateAuditType standard_write_owner
                    )
    {
        this.standard_write_owner = standard_write_owner;
    }


    public EntityStateAuditType getStandardWriteOwner()
    {
        return standard_write_owner;
    }



    /**
     */
    public void setStandardSyncronize(
                    final EntityStateAuditType standard_syncronize
                    )
    {
        this.standard_syncronize = standard_syncronize;
    }


    public EntityStateAuditType getStandardSyncronize()
    {
        return standard_syncronize;
    }



    /**
     */
    public void setAccessSystemSecurity(
                    final EntityStateAuditType access_system_security
                    )
    {
        this.access_system_security = access_system_security;
    }


    public EntityStateAuditType getAccessSystemSecurity()
    {
        return access_system_security;
    }



    /**
     */
    public void setGenericRead(
                    final EntityStateAuditType generic_read
                    )
    {
        this.generic_read = generic_read;
    }


    public EntityStateAuditType getGenericRead()
    {
        return generic_read;
    }



    /**
     */
    public void setGenericWrite(
                    final EntityStateAuditType generic_write
                    )
    {
        this.generic_write = generic_write;
    }


    public EntityStateAuditType getGenericWrite()
    {
        return generic_write;
    }



    /**
     */
    public void setGenericExecute(
                    final EntityStateAuditType generic_execute
                    )
    {
        this.generic_execute = generic_execute;
    }


    public EntityStateAuditType getGenericExecute()
    {
        return generic_execute;
    }



    /**
     */
    public void setGenericAll(
                    final EntityStateAuditType generic_all
                    )
    {
        this.generic_all = generic_all;
    }


    public EntityStateAuditType getGenericAll()
    {
        return generic_all;
    }



    /**
     */
    public void setFileReadData(
                    final EntityStateAuditType file_read_data
                    )
    {
        this.file_read_data = file_read_data;
    }


    public EntityStateAuditType getFileReadData()
    {
        return file_read_data;
    }



    /**
     */
    public void setFileWriteData(
                    final EntityStateAuditType file_write_data
                    )
    {
        this.file_write_data = file_write_data;
    }


    public EntityStateAuditType getFileWriteData()
    {
        return file_write_data;
    }



    /**
     */
    public void setFileAppendData(
                    final EntityStateAuditType file_append_data
                    )
    {
        this.file_append_data = file_append_data;
    }


    public EntityStateAuditType getFileAppendData()
    {
        return file_append_data;
    }



    /**
     */
    public void setFileReadEa(
                    final EntityStateAuditType file_read_ea
                    )
    {
        this.file_read_ea = file_read_ea;
    }


    public EntityStateAuditType getFileReadEa()
    {
        return file_read_ea;
    }



    /**
     */
    public void setFileWriteEa(
                    final EntityStateAuditType file_write_ea
                    )
    {
        this.file_write_ea = file_write_ea;
    }


    public EntityStateAuditType getFileWriteEa()
    {
        return file_write_ea;
    }



    /**
     */
    public void setFileExecute(
                    final EntityStateAuditType file_execute
                    )
    {
        this.file_execute = file_execute;
    }


    public EntityStateAuditType getFileExecute()
    {
        return file_execute;
    }



    /**
     */
    public void setFileDeleteChild(
                    final EntityStateAuditType file_delete_child
                    )
    {
        this.file_delete_child = file_delete_child;
    }


    public EntityStateAuditType getFileDeleteChild()
    {
        return file_delete_child;
    }



    /**
     */
    public void setFileReadAttributes(
                    final EntityStateAuditType file_read_attributes
                    )
    {
        this.file_read_attributes = file_read_attributes;
    }


    public EntityStateAuditType getFileReadAttributes()
    {
        return file_read_attributes;
    }



    /**
     */
    public void setFileWriteAttributes(
                    final EntityStateAuditType file_write_attributes
                    )
    {
        this.file_write_attributes = file_write_attributes;
    }


    public EntityStateAuditType getFileWriteAttributes()
    {
        return file_write_attributes;
    }



    /**
     */
    public void setWindowsView(
                    final EntityStateWindowsViewType windows_view
                    )
    {
        this.windows_view = windows_view;
    }


    public EntityStateWindowsViewType getWindowsView()
    {
        return windows_view;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();

        ref_list.add( getPath() );
        ref_list.add( getFilename() );
        ref_list.add( getTrusteeName() );
        ref_list.add( getStandardDelete() );
        ref_list.add( getStandardReadControl() );
        ref_list.add( getStandardWriteDac() );
        ref_list.add( getStandardWriteOwner() );
        ref_list.add( getStandardSyncronize() );
        ref_list.add( getAccessSystemSecurity() );
        ref_list.add( getGenericRead() );
        ref_list.add( getGenericWrite() );
        ref_list.add( getGenericExecute() );
        ref_list.add( getGenericAll() );
        ref_list.add( getFileReadData() );
        ref_list.add( getFileWriteData() );
        ref_list.add( getFileAppendData() );
        ref_list.add( getFileReadEa() );
        ref_list.add( getFileWriteEa() );
        ref_list.add( getFileExecute() );
        ref_list.add( getFileDeleteChild() );
        ref_list.add( getFileReadAttributes() );
        ref_list.add( getFileWriteAttributes() );
        ref_list.add( getWindowsView() );

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
        if (!(obj instanceof FileAuditedPermissionsState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "fileauditedpermissions_state[" + super.toString()
             + ", path="                    + getPath()
             + ", filename="                + getFilename()
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
//FileAuditedPermissionsState
