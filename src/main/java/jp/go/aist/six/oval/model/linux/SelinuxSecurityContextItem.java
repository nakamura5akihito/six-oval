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

import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.sc.EntityItemIntType;
import jp.go.aist.six.oval.model.sc.EntityItemStringType;
import jp.go.aist.six.oval.model.sc.ItemType;



/**
 * This item describes the SELinux security context of a file or process on the local system.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: SelinuxSecurityContextItem.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class SelinuxSecurityContextItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType   filepath;
    private EntityItemStringType   path;

    private EntityItemStringType   filename;
    //{nillable="true"}

    private EntityItemIntType      pid;
    private EntityItemStringType   user;
    private EntityItemStringType   role;
    private EntityItemStringType   type;
    private EntityItemStringType   low_sensitivity;
    private EntityItemStringType   low_category;
    private EntityItemStringType   high_sensitivity;
    private EntityItemStringType   high_category;
    private EntityItemStringType   rawlow_sensitivity;
    private EntityItemStringType   rawlow_category;
    private EntityItemStringType   rawhigh_sensitivity;
    private EntityItemStringType   rawhigh_category;



    /**
     * Constructor.
     */
    public SelinuxSecurityContextItem()
    {
        this( 0 );
    }


    public SelinuxSecurityContextItem(
                    final int id
                    )
    {
        super( id );

//        _oval_platform_type = OvalPlatformType.linux;
//        _oval_component_type = OvalComponentType.selinuxsecuritycontext;
        _oval_family = Family.LINUX;
        _oval_component = ComponentType.SELINUXSECURITYCONTEXT;
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
    public void setPath(
                    final EntityItemStringType path
                    )
    {
        this.path = path;
    }


    public EntityItemStringType getPath()
    {
        return path;
    }



    /**
     */
    public void setFilename(
                    final EntityItemStringType filename
                    )
    {
        this.filename = filename;
    }


    public EntityItemStringType getFilename()
    {
        return filename;
    }



    /**
     */
    public void setPid(
                    final EntityItemIntType pid
                    )
    {
        this.pid = pid;
    }


    public EntityItemIntType getPid()
    {
        return pid;
    }



    /**
     */
    public void setUser(
                    final EntityItemStringType user
                    )
    {
        this.user = user;
    }


    public EntityItemStringType getUser()
    {
        return user;
    }



    /**
     */
    public void setRole(
                    final EntityItemStringType role
                    )
    {
        this.role= role;
    }


    public EntityItemStringType getRole()
    {
        return role;
    }



    /**
     */
    public void setType(
                    final EntityItemStringType type
                    )
    {
        this.type = type;
    }


    public EntityItemStringType getType()
    {
        return type;
    }



    /**
     */
    public void setLowSensitivity(
                    final EntityItemStringType low_sensitivity
                    )
    {
        this.low_sensitivity = low_sensitivity;
    }


    public EntityItemStringType getLowSensitivity()
    {
        return low_sensitivity;
    }



    /**
     */
    public void setLowCategory(
                    final EntityItemStringType low_category
                    )
    {
        this.low_category = low_category;
    }


    public EntityItemStringType getLowCategory()
    {
        return low_category;
    }



    /**
     */
    public void setHighSensitivity(
                    final EntityItemStringType high_sensitivity
                    )
    {
        this.high_sensitivity = high_sensitivity;
    }


    public EntityItemStringType getHighSensitivity()
    {
        return high_sensitivity;
    }



    /**
     */
    public void setHighCategory(
                    final EntityItemStringType high_category
                    )
    {
        this.high_category = high_category;
    }


    public EntityItemStringType getHighCategory()
    {
        return high_category;
    }



    /**
     */
    public void setRawLowSensitivity(
                    final EntityItemStringType rawlow_sensitivity
                    )
    {
        this.rawlow_sensitivity = rawlow_sensitivity;
    }


    public EntityItemStringType getRawLowSensitivity()
    {
        return rawlow_sensitivity;
    }



    /**
     */
    public void setRawLowCategory(
                    final EntityItemStringType rawlow_category
                    )
    {
        this.rawlow_category = rawlow_category;
    }


    public EntityItemStringType getRawLowCategory()
    {
        return rawlow_category;
    }



    /**
     */
    public void setRawHighSensitivity(
                    final EntityItemStringType rawhigh_sensitivity
                    )
    {
        this.rawhigh_sensitivity = rawhigh_sensitivity;
    }


    public EntityItemStringType getRawHighSensitivity()
    {
        return rawhigh_sensitivity;
    }



    /**
     */
    public void setRawHighCategory(
                    final EntityItemStringType rawhigh_category
                    )
    {
        this.rawhigh_category = rawhigh_category;
    }


    public EntityItemStringType getRawHighCategory()
    {
        return rawhigh_category;
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
        if (!(obj instanceof SelinuxSecurityContextItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "selinuxsecuritycontext_item[" + super.toString()
                        + ", filepath="             + getFilepath()
                        + ", path="                 + getPath()
                        + ", filename="             + getFilename()
                        + ", pid="                  + getPid()
                        + ", user="                 + getUser()
                        + ", role="                 + getRole()
                        + ", type="                 + getType()
                        + ", low_sensitivity="      + getLowSensitivity()
                        + ", low_category="         + getLowCategory()
                        + ", high_sensitivity="     + getHighSensitivity()
                        + ", high_category="        + getHighCategory()
                        + ", rawlow_sensitivity="   + getRawLowSensitivity()
                        + ", rawlow_category="      + getRawLowCategory()
                        + ", rawhigh_sensitivity="  + getRawHighSensitivity()
                        + ", rawhigh_category="     + getRawHighCategory()
                        + "]";
    }

}
//SelinuxSecurityContextItem
