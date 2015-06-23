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
import io.opensec.six.oval.model.definitions.EntityStateIPAddressStringType;
import io.opensec.six.oval.model.definitions.EntityStateIntType;
import io.opensec.six.oval.model.definitions.EntityStateStringType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;



/**
 * The dnscache_state contains three entities that are used to check the domain name,
 * time to live, and IP addresses associated with the DNS cache entry.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class DnsCacheState
    extends StateType
{

    //{0..1}
    private EntityStateStringType           domain_name;
    private EntityStateIntType              ttl;
    private EntityStateIPAddressStringType  ip_address;



    /**
     * Constructor.
     */
    public DnsCacheState()
    {
        this( null, 0 );
    }


    public DnsCacheState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public DnsCacheState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.DNSCACHE;
    }



    /**
     */
    public void setDomainName(
                    final EntityStateStringType domain_name
                    )
    {
        this.domain_name = domain_name;
    }


    public EntityStateStringType getDomainName()
    {
        return domain_name;
    }



    /**
     */
    public void setTtl(
                    final EntityStateIntType ttl
                    )
    {
        this.ttl = ttl;
    }


    public EntityStateIntType getTtl()
    {
        return ttl;
    }



    /**
     */
    public void setIPAddress(
                    final EntityStateIPAddressStringType ip_address
                    )
    {
        this.ip_address = ip_address;
    }


    public EntityStateIPAddressStringType getIPAddress()
    {
        return ip_address;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getDomainName() );
        ref_list.add( getTtl() );
        ref_list.add( getIPAddress() );

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
        if (!(obj instanceof DnsCacheState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "dnscache_state[" + super.toString()
                        + ", domain_name="  + getDomainName()
                        + ", ttl="          + getTtl()
                        + ", ip_address="   + getIPAddress()
             + "]";
    }

}
//
