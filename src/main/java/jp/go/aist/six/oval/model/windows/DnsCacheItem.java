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
import java.util.Iterator;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.sc.EntityItemIPAddressStringType;
import jp.go.aist.six.oval.model.sc.EntityItemIntType;
import jp.go.aist.six.oval.model.sc.EntityItemStringType;
import jp.go.aist.six.oval.model.sc.ItemType;
import jp.go.aist.six.oval.model.sc.StatusEnumeration;



/**
 * The dnscache_item stores information retrieved from the DNS cache about a domain name,
 * its time to live, and its corresponding IP addresses.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: DnsCacheItem.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class DnsCacheItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType    domain_name;
    private EntityItemIntType       ttl;

    private final Collection<EntityItemIPAddressStringType>  ip_address =
                    new ArrayList<EntityItemIPAddressStringType>();
    //{0..*}



    /**
     * Constructor.
     */
    public DnsCacheItem()
    {
        this( 0 );
    }


    public DnsCacheItem(
                    final int id
                    )
    {
        this( id, null );
    }


    public DnsCacheItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        super( id, status );

        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.DNSCACHE;
    }



    /**
     */
    public void setDomainName(
                    final EntityItemStringType domain_name
                    )
    {
        this.domain_name = domain_name;
    }


    public EntityItemStringType getDomainName()
    {
        return domain_name;
    }



    /**
     */
    public void setTtl(
                    final EntityItemIntType ttl
                    )
    {
        this.ttl = ttl;
    }


    public EntityItemIntType getTtl()
    {
        return ttl;
    }



    /**
     */
    public void setIPAddress(
                    final Collection<? extends EntityItemIPAddressStringType> ip_addresses
                    )
    {
        if (ip_address != ip_addresses) {
            ip_address.clear();
            if (ip_addresses != null  &&  ip_addresses.size() > 0) {
                ip_address.addAll( ip_addresses );
            }
        }
    }


    public boolean addIPAddress(
                    final EntityItemIPAddressStringType ip_address
                    )
    {
        if (ip_address == null) {
            return false;
        }

        return this.ip_address.add( ip_address );
    }


    public Collection<EntityItemIPAddressStringType> getIPAddress()
    {
        return ip_address;
    }


    public Iterator<EntityItemIPAddressStringType> iterateIPAddress()
    {
        return ip_address.iterator();
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
        if (!(obj instanceof DnsCacheItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "dnscache_item[" + super.toString()
                        + ", domain_name="  + getDomainName()
                        + ", ttl="          + getTtl()
                        + ", ip_address="   + getIPAddress()
             + "]";
    }

}
//
