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
package io.opensec.six.oval.model.windows;

import io.opensec.six.oval.model.OvalEnumeration;



/**
 * The types of a shared resource state.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public enum SharedResourceTypeEnumeration
    implements OvalEnumeration
{

    STYPE_DISKTREE                  ( "STYPE_DISKTREE" ),
    STYPE_DISKTREE_SPECIAL          ( "STYPE_DISKTREE_SPECIAL" ),
    STYPE_DISKTREE_TEMPORARY        ( "STYPE_DISKTREE_TEMPORARY" ),
    STYPE_DISKTREE_SPECIAL_TEMPORARY( "STYPE_DISKTREE_SPECIAL_TEMPORARY" ),
    STYPE_PRINTQ                    ( "STYPE_PRINTQ" ),
    STYPE_PRINTQ_SPECIAL            ( "STYPE_PRINTQ_SPECIAL" ),
    STYPE_PRINTQ_TEMPORARY          ( "STYPE_PRINTQ_TEMPORARY" ),
    STYPE_PRINTQ_SPECIAL_TEMPORARY  ( "STYPE_PRINTQ_SPECIAL_TEMPORARY" ),
    STYPE_DEVICE                    ( "STYPE_DEVICE" ),
    STYPE_DEVICE_SPECIAL            ( "STYPE_DEVICE_SPECIAL" ),
    STYPE_DEVICE_TEMPORARY          ( "STYPE_DEVICE_TEMPORARY" ),
    STYPE_DEVICE_SPECIAL_TEMPORARY  ( "STYPE_DEVICE_SPECIAL_TEMPORARY" ),
    STYPE_IPC                       ( "STYPE_IPC" ),
    STYPE_IPC_SPECIAL               ( "STYPE_IPC_SPECIAL" ),
    STYPE_IPC_TEMPORARY             ( "STYPE_IPC_TEMPORARY" ),
    STYPE_IPC_SPECIAL_TEMPORARY     ( "STYPE_IPC_SPECIAL_TEMPORARY" ),
    STYPE_SPECIAL                   ( "STYPE_SPECIAL" ),
    STYPE_TEMPORARY                 ( "STYPE_TEMPORARY" ),
    NONE                            ( "" );



    /**
     * A factory method.
     */
    public static SharedResourceTypeEnumeration fromValue(
                    final String value
                    )
    {
        for (SharedResourceTypeEnumeration  e : SharedResourceTypeEnumeration.values()) {
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
    SharedResourceTypeEnumeration(
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
// SharedResourceTypeEnumeration
