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
package jp.go.aist.six.oval.model.linux;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.EntityObjectIPAddressStringType;
import jp.go.aist.six.oval.model.definitions.EntityObjectIntType;
import jp.go.aist.six.oval.model.definitions.EntityObjectStringType;
import jp.go.aist.six.oval.model.definitions.Filter;
import jp.go.aist.six.oval.model.definitions.Set;
import jp.go.aist.six.oval.model.definitions.SystemObjectType;



/**
 * The inetlisteningservers object is used by an inet listening servers test
 * to define the specific protocol-address-port to be evaluated.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: InetListeningServersObject.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class InetListeningServersObject
    extends SystemObjectType
{

    //TODO: XSD model:
    //xsd:choice(
    //            set
    //            xsd:sequence(
    //                         protocol
    //                         local_address
    //                         local_port
    //                         filter
    //            )
    //)

    private Set  set;
    //{1..1}

    private EntityObjectStringType  protocol;
    //{1..1}

    private EntityObjectIPAddressStringType  local_address;
    //{1..1}

    private EntityObjectIntType  local_port;
    //{1..1}

    private final Collection<Filter>  filter = new ArrayList<Filter>();
    //{0..*}



    /**
     * Constructor.
     */
    public InetListeningServersObject()
    {
        this( null, 0 );
    }


    public InetListeningServersObject(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public InetListeningServersObject(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.linux;
//        _oval_component_type = OvalComponentType.inetlisteningservers;
        _oval_family = Family.LINUX;
        _oval_component = ComponentType.INETLISTENINGSERVERS;
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
    public void setProtocol(
                    final EntityObjectStringType protocol
                    )
    {
        this.protocol = protocol;
    }


    public EntityObjectStringType getProtocol()
    {
        return protocol;
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
        ref_list.add( getProtocol() );
        ref_list.add( getLocalAddress() );
        ref_list.add( getLocalPort() );
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
        if (!(obj instanceof InetListeningServersObject)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "inetlisteningservers_object[" + super.toString()
                        + ", set="              + getSet()
                        + ", protocol="         + getProtocol()
                        + ", local_address="    + getLocalAddress()
                        + ", local_port="       + getLocalPort()
                        + ", filter="           + getFilter()
                        + "]";
    }

}
//InetListeningServersObject
