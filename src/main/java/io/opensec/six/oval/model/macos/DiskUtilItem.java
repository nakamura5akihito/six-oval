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
package io.opensec.six.oval.model.macos;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.ItemType;
import io.opensec.six.oval.model.sc.StatusEnumeration;



/**
 * The diskutil item holds verification information about an individual disk on a Mac OS system.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class DiskUtilItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType               device;
    private EntityItemStringType               filepath;

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
    public DiskUtilItem()
    {
        this( 0 );
    }


    public DiskUtilItem(
                    final int id
                    )
    {
        this( id, null );
    }


    public DiskUtilItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        super( id, status );

        _oval_family = Family.MACOS;
        _oval_component = ComponentType.DISKUTIL;
    }



    /**
     */
    public void setDevice(
                    final EntityItemStringType device
                    )
    {
        this.device = device;
    }


    public EntityItemStringType getDevice()
    {
        return device;
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
        if (!(obj instanceof DiskUtilItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "diskutil_item[" + super.toString()
                        + ", device="           + getDevice()
                        + ", filepath="         + getFilepath()
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
