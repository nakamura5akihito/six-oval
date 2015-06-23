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
package io.opensec.six.oval.model.solaris;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.definitions.EntityStateBoolType;
import io.opensec.six.oval.model.definitions.EntityStateStringType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;



/**
 * The package_state element defines the different verification information
 * associated with packages installed on the system.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class PackageCheckState
    extends StateType
{

    //{0..1}
    private EntityStateStringType               pkginst;
    private EntityStateStringType               filepath;
    private EntityStateBoolType                 checksum_differs;
    private EntityStateBoolType                 size_differs;
    private EntityStateBoolType                 mtime_differs;

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
    public PackageCheckState()
    {
        this( null, 0 );
    }


    public PackageCheckState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public PackageCheckState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.SOLARIS;
        _oval_component = ComponentType.PACKAGECHECK;
    }



    /**
     */
    public void setPkginst(
                    final EntityStateStringType pkginst
                    )
    {
        this.pkginst = pkginst;
    }


    public EntityStateStringType getPkginst()
    {
        return pkginst;
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
    public void setChecksumDiffers(
                    final EntityStateBoolType checksum_differs
                    )
    {
        this.checksum_differs = checksum_differs;
    }


    public EntityStateBoolType getChecksumDiffers()
    {
        return checksum_differs;
    }



    /**
     */
    public void setSizeDiffers(
                    final EntityStateBoolType size_differs
                    )
    {
        this.size_differs = size_differs;
    }


    public EntityStateBoolType getSizeDiffers()
    {
        return size_differs;
    }



    /**
     */
    public void setMtimeDiffers(
                    final EntityStateBoolType mtime_differs
                    )
    {
        this.mtime_differs = mtime_differs;
    }


    public EntityStateBoolType getMtimeDiffers()
    {
        return mtime_differs;
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
        ref_list.add( getPkginst() );
        ref_list.add( getFilepath() );
        ref_list.add( getChecksumDiffers() );
        ref_list.add( getSizeDiffers() );
        ref_list.add( getMtimeDiffers() );
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
        if (!(obj instanceof PackageCheckState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "packagecheck_state[" + super.toString()
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
