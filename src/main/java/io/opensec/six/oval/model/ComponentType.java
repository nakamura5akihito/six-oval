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
package io.opensec.six.oval.model;



/**
 * A OVAL component type.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public enum ComponentType
    implements OvalEnumeration
{
    // independent, linux, unix, windows

    ACCESSTOKEN,                    // windows
    ACCOUNTINFO,                    // macos
    ACTIVEDIRECTORY,                // windows
    ACTIVEDIRECTORY57,              // windows
    AUDITEVENTPOLICY,               // windows
    AUDITEVENTPOLICYSUBCATEGORIES,  // windows
    AUTHORIZATIONDB,				// macos 

    CMDLET,                         // windows

    DISKUTIL,                       // macos
    DNSCACHE,                       // unix, windows
    DPKGINFO,                       // linux
    ENVIRONMENTVARIABLE,            // independent @deprecated
    ENVIRONMENTVARIABLE58,          // independent

    FAMILY,                         // independent
    FILE,                           // unix, windows
    FILEAUDITEDPERMISSIONS,         // windows
    FILEAUDITEDPERMISSIONS53,       // windows
    FILEEFFECTIVERIGHTS,            // windows
    FILEEFFECTIVERIGHTS53,          // windows
    FILEHASH,                       // independent @deprecated
    FILEHASH58,                     // independent
    FILEEXTENDEDATTRIBUTE,          // unix
    FILESET,                        // aix
    FIX,                            // fix

    GCONF,                          // unix
    GLOBAL,                         // ios
    GROUP,                          // windows
    GROUP_SID,                      // windows

    IFLISTENERS,                    // linux
    INETD,                          // unix
    INETLISTENINGSERVERS,           // linux, macos
    INETLISTENINGSERVERS510,        // macos
    INTERFACE,                      // ios, unix, windows
    INTERIM_FIX,                    // aix
    ISAINFO,						// solaris

    LDAP,                           // independent
    LDAP57,                         // independent
    LINE,                           // ios, pixos
    LOCKOUTPOLICY,                  // windows

    METABASE,                       // windows

    NDD,							// solaris
    NO,                             // aix
    NVRAM,                          // macos

    OSLEVEL,                        // aix

    PACKAGE,                        // solaris
    PACKAGECHECK,                   // solaris
    PARTITION,                      // linux
    PASSWORD,                       // unix
    PASSWORDPOLICY,                 // windows
    PATCH,                          // esx, hpux, solaris
    PATCH53,                        // hpux
    PATCH54,                        // solaris
    PATCH56,                        // esx
    PEHEADER,                       // windows
    PLIST,                          // macos
    PLIST510,                       // macos
    PROCESS,                        // unix, windows
    PROCESS58,                      // unix, windows
    PORT,                           // windows
    PRINTEREFFECTIVERIGHTS,         // windows
    PWPOLICY,                       // macos
    PWPOLICY59,                     // macos

    REGISTRY,                       // windows
    REGKEYAUDITEDPERMISSIONS,       // windows
    REGKEYAUDITEDPERMISSIONS53,     // windows
    REGKEYEFFECTIVERIGHTS,          // windows
    REGKEYEFFECTIVERIGHTS53,        // windows
    ROUTINGTABLE,                   // unix
    RPMINFO,                        // linux
    RPMVERIFY,                      // linux
    RPMVERIFYFILE,                  // linux
    RPMVERIFYPACKAGE,               // linux
    RUNLEVEL,                       // unix

    SCCS,                           // unix
    SELINUXBOOLEAN,                 // linux
    SELINUXSECURITYCONTEXT,         // linux
    SERVICE,                        // windows
    SERVICEEFFECTIVERIGHTS,         // windows
    SHADOW,                         // unix
    SHAREDRESOURCE,                 // windows
    SHAREDRESOURCEAUDITEDPERMISSIONS,   // windows
    SHAREDRESOURCEEFFECTIVERIGHTS,  // windows
    SID,                            // windows
    SID_SID,                        // windows
    SLACKWAREPKGINFO,               // linux
    SMF,                            // solaris
    SNMP,                           // ios
    SQL,                            // independent @deprecated
    SQL57,                          // independent
    SWLIST,                         // hpux
    SYSCTL,                         // unix

    TCLSH,                          // ios
    TEXTFILECONTENT,                // independent @deprecated
    TEXTFILECONTENT54,              // independent

    UAC,                            // windows
    UNAME,                          // unix
    UNKNOWN,                        // independent
    USER,                           // windows
    USER_SID,                       // windows
    USER_SID55,                     // windows

    VARIABLE,                       // independent
    VERSION,                        // esx, ios, pixos
    VERSION55,                      // ios
    VISDKMANAGEDOBJECT,             // esx
    VOLUME,                         // windows

    WMI,                            // windows
    WMI57,                          // windows
    WUAUPDATESEARCHER,              // windows

    XINETD,                         // unix
    XMLFILECONTENT;                 // independent



    ////////////////////////////////////////////////////////////////

    /**
     * A factory method.
     */
    public static ComponentType fromValue(
                    final String value
                    )
    {
        return valueOf( value.toUpperCase() );
//        for (Component  e : Component.values()) {
//            if (e.value.equals( value )) {
//                return e;
//            }
//        }
//
//        throw new IllegalArgumentException( value );
    }



    private String  value = null;


    /**
     * Constructor.
     */
    ComponentType()
    {
        value = name().toLowerCase();
    }


    ComponentType(
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



    ////////////////////////////////////////////////////////////////
    // grouped by the OS family, i.e. OVAL namespace
    ////////////////////////////////////////////////////////////////

    public static final ComponentType[]  AIX = new ComponentType[] {
        ComponentType.FILESET,
        ComponentType.FIX,
        ComponentType.INTERIM_FIX,
        ComponentType.NO,
        ComponentType.OSLEVEL
    };


    public static final ComponentType[]  ESX = new ComponentType[] {
        ComponentType.PATCH,
        ComponentType.PATCH56,
        ComponentType.VERSION,
        ComponentType.VISDKMANAGEDOBJECT
    };


    public static final ComponentType[]  HPUX = new ComponentType[] {
        ComponentType.PATCH,
        ComponentType.PATCH53,
        ComponentType.SWLIST
    };


    public static final ComponentType[]  INDEPENDENT = new ComponentType[] {
        ComponentType.ENVIRONMENTVARIABLE,
        ComponentType.ENVIRONMENTVARIABLE58,
        ComponentType.FAMILY,
        ComponentType.FILEHASH,
        ComponentType.FILEHASH58,
        ComponentType.LDAP,
        ComponentType.LDAP57,
        ComponentType.SQL,
        ComponentType.SQL57,
        ComponentType.TEXTFILECONTENT,
        ComponentType.TEXTFILECONTENT54,
        ComponentType.UNKNOWN,
        ComponentType.VARIABLE,
        ComponentType.XMLFILECONTENT
    };


    public static final ComponentType[]  IOS = new ComponentType[] {
        ComponentType.GLOBAL,
        ComponentType.INTERFACE,
        ComponentType.LINE,
        ComponentType.SNMP,
        ComponentType.TCLSH,
        ComponentType.VERSION,
        ComponentType.VERSION55
    };


    public static final ComponentType[]  LINUX = new ComponentType[] {
        ComponentType.DPKGINFO,
        ComponentType.IFLISTENERS,
        ComponentType.INETLISTENINGSERVERS,
        ComponentType.PARTITION,
        ComponentType.RPMINFO,
        ComponentType.RPMVERIFY,
        ComponentType.RPMVERIFYFILE,
        ComponentType.RPMVERIFYPACKAGE,
        ComponentType.SELINUXBOOLEAN,
        ComponentType.SELINUXSECURITYCONTEXT,
        ComponentType.SLACKWAREPKGINFO,
    };


    public static final ComponentType[]  MACOS = new ComponentType[] {
        ComponentType.ACCOUNTINFO,
        ComponentType.DISKUTIL,
        ComponentType.INETLISTENINGSERVERS,
        ComponentType.INETLISTENINGSERVERS510,
        ComponentType.NVRAM,
        ComponentType.PLIST,
        ComponentType.PLIST510,
        ComponentType.PWPOLICY,
        ComponentType.PWPOLICY59
    };


    public static final ComponentType[]  PIXOS = new ComponentType[] {
        ComponentType.LINE,
        ComponentType.VERSION
    };


    public static final ComponentType[]  SOLARIS = new ComponentType[] {
        ComponentType.ISAINFO,
        ComponentType.NDD,
        ComponentType.PACKAGE,
        ComponentType.PACKAGECHECK,
        ComponentType.PATCH,
        ComponentType.PATCH54,
        ComponentType.SMF
    };


    public static final ComponentType[]  UNIX = new ComponentType[] {
        ComponentType.DNSCACHE,
        ComponentType.FILE,
        ComponentType.FILEEXTENDEDATTRIBUTE,
        ComponentType.GCONF,
        ComponentType.INETD,
        ComponentType.INTERFACE,
        ComponentType.PASSWORD,
        ComponentType.PROCESS,
        ComponentType.PROCESS58,
        ComponentType.ROUTINGTABLE,
        ComponentType.RUNLEVEL,
        ComponentType.SCCS,
        ComponentType.SHADOW,
        ComponentType.SYSCTL,
        ComponentType.UNAME,
        ComponentType.XINETD
    };


    public static final ComponentType[]  WINDOWS = new ComponentType[] {
        ComponentType.ACCESSTOKEN,
        ComponentType.ACTIVEDIRECTORY,
        ComponentType.ACTIVEDIRECTORY57,
        ComponentType.AUDITEVENTPOLICY,
        ComponentType.AUDITEVENTPOLICYSUBCATEGORIES,
        ComponentType.CMDLET,
        ComponentType.DNSCACHE,
        ComponentType.FILE,
        ComponentType.FILEAUDITEDPERMISSIONS,
        ComponentType.FILEAUDITEDPERMISSIONS53,
        ComponentType.FILEEFFECTIVERIGHTS,
        ComponentType.FILEEFFECTIVERIGHTS53,
        ComponentType.GROUP,
        ComponentType.GROUP_SID,
        ComponentType.INTERFACE,
        ComponentType.LOCKOUTPOLICY,
        ComponentType.METABASE,
        ComponentType.PASSWORDPOLICY,
        ComponentType.PEHEADER,
        ComponentType.PORT,
        ComponentType.PRINTEREFFECTIVERIGHTS,
        ComponentType.PROCESS,
        ComponentType.PROCESS58,
        ComponentType.REGISTRY,
        ComponentType.REGKEYAUDITEDPERMISSIONS,
        ComponentType.REGKEYAUDITEDPERMISSIONS53,
        ComponentType.REGKEYEFFECTIVERIGHTS,
        ComponentType.REGKEYEFFECTIVERIGHTS53,
        ComponentType.SERVICE,
        ComponentType.SERVICEEFFECTIVERIGHTS,
        ComponentType.SHAREDRESOURCE,
        ComponentType.SHAREDRESOURCEAUDITEDPERMISSIONS,
        ComponentType.SHAREDRESOURCEEFFECTIVERIGHTS,
        ComponentType.SID,
        ComponentType.SID_SID,
        ComponentType.UAC,
        ComponentType.USER,
        ComponentType.USER_SID,
        ComponentType.USER_SID55,
        ComponentType.VOLUME,
        ComponentType.WMI,
        ComponentType.WMI57,
        ComponentType.WUAUPDATESEARCHER
    };

}
//
