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

import jp.go.aist.six.oval.model.OvalEnumeration;



/**
 * The set of values that describe POSIX capability types associated with a process service.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: RoutingTableFlagsEnumeration.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public enum RoutingTableFlagsEnumeration
    implements OvalEnumeration
{

    UP,
    GATEWAY,
    HOST,
    REINSTATE,
    DYNAMIC,
    MODIFIED,
    ADDRCONF,
    CACHE,
    REJECT,
    REDUNDANT,
    SETSRC,
    BROADCAST,
    LOCAL,
    PROTOCOL_1,
    PROTOCOL_2,
    PROTOCOL_3,
    BLACK_HOLE,
    CLONING,
    PROTOCOL_CLONING,
    INTERFACE_SCOPE,
    LINK_LAYER,
    MULTICAST,
    STATIC,
    WAS_CLONED,
    XRESOLVE,
    USABLE,
    PINNED,
    ACTIVE_DEAD_GATEWAY_DETECTION,
    NONE                    ( "" );



    /**
     * A factory method.
     */
    public static RoutingTableFlagsEnumeration fromValue(
                    final String value
                    )
    {
        for (RoutingTableFlagsEnumeration  e : RoutingTableFlagsEnumeration.values()) {
            if (e.value.equals( value )) {
                return e;
            }
        }

        throw new IllegalArgumentException( value );
    }



    private String  value = null;



    /**
     * Constructor.
     */
    RoutingTableFlagsEnumeration()
    {
        value = name();
    }


    RoutingTableFlagsEnumeration(
                    final String value
                    )
    {
        this.value = value;
    }



    public String value()
    {
        return value;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return value;
    }

}
//
