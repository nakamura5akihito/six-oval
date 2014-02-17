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
 * The set of encrypt methods used for protected passwords in a shadow file.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: EncryptMethodEnumeration.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public enum EncryptMethodEnumeration
    implements OvalEnumeration
{

    DES         ( "DES" ),
    BSDI        ( "BSDi" ),
    MD5         ( "MD5" ),
    BLOWFISH    ( "Blowfish" ),
    SUN_MD5     ( "Sun MD5" ),
    SHA_256     ( "SHA-256" ),
    SHA_512     ( "SHA-512" ),
    NONE        ( "" );



    /**
     * A factory method.
     */
    public static EncryptMethodEnumeration fromValue(
                    final String value
                    )
    {
        for (EncryptMethodEnumeration  e : EncryptMethodEnumeration.values()) {
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
    EncryptMethodEnumeration(
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
//EncryptMethodEnumeration
