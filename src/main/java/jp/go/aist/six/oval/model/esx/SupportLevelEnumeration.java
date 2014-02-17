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
package jp.go.aist.six.oval.model.esx;

import jp.go.aist.six.oval.model.OvalEnumeration;



/**
 * This enumeration defines a specific set of values that describe the support level
 * of a given ESX Server patch.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: SupportLevelEnumeration.java 3152 2013-05-14 10:46:20Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public enum SupportLevelEnumeration
    implements OvalEnumeration
{

    C           ( "C" ),
    D           ( "D" ),
    G           ( "G" ),
    H           ( "H" ),
    NONE        ( "" );



    /**
     * A factory method.
     */
    public static SupportLevelEnumeration fromValue(
                    final String value
                    )
    {
        for (SupportLevelEnumeration  e : SupportLevelEnumeration.values()) {
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
    SupportLevelEnumeration(
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
