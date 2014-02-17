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
import jp.go.aist.six.oval.model.sc.EntityItemBoolType;
import jp.go.aist.six.oval.model.sc.EntityItemStringType;
import jp.go.aist.six.oval.model.sc.ItemType;
import jp.go.aist.six.oval.model.sc.StatusEnumeration;



/**
 * The packagecheck_item holds verification information about an individual file
 * that is part of a installed package.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: PackageCheckItem.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class PackageCheckItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType               pkginst;
    private EntityItemStringType               filepath;
    private EntityItemBoolType                 checksum_differs;
    private EntityItemBoolType                 size_differs;
    private EntityItemBoolType                 mtime_differs;

    private EntityItemPermissionCompareType    uread;
    private EntityItemPermissionCompareType    uwrite;
    private EntityItemPermissionCompareType    uexec;
    private EntityItemPermissionCompareType    gread;
    private EntityItemPermissionCompareType    gwrite;
    private EntityItemPermissionCompareType    gexec;
    private EntityItemPermissionCompareType    oread;
    private EntityItemPermissionCompareType    owrite;
    private EntityItemPermissionCompareType    oexec;



    /**
     * Constructor.
     */
    public PackageCheckItem()
    {
        this( 0 );
    }


    public PackageCheckItem(
                    final int id
                    )
    {
        this( id, null );
    }


    public PackageCheckItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        super( id, status );

        _oval_family = Family.SOLARIS;
        _oval_component = ComponentType.PACKAGECHECK;
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
    public void setChecksumDiffers(
                    final EntityItemBoolType checksum_differs
                    )
    {
        this.checksum_differs = checksum_differs;
    }


    public EntityItemBoolType getChecksumDiffers()
    {
        return checksum_differs;
    }



    /**
     */
    public void setSizeDiffers(
                    final EntityItemBoolType size_differs
                    )
    {
        this.size_differs = size_differs;
    }


    public EntityItemBoolType getSizeDiffers()
    {
        return size_differs;
    }



    /**
     */
    public void setMtimeDiffers(
                    final EntityItemBoolType mtime_differs
                    )
    {
        this.mtime_differs = mtime_differs;
    }


    public EntityItemBoolType getMtimeDiffers()
    {
        return mtime_differs;
    }



    /**
     */
    public void setUread(
                    final EntityItemPermissionCompareType uread
                    )
    {
        this.uread = uread;
    }


    public EntityItemPermissionCompareType getUread()
    {
        return uread;
    }



    /**
     */
    public void setUwrite(
                    final EntityItemPermissionCompareType uwrite
                    )
    {
        this.uwrite = uwrite;
    }


    public EntityItemPermissionCompareType getUwrite()
    {
        return uwrite;
    }



    /**
     */
    public void setUexec(
                    final EntityItemPermissionCompareType uexec
                    )
    {
        this.uexec = uexec;
    }


    public EntityItemPermissionCompareType getUexec()
    {
        return uexec;
    }



    /**
     */
    public void setGread(
                    final EntityItemPermissionCompareType gread
                    )
    {
        this.gread = gread;
    }


    public EntityItemPermissionCompareType getGread()
    {
        return gread;
    }



    /**
     */
    public void setGwrite(
                    final EntityItemPermissionCompareType gwrite
                    )
    {
        this.gwrite = gwrite;
    }


    public EntityItemPermissionCompareType getGwrite()
    {
        return gwrite;
    }



    /**
     */
    public void setGexec(
                    final EntityItemPermissionCompareType gexec
                    )
    {
        this.gexec = gexec;
    }


    public EntityItemPermissionCompareType getGexec()
    {
        return gexec;
    }



    /**
     */
    public void setOread(
                    final EntityItemPermissionCompareType oread
                    )
    {
        this.oread = oread;
    }


    public EntityItemPermissionCompareType getOread()
    {
        return oread;
    }



    /**
     */
    public void setOwrite(
                    final EntityItemPermissionCompareType owrite
                    )
    {
        this.owrite = owrite;
    }


    public EntityItemPermissionCompareType getOwrite()
    {
        return owrite;
    }



    /**
     */
    public void setOexec(
                    final EntityItemPermissionCompareType oexec
                    )
    {
        this.oexec = oexec;
    }


    public EntityItemPermissionCompareType getOexec()
    {
        return oexec;
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
        if (!(obj instanceof PackageCheckItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "packagecheck_item[" + super.toString()
                        + ", pkginst="          + getPkginst()
                        + ", filepath="         + getFilepath()
                        + ", checksum_differs=" + getChecksumDiffers()
                        + ", size_differs="     + getSizeDiffers()
                        + ", mtime_differs="    + getMtimeDiffers()
                        + ", uread="            + getUread()
                        + ", uwrite="           + getUwrite()
                        + ", uexec="            + getUexec()
                        + ", gread="            + getGread()
                        + ", gwrite="           + getGwrite()
                        + ", gexec="            + getGexec()
                        + ", oread="            + getOread()
                        + ", owrite="           + getOwrite()
                        + ", oexec="            + getOexec()
             + "]";
    }

}
//
