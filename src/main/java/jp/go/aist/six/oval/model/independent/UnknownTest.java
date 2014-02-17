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
package jp.go.aist.six.oval.model.independent;

import java.util.Collection;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.common.CheckEnumeration;
import jp.go.aist.six.oval.model.definitions.StateRefType;
import jp.go.aist.six.oval.model.definitions.SystemObjectRefType;
import jp.go.aist.six.oval.model.definitions.TestType;



/**
 * An unknown test acts as a placeholder for tests whose implementation is unknown.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: UnknownTest.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
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
