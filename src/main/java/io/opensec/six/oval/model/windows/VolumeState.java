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
import io.opensec.six.oval.model.definitions.EntityStateIntType;
import io.opensec.six.oval.model.definitions.EntityStateStringType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;



/**
 * The volume state defines the different metadata
 * associate with a storage volume in Windows.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class VolumeState
    extends StateType
{

    //{0..1}
    private EntityStateStringType       rootpath;
    private EntityStateStringType       file_system;
    private EntityStateStringType       name;
    private EntityStateDriveTypeType    drive_type;
    private EntityStateIntType          volume_max_component_length;
    private EntityStateIntType          serial_number;
    private EntityStateBoolType         file_case_sensitive_search;
    private EntityStateBoolType         file_case_preserved_names;
    private EntityStateBoolType         file_unicode_on_disk;
    private EntityStateBoolType         file_persistent_acls;
    private EntityStateBoolType         file_file_compression;
    private EntityStateBoolType         file_volume_quotas;
    private EntityStateBoolType         file_supports_sparse_files;
    private EntityStateBoolType         file_supports_reparse_points;
    private EntityStateBoolType         file_supports_remote_storage;
    private EntityStateBoolType         file_volume_is_compressed;
    private EntityStateBoolType         file_supports_object_ids;
    private EntityStateBoolType         file_supports_encryption;
    private EntityStateBoolType         file_named_streams;
    private EntityStateBoolType         file_read_only_volume;



    /**
     * Constructor.
     */
    public VolumeState()
    {
        this( null, 0 );
    }


    public VolumeState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public VolumeState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.volume;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.VOLUME;
    }



    /**
     */
    public void setRootpath(
                    final EntityStateStringType rootpath
                    )
    {
        this.rootpath = rootpath;
    }


    public EntityStateStringType getRootpath()
    {
        return rootpath;
    }



    /**
     */
    public void setFileSystem(
                    final EntityStateStringType file_system
                    )
    {
        this.file_system = file_system;
    }


    public EntityStateStringType getFileSystem()
    {
        return file_system;
    }



    /**
     */
    public void setName(
                    final EntityStateStringType name
                    )
    {
        this.name = name;
    }


    public EntityStateStringType getName()
    {
        return name;
    }



    /**
     */
    public void setDriveType(
                    final EntityStateDriveTypeType drive_type
                    )
    {
        this.drive_type = drive_type;
    }


    public EntityStateDriveTypeType getDriveType()
    {
        return drive_type;
    }



    /**
     */
    public void setVolumeMaxComponentLength(
                    final EntityStateIntType volume_max_component_length
                    )
    {
        this.volume_max_component_length = volume_max_component_length;
    }


    public EntityStateIntType getVolumeMaxComponentLength()
    {
        return volume_max_component_length;
    }



    /**
     */
    public void setSerialNumber(
                    final EntityStateIntType serial_number
                    )
    {
        this.serial_number = serial_number;
    }


    public EntityStateIntType getSerialNumber()
    {
        return serial_number;
    }



    /**
     */
    public void setFileCaseSensitiveSearch(
                    final EntityStateBoolType file_case_sensitive_search
                    )
    {
        this.file_case_sensitive_search = file_case_sensitive_search;
    }


    public EntityStateBoolType getFileCaseSensitiveSearch()
    {
        return file_case_sensitive_search;
    }



    /**
     */
    public void setFileCasePreservedNames(
                    final EntityStateBoolType file_case_preserved_names
                    )
    {
        this.file_case_preserved_names = file_case_preserved_names;
    }


    public EntityStateBoolType getFileCasePreservedNames()
    {
        return file_case_preserved_names;
    }



    /**
     */
    public void setFileUnicodeOnDisk(
                    final EntityStateBoolType file_unicode_on_disk
                    )
    {
        this.file_unicode_on_disk = file_unicode_on_disk;
    }


    public EntityStateBoolType getFileUnicodeOnDisk()
    {
        return file_unicode_on_disk;
    }



    /**
     */
    public void setFilePersistentAcls(
                    final EntityStateBoolType file_persistent_acls
                    )
    {
        this.file_persistent_acls = file_persistent_acls;
    }


    public EntityStateBoolType getFilePersistentAcls()
    {
        return file_persistent_acls;
    }



    /**
     */
    public void setFileFileCompression(
                    final EntityStateBoolType file_file_compression
                    )
    {
        this.file_file_compression = file_file_compression;
    }


    public EntityStateBoolType getFileFileCompression()
    {
        return file_file_compression;
    }



    /**
     */
    public void setFileVolumeQuotas(
                    final EntityStateBoolType file_volume_quotas
                    )
    {
        this.file_volume_quotas = file_volume_quotas;
    }


    public EntityStateBoolType getFileVolumeQuotas()
    {
        return file_volume_quotas;
    }



    /**
     */
    public void setFileSupportsSparseFiles(
                    final EntityStateBoolType file_supports_sparse_files
                    )
    {
        this.file_supports_sparse_files = file_supports_sparse_files;
    }


    public EntityStateBoolType getFileSupportsSparseFiles()
    {
        return file_supports_sparse_files;
    }



    /**
     */
    public void setFileSupportsReparsePoints(
                    final EntityStateBoolType file_supports_reparse_points
                    )
    {
        this.file_supports_reparse_points = file_supports_reparse_points;
    }


    public EntityStateBoolType getFileSupportsReparsePoints()
    {
        return file_supports_reparse_points;
    }



    /**
     */
    public void setFileSupportsRemoteStorage(
                    final EntityStateBoolType file_supports_remote_storage
                    )
    {
        this.file_supports_remote_storage = file_supports_remote_storage;
    }


    public EntityStateBoolType getFileSupportsRemoteStorage()
    {
        return file_supports_remote_storage;
    }



    /**
     */
    public void setFileVolumeIsCompressed(
                    final EntityStateBoolType file_volume_is_compressed
                    )
    {
        this.file_volume_is_compressed = file_volume_is_compressed;
    }


    public EntityStateBoolType getFileVolumeIsCompressed()
    {
        return file_volume_is_compressed;
    }



    /**
     */
    public void setFileSupportsObjectIds(
                    final EntityStateBoolType file_supports_object_ids
                    )
    {
        this.file_supports_object_ids = file_supports_object_ids;
    }


    public EntityStateBoolType getFileSupportsObjectIds()
    {
        return file_supports_object_ids;
    }



    /**
     */
    public void setFileSupportsEncryption(
                    final EntityStateBoolType file_supports_encryption
                    )
    {
        this.file_supports_encryption = file_supports_encryption;
    }


    public EntityStateBoolType getFileSupportsEncryption()
    {
        return file_supports_encryption;
    }



    /**
     */
    public void setFileNamedStreams(
                    final EntityStateBoolType file_named_streams
                    )
    {
        this.file_named_streams = file_named_streams;
    }


    public EntityStateBoolType getFileNamedStreams()
    {
        return file_named_streams;
    }



    /**
     */
    public void setFileReadOnlyVolume(
                    final EntityStateBoolType file_read_only_volume
                    )
    {
        this.file_read_only_volume = file_read_only_volume;
    }


    public EntityStateBoolType getFileReadOnlyVolume()
    {
        return file_read_only_volume;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();

        ref_list.add( getRootpath() );
        ref_list.add( getFileSystem() );
        ref_list.add( getName() );
        ref_list.add( getDriveType() );
        ref_list.add( getVolumeMaxComponentLength() );
        ref_list.add( getSerialNumber() );
        ref_list.add( getFileCaseSensitiveSearch() );
        ref_list.add( getFileCasePreservedNames() );
        ref_list.add( getFileUnicodeOnDisk() );
        ref_list.add( getFilePersistentAcls() );
        ref_list.add( getFileFileCompression() );
        ref_list.add( getFileVolumeQuotas() );
        ref_list.add( getFileSupportsSparseFiles() );
        ref_list.add( getFileSupportsReparsePoints() );
        ref_list.add( getFileSupportsRemoteStorage() );
        ref_list.add( getFileVolumeIsCompressed() );
        ref_list.add( getFileSupportsObjectIds() );
        ref_list.add( getFileSupportsEncryption() );
        ref_list.add( getFileNamedStreams() );
        ref_list.add( getFileReadOnlyVolume() );

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
        if (!(obj instanceof VolumeState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "volume_state[" + super.toString()
             + ", rootpath="                        + getRootpath()
             + ", file_system="                     + getFileSystem()
             + ", name="                            + getName()
             + ", drive_type="                      + getDriveType()
             + ", volume_max_component_length="     + getVolumeMaxComponentLength()
             + ", serial_number="                   + getSerialNumber()
             + ", file_case_sensitive_search="      + getFileCaseSensitiveSearch()
             + ", file_case_preserved_names="       + getFileCasePreservedNames()
             + ", file_unicode_on_disk="            + getFileUnicodeOnDisk()
             + ", file_persistent_acls="            + getFilePersistentAcls()
             + ", file_file_compression="           + getFileFileCompression()
             + ", file_volume_quotas="              + getFileVolumeQuotas()
             + ", file_supports_sparse_files="      + getFileSupportsSparseFiles()
             + ", file_supports_reparse_points="    + getFileSupportsReparsePoints()
             + ", file_supports_remote_storage="    + getFileSupportsRemoteStorage()
             + ", file_volume_is_compressed="       + getFileVolumeIsCompressed()
             + ", file_supports_object_ids="        + getFileSupportsObjectIds()
             + ", file_supports_encryption="        + getFileSupportsEncryption()
             + ", file_named_streams="              + getFileNamedStreams()
             + ", file_read_only_volume="           + getFileReadOnlyVolume()
             + "]";
    }

}
//VolumeState
