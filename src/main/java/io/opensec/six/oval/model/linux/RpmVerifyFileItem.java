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
package io.opensec.six.oval.model.linux;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.common.DatatypeEnumeration;
import io.opensec.six.oval.model.sc.EntityItemAnySimpleType;
import io.opensec.six.oval.model.sc.EntityItemBoolType;
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.ItemType;
import io.opensec.six.oval.model.sc.StatusEnumeration;



/**
 * This item stores the verification results of the individual files in an RPM
 * similar to what is produced by the rpm -V command.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class RpmVerifyFileItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType        name;
    private EntityItemAnySimpleType     epoch;
    private EntityItemAnySimpleType     version;
    private EntityItemAnySimpleType     release;
    private EntityItemStringType        arch;
    private EntityItemStringType        filepath;
    private EntityItemStringType        extended_name;

    private EntityItemRpmVerifyResultType  size_differs;
    private EntityItemRpmVerifyResultType  mode_differs;
    private EntityItemRpmVerifyResultType  md5_differs;
    private EntityItemRpmVerifyResultType  device_differs;
    private EntityItemRpmVerifyResultType  link_mismatch;
    private EntityItemRpmVerifyResultType  ownership_differs;
    private EntityItemRpmVerifyResultType  group_differs;
    private EntityItemRpmVerifyResultType  mtime_differs;
    private EntityItemRpmVerifyResultType  capabilities_differ;

    private EntityItemBoolType             configuration_file;
    private EntityItemBoolType             documentation_file;
    private EntityItemBoolType             ghost_file;
    private EntityItemBoolType             license_file;
    private EntityItemBoolType             readme_file;



    /**
     * Constructor.
     */
    public RpmVerifyFileItem()
    {
        this( 0 );
    }


    public RpmVerifyFileItem(
                    final int id
                    )
    {
        this( id, DEFAULT_STATUS );
    }


    public RpmVerifyFileItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        super( id, status );

        _oval_family = Family.LINUX;
        _oval_component = ComponentType.RPMVERIFYFILE;
    }

//    public RpmInfoItem(
//                    final int id
//                    )
//    {
//        this( id,
//                        (String)null,
//                        (String)null,
//                        (String)null,
//                        (String)null,
//                        (String)null,
//                        (String)null,
//                        (String)null
//                        );
//    }
//
//
//
//    public RpmInfoItem(
//                    final int id,
//                    final String arch,
//                    final String name,
//                    final String version,
//                    final String release,
//                    final String epoch,
//                    final String evr,
//                    final String sigkeyid
//                    )
//    {
//        super( id, arch, name, version, release, epoch, evr );
//
//        if (sigkeyid != null) {
//            setSignatureKeyId( new EntityItemStringType( sigkeyid ) );
//        }
//
//        _oval_platform_type = OvalPlatformType.linux;
//        _oval_component_type = OvalComponentType.rpminfo;
//    }


//    public RpmInfoItem(
//                    final int id,
//                    final EntityItemStringType arch,
//                    final EntityItemStringType name,
//                    final EntityItemAnySimpleType version,
//                    final EntityItemAnySimpleType release,
//                    final EntityItemAnySimpleType epoch,
//                    final EntityItemEVRStringType evr,
//                    final EntityItemStringType sigkeyid
//                    )
//    {
//        super( id, arch, name, version, release, epoch, evr );
//
//        setSignatureKeyID( sigkeyid );
//    }



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
    public void setEpoch(
                    final EntityItemAnySimpleType epoch
                    )
    {
        if (epoch != null) {
            DatatypeEnumeration  datatype = epoch.getDatatype();
            if (datatype != null) {
                if (datatype == DatatypeEnumeration.STRING
                                ||  datatype == DatatypeEnumeration.INT) {
                    //validation: xsd:restriction satisfied.
                } else {
                    throw new IllegalArgumentException(
                                    "invalid epoch: datatype=" + datatype );
                }
            }
        }

        this.epoch = epoch;
    }


    public EntityItemAnySimpleType getEpoch()
    {
        return epoch;
    }



    /**
     */
    public void setVersion(
                    final EntityItemAnySimpleType version
                    )
    {
        if (version != null) {
            DatatypeEnumeration  datatype = version.getDatatype();
            if (datatype != null) {
                if (datatype == DatatypeEnumeration.STRING
                                ||  datatype == DatatypeEnumeration.VERSION) {
                    // xsd:restriction satisfied.
                } else {
                    throw new IllegalArgumentException(
                                    "invalid version: datatype=" + datatype );
                }
            }
        }

        this.version = version;
    }


    public EntityItemAnySimpleType getVersion()
    {
        return version;
    }



    /**
     */
    public void setRelease(
                    final EntityItemAnySimpleType release
                    )
    {
        if (release != null) {
            DatatypeEnumeration  datatype = release.getDatatype();
            if (datatype != null) {
                if (datatype == DatatypeEnumeration.STRING
                                ||  datatype == DatatypeEnumeration.VERSION) {
                    // xsd:restriction satisfied.
                } else {
                    throw new IllegalArgumentException(
                                    "invalid release: datatype=" + datatype );
                }
            }
        }

        this.release = release;
    }


    public EntityItemAnySimpleType getRelease()
    {
        return release;
    }



    /**
     */
    public void setArch(
                    final EntityItemStringType arch
                    )
    {
        this.arch = arch;
    }


    public EntityItemStringType getArch()
    {
        return arch;
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
    public void setExtendedName(
                    final EntityItemStringType extended_name
                    )
    {
        this.extended_name = extended_name;
    }


    public EntityItemStringType getExtendedName()
    {
        return extended_name;
    }



    /**
     */
    public void setSizeDiffers(
                    final EntityItemRpmVerifyResultType size_differs
                    )
    {
        this.size_differs = size_differs;
    }


    public EntityItemRpmVerifyResultType getSizeDiffers()
    {
        return size_differs;
    }



    /**
     */
    public void setModeDiffers(
                    final EntityItemRpmVerifyResultType mode_differs
                    )
    {
        this.mode_differs = mode_differs;
    }


    public EntityItemRpmVerifyResultType getModeDiffers()
    {
        return mode_differs;
    }



    /**
     */
    public void setMd5Differs(
                    final EntityItemRpmVerifyResultType md5_differs
                    )
    {
        this.md5_differs = md5_differs;
    }


    public EntityItemRpmVerifyResultType getMd5Differs()
    {
        return md5_differs;
    }



    /**
     */
    public void setDeviceDiffers(
                    final EntityItemRpmVerifyResultType device_differs
                    )
    {
        this.device_differs = device_differs;
    }


    public EntityItemRpmVerifyResultType getDeviceDiffers()
    {
        return device_differs;
    }



    /**
     */
    public void setLinkMismatch(
                    final EntityItemRpmVerifyResultType link_mismatch
                    )
    {
        this.link_mismatch = link_mismatch;
    }


    public EntityItemRpmVerifyResultType getLinkMismatch()
    {
        return link_mismatch;
    }



    /**
     */
    public void setOwnershipDiffers(
                    final EntityItemRpmVerifyResultType ownership_differs
                    )
    {
        this.ownership_differs = ownership_differs;
    }


    public EntityItemRpmVerifyResultType getOwnershipDiffers()
    {
        return ownership_differs;
    }



    /**
     */
    public void setGroupDiffers(
                    final EntityItemRpmVerifyResultType group_differs
                    )
    {
        this.group_differs = group_differs;
    }


    public EntityItemRpmVerifyResultType getGroupDiffers()
    {
        return group_differs;
    }



    /**
     */
    public void setMtimeDiffers(
                    final EntityItemRpmVerifyResultType mtime_differs
                    )
    {
        this.mtime_differs = mtime_differs;
    }


    public EntityItemRpmVerifyResultType getMtimeDiffers()
    {
        return mtime_differs;
    }



    /**
     */
    public void setCapabilitiesDiffer(
                    final EntityItemRpmVerifyResultType capabilities_differ
                    )
    {
        this.capabilities_differ = capabilities_differ;
    }


    public EntityItemRpmVerifyResultType getCapabilitiesDiffer()
    {
        return capabilities_differ;
    }



    /**
     */
    public void setConfigurationFile(
                    final EntityItemBoolType configuration_file
                    )
    {
        this.configuration_file = configuration_file;
    }


    public EntityItemBoolType getConfigurationFile()
    {
        return configuration_file;
    }



    /**
     */
    public void setDocumentationFile(
                    final EntityItemBoolType documentation_file
                    )
    {
        this.documentation_file = documentation_file;
    }


    public EntityItemBoolType getDocumentationFile()
    {
        return documentation_file;
    }



    /**
     */
    public void setGhostFile(
                    final EntityItemBoolType ghost_file
                    )
    {
        this.ghost_file = ghost_file;
    }


    public EntityItemBoolType getGhostFile()
    {
        return ghost_file;
    }



    /**
     */
    public void setLicenseFile(
                    final EntityItemBoolType license_file
                    )
    {
        this.license_file = license_file;
    }


    public EntityItemBoolType getLicenseFile()
    {
        return license_file;
    }



    /**
     */
    public void setReadmeFile(
                    final EntityItemBoolType readme_file
                    )
    {
        this.readme_file = readme_file;
    }


    public EntityItemBoolType getReadmeFile()
    {
        return readme_file;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "rpmverifyfile_item[" + super.toString()
                        + ", name="                 + getName()
                        + ", epoch="                + getEpoch()
                        + ", version="              + getVersion()
                        + ", release="              + getRelease()
                        + ", arch="                 + getArch()
                        + ", filepath="             + getFilepath()
                        + ", extended_name="        + getExtendedName()
                        + ", size_differs="         + getSizeDiffers()
                        + ", mode_differs="         + getModeDiffers()
                        + ", md5_differs="          + getMd5Differs()
                        + ", device_differs="       + getDeviceDiffers()
                        + ", link_mismatch="        + getLinkMismatch()
                        + ", ownership_differs="    + getOwnershipDiffers()
                        + ", group_differs="        + getGroupDiffers()
                        + ", mtime_differs="        + getMtimeDiffers()
                        + ", capabilities_differ="  + getCapabilitiesDiffer()
                        + ", configuration_file="   + getConfigurationFile()
                        + ", documentation_file="   + getDocumentationFile()
                        + ", ghost_file="           + getGhostFile()
                        + ", license_file="         + getLicenseFile()
                        + ", readme_file="          + getReadmeFile()
             + "]";
    }

}
//
