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
import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.definitions.EntityStateIntType;
import io.opensec.six.oval.model.definitions.EntityStateStringType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;



/**
 * The iflisteners_state element defines the different information that can be
 * used to evaluate the specified applications that are listening on interfaces on the system.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class IfListenersState
    extends StateType
{

    //{0..1}
    private EntityStateStringType       interface_name;
    private EntityStateProtocolType     protocol;
    private EntityStateStringType       hw_address;
    private EntityStateStringType       program_name;
    private EntityStateIntType          pid;
    private EntityStateIntType          user_id;



    /**
     * Constructor.
     */
    public IfListenersState()
    {
        this( null, 0 );
    }


    public IfListenersState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public IfListenersState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.LINUX;
        _oval_component = ComponentType.IFLISTENERS;
    }



    /**
     */
    public void setInterfaceName(
                    final EntityStateStringType interface_name
                    )
    {
        this.interface_name = interface_name;
    }


    public EntityStateStringType getInterfaceName()
    {
        return interface_name;
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
    public void setHwAddress(
                    final EntityStateStringType hw_address
                    )
    {
        this.hw_address = hw_address;
    }


    public EntityStateStringType getHwAddress()
    {
        return hw_address;
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
        ref_list.add( getInterfaceName() );
        ref_list.add( getProtocol() );
        ref_list.add( getHwAddress() );
        ref_list.add( getProgramName() );
        ref_list.add( getPid() );
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
        if (!(obj instanceof IfListenersState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "iflisteners_state[" + super.toString()
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
