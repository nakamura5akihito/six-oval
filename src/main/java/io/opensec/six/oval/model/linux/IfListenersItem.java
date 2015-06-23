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
package io.opensec.six.oval.model.linux;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.sc.EntityItemIntType;
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.ItemType;



/**
 * An iflisteners_item stores the results of checking for applications
 * that are bound to an interface on the system.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class IfListenersItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType       interface_name;
    private EntityItemProtocolType     protocol;
    private EntityItemStringType       hw_address;
    private EntityItemStringType       program_name;
    private EntityItemIntType          pid;
    private EntityItemIntType          user_id;



    /**
     * Constructor.
     */
    public IfListenersItem()
    {
        this( 0 );
    }


    public IfListenersItem(
                    final int id
                    )
    {
        super( id );

        _oval_family = Family.LINUX;
        _oval_component = ComponentType.IFLISTENERS;
    }



    /**
     */
    public void setInterfaceName(
                    final EntityItemStringType interface_name
                    )
    {
        this.interface_name = interface_name;
    }


    public EntityItemStringType getInterfaceName()
    {
        return interface_name;
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
    public void setHwAddress(
                    final EntityItemStringType hw_address
                    )
    {
        this.hw_address = hw_address;
    }


    public EntityItemStringType getHwAddress()
    {
        return hw_address;
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
        return "iflisteners_item[" + super.toString()
                        + ", interface_name="  + getInterfaceName()
                        + ", protocol="        + getProtocol()
                        + ", hw_address="      + getHwAddress()
                        + ", program_name="    + getProgramName()
                        + ", pid="             + getPid()
                        + ", user_id="         + getUserId()
             + "]";
    }

}
//
