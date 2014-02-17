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
package jp.go.aist.six.oval.model.sc;

import jp.go.aist.six.oval.model.OvalObject;




/**
 * An existing network interface on the system.
 * The name "interface" in the OVAL Schema is renamed
 * because the name has the special meaning in Java.
 *
 * @author	Akihito Nakamura, AIST
 * @version $Id: InterfaceType.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class InterfaceType
    implements OvalObject
//    implements Dependent<OvalSystemCharacteristics>
//implements Dependent<SystemInfo>
{

    private String  interface_name;
    //{1..1}

//    private EntityItemIPAddressStringType  ip_address;    // -5.9
    private String  ip_address;                             //5.10-
    //{1..1}

    private String  mac_address;
    //{1..1}



    /**
     * Constructor.
     */
    public InterfaceType()
    {
    }


    /**
     * Constructor.
     */
    public InterfaceType(
                    final String name,
                    final String ip,
                    final String mac
                    )
    {
        setInterfaceName( name );
        setIpAddress( ip );
        setMacAddress( mac );
    }



    /**
     */
    public void setInterfaceName(
                    final String interface_name
                    )
    {
        this.interface_name = interface_name;
    }


    public String getInterfaceName()
    {
        return interface_name;
    }



    /**
     */
    public void setIpAddress(
                    final String ip_address
                    )
    {
        this.ip_address = ip_address;
//        setIpAddress( new EntityItemIPAddressStringType( ip_address ) );
    }


    public String getIpAddress()
    {
        return ip_address;
    }

//    public void setIpAddress(
//                    final EntityItemIPAddressStringType ip_address
//                    )
//    {
//        this.ip_address = ip_address;
//    }
//
//
//    public EntityItemIPAddressStringType getIpAddress()
//    {
//        return ip_address;
//    }



    /**
     */
    public void setMacAddress(
                    final String mac_address
                    )
    {
        this.mac_address = mac_address;
    }


    public String getMacAddress()
    {
        return mac_address;
    }



//    //**************************************************************
//    //  Dependent
//    //**************************************************************
//
//    private OvalSystemCharacteristics  _master;
//
//
//
//    @Override
//    public void setMasterObject(
//                    final OvalSystemCharacteristics master
//                    )
//    {
//        _master = master;
//    }
//
//
//    @Override
//    public OvalSystemCharacteristics getMasterObject()
//    {
//        return _master;
//    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public int hashCode()
    {
        final int  prime = 37;
        int  result = 17;

        String  interface_name = getInterfaceName();
        result = prime * result + ((interface_name == null) ? 0 : interface_name.hashCode());

//        EntityItemIPAddressStringType  ip_address = getIpAddress();
        String  ip_address = getIpAddress();
        result = prime * result + ((ip_address == null) ? 0 : ip_address.hashCode());

        String  mac_address = getMacAddress();
        result = prime * result + ((mac_address == null) ? 0 : mac_address.hashCode());

        return result;
    }



    @Override
    public boolean equals(
                    final Object obj
                    )
    {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof InterfaceType)) {
            return false;
        }

        InterfaceType  other = (InterfaceType)obj;
        String  other_ip = other.getIpAddress();
        String   this_ip =  this.getIpAddress();
        if (this_ip == other_ip
                        ||  (this_ip != null  &&  this_ip.equals( other_ip ))) {
            String  other_mac = other.getMacAddress();
            String   this_mac =  this.getMacAddress();
            if (this_mac == other_mac
                            ||  (this_mac != null  &&  this_mac.equals( other_mac ))) {
                String  other_name = other.getInterfaceName();
                String   this_name =  this.getInterfaceName();
                if (this_name == other_name
                                ||  (this_name != null  &&  this_name.equals( other_name ))) {
                    return true;
                }
            }
        }

        return false;
    }



    @Override
    public String toString()
    {
        return "[interface_name=" + getInterfaceName()
                        + ", ip_address=" + getIpAddress()
                        + ", mac_address=" + getMacAddress()
                        + "]";
    }

}
//InterfaceType
