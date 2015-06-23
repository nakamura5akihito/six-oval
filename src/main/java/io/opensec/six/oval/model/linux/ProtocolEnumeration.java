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

import io.opensec.six.oval.model.OvalEnumeration;



/**
 * Physical layer protocols used by AF_PACKET sockets
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public enum ProtocolEnumeration
    implements OvalEnumeration
{

    ETH_P_LOOP,
    ETH_P_PUP,
    ETH_P_PUPAT,
    ETH_P_IP,
    ETH_P_X25,
    ETH_P_ARP,
    ETH_P_BPQ,
    ETH_P_IEEEPUP,
    ETH_P_IEEEPUPAT,
    ETH_P_DEC,
    ETH_P_DNA_DL,
    ETH_P_DNA_RC,
    ETH_P_DNA_RT,
    ETH_P_LAT,
    ETH_P_DIAG,
    ETH_P_CUST,
    ETH_P_SCA,
    ETH_P_RARP,
    ETH_P_ATALK,
    ETH_P_AARP,
    ETH_P_8021Q,
    ETH_P_IPX,
    ETH_P_IPV6,
    ETH_P_SLOW,
    ETH_P_WCCP,
    ETH_P_PPP_DISC,
    ETH_P_PPP_SES,
    ETH_P_MPLS_UC,
    ETH_P_MPLS_MC,
    ETH_P_ATMMPOA,
    ETH_P_ATMFATE,
    ETH_P_AOE,
    ETH_P_TIPC,
    ETH_P_802_3,
    ETH_P_AX25,
    ETH_P_ALL,
    ETH_P_802_2,
    ETH_P_SNAP,
    ETH_P_DDCMP,
    ETH_P_WAN_PPP,
    ETH_P_PPP_MP,
    ETH_P_PPPTALK,
    ETH_P_LOCALTALK,
    ETH_P_TR_802_2,
    ETH_P_MOBITEX,
    ETH_P_CONTROL,
    ETH_P_IRDA,
    ETH_P_ECONET,
    ETH_P_HDLC,
    ETH_P_ARCNET,
    NONE    ( "" );



    /**
     * A factory method.
     */
    public static ProtocolEnumeration fromValue(
                    final String value
                    )
    {
        for (ProtocolEnumeration  e : ProtocolEnumeration.values()) {
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
    ProtocolEnumeration()
    {
        value = name();
    }


    ProtocolEnumeration(
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
