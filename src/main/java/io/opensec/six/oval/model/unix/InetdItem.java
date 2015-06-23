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
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.ItemType;
import io.opensec.six.oval.model.sc.StatusEnumeration;



/**
 * The file item holds information about the individual files found on a system.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class InetdItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType       protocol;
    private EntityItemStringType       service_name;
    private EntityItemStringType       server_program;
    private EntityItemStringType       server_arguments;
    private EntityItemEndpointType     endpoint_type;
    private EntityItemStringType       exec_as_user;
    private EntityItemWaitStatusType   wait_status;



    /**
     * Constructor.
     */
    public InetdItem()
    {
        this( 0 );
    }


    public InetdItem(
                    final int id
                    )
    {
        this( id, null );
    }


    public InetdItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        super( id, status );

//        _oval_platform_type = OvalPlatformType.unix;
//        _oval_component_type = OvalComponentType.inetd;
        _oval_family = Family.UNIX;
        _oval_component = ComponentType.INETD;
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
    public void setServerProgram(
                    final EntityItemStringType server_program
                    )
    {
        this.server_program = server_program;
    }


    public EntityItemStringType getServerProgram()
    {
        return server_program;
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
    public void setEndpointType(
                    final EntityItemEndpointType endpoint_type
                    )
    {
        this.endpoint_type = endpoint_type;
    }


    public EntityItemEndpointType getEndpointType()
    {
        return endpoint_type;
    }



    /**
     */
    public void setExecAsUser(
                    final EntityItemStringType exec_as_user
                    )
    {
        this.exec_as_user = exec_as_user;
    }


    public EntityItemStringType getExecAsUser()
    {
        return exec_as_user;
    }



    /**
     */
    public void setWaitStatus(
                    final EntityItemWaitStatusType wait_status
                    )
    {
        this.wait_status = wait_status;
    }


    public EntityItemWaitStatusType getWaitStatus()
    {
        return wait_status;
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
        if (!(obj instanceof InetdItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "inetd_item[" + super.toString()
                        + ", protocol="         + getProtocol()
                        + ", service_name="     + getServiceName()
                        + ", server_program="   + getServerProgram()
                        + ", server_arguments=" + getServerArguments()
                        + ", endpoint_type="    + getEndpointType()
                        + ", exec_as_user="     + getExecAsUser()
                        + ", wait_status="      + getWaitStatus()
             + "]";
    }

}
//InetdItem
