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

import io.opensec.six.oval.model.OvalEnumeration;



/**
 * The set of values that describe POSIX capability types associated with a process service.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public enum CapabilityEnumeration
    implements OvalEnumeration
{

    CAP_CHOWN               ( "CAP_CHOWN" ),
    CAP_DAC_OVERRIDE        ( "CAP_DAC_OVERRIDE" ),
    CAP_DAC_READ_SEARCH     ( "CAP_DAC_READ_SEARCH" ),
    CAP_FOWNER              ( "CAP_FOWNER" ),
    CAP_FSETID              ( "CAP_FSETID " ),
    CAP_KILL                ( "CAP_KILL" ),
    CAP_SETGID              ( "CAP_SETGID" ),
    CAP_SETUID              ( "CAP_SETUID" ),
    CAP_SETPCAP             ( "CAP_SETPCAP" ),
    CAP_LINUX_IMMUTABLE     ( "CAP_LINUX_IMMUTABLE" ),
    CAP_NET_BIND_SERVICE    ( "CAP_NET_BIND_SERVICE" ),
    CAP_NET_BROADCAST       ( "CAP_NET_BROADCAST" ),
    CAP_NET_ADMIN           ( "CAP_NET_ADMIN" ),
    CAP_NET_RAW             ( "CAP_NET_RAW" ),
    CAP_IPC_LOCK            ( "CAP_IPC_LOCK" ),
    CAP_IPC_OWNER           ( "CAP_IPC_OWNER" ),
    CAP_SYS_MODULE          ( "CAP_SYS_MODULE" ),
    CAP_SYS_RAWIO           ( "CAP_SYS_RAWIO" ),
    CAP_SYS_CHROOT          ( "CAP_SYS_CHROOT" ),
    CAP_SYS_PTRACE          ( "CAP_SYS_PTRACE" ),
    CAP_SYS_ADMIN           ( "CAP_SYS_ADMIN" ),
    CAP_SYS_BOOT            ( "CAP_SYS_BOOT" ),
    CAP_SYS_NICE            ( "CAP_SYS_NICE" ),
    CAP_SYS_RESOURCE        ( "CAP_SYS_RESOURCE" ),
    CAP_SYS_TIME            ( "CAP_SYS_TIME" ),
    CAP_SYS_TTY_CONFIG      ( "CAP_SYS_TTY_CONFIG" ),
    CAP_MKNOD               ( "CAP_MKNOD" ),
    CAP_LEASE               ( "CAP_LEASE" ),
    CAP_AUDIT_WRITE         ( "CAP_AUDIT_WRITE" ),
    CAP_AUDIT_CONTROL       ( "CAP_AUDIT_CONTROL" ),
    CAP_SETFCAP             ( "CAP_SETFCAP" ),
    CAP_MAC_OVERRIDE        ( "CAP_MAC_OVERRIDE" ),
    CAP_MAC_ADMIN           ( "CAP_MAC_ADMIN" ),
    NONE                    ( "" );



    /**
     * A factory method.
     */
    public static CapabilityEnumeration fromValue(
                    final String value
                    )
    {
        for (CapabilityEnumeration  e : CapabilityEnumeration.values()) {
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
    CapabilityEnumeration(
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
//CapabilityEnumeration
