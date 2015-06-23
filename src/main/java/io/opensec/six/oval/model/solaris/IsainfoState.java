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
import io.opensec.six.oval.model.definitions.EntityStateIntType;
import io.opensec.six.oval.model.definitions.EntityStateStringType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;



/**
 * The xinetd state defines the different information
 * associated with a specific Internet service.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class IsainfoState
    extends StateType
{

    //{0..1}
    private EntityStateIntType      bits;
    private EntityStateStringType   kernel_isa;
    private EntityStateStringType	application_isa;



    /**
     * Constructor.
     */
    public IsainfoState()
    {
        this( null, 0 );
    }


    public IsainfoState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public IsainfoState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.SOLARIS;
        _oval_component = ComponentType.ISAINFO;
    }



    /**
     */
    public void setBits(
                    final EntityStateIntType bits
                    )
    {
        this.bits = bits;
    }


    public EntityStateIntType getBits()
    {
        return bits;
    }



    /**
     */
    public void setKernelIsa(
                    final EntityStateStringType kernel_isa
                    )
    {
        this.kernel_isa = kernel_isa;
    }


    public EntityStateStringType getKernelIsa()
    {
        return kernel_isa;
    }



    /**
     */
    public void setApplicationIsa(
                    final EntityStateStringType application_isa
                    )
    {
        this.application_isa = application_isa;
    }


    public EntityStateStringType getApplicationIsa()
    {
        return application_isa;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getBits() );
        ref_list.add( getKernelIsa() );
        ref_list.add( getApplicationIsa() );

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
        if (!(obj instanceof IsainfoState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "isainfo_state[" + super.toString()
                        + ", bits="             + getBits()
                        + ", kernel_isa="       + getKernelIsa()
                        + ", application_isa="	+ getApplicationIsa()
             + "]";
    }

}
//
