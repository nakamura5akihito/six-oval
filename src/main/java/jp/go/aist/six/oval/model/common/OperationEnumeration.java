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
package jp.go.aist.six.oval.model.common;

import jp.go.aist.six.oval.model.OvalEnumeration;



/**
 * The Operation enumeration type defines acceptable operations.
 * Each operation defines how to compare entities against their actual values.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: OperationEnumeration.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public enum OperationEnumeration
    implements OvalEnumeration
{

    EQUALS                      ( "equals" ),
    NOT_EQUAL                   ( "not equal" ),
    CASE_INSENSITIVE_EQUALS     ( "case insensitive equals" ),
    CASE_INSENSITIVE_NOT_EQUAL  ( "case insensitive not equal" ),
    GREATER_THAN                ( "greater than" ),
    LESS_THAN                   ( "less than" ),
    GREATER_THAN_OR_EQUAL       ( "greater than or equal" ),
    LESS_THAN_OR_EQUAL          ( "less than or equal" ),
    BITWISE_AND                 ( "bitwise and" ),
    BITWISE_OR                  ( "bitwise or" ),
    PATTERN_MATCH               ( "pattern match" ),
    SUBSET_OF                   ( "subset of" ),
    SUPERSET_OF                 ( "superset of" );


    /**
     * A factory method.
     */
    public static OperationEnumeration fromValue(
                    final String value
                    )
    {
        for (OperationEnumeration  e : OperationEnumeration.values()) {
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
    OperationEnumeration(
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
// OperationEnumeration
