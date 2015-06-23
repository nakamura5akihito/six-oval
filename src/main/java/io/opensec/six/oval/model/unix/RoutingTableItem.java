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
import io.opensec.six.oval.model.sc.EntityItemIPAddressStringType;
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.ItemType;



/**
 * The routingtable_item holds information about an individual routing table entry
 * found in a system's primary routing table.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class RoutingTableItem
    extends ItemType
{

    //{0..1}
    private EntityItemIPAddressStringType      destination;
    private EntityItemIPAddressStringType      gateway;
    private EntityItemRoutingTableFlagsType    flags;
    private EntityItemStringType               interface_name;



    /**
     * Constructor.
     */
    public RoutingTableItem()
    {
        this( 0 );
    }


    public RoutingTableItem(
                    final int id
                    )
    {
        super( id );

        _oval_family = Family.UNIX;
        _oval_component = ComponentType.ROUTINGTABLE;
    }



    /**
     */
    public void setDestination(
                    final EntityItemIPAddressStringType destination
                    )
    {
        this.destination = destination;
    }


    public EntityItemIPAddressStringType getDestination()
    {
        return destination;
    }



    /**
     */
    public void setGateway(
                    final EntityItemIPAddressStringType gateway
                    )
    {
        this.gateway = gateway;
    }


    public EntityItemIPAddressStringType getGateway()
    {
        return gateway;
    }



    /**
     */
    public void setFlags(
                    final EntityItemRoutingTableFlagsType flags
                    )
    {
        this.flags = flags;
    }


    public EntityItemRoutingTableFlagsType getFlags()
    {
        return flags;
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



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "interface_item[" + super.toString()
                        + ", destination="      + getDestination()
                        + ", gateway="          + getGateway()
                        + ", flags="            + getFlags()
                        + ", interface_name="   + getInterfaceName()
             + "]";
    }

}
//
