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

import java.util.ArrayList;
import java.util.Collection;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.EntityStateAnySimpleType;
import jp.go.aist.six.oval.model.definitions.EntityStateStringType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: WmiState.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 * @deprecated Deprecated as of version 5.7:
 *             Replaced by the wmi57 state and
 *             will be removed in a future version of the language.
 */
@Deprecated
public class WmiState
    extends StateType
{

    private EntityStateStringType  namespace;
    //{0..1}

    private EntityStateStringType  wql;
    //{0..1}

    private EntityStateAnySimpleType  result;
    //{0..1}


//    private final EntityPropertyMap<WmiProperty>  _properties =
//        WmiProperty.createPropertyMap();




    /**
     * Constructor.
     */
    public WmiState()
    {
        this( null, 0 );
    }


    public WmiState(
                    final String id,
                    final int version
                    )
    {
        super( id, version );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.wmi;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.WMI;
    }



    /**
     */
    public void setNamespace(
                    final EntityStateStringType namespace
                    )
    {
        this.namespace = namespace;
//        _properties.setProperty( WmiProperty.NAMESPACE, namespace );
    }


    public EntityStateStringType getNamespace()
    {
        return namespace;
//        return _properties.getProperty(
//                        WmiProperty.NAMESPACE, EntityStateStringType.class );
    }



    /**
     */
    public void setWql(
                    final EntityStateStringType wql
                    )
    {
        this.wql = wql;
//        _properties.setProperty( WmiProperty.WQL, wql );
    }


    public EntityStateStringType getWql()
    {
        return wql;
//        return _properties.getProperty(
//                        WmiProperty.WQL, EntityStateStringType.class );
    }



    /**
     */
    public void setResult(
                    final EntityStateAnySimpleType result
                    )
    {
        this.result = result;
//        _properties.setProperty( WmiProperty.RESULT, result );
    }


    public EntityStateAnySimpleType getResult()
    {
        return result;
//        return _properties.getProperty(
//                        WmiProperty.RESULT, EntityStateAnySimpleType.class );
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();

        ref_list.add( getNamespace() );
        ref_list.add( getWql() );
        ref_list.add( getResult() );

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
        if (!(obj instanceof WmiState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "wmi_state[" + super.toString()
                        + ", " + getNamespace()
                        + ", " + getWql()
                        + ", " + getResult()
//                        + ", " + String.valueOf( _properties )
                        + "]";
    }

}
//WmiState
