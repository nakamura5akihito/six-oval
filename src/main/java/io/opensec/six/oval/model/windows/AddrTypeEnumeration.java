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
package io.opensec.six.oval.model.windows;

import io.opensec.six.oval.model.OvalEnumeration;



/**
 * The address types associated with a network interface.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public enum AddrTypeEnumeration
    implements OvalEnumeration
{

    MIB_IPADDR_DELETED      ( "MIB_IPADDR_DELETED" ),
    MIB_IPADDR_DISCONNECTED ( "MIB_IPADDR_DISCONNECTED" ),
    MIB_IPADDR_DYNAMIC      ( "MIB_IPADDR_DYNAMIC" ),
    MIB_IPADDR_PRIMARY      ( "MIB_IPADDR_PRIMARY" ),
    MIB_IPADDR_TRANSIENT    ( "MIB_IPADDR_TRANSIENT" ),
    NONE                    ( "" );



    /**
     * A factory method.
     */
    public static AddrTypeEnumeration fromValue(
                    final String value
                    )
    {
        for (AddrTypeEnumeration  e : AddrTypeEnumeration.values()) {
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
    AddrTypeEnumeration(
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
//AddrTypeEnumeration
