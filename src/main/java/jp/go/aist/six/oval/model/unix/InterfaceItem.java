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
package jp.go.aist.six.oval.model.unix;

import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.sc.EntityItemIPAddressStringType;
import jp.go.aist.six.oval.model.sc.EntityItemStringType;
import jp.go.aist.six.oval.model.sc.ItemType;



/**
 * The interface item enumerates various attributes
 * about the network interfaces on a system.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: InterfaceItem.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class InterfaceItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType               name;
    private EntityItemInterfaceType     type;
    private EntityItemStringType               hardware_addr;
    private EntityItemIPAddressStringType      inet_addr;
    private EntityItemIPAddressStringType      broadcast_addr;
    private EntityItemIPAddressStringType      netmask;
    private EntityItemStringType               flag;



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

//        _oval_platform_type = OvalPlatformType.unix;
//        _oval_component_type = OvalComponentType.network_interface;
        _oval_family = Family.UNIX;
        _oval_component = ComponentType.INTERFACE;
    }



    /**
     */
    public void setName(
                    final EntityItemStringType name
                    )
    {
        this.name = name;
    }


    public EntityItemStringType getName()
    {
        return name;
    }



    /**
     */
    public void setType(
                    final EntityItemInterfaceType type
                    )
    {
        this.type = type;
    }


    public EntityItemInterfaceType getType()
    {
        return type;
    }



    /**
     */
    public void setHardwareAddr(
                    final EntityItemStringType hardware_addr
                    )
    {
        this.hardware_addr = hardware_addr;
    }


    public EntityItemStringType getHardwareAddr()
    {
        return hardware_addr;
    }



    /**
     */
    public void setInetAddr(
                    final EntityItemIPAddressStringType inet_addr
                    )
    {
        this.inet_addr = inet_addr;
    }


    public EntityItemIPAddressStringType getInetAddr()
    {
        return inet_addr;
    }



    /**
     */
    public void setBroadcastAddr(
                    final EntityItemIPAddressStringType broadcast_addr
                    )
    {
        this.broadcast_addr = broadcast_addr;
    }


    public EntityItemIPAddressStringType getBroadcastAddr()
    {
        return broadcast_addr;
    }



    /**
     */
    public void setNetmask(
                    final EntityItemIPAddressStringType netmask
                    )
    {
        this.netmask = netmask;
    }


    public EntityItemIPAddressStringType getNetmask()
    {
        return netmask;
    }



    /**
     */
    public void setFlag(
                    final EntityItemStringType flag
                    )
    {
        this.flag = flag;
    }


    public EntityItemStringType getFlag()
    {
        return flag;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "interface_item[" + super.toString()
                        + ", name="            + getName()
                        + ", type="            + getType()
                        + ", hadware_addr="    + getHardwareAddr()
                        + ", inet_addr="       + getInetAddr()
                        + ", broadcast_addr="  + getBroadcastAddr()
                        + ", netmask="         + getNetmask()
                        + ", flag="            + getFlag()
             + "]";
    }

}
//InterfaceItem
