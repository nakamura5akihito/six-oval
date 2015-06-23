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
package io.opensec.six.oval.model.unix;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.sc.EntityItemBoolType;
import io.opensec.six.oval.model.sc.EntityItemIPAddressStringType;
import io.opensec.six.oval.model.sc.EntityItemIntType;
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.ItemType;
import io.opensec.six.oval.model.sc.StatusEnumeration;



/**
 * The xinetd item holds information associated with different Internet services.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class XinetdItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType           protocol;
    private EntityItemStringType           service_name;
    private EntityItemStringType           flags;
    private EntityItemStringType           no_access;
    private EntityItemIPAddressStringType  only_from;
    private EntityItemIntType              port;
    private EntityItemStringType           server;
    private EntityItemStringType           server_arguments;
    private EntityItemStringType           socket_type;
    private EntityItemXinetdTypeStatusType type;
    private EntityItemStringType           user;
    private EntityItemBoolType             wait;
    private EntityItemBoolType             disabled;



    /**
     * Constructor.
     */
    public XinetdItem()
    {
        this( 0 );
    }


    public XinetdItem(
                    final int id
                    )
    {
        this( id, null );
    }


    public XinetdItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        super( id, status );

//        _oval_platform_type = OvalPlatformType.unix;
//        _oval_component_type = OvalComponentType.xinetd;
        _oval_family = Family.UNIX;
        _oval_component = ComponentType.XINETD;
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
    public void setServiceName(
                    final EntityItemStringType service_name
                    )
    {
        this.service_name = service_name;
    }


    public EntityItemStringType getServiceName()
    {
        return service_name;
    }



    /**
     */
    public void setFlags(
                    final EntityItemStringType flags
                    )
    {
        this.flags = flags;
    }


    public EntityItemStringType getFlags()
    {
        return flags;
    }



    /**
     */
    public void setNoAccess(
                    final EntityItemStringType no_access
                    )
    {
        this.no_access = no_access;
    }


    public EntityItemStringType getNoAccess()
    {
        return no_access;
    }



    /**
     */
    public void setOnlyFrom(
                    final EntityItemIPAddressStringType only_from
                    )
    {
        this.only_from = only_from;
    }


    public EntityItemIPAddressStringType getOnlyFrom()
    {
        return only_from;
    }



    /**
     */
    public void setPort(
                    final EntityItemIntType port
                    )
    {
        this.port = port;
    }


    public EntityItemIntType getPort()
    {
        return port;
    }



    /**
     */
    public void setServer(
                    final EntityItemStringType server
                    )
    {
        this.server = server;
    }


    public EntityItemStringType getServer()
    {
        return server;
    }



    /**
     */
    public void setServerArguments(
                    final EntityItemStringType server_arguments
                    )
    {
        this.server_arguments = server_arguments;
    }


    public EntityItemStringType getServerArguments()
    {
        return server_arguments;
    }



    /**
     */
    public void setSocketType(
                    final EntityItemStringType socket_type
                    )
    {
        this.socket_type = socket_type;
    }


    public EntityItemStringType getSocketType()
    {
        return socket_type;
    }



    /**
     */
    public void setType(
                    final EntityItemXinetdTypeStatusType type
                    )
    {
        this.type = type;
    }


    public EntityItemXinetdTypeStatusType getType()
    {
        return type;
    }



    /**
     */
    public void setUser(
                    final EntityItemStringType user
                    )
    {
        this.user = user;
    }


    public EntityItemStringType getUser()
    {
        return user;
    }



    /**
     */
    public void setWait(
                    final EntityItemBoolType wait
                    )
    {
        this.wait = wait;
    }


    public EntityItemBoolType getWait()
    {
        return wait;
    }



    /**
     */
    public void setDisabled(
                    final EntityItemBoolType disabled
                    )
    {
        this.disabled = disabled;
    }


    public EntityItemBoolType getDisabled()
    {
        return disabled;
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
        if (!(obj instanceof XinetdItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "xinetd_item[" + super.toString()
                        + ", protocol="         + getProtocol()
                        + ", service_name="     + getServiceName()
                        + ", flags="            + getFlags()
                        + ", no_access="        + getNoAccess()
                        + ", only_from="        + getOnlyFrom()
                        + ", port="             + getPort()
                        + ", server="           + getServer()
                        + ", server_arguments=" + getServerArguments()
                        + ", socket_type="      + getSocketType()
                        + ", type="             + getType()
                        + ", user="             + getUser()
                        + ", wait="             + getWait()
                        + ", disabled="         + getDisabled()
             + "]";
    }

}
//XinetdItem
