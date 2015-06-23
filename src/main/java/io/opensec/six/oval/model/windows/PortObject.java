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
import io.opensec.six.oval.model.definitions.EntityObjectIPAddressStringType;
import io.opensec.six.oval.model.definitions.EntityObjectIntType;
import io.opensec.six.oval.model.definitions.Filter;
import io.opensec.six.oval.model.definitions.Set;
import io.opensec.six.oval.model.definitions.SystemObjectType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



/**
 * The port object is used by a port test to define
 * the specific port(s) to be evaluated.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class PortObject
    extends SystemObjectType
{

    //TODO: XSD model:
    //xsd:choice(
    //            set
    //            xsd:sequence(
    //                         local_address
    //                         local_port
    //                         protocol
    //                         filter
    //            )
    //)

    private Set  set;
    //{1..1}

    private EntityObjectIPAddressStringType  local_address;
    //{1..1}

    private EntityObjectIntType  local_port;
    //{1..1}

    private EntityObjectProtocolType  protocol;
    //{1..1}

    private final Collection<Filter>  filter = new ArrayList<Filter>();
    //{0..*}



    /**
     * Constructor.
     */
    public PortObject()
    {
        this( null, 0 );
    }


    public PortObject(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public PortObject(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.port;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.PORT;
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
    public void setLocalAddress(
                    final EntityObjectIPAddressStringType local_address
                    )
    {
        this.local_address = local_address;
    }


    public EntityObjectIPAddressStringType getLocalAddress()
    {
        return local_address;
    }



    /**
     */
    public void setLocalPort(
                    final EntityObjectIntType local_port
                    )
    {
        this.local_port = local_port;
    }


    public EntityObjectIntType getLocalPort()
    {
        return local_port;
    }



    /**
     */
    public void setProtocol(
                    final EntityObjectProtocolType protocol
                    )
    {
        this.protocol = protocol;
    }


    public EntityObjectProtocolType getProtocol()
    {
        return protocol;
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

        ref_list.add( getLocalAddress() );
        ref_list.add( getLocalPort() );
        ref_list.add( getProtocol() );
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
        if (!(obj instanceof PortObject)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "port_object[" + super.toString()
                        + ", set="              + getSet()
                        + ", local_address="    + getLocalAddress()
                        + ", local_port="       + getLocalPort()
                        + ", protocol="         + getProtocol()
                        + ", filter="           + getFilter()
                        + "]";
    }

}
//PortObject
