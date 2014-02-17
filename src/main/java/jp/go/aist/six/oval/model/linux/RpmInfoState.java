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

import java.util.ArrayList;
import java.util.Collection;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.EntityStateAnySimpleType;
import jp.go.aist.six.oval.model.definitions.EntityStateEVRStringType;
import jp.go.aist.six.oval.model.definitions.EntityStateStringType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 * The rpminfo state defines the different information
 * that can be used to evaluate the specified rpm.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: RpmInfoState.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class RpmInfoState
    extends StateType
{

    //{0..1}
    private EntityStateStringType       name;
    private EntityStateStringType       arch;
    private EntityStateAnySimpleType    epoch;
    private EntityStateAnySimpleType    release;
    private EntityStateAnySimpleType    version;
    private EntityStateEVRStringType    evr;
    private EntityStateStringType       signature_keyid;
    private EntityStateStringType       extended_name;
    private EntityStateStringType       filepath;



    /**
     * Constructor.
     */
    public RpmInfoState()
    {
        this( null, 0 );
    }


    public RpmInfoState(
                    final String id,
                    final int version
                    )
    {
        super( id, version );

//        _oval_platform_type = OvalPlatformType.linux;
//        _oval_component_type = OvalComponentType.rpminfo;
        _oval_family = Family.LINUX;
        _oval_component = ComponentType.RPMINFO;
    }



    /**
     */
    public void setName(
                    final EntityStateStringType name
                    )
    {
        this.name = name;
    }


    public EntityStateStringType getName()
    {
        return name;
    }



    /**
     */
    public void setArch(
                    final EntityStateStringType arch
                    )
    {
        this.arch = arch;
    }


    public EntityStateStringType getArch()
    {
        return arch;
    }



    /**
     */
    public void setEpoch(
                    final EntityStateAnySimpleType epoch
                    )
    {
        this.epoch = epoch;
    }


    public EntityStateAnySimpleType getEpoch()
    {
        return epoch;
    }



    /**
     */
    public void setRelease(
                    final EntityStateAnySimpleType release
                    )
    {
        this.release = release;
    }


    public EntityStateAnySimpleType getRelease()
    {
        return release;
    }



    /**
     */
    public void setVersion(
                    final EntityStateAnySimpleType version
                    )
    {
        this.version = version;
    }


    public EntityStateAnySimpleType getVersion()
    {
        return version;
    }



    /**
     */
    public void setEvr(
                    final EntityStateEVRStringType evr
                    )
    {
        this.evr = evr;
    }


    public EntityStateEVRStringType getEvr()
    {
        return evr;
    }


    public RpmInfoState evr(
                    final EntityStateEVRStringType evr
                    )
    {
        setEvr( evr );
        return this;
    }



    /**
     */
    public void setSignatureKeyid(
                    final EntityStateStringType keyid
                    )
    {
        signature_keyid = keyid;
    }


    public EntityStateStringType getSignatureKeyid()
    {
        return signature_keyid;
    }


    public RpmInfoState signatureKeyid(
                    final EntityStateStringType keyid
                    )
    {
        setSignatureKeyid( keyid );
        return this;
    }



    /**
     */
    public void setExtendedName(
                    final EntityStateStringType extended_name
                    )
    {
        this.extended_name = extended_name;
    }


    public EntityStateStringType getExtendedName()
    {
        return extended_name;
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



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getName() );
        ref_list.add( getArch() );
        ref_list.add( getEpoch() );
        ref_list.add( getRelease() );
        ref_list.add( getVersion() );
        ref_list.add( getEvr() );
        ref_list.add( getSignatureKeyid() );
        ref_list.add( getExtendedName() );
        ref_list.add( getFilepath() );

        return ref_list;
    }



    // **************************************************************
    // java.lang.Object
    // **************************************************************

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
        if (!(obj instanceof RpmInfoState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "rpminfo_state[" + super.toString()
                        + ", name="     + getName()
                        + ", arch="     + getArch()
                        + ", epoch="    + getEpoch()
                        + ", release="  + getRelease()
                        + ", version="  + getVersion()
                        + ", evr="      + getEvr()
                        + ", signature_keyid="  + getSignatureKeyid()
                        + ", extended_name="    + getExtendedName()
                        + ", filepath=" + getFilepath()
                        + "]";
    }

}
//RpmInfoState
