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
 * The Check enumeration type defines acceptable check values,
 * which are used to determine the final result of something
 * based on the results of individual components.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public enum CheckEnumeration
    implements OvalEnumeration
{

    ALL           ( "all" ),
    AT_LEAST_ONE  ( "at least one" ),
    NONE_EXIST    ( "none exist" ),
    NONE_SATISFY  ( "none satisfy" ),
    ONLY_ONE      ( "only one" );



    /**
     * A factory method.
     */
    public static CheckEnumeration fromValue(
                    final String value
                    )
    {
        for (CheckEnumeration  e : CheckEnumeration.values()) {
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
    CheckEnumeration(
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
// CheckEnumeration
