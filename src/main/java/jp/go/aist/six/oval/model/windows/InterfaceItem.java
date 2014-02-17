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



/**
 * The network_interface item enumerates various attributes
 * about the network interfaces on a system.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: InterfaceItem.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class InterfaceItem
    extends ItemType
{

    private EntityItemStringType  name;
    //{0..1}

    private EntityItemIntType  index;
    //{0..1}

    private EntityItemInterfaceTypeType  type;
    //{0..1}

    private EntityItemStringType  hardware_addr;
    //{0..1}

    private EntityItemIPAddressStringType  inet_addr;
    //{0..1}

    private EntityItemIPAddressStringType  broadcast_addr;
    //{0..1}

    private EntityItemIPAddressStringType  netmask;
    //{0..1}

    private final Collection<EntityItemAddrTypeType>  addr_type =
        new ArrayList<EntityItemAddrTypeType>();
    //{0..*}



    /**
     * Constructor.
     */
    public InterfaceItem()
    {
        this( 0 );
    }


    public InterfaceItem(
                    final int id
                    )
    {
        super( id );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.network_interface;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.INTERFACE;
    }



    /**
     */
    public EntityItemStringType getName()
    {
        return name;
    }


    public void setName(
                    final EntityItemStringType name
                    )
    {
        this.name = name;
    }



    /**
     */
    public EntityItemIntType getIndex()
    {
        return index;
    }


    public void setIndex(
                    final EntityItemIntType index
                    )
    {
        this.index = index;
    }



    /**
     */
    public EntityItemInterfaceTypeType getType()
    {
        return type;
    }


    public void setType(
                    final EntityItemInterfaceTypeType name
                    )
    {
        type = name;
    }



    /**
     */
    public EntityItemStringType getHardwareAddr()
    {
        return hardware_addr;
    }


    public void setHardwareAddr(
                    final EntityItemStringType hardware_addr
                    )
    {
        this.hardware_addr = hardware_addr;
    }



    /**
     */
    public EntityItemIPAddressStringType getInetAddr()
    {
        return inet_addr;
    }


    public void setInetAddr(
                    final EntityItemIPAddressStringType inet_addr
                    )
    {
        this.inet_addr = inet_addr;
    }



    /**
     */
    public EntityItemIPAddressStringType getBroadcastAddr()
    {
        return broadcast_addr;
    }


    public void setBroadcastAddr(
                    final EntityItemIPAddressStringType broadcast_addr
                    )
    {
        this.broadcast_addr = broadcast_addr;
    }



    /**
     */
    public EntityItemIPAddressStringType getNetmask()
    {
        return netmask;
    }


    public void setNetmask(
                    final EntityItemIPAddressStringType netmask
                    )
    {
        this.netmask = netmask;
    }



    /**
     */
    public void setAddrType(
                    final Collection<? extends EntityItemAddrTypeType> addr_types
                    )
    {
        if (addr_type != addr_types) {
            addr_type.clear();
            if (addr_types != null  &&  addr_types.size() > 0) {
                addr_type.addAll( addr_types );
            }
        }
    }


    public Collection<EntityItemAddrTypeType> getAddrType()
    {
        return addr_type;
    }


    public Iterator<EntityItemAddrTypeType> iterateAddrType()
    {
        return addr_type.iterator();
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "network_interface_item[" + super.toString()
             + ", name="            + getName()
             + ", index="           + getIndex()
             + ", type="            + getType()
             + ", hardware_addr="   + getHardwareAddr()
             + ", inet_addr="       + getInetAddr()
             + ", broadcast_addr="  + getBroadcastAddr()
             + ", netmask="         + getNetmask()
             + ", addr_type="       + getAddrType()
             + "]";
    }

}
//NetworkInterfaceItem
