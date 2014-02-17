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
package jp.go.aist.six.oval.model.windows;

import jp.go.aist.six.oval.model.OvalEnumeration;



/**
 * The different types of information that an active directory attribute can represents.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: AdstypeEnumeration.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public enum AdstypeEnumeration
    implements OvalEnumeration
{

    ADSTYPE_INVALID                 ( "ADSTYPE_INVALID" ),
    ADSTYPE_DN_STRING               ( "ADSTYPE_DN_STRING" ),
    ADSTYPE_CASE_EXACT_STRING       ( "ADSTYPE_CASE_EXACT_STRING" ),
    ADSTYPE_CASE_IGNORE_STRING      ( "ADSTYPE_CASE_IGNORE_STRING" ),
    ADSTYPE_PRINTABLE_STRING        ( "ADSTYPE_PRINTABLE_STRING" ),
    ADSTYPE_NUMERIC_STRING          ( "ADSTYPE_NUMERIC_STRING" ),
    ADSTYPE_BOOLEAN                 ( "ADSTYPE_BOOLEAN" ),
    ADSTYPE_INTEGER                 ( "ADSTYPE_INTEGER" ),
    ADSTYPE_OCTET_STRING            ( "ADSTYPE_OCTET_STRING" ),
    ADSTYPE_UTC_TIME                ( "ADSTYPE_UTC_TIME" ),
    ADSTYPE_LARGE_INTEGER           ( "ADSTYPE_LARGE_INTEGER" ),
    ADSTYPE_PROV_SPECIFIC           ( "ADSTYPE_PROV_SPECIFIC" ),
    ADSTYPE_OBJECT_CLASS            ( "ADSTYPE_OBJECT_CLASS" ),
    ADSTYPE_CASEIGNORE_LIST         ( "ADSTYPE_CASEIGNORE_LIST" ),
    ADSTYPE_OCTET_LIST              ( "ADSTYPE_OCTET_LIST" ),
    ADSTYPE_PATH                    ( "ADSTYPE_PATH" ),
    ADSTYPE_POSTALADDRESS           ( "ADSTYPE_POSTALADDRESS" ),
    ADSTYPE_TIMESTAMP               ( "ADSTYPE_TIMESTAMP" ),
    ADSTYPE_BACKLINK                ( "ADSTYPE_BACKLINK" ),
    ADSTYPE_TYPEDNAME               ( "ADSTYPE_TYPEDNAME" ),
    ADSTYPE_HOLD                    ( "ADSTYPE_HOLD" ),
    ADSTYPE_NETADDRESS              ( "ADSTYPE_NETADDRESS" ),
    ADSTYPE_REPLICAPOINTER          ( "ADSTYPE_REPLICAPOINTER" ),
    ADSTYPE_FAXNUMBER               ( "ADSTYPE_FAXNUMBER" ),
    ADSTYPE_EMAIL                   ( "ADSTYPE_EMAIL" ),
    ADSTYPE_NT_SECURITY_DESCRIPTOR  ( "ADSTYPE_NT_SECURITY_DESCRIPTOR" ),
    ADSTYPE_UNKNOWN                 ( "ADSTYPE_UNKNOWN" ),
    ADSTYPE_DN_WITH_BINARY          ( "ADSTYPE_DN_WITH_BINARY" ),
    ADSTYPE_DN_WITH_STRING          ( "ADSTYPE_DN_WITH_STRING" )
    ;



    /**
     * A factory method.
     */
    public static AdstypeEnumeration fromValue(
                    final String value
                    )
    {
        for (AdstypeEnumeration  e : AdstypeEnumeration.values()) {
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
    AdstypeEnumeration(
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
//AdstypeEnumeration
