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
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.sc.EntityItemIPAddressStringType;
import io.opensec.six.oval.model.sc.EntityItemIntType;
import io.opensec.six.oval.model.sc.ItemType;



/**
 * The port item specifies information about open listening ports.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class PortItem
    extends ItemType
{

    //{0..1}
    private EntityItemIPAddressStringType  local_address;
    private EntityItemIntType              local_port;
    private EntityItemProtocolType         protocol;
    private EntityItemIntType              pid;
    private EntityItemIPAddressStringType  foreign_address;
    private EntityItemIntType              foreign_port;



    /**
     * Constructor.
     */
    public PortItem()
    {
        this( 0 );
    }


    public PortItem(
                    final int id
                    )
    {
        super( id );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.port;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.PORT;
    }



    /**
     */
    public void setLocalAddress(
                    final EntityItemIPAddressStringType local_address
                    )
    {
        this.local_address = local_address;
    }


    public EntityItemIPAddressStringType getLocalAddress()
    {
        return local_address;
    }



    /**
     */
    public void setLocalPort(
                    final EntityItemIntType local_port
                    )
    {
        this.local_port = local_port;
    }


    public EntityItemIntType getLocalPort()
    {
        return local_port;
    }



    /**
     */
    public void setProtocol(
                    final EntityItemProtocolType protocol
                    )
    {
        this.protocol = protocol;
    }


    public EntityItemProtocolType getProtocol()
    {
        return protocol;
    }



    /**
     */
    public void setPid(
                    final EntityItemIntType pid
                    )
    {
        this.pid = pid;
    }


    public EntityItemIntType getPid()
    {
        return pid;
    }



    /**
     */
    public void setForeignAddress(
                    final EntityItemIPAddressStringType foreign_address
                    )
    {
        this.foreign_address = foreign_address;
    }


    public EntityItemIPAddressStringType getForeignAddress()
    {
        return foreign_address;
    }



    /**
     */
    public void setForeignPort(
                    final EntityItemIntType foreign_port
                    )
    {
        this.foreign_port = foreign_port;
    }


    public EntityItemIntType getForeignPort()
    {
        return foreign_port;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "port_item[" + super.toString()
                        + ", local_address="    + getLocalAddress()
                        + ", local_port="       + getLocalPort()
                        + ", protocol="         + getProtocol()
                        + ", pid="              + getPid()
                        + ", foreign_address="  + getForeignAddress()
                        + ", foreign_port="     + getForeignPort()
             + "]";
    }

}
//PortItem
