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
import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.definitions.EntityStateAnySimpleType;
import io.opensec.six.oval.model.definitions.EntityStateBoolType;
import io.opensec.six.oval.model.definitions.EntityStateStringType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;



/**
 * The rpmverifypackage_state defines the different information that can be used to verify
 * the integrity of installed RPMs.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class RpmVerifyPackageState
    extends StateType
{

    //{0..1}
    private EntityStateStringType           name;
    private EntityStateAnySimpleType        epoch;
    private EntityStateAnySimpleType        version;
    private EntityStateAnySimpleType        release;
    private EntityStateStringType           arch;

    private EntityStateBoolType             dependency_check_passed;
    private EntityStateBoolType             digest_check_passed;
    private EntityStateBoolType             verification_script_successful;
    private EntityStateBoolType             signature_check_passed;



    /**
     * Constructor.
     */
    public RpmVerifyPackageState()
    {
        this( null, 0 );
    }


    public RpmVerifyPackageState(
                    final String id,
                    final int version
                    )
    {
        super( id, version );

        _oval_family = Family.LINUX;
        _oval_component = ComponentType.RPMVERIFYPACKAGE;
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
    public void setDependencyCheckPassed(
                    final EntityStateBoolType dependency_check_passed
                    )
    {
        this.dependency_check_passed = dependency_check_passed;
    }


    public EntityStateBoolType getDependencyCheckPassed()
    {
        return dependency_check_passed;
    }



    /**
     */
    public void setDigestCheckPassed(
                    final EntityStateBoolType digest_check_passed
                    )
    {
        this.digest_check_passed = digest_check_passed;
    }


    public EntityStateBoolType getDigestCheckPassed()
    {
        return digest_check_passed;
    }



    /**
     */
    public void setVerificationScriptSuccessful(
                    final EntityStateBoolType verification_script_successful
                    )
    {
        this.verification_script_successful = verification_script_successful;
    }


    public EntityStateBoolType getVerificationScriptSuccessful()
    {
        return verification_script_successful;
    }



    /**
     */
    public void setSignatureCheckPassed(
                    final EntityStateBoolType signature_check_passed
                    )
    {
        this.signature_check_passed = signature_check_passed;
    }


    public EntityStateBoolType getSignatureCheckPassed()
    {
        return signature_check_passed;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getName() );
        ref_list.add( getEpoch() );
        ref_list.add( getVersion() );
        ref_list.add( getRelease() );
        ref_list.add( getArch() );

        ref_list.add( getDependencyCheckPassed() );
        ref_list.add( getDigestCheckPassed() );
        ref_list.add( getVerificationScriptSuccessful() );
        ref_list.add( getSignatureCheckPassed() );

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
        if (!(obj instanceof RpmVerifyPackageState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "rpmverifypackage_state[" + super.toString()
                        + ", name="                 + getName()
                        + ", epoch="                + getEpoch()
                        + ", version="              + getVersion()
                        + ", release="              + getRelease()
                        + ", arch="                 + getArch()
                        + ", configuration_file="   + getDependencyCheckPassed()
                        + ", documentation_file="   + getDigestCheckPassed()
                        + ", ghost_file="           + getVerificationScriptSuccessful()
                        + ", license_file="         + getSignatureCheckPassed()
                        + "]";
    }

}
//
