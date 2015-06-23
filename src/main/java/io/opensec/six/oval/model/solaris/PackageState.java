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
import io.opensec.six.oval.model.definitions.EntityStateStringType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;



/**
 * The package_state element defines the different information associated with packages
 * installed on the system.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class PackageState
    extends StateType
{

    //{0..1}
    private EntityStateStringType   pkginst;
    private EntityStateStringType   name;
    private EntityStateStringType   category;
    private EntityStateStringType   version;
    private EntityStateStringType   vendor;
    private EntityStateStringType   description;



    /**
     * Constructor.
     */
    public PackageState()
    {
        this( null, 0 );
    }


    public PackageState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public PackageState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.SOLARIS;
        _oval_component = ComponentType.PACKAGE;
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
    public void setCategory(
                    final EntityStateStringType category
                    )
    {
        this.category = category;
    }


    public EntityStateStringType getCategory()
    {
        return category;
    }



    /**
     */
    public void setVersion(
                    final EntityStateStringType version
                    )
    {
        this.version = version;
    }


    public EntityStateStringType getVersion()
    {
        return version;
    }



    /**
     */
    public void setVendor(
                    final EntityStateStringType vendor
                    )
    {
        this.vendor = vendor;
    }


    public EntityStateStringType getVendor()
    {
        return vendor;
    }



    /**
     */
    public void setDescription(
                    final EntityStateStringType description
                    )
    {
        this.description = description;
    }


    public EntityStateStringType getDescription()
    {
        return description;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getPkginst() );
        ref_list.add( getName() );
        ref_list.add( getCategory() );
        ref_list.add( getVersion() );
        ref_list.add( getVendor() );
        ref_list.add( getDescription() );

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
        if (!(obj instanceof PackageState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "package_state[" + super.toString()
                        + ", pkginst="      + getPkginst()
                        + ", name="         + getName()
                        + ", category="     + getCategory()
                        + ", version="      + getVersion()
                        + ", vendor="       + getVendor()
                        + ", description="  + getDescription()
             + "]";
    }

}
//
