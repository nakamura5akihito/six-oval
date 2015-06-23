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
package io.opensec.six.oval.model.common;

import io.opensec.six.oval.model.OvalEnumeration;



/**
 * The Datatype enumeration type defines the legal datatypes
 * that are used to describe the values of individual entities.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public enum DatatypeEnumeration
    implements OvalEnumeration
{

    BINARY            ( "binary" ),
    BOOLEAN           ( "boolean" ),
    EVR_STRING        ( "evr_string" ),
    FILESET_REVISION  ( "fileset_revision" ),
    FLOAT             ( "float" ),
    IOS_VERSION       ( "ios_version" ),
    INT               ( "int" ),
    IPV4_ADDRESS      ( "ipv4_address" ),
    IPV6_ADDRESS      ( "ipv6_address" ),
    STRING            ( "string" ),
    VERSION           ( "version" ),

    RECORD            ( "record", true );



    /**
     * A factory method.
     */
    public static DatatypeEnumeration fromValue(
                    final String value
                    )
    {
        for (DatatypeEnumeration  e : DatatypeEnumeration.values()) {
            if (e.value.equals( value )) {
                return e;
            }
        }

        throw new IllegalArgumentException( value );
    }



    private String  value = null;
    private boolean  complex = false;



    /**
     * Constructor.
     */
    DatatypeEnumeration(
                    final String value
                    )
    {
        this( value, false );
    }


    DatatypeEnumeration(
                    final String value,
                    final boolean complex
                    )
    {
        this.value = value;
        this.complex = complex;
    }



    public String value()
    {
        return value;
    }



    /**
     */
    public boolean isComplex()
    {
        return complex;
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
// DatatypeEnumeration
