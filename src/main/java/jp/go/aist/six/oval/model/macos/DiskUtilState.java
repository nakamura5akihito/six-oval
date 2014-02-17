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
package jp.go.aist.six.oval.model.macos;

import java.util.ArrayList;
import java.util.Collection;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.EntityStateStringType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 * The package state defines the different verification information associated
 * with a disk on a Mac OS system.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: DiskUtilState.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class DiskUtilState
    extends StateType
{

    //{0..1}
    private EntityStateStringType               device;
    private EntityStateStringType               filepath;

    private EntityStatePermissionCompareType    uread;
    private EntityStatePermissionCompareType    uwrite;
    private EntityStatePermissionCompareType    uexec;
    private EntityStatePermissionCompareType    gread;
    private EntityStatePermissionCompareType    gwrite;
    private EntityStatePermissionCompareType    gexec;
    private EntityStatePermissionCompareType    oread;
    private EntityStatePermissionCompareType    owrite;
    private EntityStatePermissionCompareType    oexec;



    /**
     * Constructor.
     */
    public DiskUtilState()
    {
        this( null, 0 );
    }


    public DiskUtilState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public DiskUtilState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.MACOS;
        _oval_component = ComponentType.DISKUTIL;
    }



    /**
     */
    public void setDevice(
                    final EntityStateStringType device
                    )
    {
        this.device = device;
    }


    public EntityStateStringType getDevice()
    {
        return device;
    }



    /**
     */
    public void setFilepath(
                    final EntityStateStringType filepath
                    )
    {
        this.filepath = filepath;
    }


    public EntityStateStringType getFilepath()
    {
        return filepath;
    }



    /**
     */
    public void setUread(
                    final EntityStatePermissionCompareType uread
                    )
    {
        this.uread = uread;
    }


    public EntityStatePermissionCompareType getUread()
    {
        return uread;
    }



    /**
     */
    public void setUwrite(
                    final EntityStatePermissionCompareType uwrite
                    )
    {
        this.uwrite = uwrite;
    }


    public EntityStatePermissionCompareType getUwrite()
    {
        return uwrite;
    }



    /**
     */
    public void setUexec(
                    final EntityStatePermissionCompareType uexec
                    )
    {
        this.uexec = uexec;
    }


    public EntityStatePermissionCompareType getUexec()
    {
        return uexec;
    }



    /**
     */
    public void setGread(
                    final EntityStatePermissionCompareType gread
                    )
    {
        this.gread = gread;
    }


    public EntityStatePermissionCompareType getGread()
    {
        return gread;
    }



    /**
     */
    public void setGwrite(
                    final EntityStatePermissionCompareType gwrite
                    )
    {
        this.gwrite = gwrite;
    }


    public EntityStatePermissionCompareType getGwrite()
    {
        return gwrite;
    }



    /**
     */
    public void setGexec(
                    final EntityStatePermissionCompareType gexec
                    )
    {
        this.gexec = gexec;
    }


    public EntityStatePermissionCompareType getGexec()
    {
        return gexec;
    }



    /**
     */
    public void setOread(
                    final EntityStatePermissionCompareType oread
                    )
    {
        this.oread = oread;
    }


    public EntityStatePermissionCompareType getOread()
    {
        return oread;
    }



    /**
     */
    public void setOwrite(
                    final EntityStatePermissionCompareType owrite
                    )
    {
        this.owrite = owrite;
    }


    public EntityStatePermissionCompareType getOwrite()
    {
        return owrite;
    }



    /**
     */
    public void setOexec(
                    final EntityStatePermissionCompareType oexec
                    )
    {
        this.oexec = oexec;
    }


    public EntityStatePermissionCompareType getOexec()
    {
        return oexec;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getDevice() );
        ref_list.add( getFilepath() );
        ref_list.add( getUread() );
        ref_list.add( getUwrite() );
        ref_list.add( getUexec() );
        ref_list.add( getGread() );
        ref_list.add( getGwrite() );
        ref_list.add( getGexec() );
        ref_list.add( getOread() );
        ref_list.add( getOwrite() );
        ref_list.add( getOexec() );

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
        if (!(obj instanceof DiskUtilState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "diskutil_state[" + super.toString()
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
