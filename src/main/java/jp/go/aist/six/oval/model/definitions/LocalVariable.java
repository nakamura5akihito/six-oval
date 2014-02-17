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
package jp.go.aist.six.oval.model.definitions;

import java.util.ArrayList;
import java.util.Collection;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.common.DatatypeEnumeration;



/**
 * The LocalVariable extends the Variable and defines a variable
 * with some local source.
 *
 * @author	Akihito Nakamura, AIST
 * @version $Id: LocalVariable.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class LocalVariable
    extends VariableType
{

    private ComponentGroup  component;
    //{1..1}


    private String  _componentXml;



    /**
     * Constructor.
     */
    public LocalVariable()
    {
        this( null, 0 );
    }


    public LocalVariable(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public LocalVariable(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        this( id, version, comment, null );
    }


    public LocalVariable(
                    final String id,
                    final int version,
                    final String comment,
                    final DatatypeEnumeration datatype
                    )
    {
        super( id, version, comment, datatype );

//        _oval_component_type = OvalComponentType.local;
    }



    /**
     */
    public void setComponent(
                    final ComponentGroup component
                    )
    {
        this.component = component;
    }


    public ComponentGroup getComponent()
    {
        return component;
    }


    public LocalVariable component(
                    final ComponentGroup component
                    )
    {
        setComponent( component );
        return this;
    }



    /**
     */
    public void xmlSetComponent(
                    final String xml
                    )
    {
        _componentXml = xml;
    }


    public String xmlGetComponent()
    {
        return _componentXml;
    }



    //*********************************************************************
    //  VariableType
    //*********************************************************************

    @Override
    public VariableType.Type ovalGetVariableType()
    {
        return VariableType.Type.LOCAL;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = super.ovalGetElementRef();
        ComponentGroup  component = getComponent();
        if (component == null) {
            return ref_list;
        }

        ref_list = new ArrayList<ElementRef>( ref_list );
        _collectElementRef( ref_list, component );

        return ref_list;
    }



    private void _collectElementRef(
                    final Collection<ElementRef> ref_list,
                    final ComponentGroup component
                    )
    {
        if (ElementRef.class.isInstance( component )) {
            ref_list.add( ElementRef.class.cast( component ) );
        }

        Collection<ComponentGroup>  subcomponent_list = component.ovalGetSubComponent();
        if (subcomponent_list != null  &&  subcomponent_list.size() > 0) {
            for (ComponentGroup  subcomponent : subcomponent_list) {
                _collectElementRef( ref_list, subcomponent );
            }
        }
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
        if (!(obj instanceof LocalVariable)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "local_variable[" + super.toString()
             + ", " + getComponent()
             + "]";
    }

}
// LocalVariable
