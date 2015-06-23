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
import io.opensec.six.oval.model.definitions.EntityStateIntType;
import io.opensec.six.oval.model.definitions.EntityStateStringType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;



/**
 * The selinuxsecuritycontext state defines the different information
 * that can be used to evaluate the specified SELinux security context.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class SelinuxSecurityContextState
    extends StateType
{

    //{0..1}
    private EntityStateStringType   filepath;
    private EntityStateStringType   path;
    private EntityStateStringType   filename;
    private EntityStateIntType      pid;
    private EntityStateStringType   user;
    private EntityStateStringType   role;
    private EntityStateStringType   type;
    private EntityStateStringType   low_sensitivity;
    private EntityStateStringType   low_category;
    private EntityStateStringType   high_sensitivity;
    private EntityStateStringType   high_category;
    private EntityStateStringType   rawlow_sensitivity;
    private EntityStateStringType   rawlow_category;
    private EntityStateStringType   rawhigh_sensitivity;
    private EntityStateStringType   rawhigh_category;



    /**
     * Constructor.
     */
    public SelinuxSecurityContextState()
    {
        this( null, 0 );
    }


    public SelinuxSecurityContextState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public SelinuxSecurityContextState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.linux;
//        _oval_component_type = OvalComponentType.selinuxsecuritycontext;
        _oval_family = Family.LINUX;
        _oval_component = ComponentType.SELINUXSECURITYCONTEXT;
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
    public void setPath(
                    final EntityStateStringType path
                    )
    {
        this.path = path;
    }


    public EntityStateStringType getPath()
    {
        return path;
    }



    /**
     */
    public void setFilename(
                    final EntityStateStringType filename
                    )
    {
        this.filename = filename;
    }


    public EntityStateStringType getFilename()
    {
        return filename;
    }



    /**
     */
    public void setPid(
                    final EntityStateIntType pid
                    )
    {
        this.pid = pid;
    }


    public EntityStateIntType getPid()
    {
        return pid;
    }



    /**
     */
    public void setUser(
                    final EntityStateStringType user
                    )
    {
        this.user = user;
    }


    public EntityStateStringType getUser()
    {
        return user;
    }



    /**
     */
    public void setRole(
                    final EntityStateStringType role
                    )
    {
        this.role= role;
    }


    public EntityStateStringType getRole()
    {
        return role;
    }



    /**
     */
    public void setType(
                    final EntityStateStringType type
                    )
    {
        this.type = type;
    }


    public EntityStateStringType getType()
    {
        return type;
    }



    /**
     */
    public void setLowSensitivity(
                    final EntityStateStringType low_sensitivity
                    )
    {
        this.low_sensitivity = low_sensitivity;
    }


    public EntityStateStringType getLowSensitivity()
    {
        return low_sensitivity;
    }



    /**
     */
    public void setLowCategory(
                    final EntityStateStringType low_category
                    )
    {
        this.low_category = low_category;
    }


    public EntityStateStringType getLowCategory()
    {
        return low_category;
    }



    /**
     */
    public void setHighSensitivity(
                    final EntityStateStringType high_sensitivity
                    )
    {
        this.high_sensitivity = high_sensitivity;
    }


    public EntityStateStringType getHighSensitivity()
    {
        return high_sensitivity;
    }



    /**
     */
    public void setHighCategory(
                    final EntityStateStringType high_category
                    )
    {
        this.high_category = high_category;
    }


    public EntityStateStringType getHighCategory()
    {
        return high_category;
    }



    /**
     */
    public void setRawLowSensitivity(
                    final EntityStateStringType rawlow_sensitivity
                    )
    {
        this.rawlow_sensitivity = rawlow_sensitivity;
    }


    public EntityStateStringType getRawLowSensitivity()
    {
        return rawlow_sensitivity;
    }



    /**
     */
    public void setRawLowCategory(
                    final EntityStateStringType rawlow_category
                    )
    {
        this.rawlow_category = rawlow_category;
    }


    public EntityStateStringType getRawLowCategory()
    {
        return rawlow_category;
    }



    /**
     */
    public void setRawHighSensitivity(
                    final EntityStateStringType rawhigh_sensitivity
                    )
    {
        this.rawhigh_sensitivity = rawhigh_sensitivity;
    }


    public EntityStateStringType getRawHighSensitivity()
    {
        return rawhigh_sensitivity;
    }



    /**
     */
    public void setRawHighCategory(
                    final EntityStateStringType rawhigh_category
                    )
    {
        this.rawhigh_category = rawhigh_category;
    }


    public EntityStateStringType getRawHighCategory()
    {
        return rawhigh_category;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getFilepath() );
        ref_list.add( getPath() );
        ref_list.add( getFilename() );
        ref_list.add( getPid() );
        ref_list.add( getUser() );
        ref_list.add( getRole() );
        ref_list.add( getType() );
        ref_list.add( getLowSensitivity() );
        ref_list.add( getLowCategory() );
        ref_list.add( getHighSensitivity() );
        ref_list.add( getHighCategory() );
        ref_list.add( getRawLowSensitivity() );
        ref_list.add( getRawLowCategory() );
        ref_list.add( getRawHighSensitivity() );
        ref_list.add( getRawHighCategory() );

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
        if (!(obj instanceof SelinuxSecurityContextState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "selinuxsecuritycontext_state[" + super.toString()
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
//SelinuxSecurityContextState
