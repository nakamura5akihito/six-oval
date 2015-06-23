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
package io.opensec.six.oval.model.macos;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.common.CheckEnumeration;
import io.opensec.six.oval.model.definitions.TestType;



/**
 * The authorizationdb_test is used to check the properties of the plist-style XML output
 * from the "security authorizationdb read &gt;right-name&lt;" command, for reading information
 * about rights authorizations on MacOSX.
 * It extends the standard TestType as defined in the oval-definitions-schema and
 * one should refer to the TestType description for more information.
 * The required object element references an authorizationdb_object and the optional
 * state element specifies the data to check.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class AuthorizationDbTest
    extends TestType
{

    /**
     * Constructor.
     */
    public AuthorizationDbTest()
    {
        this( null, 0 );
    }


    public AuthorizationDbTest(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null, null );
    }


    public AuthorizationDbTest(
                    final String id,
                    final int version,
                    final String comment,
                    final CheckEnumeration check
                    )
    {
        super( id, version, comment, check );

        _oval_family = Family.MACOS;
        _oval_component = ComponentType.AUTHORIZATIONDB;
    }


//    public FileTest(
//                    final String id,
//                    final int version,
//                    final String comment,
//                    final CheckEnumeration check,
//                    final SystemObjectRefType object,
//                    final StateRefType[] stateList
//                    )
//    {
//        super( id, version, comment, check, object, stateList );
//    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public int hashCode()
    {
        return super.hashCode();
    }



    @Override
    public boolean equals(
                    final Object obj
                    )
    {
        if (!(obj instanceof AuthorizationDbTest)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "authorizationdb_test[" + super.toString() + "]";
    }

}
//
