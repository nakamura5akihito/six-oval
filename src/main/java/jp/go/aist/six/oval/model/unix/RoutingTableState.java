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

import java.util.ArrayList;
import java.util.Collection;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.EntityStateIPAddressStringType;
import jp.go.aist.six.oval.model.definitions.EntityStateStringType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 * The routingtable_state defines the different information that can be used to check an entry
 * found in a system's primary routing table.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: RoutingTableState.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class RoutingTableState
    extends StateType
{

    //{0..1}
    private EntityStateIPAddressStringType      destination;
    private EntityStateIPAddressStringType      gateway;
    private EntityStateRoutingTableFlagsType    flags;
    private EntityStateStringType               interface_name;



    /**
     * Constructor.
     */
    public RoutingTableState()
    {
        this( null, 0 );
    }


    public RoutingTableState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public RoutingTableState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.UNIX;
        _oval_component = ComponentType.ROUTINGTABLE;
    }



    /**
     */
    public void setDestination(
                    final EntityStateIPAddressStringType destination
                    )
    {
        this.destination = destination;
    }


    public EntityStateIPAddressStringType getDestination()
    {
        return destination;
    }



    /**
     */
    public void setGateway(
                    final EntityStateIPAddressStringType bgateway
                    )
    {
        gateway = bgateway;
    }


    public EntityStateIPAddressStringType getGateway()
    {
        return gateway;
    }



    /**
     */
    public void setFlags(
                    final EntityStateRoutingTableFlagsType flags
                    )
    {
        this.flags = flags;
    }


    public EntityStateRoutingTableFlagsType getFlags()
    {
        return flags;
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



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getDestination() );
        ref_list.add( getGateway() );
        ref_list.add( getFlags() );
        ref_list.add( getInterfaceName() );

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
        if (!(obj instanceof RoutingTableState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "routingtable_state[" + super.toString()
             + ", destination="     + getDestination()
             + ", gateway="         + getGateway()
             + ", flags="           + getFlags()
             + ", interface_name="  + getInterfaceName()
             + "]";
    }
}
//
