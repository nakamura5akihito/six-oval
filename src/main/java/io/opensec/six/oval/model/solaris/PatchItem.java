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
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.sc.EntityItemIntType;
import io.opensec.six.oval.model.sc.ItemType;
import io.opensec.six.oval.model.sc.StatusEnumeration;



/**
 * Patches are identified by unique alphanumeric strings, with the patch base code first,
 * a hyphen, and a number that represents the patch revision number.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class PatchItem
    extends ItemType
{

    //{0..1}
    private EntityItemIntType   base;
    private EntityItemIntType   version;



    /**
     * Constructor.
     */
    public PatchItem()
    {
        this( 0 );
    }


    public PatchItem(
                    final int id
                    )
    {
        this( id, null );
    }


    public PatchItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        super( id, status );

        _oval_family = Family.SOLARIS;
        _oval_component = ComponentType.PATCH;
    }



    /**
     */
    public void setBase(
                    final EntityItemIntType base
                    )
    {
        this.base = base;
    }


    public EntityItemIntType getBase()
    {
        return base;
    }



    /**
     */
    public void setVersion(
                    final EntityItemIntType version
                    )
    {
        this.version = version;
    }


    public EntityItemIntType getVersion()
    {
        return version;
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
        if (!(obj instanceof PatchItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "patch_item[" + super.toString()
                		+ ", base="     + getBase()
                        + ", version="  + getVersion()
             + "]";
    }

}
//
