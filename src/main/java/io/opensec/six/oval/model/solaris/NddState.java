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
import io.opensec.six.oval.model.definitions.EntityStateAnySimpleType;
import io.opensec.six.oval.model.definitions.EntityStateIntType;
import io.opensec.six.oval.model.definitions.EntityStateStringType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;



/**
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class NddState
    extends StateType
{

    //{0..1}
    private EntityStateStringType           device;
    private EntityStateIntType              instance;
    private EntityStateStringType           parameter;
    private EntityStateAnySimpleType        value;



    /**
     * Constructor.
     */
    public NddState()
    {
        this( null, 0 );
    }


    public NddState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public NddState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.SOLARIS;
        _oval_component = ComponentType.NDD;
    }



    /**
     */
    public void setDevice(
                    final EntityStateStringType device
                    )
    {
        this.device = device;
    }


    public EntityStateStringType getDevice()
    {
        return device;
    }



    /**
     */
    public void setInstance(
                    final EntityStateIntType instance
                    )
    {
        this.instance = instance;
    }


    public EntityStateIntType getInstance()
    {
        return instance;
    }



    /**
     */
    public void setParameter(
                    final EntityStateStringType parameter
                    )
    {
        this.parameter = parameter;
    }


    public EntityStateStringType getParameter()
    {
        return parameter;
    }



    /**
     */
    public void setValue(
                    final EntityStateAnySimpleType value
                    )
    {
        this.value = value;
    }


    public EntityStateAnySimpleType getValue()
    {
        return value;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getDevice() );
        ref_list.add( getInstance() );
        ref_list.add( getParameter() );
        ref_list.add( getValue() );

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
        if (!(obj instanceof NddState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "ndd_state[" + super.toString()
                        + ", protocol="         + getDevice()
                        + ", port="             + getInstance()
                        + ", server="           + getParameter()
                        + ", user="             + getValue()
             + "]";
    }

}
//
