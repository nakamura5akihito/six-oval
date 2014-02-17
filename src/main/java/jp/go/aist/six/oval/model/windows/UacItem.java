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

import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.sc.EntityItemBoolType;
import jp.go.aist.six.oval.model.sc.EntityItemStringType;
import jp.go.aist.six.oval.model.sc.ItemType;
import jp.go.aist.six.oval.model.sc.StatusEnumeration;



/**
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: UacItem.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class UacItem
    extends ItemType
{

    //{0..1}
    private EntityItemBoolType         admin_approval_mode;
    private EntityItemStringType       elevation_prompt_admin;
    private EntityItemStringType       elevation_prompt_standard;
    private EntityItemBoolType         detect_installations;
    private EntityItemBoolType         elevate_signed_executables;
    private EntityItemBoolType         elevate_uiaccess;
    private EntityItemBoolType         run_admins_aam;
    private EntityItemBoolType         secure_desktop;
    private EntityItemBoolType         virtualize_write_failures;



    /**
     * Constructor.
     */
    public UacItem()
    {
        this( 0 );
    }


    public UacItem(
                    final int id
                    )
    {
        this( id, null );
    }


    public UacItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        super( id, status );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.uac;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.UAC;
    }



    /**
     */
    public void setElevationPromptAdmin(
                    final EntityItemStringType elevation_prompt_admin
                    )
    {
        this.elevation_prompt_admin = elevation_prompt_admin;
    }


    public EntityItemStringType getElevationPromptAdmin()
    {
        return elevation_prompt_admin;
    }



    /**
     */
    public void setAdminApprovalMode(
                    final EntityItemBoolType admin_approval_mode
                    )
    {
        this.admin_approval_mode = admin_approval_mode;
    }


    public EntityItemBoolType getAdminApprovalMode()
    {
        return admin_approval_mode;
    }



    /**
     */
    public void setElevationPromptStandard(
                    final EntityItemStringType elevation_prompt_standard
                    )
    {
        this.elevation_prompt_standard = elevation_prompt_standard;
    }


    public EntityItemStringType getElevationPromptStandard()
    {
        return elevation_prompt_standard;
    }



    /**
     */
    public void setDetectInstallations(
                    final EntityItemBoolType detect_installations
                    )
    {
        this.detect_installations = detect_installations;
    }


    public EntityItemBoolType getDetectInstallations()
    {
        return detect_installations;
    }



    /**
     */
    public void setElevateSignedExecutables(
                    final EntityItemBoolType elevate_signed_executables
                    )
    {
        this.elevate_signed_executables = elevate_signed_executables;
    }


    public EntityItemBoolType getElevateSignedExecutables()
    {
        return elevate_signed_executables;
    }



    /**
     */
    public void setElevateUiaccess(
                    final EntityItemBoolType elevate_uiaccess
                    )
    {
        this.elevate_uiaccess = elevate_uiaccess;
    }


    public EntityItemBoolType getElevateUiaccess()
    {
        return elevate_uiaccess;
    }



    /**
     */
    public void setRunAdminsAam(
                    final EntityItemBoolType run_admins_aam
                    )
    {
        this.run_admins_aam = run_admins_aam;
    }


    public EntityItemBoolType getRunAdminsAam()
    {
        return run_admins_aam;
    }



    /**
     */
    public void setSecureDesktop(
                    final EntityItemBoolType secure_desktop
                    )
    {
        this.secure_desktop = secure_desktop;
    }


    public EntityItemBoolType getSecureDesktop()
    {
        return secure_desktop;
    }



    /**
     */
    public void setVirtualizeWriteFailures(
                    final EntityItemBoolType virtualize_write_failures
                    )
    {
        this.virtualize_write_failures = virtualize_write_failures;
    }


    public EntityItemBoolType getVirtualizeWriteFailures()
    {
        return virtualize_write_failures;
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
        if (!(obj instanceof UacItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "uac_item[" + super.toString()
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
//UacItem
