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
package jp.go.aist.six.oval.model.solaris;

import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.sc.EntityItemStringType;
import jp.go.aist.six.oval.model.sc.ItemType;
import jp.go.aist.six.oval.model.sc.StatusEnumeration;



/**
 * Output of /usr/bin/pkginfo.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: PackageItem.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class PackageItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType    pkginst;
    private EntityItemStringType    name;
    private EntityItemStringType    category;
    private EntityItemStringType	version;
    private EntityItemStringType    vendor;
    private EntityItemStringType    description;



    /**
     * Constructor.
     */
    public PackageItem()
    {
        this( 0 );
    }


    public PackageItem(
                    final int id
                    )
    {
        this( id, null );
    }


    public PackageItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        super( id, status );

        _oval_family = Family.SOLARIS;
        _oval_component = ComponentType.PACKAGE;
    }



    /**
     */
    public void setPkginst(
                    final EntityItemStringType pkginst
                    )
    {
        this.pkginst = pkginst;
    }


    public EntityItemStringType getPkginst()
    {
        return pkginst;
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
    public void setCategory(
                    final EntityItemStringType category
                    )
    {
        this.category = category;
    }


    public EntityItemStringType getCategory()
    {
        return category;
    }



    /**
     */
    public void setVersion(
                    final EntityItemStringType version
                    )
    {
        this.version = version;
    }


    public EntityItemStringType getVersion()
    {
        return version;
    }



    /**
     */
    public void setVendor(
                    final EntityItemStringType vendor
                    )
    {
        this.vendor = vendor;
    }


    public EntityItemStringType getVendor()
    {
        return vendor;
    }



    /**
     */
    public void setDescription(
                    final EntityItemStringType description
                    )
    {
        this.description = description;
    }


    public EntityItemStringType getDescription()
    {
        return description;
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
        if (!(obj instanceof PackageItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "package_item[" + super.toString()
                		+ ", pkginst="      + getPkginst()
                        + ", name="         + getName()
                        + ", category="     + getCategory()
                        + ", version="      + getVersion()
                        + ", vendor="       + getVendor()
                        + ", description="  + getDescription()
             + "]";
    }

}
//
