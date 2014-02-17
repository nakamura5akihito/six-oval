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
import jp.go.aist.six.oval.model.definitions.EntityObjectStringType;
import jp.go.aist.six.oval.model.definitions.Set;
import jp.go.aist.six.oval.model.definitions.SystemObjectType;



/**
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: WmiObject.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 * @deprecated Deprecated as of version 5.7:
 *             Replaced by the wmi57 object and
 *             will be removed in a future version of the language.
 */
@Deprecated
public class WmiObject
    extends SystemObjectType
{

    // XSD model:
    // choice(
    //         oval-def:set
    //         sequence(
    //                   namespace
    //                   wql
    //         )
    // )

    private Set  set;
    //{1..1}


    private EntityObjectStringType  namespace;
    //{1..1}

    private EntityObjectStringType  wql;
    //{1..1}


//    private final EntityPropertyMap<WmiProperty>  _properties =
//        WmiProperty.createPropertyMap();



    /**
     * Constructor.
     */
    public WmiObject()
    {
        this( null, 0 );
    }


    public WmiObject(
                    final String id,
                    final int version
                    )
    {
        this( id, version,
                        (EntityObjectStringType)null,
                        (EntityObjectStringType)null
                        );
    }


    public WmiObject(
                    final String id,
                    final int version,
                    final String namespace,
                    final String wql
                    )
    {
        this( id, version,
                        (namespace == null ? null : (new EntityObjectStringType( namespace ))),
                        (wql == null ? null : (new EntityObjectStringType( wql )))
        );
    }


    public WmiObject(
                    final String id,
                    final int version,
                    final EntityObjectStringType namespace,
                    final EntityObjectStringType wql
                    )
    {
        super( id, version );

        setNamespace( namespace );
        setWql( wql );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.wmi;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.WMI;
    }



    /**
     */
    public void setSet(
                    final Set set
                    )
    {
        this.set = set;
    }


    public Set getSet()
    {
        return set;
    }



    /**
     */
    public void setNamespace(
                    final EntityObjectStringType namespace
                    )
    {
        this.namespace = namespace;
//        _properties.setProperty( WmiProperty.NAMESPACE, namespace );
    }


    public EntityObjectStringType getNamespace()
    {
        return namespace;
//        return _properties.getProperty(
//                        WmiProperty.NAMESPACE, EntityObjectStringType.class );
    }



    /**
     */
    public void setWql(
                    final EntityObjectStringType wql
                    )
    {
        this.wql = wql;
//        _properties.setProperty( WmiProperty.WQL, wql );
    }


    public EntityObjectStringType getWql()
    {
        return wql;
//        return _properties.getProperty(
//                        WmiProperty.WQL, EntityObjectStringType.class );
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
        if (!(obj instanceof WmiObject)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "wmi_object[" + super.toString()
                        + ", set=" + getSet()
                        + ", " + getNamespace()
                        + ", " + getWql()
//                        + ", " + String.valueOf( _properties )
                        + "]";
    }

}
// WmiObject
