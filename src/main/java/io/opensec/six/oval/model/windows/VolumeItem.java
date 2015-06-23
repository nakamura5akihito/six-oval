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
import io.opensec.six.oval.model.sc.EntityItemIntType;
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.ItemType;
import io.opensec.six.oval.model.sc.StatusEnumeration;



/**
 * The volume item enumerates various attributes
 * about a particular volume mounted to a machine.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class VolumeItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType       rootpath;
    private EntityItemStringType       file_system;
    private EntityItemStringType       name;
    private EntityItemDriveTypeType    drive_type;
    private EntityItemIntType          volume_max_component_length;
    private EntityItemIntType          serial_number;
    private EntityItemBoolType         file_case_sensitive_search;
    private EntityItemBoolType         file_case_preserved_names;
    private EntityItemBoolType         file_unicode_on_disk;
    private EntityItemBoolType         file_persistent_acls;
    private EntityItemBoolType         file_file_compression;
    private EntityItemBoolType         file_volume_quotas;
    private EntityItemBoolType         file_supports_sparse_files;
    private EntityItemBoolType         file_supports_reparse_points;
    private EntityItemBoolType         file_supports_remote_storage;
    private EntityItemBoolType         file_volume_is_compressed;
    private EntityItemBoolType         file_supports_object_ids;
    private EntityItemBoolType         file_supports_encryption;
    private EntityItemBoolType         file_named_streams;
    private EntityItemBoolType         file_read_only_volume;



    /**
     * Constructor.
     */
    public VolumeItem()
    {
        this( 0 );
    }


    public VolumeItem(
                    final int id
                    )
    {
        this( id, null );
    }


    public VolumeItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        super( id, status );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.volume;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.VOLUME;
    }



    /**
     */
    public void setRootpath(
                    final EntityItemStringType rootpath
                    )
    {
        this.rootpath = rootpath;
    }


    public EntityItemStringType getRootpath()
    {
        return rootpath;
    }



    /**
     */
    public void setFileSystem(
                    final EntityItemStringType file_system
                    )
    {
        this.file_system = file_system;
    }


    public EntityItemStringType getFileSystem()
    {
        return file_system;
    }



    /**
     */
    public void setName(
                    final EntityItemStringType name
                    )
    {
        this.name = name;
    }


    public EntityItemStringType getName()
    {
        return name;
    }



    /**
     */
    public void setDriveType(
                    final EntityItemDriveTypeType drive_type
                    )
    {
        this.drive_type = drive_type;
    }


    public EntityItemDriveTypeType getDriveType()
    {
        return drive_type;
    }



    /**
     */
    public void setVolumeMaxComponentLength(
                    final EntityItemIntType volume_max_component_length
                    )
    {
        this.volume_max_component_length = volume_max_component_length;
    }


    public EntityItemIntType getVolumeMaxComponentLength()
    {
        return volume_max_component_length;
    }



    /**
     */
    public void setSerialNumber(
                    final EntityItemIntType serial_number
                    )
    {
        this.serial_number = serial_number;
    }


    public EntityItemIntType getSerialNumber()
    {
        return serial_number;
    }



    /**
     */
    public void setFileCaseSensitiveSearch(
                    final EntityItemBoolType file_case_sensitive_search
                    )
    {
        this.file_case_sensitive_search = file_case_sensitive_search;
    }


    public EntityItemBoolType getFileCaseSensitiveSearch()
    {
        return file_case_sensitive_search;
    }



    /**
     */
    public void setFileCasePreservedNames(
                    final EntityItemBoolType file_case_preserved_names
                    )
    {
        this.file_case_preserved_names = file_case_preserved_names;
    }


    public EntityItemBoolType getFileCasePreservedNames()
    {
        return file_case_preserved_names;
    }



    /**
     */
    public void setFileUnicodeOnDisk(
                    final EntityItemBoolType file_unicode_on_disk
                    )
    {
        this.file_unicode_on_disk = file_unicode_on_disk;
    }


    public EntityItemBoolType getFileUnicodeOnDisk()
    {
        return file_unicode_on_disk;
    }



    /**
     */
    public void setFilePersistentAcls(
                    final EntityItemBoolType file_persistent_acls
                    )
    {
        this.file_persistent_acls = file_persistent_acls;
    }


    public EntityItemBoolType getFilePersistentAcls()
    {
        return file_persistent_acls;
    }



    /**
     */
    public void setFileFileCompression(
                    final EntityItemBoolType file_file_compression
                    )
    {
        this.file_file_compression = file_file_compression;
    }


    public EntityItemBoolType getFileFileCompression()
    {
        return file_file_compression;
    }



    /**
     */
    public void setFileVolumeQuotas(
                    final EntityItemBoolType file_volume_quotas
                    )
    {
        this.file_volume_quotas = file_volume_quotas;
    }


    public EntityItemBoolType getFileVolumeQuotas()
    {
        return file_volume_quotas;
    }



    /**
     */
    public void setFileSupportsSparseFiles(
                    final EntityItemBoolType file_supports_sparse_files
                    )
    {
        this.file_supports_sparse_files = file_supports_sparse_files;
    }


    public EntityItemBoolType getFileSupportsSparseFiles()
    {
        return file_supports_sparse_files;
    }



    /**
     */
    public void setFileSupportsReparsePoints(
                    final EntityItemBoolType file_supports_reparse_points
                    )
    {
        this.file_supports_reparse_points = file_supports_reparse_points;
    }


    public EntityItemBoolType getFileSupportsReparsePoints()
    {
        return file_supports_reparse_points;
    }



    /**
     */
    public void setFileSupportsRemoteStorage(
                    final EntityItemBoolType file_supports_remote_storage
                    )
    {
        this.file_supports_remote_storage = file_supports_remote_storage;
    }


    public EntityItemBoolType getFileSupportsRemoteStorage()
    {
        return file_supports_remote_storage;
    }



    /**
     */
    public void setFileVolumeIsCompressed(
                    final EntityItemBoolType file_volume_is_compressed
                    )
    {
        this.file_volume_is_compressed = file_volume_is_compressed;
    }


    public EntityItemBoolType getFileVolumeIsCompressed()
    {
        return file_volume_is_compressed;
    }



    /**
     */
    public void setFileSupportsObjectIds(
                    final EntityItemBoolType file_supports_object_ids
                    )
    {
        this.file_supports_object_ids = file_supports_object_ids;
    }


    public EntityItemBoolType getFileSupportsObjectIds()
    {
        return file_supports_object_ids;
    }



    /**
     */
    public void setFileSupportsEncryption(
                    final EntityItemBoolType file_supports_encryption
                    )
    {
        this.file_supports_encryption = file_supports_encryption;
    }


    public EntityItemBoolType getFileSupportsEncryption()
    {
        return file_supports_encryption;
    }



    /**
     */
    public void setFileNamedStreams(
                    final EntityItemBoolType file_named_streams
                    )
    {
        this.file_named_streams = file_named_streams;
    }


    public EntityItemBoolType getFileNamedStreams()
    {
        return file_named_streams;
    }



    /**
     */
    public void setFileReadOnlyVolume(
                    final EntityItemBoolType file_read_only_volume
                    )
    {
        this.file_read_only_volume = file_read_only_volume;
    }


    public EntityItemBoolType getFileReadOnlyVolume()
    {
        return file_read_only_volume;
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
        if (!(obj instanceof VolumeItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "volume_item[" + super.toString()
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
//VolumeItem
