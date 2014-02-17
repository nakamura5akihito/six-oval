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

import jp.go.aist.six.oval.model.common.DatatypeEnumeration;
import jp.go.aist.six.oval.model.sc.EntityItemAnySimpleType;
import jp.go.aist.six.oval.model.sc.EntityItemStringType;
import jp.go.aist.six.oval.model.sc.ItemType;
import jp.go.aist.six.oval.model.sc.StatusEnumeration;



/**
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: LinuxPkgInfoItem.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public abstract class LinuxPkgInfoItem
    extends ItemType
{

    private EntityItemStringType  name;
    //{0..1}

    private EntityItemStringType  arch;
    //{0..1}

    private EntityItemAnySimpleType  version;
    //{0..1}


//    protected Map<LinuxPkgProperty, EntityAttributeGroup>  _properties =
//        new EnumMap<LinuxPkgProperty, EntityAttributeGroup>( LinuxPkgProperty.class );


    /**
     * Constructor.
     */
    public LinuxPkgInfoItem()
    {
        this( 0 );
    }


    public LinuxPkgInfoItem(
                    final int id
                    )
    {
        this( id, null );
    }


    public LinuxPkgInfoItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        this( id, status, (EntityItemStringType)null );
    }


    public LinuxPkgInfoItem(
                    final int id,
                    final StatusEnumeration status,
                    final String name
                    )
    {
        this( id, status, null, name, null );
    }


    public LinuxPkgInfoItem(
                    final int id,
                    final StatusEnumeration status,
                    final EntityItemStringType name
                    )
    {
        this( id, status, (EntityItemStringType)null, name, (EntityItemAnySimpleType)null );
    }


    public LinuxPkgInfoItem(
                    final int id,
                    final String arch,
                    final String name,
                    final String version
                    )
    {
        this( id, DEFAULT_STATUS, arch, name, version );
    }


    public LinuxPkgInfoItem(
                    final int id,
                    final StatusEnumeration status,
                    final String arch,
                    final String name,
                    final String version
                    )
    {
        this( id, status,
                        (arch == null ? null : new EntityItemStringType( arch )),
                        (name == null ? null : new EntityItemStringType( name )),
                        (version == null ? null : new EntityItemAnySimpleType( version ))
                        );
    }


    public LinuxPkgInfoItem(
                    final int id,
                    final StatusEnumeration status,
                    final EntityItemStringType arch,
                    final EntityItemStringType name,
                    final EntityItemAnySimpleType version
                    )
    {
        super( id, status );

        setArch( arch);
        setName( name );
        setVersion( version );
    }



    /**
     */
    public void setName(
                    final EntityItemStringType name
                    )
    {
        this.name = name;
//        _properties.put( LinuxPkgProperty.NAME, name );
    }


    public EntityItemStringType getName()
    {
        return name;
//        return (EntityItemStringType)_properties.get( LinuxPkgProperty.NAME );
    }



    /**
     */
    public void setArch(
                    final EntityItemStringType arch
                    )
    {
        this.arch = arch;
//        _properties.put( LinuxPkgProperty.ARCH, arch );
    }


    public EntityItemStringType getArch()
    {
        return arch;
//        return (EntityItemStringType)_properties.get( LinuxPkgProperty.ARCH );
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
//        _properties.put( LinuxPkgProperty.VERSION, version );
    }


    public EntityItemAnySimpleType getVersion()
    {
        return version;
//        return (EntityItemAnySimpleType)_properties.get( LinuxPkgProperty.VERSION );
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return super.toString()
             + ", name="    + getName()
             + ", arch="    + getArch()
             + ", version=" + getVersion()
             ;
    }

}
// LinuxPkgInfoItem
