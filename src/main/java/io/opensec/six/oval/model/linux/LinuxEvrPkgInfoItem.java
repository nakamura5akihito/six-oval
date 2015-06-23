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

import io.opensec.six.oval.model.common.DatatypeEnumeration;
import io.opensec.six.oval.model.sc.EntityItemAnySimpleType;
import io.opensec.six.oval.model.sc.EntityItemEVRStringType;
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.StatusEnumeration;



/**
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public abstract class LinuxEvrPkgInfoItem
    extends LinuxPkgInfoItem
{

    private EntityItemAnySimpleType  epoch;
    //{0..1}

    private EntityItemAnySimpleType  release;
    //{0..1}

    private EntityItemEVRStringType  evr;
    //{0..1}



    /**
     * Constructor.
     */
    public LinuxEvrPkgInfoItem()
    {
        this( 0 );
    }


    public LinuxEvrPkgInfoItem(
                    final int id
                    )
    {
        this( id, DEFAULT_STATUS );
    }


    public LinuxEvrPkgInfoItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        this( id, status, (EntityItemStringType)null );
    }


    public LinuxEvrPkgInfoItem(
                    final int id,
                    final StatusEnumeration status,
                    final String name
                    )
    {
        this( id, status,
                        (name == null ? null : new EntityItemStringType( name ))
                        );
    }


    public LinuxEvrPkgInfoItem(
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



    public LinuxEvrPkgInfoItem(
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


    public LinuxEvrPkgInfoItem(
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


    public LinuxEvrPkgInfoItem(
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
        super( id, status, arch, name, version );

        setEpoch( epoch );
        setRelease( release );
        setEvr( evr );
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
                    // xsd:restriction satisfied.
                } else {
                    throw new IllegalArgumentException(
                                    "invalid epoch: datatype=" + datatype );
                }
            }
        }

        this.epoch = epoch;
//        _properties.put( LinuxPkgProperty.EPOCH, epoch );
    }


    public EntityItemAnySimpleType getEpoch()
    {
        return epoch;
//        return (EntityItemAnySimpleType)_properties.get( LinuxPkgProperty.EPOCH );
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
//        _properties.put( LinuxPkgProperty.RELEASE, release );
    }


    public EntityItemAnySimpleType getRelease()
    {
        return release;
//        return (EntityItemAnySimpleType)_properties.get( LinuxPkgProperty.RELEASE );
    }



    /**
     */
    public void setEvr(
                    final EntityItemEVRStringType evr
                    )
    {
        this.evr = evr;
//        _properties.put( LinuxPkgProperty.EVR, evr );
    }


    public EntityItemEVRStringType getEvr()
    {
        return evr;
//        return (EntityItemEVRStringType)_properties.get( LinuxPkgProperty.EVR );
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return super.toString()
             + ", epoch="   + getEpoch()
             + ", release=" + getRelease()
             + ", evr="     + getEvr()
             ;
    }

}
// LinuxEvrPkgInfoItem
