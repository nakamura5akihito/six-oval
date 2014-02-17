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
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.EntityStateIPAddressStringType;
import jp.go.aist.six.oval.model.definitions.EntityStateIntType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 * The port state defines the different metadata associate with a Windows port.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: PortState.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class PortState
    extends StateType
{

    //{0..1}
    private EntityStateIPAddressStringType  local_address;
    private EntityStateIntType              local_port;
    private EntityStateProtocolType         protocol;
    private EntityStateIntType              pid;
    private EntityStateIPAddressStringType  foreign_address;
    private EntityStateIntType              foreign_port;



    /**
     * Constructor.
     */
    public PortState()
    {
        this( null, 0 );
    }


    public PortState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public PortState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.port;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.PORT;
    }



    /**
     */
    public void setLocalAddress(
                    final EntityStateIPAddressStringType local_address
                    )
    {
        this.local_address = local_address;
    }


    public EntityStateIPAddressStringType getLocalAddress()
    {
        return local_address;
    }



    /**
     */
    public void setLocalPort(
                    final EntityStateIntType local_port
                    )
    {
        this.local_port = local_port;
    }


    public EntityStateIntType getLocalPort()
    {
        return local_port;
    }



    /**
     */
    public void setProtocol(
                    final EntityStateProtocolType protocol
                    )
    {
        this.protocol = protocol;
    }


    public EntityStateProtocolType getProtocol()
    {
        return protocol;
    }



    /**
     */
    public void setPid(
                    final EntityStateIntType pid
                    )
    {
        this.pid = pid;
    }


    public EntityStateIntType getPid()
    {
        return pid;
    }



    /**
     */
    public void setForeignAddress(
                    final EntityStateIPAddressStringType foreign_address
                    )
    {
        this.foreign_address = foreign_address;
    }


    public EntityStateIPAddressStringType getForeignAddress()
    {
        return foreign_address;
    }



    /**
     */
    public void setForeignPort(
                    final EntityStateIntType foreign_port
                    )
    {
        this.foreign_port = foreign_port;
    }


    public EntityStateIntType getForeignPort()
    {
        return foreign_port;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();

        ref_list.add( getLocalAddress() );
        ref_list.add( getLocalPort() );
        ref_list.add( getProtocol() );
        ref_list.add( getPid() );
        ref_list.add( getForeignAddress() );
        ref_list.add( getForeignPort() );

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
        if (!(obj instanceof PortState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "port_state[" + super.toString()
                        + ", local_address="    + getLocalAddress()
                        + ", local_port="       + getLocalPort()
                        + ", protocol="         + getProtocol()
                        + ", pid="              + getPid()
                        + ", foreign_address="  + getForeignAddress()
                        + ", foreign_port="     + getForeignPort()
                        + "]";
    }

}
//PortState
