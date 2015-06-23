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
package io.opensec.six.oval.model.sc;

import io.opensec.six.oval.model.Container;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.mongodb.morphia.annotations.Embedded;



/**
 * The InterfacesType is a container for zero or more interface elements.
 * Each interface element is used to describe an existing network interface on the system.
 *
 * @author	Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class InterfacesType
    extends Container<InterfaceType> //{0..*}
{

    @Embedded( "interface" )
    private final Collection<InterfaceType>  network_interface =
        new ArrayList<InterfaceType>();



    /**
     * Constructor.
     */
    public InterfacesType()
    {
    }


    public InterfacesType(
                    final Collection<? extends InterfaceType> interface_list
                    )
    {
//        super( network_interface_list );

//        network_interface.addAll( network_interface_list );
        _copy( network_interface, interface_list );
    }


    public InterfacesType(
                    final InterfaceType[] interface_list
                    )
    {
//        super( network_interface_list );

        this( Arrays.asList( interface_list ) );
    }



    /**
     */
    public void setInterface(
                    final Collection<? extends InterfaceType> interface_list
                    )
    {
        reset( interface_list );
    }


    public void setInterface(
                    final InterfaceType[] interface_list
                    )
    {
        reset( interface_list );
    }


    public Collection<InterfaceType> getInterface()
    {
        return _getCollection();
    }


//    public boolean addInterface(
//                    final InterfaceType network_interface
//                    )
//    {
//        return add( network_interface );
//    }
//
//
//    public Iterator<InterfaceType> iterateInterface()
//    {
//        return iterator();
//    }



    //**************************************************************
    //  Container
    //**************************************************************

    @Override
    protected Collection<InterfaceType> _getCollection()
    {
        return network_interface;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

}
//
