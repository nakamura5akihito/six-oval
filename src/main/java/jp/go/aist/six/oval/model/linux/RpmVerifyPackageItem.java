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
package jp.go.aist.six.oval.model.linux;

import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.common.DatatypeEnumeration;
import jp.go.aist.six.oval.model.sc.EntityItemAnySimpleType;
import jp.go.aist.six.oval.model.sc.EntityItemBoolType;
import jp.go.aist.six.oval.model.sc.EntityItemStringType;
import jp.go.aist.six.oval.model.sc.ItemType;
import jp.go.aist.six.oval.model.sc.StatusEnumeration;



/**
 * This item stores the rpm verification results of an rpm similar to
 * what is produced by the rpm -V command.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: RpmVerifyPackageItem.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class RpmVerifyPackageItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType        name;
    private EntityItemAnySimpleType     epoch;
    private EntityItemAnySimpleType     version;
    private EntityItemAnySimpleType     release;
    private EntityItemStringType        arch;
    private EntityItemStringType        extended_name;

    private EntityItemBoolType         dependency_check_passed;
    private EntityItemBoolType         digest_check_passed;
    private EntityItemBoolType         verification_script_successful;
    private EntityItemBoolType         signature_check_passed;



    /**
     * Constructor.
     */
    public RpmVerifyPackageItem()
    {
        this( 0 );
    }


    public RpmVerifyPackageItem(
                    final int id
                    )
    {
        this( id, DEFAULT_STATUS );
    }


    public RpmVerifyPackageItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        super( id, status );

        _oval_family = Family.LINUX;
        _oval_component = ComponentType.RPMVERIFYPACKAGE;
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
    public void setDependencyCheckPassed(
                    final EntityItemBoolType dependency_check_passed
                    )
    {
        this.dependency_check_passed = dependency_check_passed;
    }


    public EntityItemBoolType getDependencyCheckPassed()
    {
        return dependency_check_passed;
    }



    /**
     */
    public void setDigestCheckPassed(
                    final EntityItemBoolType digest_check_passed
                    )
    {
        this.digest_check_passed = digest_check_passed;
    }


    public EntityItemBoolType getDigestCheckPassed()
    {
        return digest_check_passed;
    }



    /**
     */
    public void setVerificationScriptSuccessful(
                    final EntityItemBoolType verification_script_successful
                    )
    {
        this.verification_script_successful = verification_script_successful;
    }


    public EntityItemBoolType getVerificationScriptSuccessful()
    {
        return verification_script_successful;
    }



    /**
     */
    public void setSignatureCheckPassed(
                    final EntityItemBoolType signature_check_passed
                    )
    {
        this.signature_check_passed = signature_check_passed;
    }


    public EntityItemBoolType getSignatureCheckPassed()
    {
        return signature_check_passed;
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
                        + ", extended_name="        + getExtendedName()
                        + ", dependency_check_passed="          + getDependencyCheckPassed()
                        + ", digest_check_passed="              + getDigestCheckPassed()
                        + ", verification_script_successful="   + getVerificationScriptSuccessful()
                        + ", signature_check_passed="           + getSignatureCheckPassed()
             + "]";
    }

}
//
