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
 * The network_interface state enumerates the different properties
 * associate with a Windows interface.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class InterfaceState
    extends StateType
{

    //{0..1}
    private EntityStateStringType               name;
    private EntityStateIntType                  index;
    private EntityStateInterfaceTypeType        type;
    private EntityStateStringType               hardware_addr;
    private EntityStateIPAddressStringType      inet_addr;
    private EntityStateIPAddressStringType      broadcast_addr;
    private EntityStateIPAddressStringType      netmask;
    private EntityStateAddrTypeType             addr_type;



    /**
     * Constructor.
     */
    public InterfaceState()
    {
        this( null, 0 );
    }


    public InterfaceState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public InterfaceState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.network_interface;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.INTERFACE;
    }



    /**
     */
    public void setName(
                    final EntityStateStringType name
                    )
    {
        this.name = name;
    }


    public EntityStateStringType getName()
    {
        return name;
    }



    /**
     */
    public void setIndex(
                    final EntityStateIntType index
                    )
    {
        this.index = index;
    }


    public EntityStateIntType getIndex()
    {
        return index;
    }



    /**
     */
    public void setType(
                    final EntityStateInterfaceTypeType type
                    )
    {
        this.type = type;
    }


    public EntityStateInterfaceTypeType getType()
    {
        return type;
    }



    /**
     */
    public void setHardwareAddr(
                    final EntityStateStringType hardware_addr
                    )
    {
        this.hardware_addr = hardware_addr;
    }


    public EntityStateStringType getHardwareAddr()
    {
        return hardware_addr;
    }



    /**
     */
    public void setInetAddr(
                    final EntityStateIPAddressStringType inet_addr
                    )
    {
        this.inet_addr = inet_addr;
    }


    public EntityStateIPAddressStringType getInetAddr()
    {
        return inet_addr;
    }



    /**
     */
    public void setBroadcastAddr(
                    final EntityStateIPAddressStringType broadcast_addr
                    )
    {
        this.broadcast_addr = broadcast_addr;
    }


    public EntityStateIPAddressStringType getBroadcastAddr()
    {
        return broadcast_addr;
    }



    /**
     */
    public void setNetmask(
                    final EntityStateIPAddressStringType netmask
                    )
    {
        this.netmask = netmask;
    }


    public EntityStateIPAddressStringType getNetmask()
    {
        return netmask;
    }



    /**
     */
    public void setAddrType(
                    final EntityStateAddrTypeType addr_type
                    )
    {
        this.addr_type = addr_type;
    }


    public EntityStateAddrTypeType getAddrType()
    {
        return addr_type;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getName() );
        ref_list.add( getIndex() );
        ref_list.add( getType() );
        ref_list.add( getHardwareAddr() );
        ref_list.add( getInetAddr() );
        ref_list.add( getBroadcastAddr() );
        ref_list.add( getNetmask() );
        ref_list.add( getAddrType() );

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
        if (!(obj instanceof InterfaceState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "neytwork_interface_state[" + super.toString()
             + ", name="            + getName()
             + ", index="           + getIndex()
             + ", type="            + getType()
             + ", hadware_addr="    + getHardwareAddr()
             + ", inet_addr="       + getInetAddr()
             + ", broadcast_addr="  + getBroadcastAddr()
             + ", netmask="         + getNetmask()
             + ", addr_type="       + getAddrType()
             + "]";
    }
}
//
