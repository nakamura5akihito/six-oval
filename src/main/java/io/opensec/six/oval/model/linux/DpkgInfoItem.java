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
import io.opensec.six.oval.model.sc.EntityItemEVRStringType;
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.ItemType;
import io.opensec.six.oval.model.sc.StatusEnumeration;



/**
 * The dpkginfo item stores DPKG package info.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class DpkgInfoItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType        name;
    private EntityItemStringType        arch;
    private EntityItemAnySimpleType     epoch;
    private EntityItemAnySimpleType     release;
    private EntityItemAnySimpleType     version;
    private EntityItemEVRStringType     evr;



    /**
     * Constructor.
     */
    public DpkgInfoItem()
    {
        this( 0 );
    }


    public DpkgInfoItem(
                    final int id
                    )
    {
        this( id, DEFAULT_STATUS );
    }


    public DpkgInfoItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        this( id, status, (EntityItemStringType)null );
    }


    public DpkgInfoItem(
                    final int id,
                    final StatusEnumeration status,
                    final String name
                    )
    {
        this( id, status,
                        (name == null ? null : new EntityItemStringType( name ))
                        );
    }


    public DpkgInfoItem(
                    final int id,
                    final StatusEnumeration status,
                    final EntityItemStringType name
                    )
    {
        this( id, status,
                        (EntityItemStringType)null,
                        name,
                        (EntityItemAnySimpleType)null,
                        (EntityItemAnySimpleType)null,
                        (EntityItemAnySimpleType)null,
                        (EntityItemEVRStringType)null
                        );
    }


    public DpkgInfoItem(
                    final int id,
                    final String arch,
                    final String name,
                    final String version,
                    final String release,
                    final String epoch,
                    final String evr
                    )
    {
        this( id, DEFAULT_STATUS, arch, name, version, release, epoch, evr );
    }


    public DpkgInfoItem(
                    final int id,
                    final StatusEnumeration status,
                    final String arch,
                    final String name,
                    final String version,
                    final String release,
                    final String epoch,
                    final String evr
                    )
    {
        this( id, status,
                        (arch == null ? null : new EntityItemStringType( arch )),
                        (name == null ? null : new EntityItemStringType( name )),
                        (version == null ? null : new EntityItemAnySimpleType( version )),
                        (release == null ? null : new EntityItemAnySimpleType( release )),
                        (epoch == null ? null : new EntityItemAnySimpleType( epoch )),
                        (evr == null ? null : new EntityItemEVRStringType( evr ))
                        );
    }


    public DpkgInfoItem(
                    final int id,
                    final StatusEnumeration status,
                    final EntityItemStringType arch,
                    final EntityItemStringType name,
                    final EntityItemAnySimpleType version,
                    final EntityItemAnySimpleType release,
                    final EntityItemAnySimpleType epoch,
                    final EntityItemEVRStringType evr
                    )
    {
        super( id, status );
//        super( id, status, arch, name, version, release, epoch, evr );

        setName( name );
        setArch( arch);
        setEpoch( epoch);
        setRelease( release);
        setVersion( version);
        setEvr( evr );

//        _oval_platform_type = OvalPlatformType.linux;
//        _oval_component_type = OvalComponentType.dpkginfo;
        _oval_family = Family.LINUX;
        _oval_component = ComponentType.DPKGINFO;
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


    public DpkgInfoItem name(
                    final String name
                    )
    {
        setName( new EntityItemStringType( name ) );
        return this;
    }


    public DpkgInfoItem name(
                    final EntityItemStringType name
                    )
    {
        setName( name );
        return this;
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


    public DpkgInfoItem arch(
                    final String arch
                    )
    {
        setArch( new EntityItemStringType( arch ) );
        return this;
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


    public DpkgInfoItem epoch(
                    final String epoch
                    )
    {
        setEpoch( new EntityItemAnySimpleType( epoch ) );
        return this;
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


    public DpkgInfoItem release(
                    final String release
                    )
    {
        setRelease( new EntityItemAnySimpleType( release ) );
        return this;
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


    public DpkgInfoItem version(
                    final String version
                    )
    {
        setVersion( new EntityItemAnySimpleType( version ) );
        return this;
    }



    /**
     */
    public void setEvr(
                    final EntityItemEVRStringType evr
                    )
    {
        this.evr = evr;
    }


    public EntityItemEVRStringType getEvr()
    {
        return evr;
    }


    public DpkgInfoItem evr(
                    final String evr
                    )
    {
        setEvr( new EntityItemEVRStringType( evr ) );
        return this;
    }




    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "dpkginfo_item[" + super.toString()
                        + ", name="    + getName()
                        + ", arch="    + getArch()
                        + ", epoch="   + getEpoch()
                        + ", release=" + getRelease()
                        + ", version=" + getVersion()
                        + ", evr="     + getEvr()
             + "]";
    }

}
//DpkgInfoItem
