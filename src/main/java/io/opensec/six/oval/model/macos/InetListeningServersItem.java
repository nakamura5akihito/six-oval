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
package io.opensec.six.oval.model.macos;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.sc.EntityItemIPAddressStringType;
import io.opensec.six.oval.model.sc.EntityItemIntType;
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.ItemType;



/**
 * An inet listening server item stores the results of checking
 * for network servers currently active on a system.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 * @deprecated Deprecated as of version 5.10:
 *             Replaced by the inetlisteningservers510 item.
 */
@Deprecated
public class InetListeningServersItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType           program_name;
    private EntityItemIPAddressStringType  local_address;
    private EntityItemStringType           local_full_address;
    private EntityItemIntType              local_port;
    private EntityItemIPAddressStringType  foreign_address;
    private EntityItemStringType           foreign_full_address;
    private EntityItemIntType              foreign_port;
    private EntityItemIntType              pid;
    private EntityItemStringType           protocol;
    private EntityItemIntType              user_id;



    /**
     * Constructor.
     */
    public InetListeningServersItem()
    {
        this( 0 );
    }


    public InetListeningServersItem(
                    final int id
                    )
    {
        super( id );

        _oval_family = Family.MACOS;
        _oval_component = ComponentType.INETLISTENINGSERVERS;
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
    public void setLocalFullAddress(
                    final EntityItemStringType local_full_address
                    )
    {
        this.local_full_address = local_full_address;
    }


    public EntityItemStringType getLocalFullAddress()
    {
        return local_full_address;
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
    public void setProgramName(
                    final EntityItemStringType program_name
                    )
    {
        this.program_name = program_name;
    }


    public EntityItemStringType getProgramName()
    {
        return program_name;
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
    public void setForeignFullAddress(
                    final EntityItemStringType foreign_full_address
                    )
    {
        this.foreign_full_address = foreign_full_address;
    }


    public EntityItemStringType getForeignFullAddress()
    {
        return foreign_full_address;
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
    public void setProtocol(
                    final EntityItemStringType protocol
                    )
    {
        this.protocol = protocol;
    }


    public EntityItemStringType getProtocol()
    {
        return protocol;
    }



    /**
     */
    public void setUserId(
                    final EntityItemIntType user_id
                    )
    {
        this.user_id = user_id;
    }


    public EntityItemIntType getUserId()
    {
        return user_id;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "inetlisteningserver_item[" + super.toString()
                        + ", program_name="         + getProgramName()
                        + ", local_address="        + getLocalAddress()
                        + ", local_full_address="   + getLocalFullAddress()
                        + ", local_port="           + getLocalPort()
                        + ", foreign_address="      + getForeignAddress()
                        + ", foreign_full_address=" + getForeignFullAddress()
                        + ", foreign_port="         + getForeignPort()
                        + ", pid="                  + getPid()
                        + ", protocol="             + getProtocol()
                        + ", user_id="              + getUserId()
             + "]";
    }

}
//
