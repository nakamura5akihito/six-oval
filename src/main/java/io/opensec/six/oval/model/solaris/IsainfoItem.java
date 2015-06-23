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
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.ItemType;
import io.opensec.six.oval.model.sc.StatusEnumeration;



/**
 * Information about the instruction set architectures.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class IsainfoItem
    extends ItemType
{

    //{0..1}
    private EntityItemIntType              bits;
    private EntityItemStringType           kernel_isa;
    private EntityItemStringType           application_isa;



    /**
     * Constructor.
     */
    public IsainfoItem()
    {
        this( 0 );
    }


    public IsainfoItem(
                    final int id
                    )
    {
        this( id, null );
    }


    public IsainfoItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        super( id, status );

        _oval_family = Family.SOLARIS;
        _oval_component = ComponentType.ISAINFO;
    }



    /**
     */
    public void setBits(
                    final EntityItemIntType bits
                    )
    {
        this.bits = bits;
    }


    public EntityItemIntType getBits()
    {
        return bits;
    }



    /**
     */
    public void setKernelIsa(
                    final EntityItemStringType kernel_isa
                    )
    {
        this.kernel_isa = kernel_isa;
    }


    public EntityItemStringType getKernelIsa()
    {
        return kernel_isa;
    }



    /**
     */
    public void setApplicationIsa(
                    final EntityItemStringType application_isa
                    )
    {
        this.application_isa = application_isa;
    }


    public EntityItemStringType getApplicationIsa()
    {
        return application_isa;
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
        if (!(obj instanceof IsainfoItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "isainfo_item[" + super.toString()
                        + ", bits="             + getBits()
                        + ", kernel_isa="       + getKernelIsa()
                        + ", application_isa="	+ getApplicationIsa()
             + "]";
    }

}
//
