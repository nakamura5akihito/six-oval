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
package io.opensec.six.oval.model.independent;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.common.CheckEnumeration;
import io.opensec.six.oval.model.definitions.StateRefType;
import io.opensec.six.oval.model.definitions.SystemObjectRefType;
import io.opensec.six.oval.model.definitions.TestType;
import java.util.Collection;



/**
 * An unknown test acts as a placeholder for tests whose implementation is unknown.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class UnknownTest
    extends TestType
{

    /**
     * Constructor.
     */
    public UnknownTest()
    {
        this( null, 0 );
    }


    public UnknownTest(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null, null );
    }


    public UnknownTest(
                    final String id,
                    final int version,
                    final String comment,
                    final CheckEnumeration check
                    )
    {
        super( id, version, comment, check );

//        _oval_platform_type = OvalPlatformType.independent;
//        _oval_component_type = OvalComponentType.unknown;
        _oval_family = Family.INDEPENDENT;
        _oval_component = ComponentType.UNKNOWN;
    }



    //**************************************************************
    //  Test
    //**************************************************************

    @Override
    public void setObject(
                    final SystemObjectRefType ref
                    )
    {
    }


    @Override
    public SystemObjectRefType getObject()
    {
        return null;
    }



    @Override
    public void setState(
                    final Collection<? extends StateRefType> ref
                    )
    {
    }



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
        if (!(obj instanceof UnknownTest)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "unknown_test[" + super.toString() + "]";
    }

}
// UnknownTest
