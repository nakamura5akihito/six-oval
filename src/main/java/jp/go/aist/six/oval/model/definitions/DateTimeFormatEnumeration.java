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
package jp.go.aist.six.oval.model.definitions;

import jp.go.aist.six.oval.model.OvalEnumeration;



/**
 * The DateTimeFormatEnumeration defines the different date-time formats
 * that are understood by OVAL.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: DateTimeFormatEnumeration.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public enum DateTimeFormatEnumeration
    implements OvalEnumeration
{

    YEAR_MONTH_DAY      ( "year_month_day" ),
    MONTH_DAY_YEAR      ( "month_day_year" ),
    DAY_MONTH_YEAR      ( "day_month_year" ),
    WIN_FILETIME        ( "win_filetime" ),
    SECONDS_SINCE_EPOCH ( "seconds_since_epoch" )
    ;



    /**
     * A factory method.
     */
    public static DateTimeFormatEnumeration fromValue(
                    final String value
                    )
    {
        for (DateTimeFormatEnumeration  e : DateTimeFormatEnumeration.values()) {
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
    DateTimeFormatEnumeration(
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
//DateTimeFormatEnumeration
