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

import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.common.CheckEnumeration;
import jp.go.aist.six.oval.model.definitions.TestType;



/**
 * The visdkmanagedobject test is used to check information about Managed Objects
 * in the VMware Infrastructure.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: ViSdkManagedObjectTest.java 3151 2013-05-14 03:31:09Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class ViSdkManagedObjectTest
    extends TestType
{

    /**
     * Constructor.
     */
    public ViSdkManagedObjectTest()
    {
        this( null, 0 );
    }


    public ViSdkManagedObjectTest(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null, null );
    }


    public ViSdkManagedObjectTest(
                    final String id,
                    final int version,
                    final String comment,
                    final CheckEnumeration check
                    )
    {
        super( id, version, comment, check );

        _oval_family = Family.ESX;
        _oval_component = ComponentType.VISDKMANAGEDOBJECT;
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
        if (!(obj instanceof ViSdkManagedObjectTest)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "visdkmanagedobject_test[" + super.toString() + "]";
    }

}
//
