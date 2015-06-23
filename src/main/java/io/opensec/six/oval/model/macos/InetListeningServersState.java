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
import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.definitions.EntityStateIPAddressStringType;
import io.opensec.six.oval.model.definitions.EntityStateIntType;
import io.opensec.six.oval.model.definitions.EntityStateStringType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;



/**
 * The inetlisteningservers defines the different information that can be used to evaluate
 * the specified inet listening server.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 * @deprecated Deprecated as of version 5.10:
 *             Replaced by the inetlisteningservers510 state.
 */
@Deprecated
public class InetListeningServersState
    extends StateType
{

    //{0..1}
    private EntityStateStringType           program_name;
    private EntityStateIPAddressStringType  local_address;
    private EntityStateStringType           local_full_address;
    private EntityStateIntType              local_port;
    private EntityStateIPAddressStringType  foreign_address;
    private EntityStateStringType           foreign_full_address;
    private EntityStateIntType              foreign_port;
    private EntityStateIntType              pid;
    private EntityStateStringType           protocol;
    private EntityStateIntType              user_id;



    /**
     * Constructor.
     */
    public InetListeningServersState()
    {
        this( null, 0 );
    }


    public InetListeningServersState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public InetListeningServersState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.MACOS;
        _oval_component = ComponentType.INETLISTENINGSERVERS;
    }



    /**
     */
    public void setProgramName(
                    final EntityStateStringType program_name
                    )
    {
        this.program_name = program_name;
    }


    public EntityStateStringType getProgramName()
    {
        return program_name;
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
    public void setLocalFullAddress(
                    final EntityStateStringType local_full_address
                    )
    {
        this.local_full_address = local_full_address;
    }


    public EntityStateStringType getLocalFullAddress()
    {
        return local_full_address;
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
    public void setForeignFullAddress(
                    final EntityStateStringType foreign_full_address
                    )
    {
        this.foreign_full_address = foreign_full_address;
    }


    public EntityStateStringType getForeignFullAddress()
    {
        return foreign_full_address;
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
    public void setProtocol(
                    final EntityStateStringType protocol
                    )
    {
        this.protocol = protocol;
    }


    public EntityStateStringType getProtocol()
    {
        return protocol;
    }



    /**
     */
    public void setUserId(
                    final EntityStateIntType user_id
                    )
    {
        this.user_id = user_id;
    }


    public EntityStateIntType getUserId()
    {
        return user_id;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getProgramName() );
        ref_list.add( getLocalAddress() );
        ref_list.add( getLocalFullAddress() );
        ref_list.add( getLocalPort() );
        ref_list.add( getForeignAddress() );
        ref_list.add( getForeignFullAddress() );
        ref_list.add( getForeignPort() );
        ref_list.add( getPid() );
        ref_list.add( getProtocol() );
        ref_list.add( getUserId() );

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
        if (!(obj instanceof InetListeningServersState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "inetlisteningservers_state[" + super.toString()
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
