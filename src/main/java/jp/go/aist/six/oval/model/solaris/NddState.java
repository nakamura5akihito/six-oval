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
package jp.go.aist.six.oval.model.solaris;

import java.util.ArrayList;
import java.util.Collection;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.EntityStateAnySimpleType;
import jp.go.aist.six.oval.model.definitions.EntityStateIntType;
import jp.go.aist.six.oval.model.definitions.EntityStateStringType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: NddState.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
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
