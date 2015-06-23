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
package io.opensec.six.oval.repository;

import io.opensec.util.repository.CommonQueryParams;



/**
 *
 * @author  Akihito Nakamura, AIST
 */
public class OvalSystemCharacteristicsQueryParams
    extends CommonQueryParams
{

    public static class Key
    extends CommonQueryParams.Key
    {
        public static final String  HOST        = "primary_host_name";
        public static final String  OS          = "os_name";
        public static final String  OS_VERSION  = "os_version";
        public static final String  IP          = "ip_address";
        public static final String  MAC         = "mac_address";
    }
    // Key



    /**
     * Constructor.
     */
    public OvalSystemCharacteristicsQueryParams()
    {
    }



    /**
     */
    public void setHost(
                    final String host
                    )
    {
        set( Key.HOST, host );
    }


    public String getHost()
    {
        return get( Key.HOST );
    }



    /**
     */
    public void setOs(
                    final String os_name
    )
    {
        set( Key.OS, os_name );
    }


    public String getOs()
    {
        return get( Key.OS );
    }



    /**
     */
    public void setOsVersion(
                    final String os_version
    )
    {
        set( Key.OS_VERSION, os_version );
    }


    public String getOsVersion()
    {
        return get( Key.OS_VERSION );
    }



    /**
     */
    public void setIp(
                    final String ip_address
    )
    {
        set( Key.IP, ip_address );
    }


    public String getIp()
    {
        return get( Key.IP );
    }



    /**
     */
    public void setMac(
                    final String mac_address
    )
    {
        set( Key.MAC, mac_address );
    }


    public String getMac()
    {
        return get( Key.MAC );
    }

}
//

