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
import io.opensec.six.oval.model.definitions.EntityStateBoolType;
import io.opensec.six.oval.model.definitions.EntityStateStringType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;



/**
 * The fileeffectiverights53 state defines the different rights
 * that can be associated with a given fileeffectiverights53_object.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class FileEffectiveRights53State
    extends StateType
{

    //{0..1}
    private EntityStateStringType   filepath;
    private EntityStateStringType   path;
    private EntityStateStringType   filename;
    private EntityStateStringType   trustee_sid;
    private EntityStateBoolType    standard_delete;
    private EntityStateBoolType    standard_read_control;
    private EntityStateBoolType    standard_write_dac;
    private EntityStateBoolType    standard_write_owner;
    private EntityStateBoolType    standard_syncronize;
    private EntityStateBoolType    access_system_security;
    private EntityStateBoolType    generic_read;
    private EntityStateBoolType    generic_write;
    private EntityStateBoolType    generic_execute;
    private EntityStateBoolType    generic_all;
    private EntityStateBoolType    file_read_data;
    private EntityStateBoolType    file_write_data;
    private EntityStateBoolType    file_append_data;
    private EntityStateBoolType    file_read_ea;
    private EntityStateBoolType    file_write_ea;
    private EntityStateBoolType    file_execute;
    private EntityStateBoolType    file_delete_child;
    private EntityStateBoolType    file_read_attributes;
    private EntityStateBoolType    file_write_attributes;

    private EntityStateWindowsViewType  windows_view;
    //{0..1}



    /**
     * Constructor.
     */
    public FileEffectiveRights53State()
    {
        this( null, 0 );
    }


    public FileEffectiveRights53State(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public FileEffectiveRights53State(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.fileeffectiverights53;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.FILEEFFECTIVERIGHTS53;
    }



    /**
     */
    public void setFilepath(
                    final EntityStateStringType filepath
                    )
    {
        this.filepath = filepath;
    }


    public EntityStateStringType getFilepath()
    {
        return filepath;
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
    public void setTrusteeSid(
                    final EntityStateStringType trustee_sid
                    )
    {
        this.trustee_sid = trustee_sid;
    }


    public EntityStateStringType getTrusteeSid()
    {
        return trustee_sid;
    }



    /**
     */
    public void setStandardDelete(
                    final EntityStateBoolType standard_delete
                    )
    {
        this.standard_delete = standard_delete;
    }


    public EntityStateBoolType getStandardDelete()
    {
        return standard_delete;
    }



    /**
     */
    public void setStandardReadControl(
                    final EntityStateBoolType standard_read_control
                    )
    {
        this.standard_read_control = standard_read_control;
    }


    public EntityStateBoolType getStandardReadControl()
    {
        return standard_read_control;
    }



    /**
     */
    public void setStandardWriteDac(
                    final EntityStateBoolType standard_write_dac
                    )
    {
        this.standard_write_dac = standard_write_dac;
    }


    public EntityStateBoolType getStandardWriteDac()
    {
        return standard_write_dac;
    }



    /**
     */
    public void setStandardWriteOwner(
                    final EntityStateBoolType standard_write_owner
                    )
    {
        this.standard_write_owner = standard_write_owner;
    }


    public EntityStateBoolType getStandardWriteOwner()
    {
        return standard_write_owner;
    }



    /**
     */
    public void setStandardSyncronize(
                    final EntityStateBoolType standard_syncronize
                    )
    {
        this.standard_syncronize = standard_syncronize;
    }


    public EntityStateBoolType getStandardSyncronize()
    {
        return standard_syncronize;
    }



    /**
     */
    public void setAccessSystemSecurity(
                    final EntityStateBoolType access_system_security
                    )
    {
        this.access_system_security = access_system_security;
    }


    public EntityStateBoolType getAccessSystemSecurity()
    {
        return access_system_security;
    }



    /**
     */
    public void setGenericRead(
                    final EntityStateBoolType generic_read
                    )
    {
        this.generic_read = generic_read;
    }


    public EntityStateBoolType getGenericRead()
    {
        return generic_read;
    }



    /**
     */
    public void setGenericWrite(
                    final EntityStateBoolType generic_write
                    )
    {
        this.generic_write = generic_write;
    }


    public EntityStateBoolType getGenericWrite()
    {
        return generic_write;
    }



    /**
     */
    public void setGenericExecute(
                    final EntityStateBoolType generic_execute
                    )
    {
        this.generic_execute = generic_execute;
    }


    public EntityStateBoolType getGenericExecute()
    {
        return generic_execute;
    }



    /**
     */
    public void setGenericAll(
                    final EntityStateBoolType generic_all
                    )
    {
        this.generic_all = generic_all;
    }


    public EntityStateBoolType getGenericAll()
    {
        return generic_all;
    }



    /**
     */
    public void setFileReadData(
                    final EntityStateBoolType file_read_data
                    )
    {
        this.file_read_data = file_read_data;
    }


    public EntityStateBoolType getFileReadData()
    {
        return file_read_data;
    }



    /**
     */
    public void setFileWriteData(
                    final EntityStateBoolType file_write_data
                    )
    {
        this.file_write_data = file_write_data;
    }


    public EntityStateBoolType getFileWriteData()
    {
        return file_write_data;
    }



    /**
     */
    public void setFileAppendData(
                    final EntityStateBoolType file_append_data
                    )
    {
        this.file_append_data = file_append_data;
    }


    public EntityStateBoolType getFileAppendData()
    {
        return file_append_data;
    }



    /**
     */
    public void setFileReadEa(
                    final EntityStateBoolType file_read_ea
                    )
    {
        this.file_read_ea = file_read_ea;
    }


    public EntityStateBoolType getFileReadEa()
    {
        return file_read_ea;
    }



    /**
     */
    public void setFileWriteEa(
                    final EntityStateBoolType file_write_ea
                    )
    {
        this.file_write_ea = file_write_ea;
    }


    public EntityStateBoolType getFileWriteEa()
    {
        return file_write_ea;
    }



    /**
     */
    public void setFileExecute(
                    final EntityStateBoolType file_execute
                    )
    {
        this.file_execute = file_execute;
    }


    public EntityStateBoolType getFileExecute()
    {
        return file_execute;
    }



    /**
     */
    public void setFileDeleteChild(
                    final EntityStateBoolType file_delete_child
                    )
    {
        this.file_delete_child = file_delete_child;
    }


    public EntityStateBoolType getFileDeleteChild()
    {
        return file_delete_child;
    }



    /**
     */
    public void setFileReadAttributes(
                    final EntityStateBoolType file_read_attributes
                    )
    {
        this.file_read_attributes = file_read_attributes;
    }


    public EntityStateBoolType getFileReadAttributes()
    {
        return file_read_attributes;
    }



    /**
     */
    public void setFileWriteAttributes(
                    final EntityStateBoolType file_write_attributes
                    )
    {
        this.file_write_attributes = file_write_attributes;
    }


    public EntityStateBoolType getFileWriteAttributes()
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

        ref_list.add( getFilepath() );
        ref_list.add( getPath() );
        ref_list.add( getFilename() );
        ref_list.add( getTrusteeSid() );
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
        if (!(obj instanceof FileEffectiveRights53State)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "fileeffectiverights53_state[" + super.toString()
             + ", filepath="                + getFilepath()
             + ", path="                    + getPath()
             + ", filename="                + getFilename()
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
//FileEffectiveRights53State
