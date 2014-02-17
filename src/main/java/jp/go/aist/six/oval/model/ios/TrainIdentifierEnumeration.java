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
package jp.go.aist.six.oval.model.ios;

import jp.go.aist.six.oval.model.OvalEnumeration;



/**
 * This enumeration defines the possible types of trains in a Cisco IOS release.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: TrainIdentifierEnumeration.java 3193 2013-07-05 06:50:45Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public enum TrainIdentifierEnumeration
    implements OvalEnumeration
{

    MAINLINE        ( "mainline" ),
    T               ( "T" ),
    S               ( "S" ),
    E               ( "E" ),
    B               ( "B" ),
    NONE            ( "" );



    /**
     * A factory method.
     */
    public static TrainIdentifierEnumeration fromValue(
                    final String value
                    )
    {
        for (TrainIdentifierEnumeration  e : TrainIdentifierEnumeration.values()) {
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
    TrainIdentifierEnumeration(
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
