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
package io.opensec.six.oval.model.windows;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.definitions.EntityObjectStringType;
import io.opensec.six.oval.model.definitions.Filter;
import io.opensec.six.oval.model.definitions.Set;
import io.opensec.six.oval.model.definitions.SystemObjectType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



/**
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class Wmi57Object
    extends SystemObjectType
{

    // XSD model:
    // choice(
    //         oval-def:set
    //         sequence(
    //                   namespace
    //                   wql
    //                   filter
    //         )
    // )

    private Set  set;
    //{1..1}

    private EntityObjectStringType  namespace;
    //{1..1}

    private EntityObjectStringType  wql;
    //{1..1}


    private final Collection<Filter>  filter = new ArrayList<Filter>();
    //{0..*}



    /**
     * Constructor.
     */
    public Wmi57Object()
    {
        this( null, 0 );
    }


    public Wmi57Object(
                    final String id,
                    final int version
                    )
    {
        this( id, version,
                        (EntityObjectStringType)null,
                        (EntityObjectStringType)null
                        );
    }


    public Wmi57Object(
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


    public Wmi57Object(
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
//        _oval_component_type = OvalComponentType.wmi57;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.WMI57;
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



    /**
     */
    public void setFilter(
                    final Collection<? extends Filter> filters
                    )
    {
        if (filters != filter) {
            filter.clear();
            if (filters != null  &&  filters.size() > 0) {
                filter.addAll( filters );
            }
        }
    }


    public Collection<Filter> getFilter()
    {
        return filter;
    }


    public Iterator<Filter> iterateFilter()
    {
        return filter.iterator();
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
        ref_list.addAll( getFilter() );

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
        if (!(obj instanceof Wmi57Object)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "wmi57_object[" + super.toString()
                        + ", set=" + getSet()
                        + ", namespace="    + getNamespace()
                        + ", wql="          + getWql()
                        + ", fileter="      + getFilter()
                        + "]";
    }

}
//Wmi57Object
