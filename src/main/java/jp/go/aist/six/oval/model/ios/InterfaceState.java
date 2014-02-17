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
package jp.go.aist.six.oval.model.ios;

import java.util.ArrayList;
import java.util.Collection;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.EntityStateStringType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: InterfaceState.java 3199 2013-07-05 10:38:17Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class InterfaceState
    extends StateType
{

    //{0..1}
    private EntityStateStringType   name;
    private EntityStateStringType   ip_directed_broadcast_command;
    private EntityStateStringType   no_ip_directed_broadcast_command;
    private EntityStateStringType   proxy_arp_command;
    private EntityStateStringType   shutdown_command;



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

        _oval_family = Family.IOS;
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
    public void setIpDirectedBroadcastCommand(
                    final EntityStateStringType ip_directed_broadcast_command
                    )
    {
        this.ip_directed_broadcast_command = ip_directed_broadcast_command;
    }


    public EntityStateStringType getIpDirectedBroadcastCommand()
    {
        return ip_directed_broadcast_command;
    }



    /**
     */
    public void setNoIpDirectedBroadcastCommand(
                    final EntityStateStringType no_ip_directed_broadcast_command
                    )
    {
        this.no_ip_directed_broadcast_command = no_ip_directed_broadcast_command;
    }


    public EntityStateStringType getNoIpDirectedBroadcastCommand()
    {
        return no_ip_directed_broadcast_command;
    }



    /**
     */
    public void setProxyArpCommand(
                    final EntityStateStringType proxy_arp_command
                    )
    {
        this.proxy_arp_command = proxy_arp_command;
    }


    public EntityStateStringType getProxyArpCommand()
    {
        return proxy_arp_command;
    }



    /**
     */
    public void setShutdownCommand(
                    final EntityStateStringType shutdown_command
                    )
    {
        this.shutdown_command = shutdown_command;
    }


    public EntityStateStringType getShutdownCommand()
    {
        return shutdown_command;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getName() );
        ref_list.add( getIpDirectedBroadcastCommand() );
        ref_list.add( getNoIpDirectedBroadcastCommand() );
        ref_list.add( getProxyArpCommand() );
        ref_list.add( getShutdownCommand() );

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
        return "interface_state[" + super.toString()
             + ", name="                                + getName()
             + ", ip_directed_broadcast_command="       + getIpDirectedBroadcastCommand()
             + ", no_ip_directed_broadcast_command="    + getNoIpDirectedBroadcastCommand()
             + ", proxy_arp_command="                   + getProxyArpCommand()
             + ", shutdown_command="                    + getShutdownCommand()
             + "]";
    }

}
//InterfaceState
