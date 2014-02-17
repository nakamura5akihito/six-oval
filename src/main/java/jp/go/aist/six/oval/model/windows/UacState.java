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
package jp.go.aist.six.oval.model.windows;

import java.util.ArrayList;
import java.util.Collection;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.EntityStateBoolType;
import jp.go.aist.six.oval.model.definitions.EntityStateStringType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 * The uac state specifies the different settings that are available
 * under User Access Control.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: UacState.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class UacState
    extends StateType
{

    //{0..1}
    private EntityStateBoolType         admin_approval_mode;
    private EntityStateStringType       elevation_prompt_admin;
    private EntityStateStringType       elevation_prompt_standard;
    private EntityStateBoolType         detect_installations;
    private EntityStateBoolType         elevate_signed_executables;
    private EntityStateBoolType         elevate_uiaccess;
    private EntityStateBoolType         run_admins_aam;
    private EntityStateBoolType         secure_desktop;
    private EntityStateBoolType         virtualize_write_failures;



    /**
     * Constructor.
     */
    public UacState()
    {
        this( null, 0 );
    }


    public UacState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public UacState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.uac;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.UAC;
    }



    /**
     */
    public void setElevationPromptAdmin(
                    final EntityStateStringType elevation_prompt_admin
                    )
    {
        this.elevation_prompt_admin = elevation_prompt_admin;
    }


    public EntityStateStringType getElevationPromptAdmin()
    {
        return elevation_prompt_admin;
    }



    /**
     */
    public void setAdminApprovalMode(
                    final EntityStateBoolType admin_approval_mode
                    )
    {
        this.admin_approval_mode = admin_approval_mode;
    }


    public EntityStateBoolType getAdminApprovalMode()
    {
        return admin_approval_mode;
    }



    /**
     */
    public void setElevationPromptStandard(
                    final EntityStateStringType elevation_prompt_standard
                    )
    {
        this.elevation_prompt_standard = elevation_prompt_standard;
    }


    public EntityStateStringType getElevationPromptStandard()
    {
        return elevation_prompt_standard;
    }



    /**
     */
    public void setDetectInstallations(
                    final EntityStateBoolType detect_installations
                    )
    {
        this.detect_installations = detect_installations;
    }


    public EntityStateBoolType getDetectInstallations()
    {
        return detect_installations;
    }



    /**
     */
    public void setElevateSignedExecutables(
                    final EntityStateBoolType elevate_signed_executables
                    )
    {
        this.elevate_signed_executables = elevate_signed_executables;
    }


    public EntityStateBoolType getElevateSignedExecutables()
    {
        return elevate_signed_executables;
    }



    /**
     */
    public void setElevateUiaccess(
                    final EntityStateBoolType elevate_uiaccess
                    )
    {
        this.elevate_uiaccess = elevate_uiaccess;
    }


    public EntityStateBoolType getElevateUiaccess()
    {
        return elevate_uiaccess;
    }



    /**
     */
    public void setRunAdminsAam(
                    final EntityStateBoolType run_admins_aam
                    )
    {
        this.run_admins_aam = run_admins_aam;
    }


    public EntityStateBoolType getRunAdminsAam()
    {
        return run_admins_aam;
    }



    /**
     */
    public void setSecureDesktop(
                    final EntityStateBoolType secure_desktop
                    )
    {
        this.secure_desktop = secure_desktop;
    }


    public EntityStateBoolType getSecureDesktop()
    {
        return secure_desktop;
    }



    /**
     */
    public void setVirtualizeWriteFailures(
                    final EntityStateBoolType virtualize_write_failures
                    )
    {
        this.virtualize_write_failures = virtualize_write_failures;
    }


    public EntityStateBoolType getVirtualizeWriteFailures()
    {
        return virtualize_write_failures;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();

        ref_list.add( getAdminApprovalMode() );
        ref_list.add( getElevationPromptAdmin() );
        ref_list.add( getElevationPromptStandard() );
        ref_list.add( getDetectInstallations() );
        ref_list.add( getElevateSignedExecutables() );
        ref_list.add( getElevateUiaccess() );
        ref_list.add( getRunAdminsAam() );
        ref_list.add( getSecureDesktop() );
        ref_list.add( getVirtualizeWriteFailures() );

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
        if (!(obj instanceof UacState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "uac_state[" + super.toString()
             + ", admin_approval_mode="         + getAdminApprovalMode()
             + ", elevation_prompt_admin="      + getElevationPromptAdmin()
             + ", elevation_prompt_standard="   + getElevationPromptStandard()
             + ", detect_installations="        + getDetectInstallations()
             + ", elevate_signed_executables="  + getElevateSignedExecutables()
             + ", elevate_uiaccess="            + getElevateUiaccess()
             + ", run_admins_aam="              + getRunAdminsAam()
             + ", secure_desktop="              + getSecureDesktop()
             + ", virtualize_write_failures="   + getVirtualizeWriteFailures()
             + "]";
    }
}
//UacState
