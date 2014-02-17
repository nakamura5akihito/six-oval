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
package jp.go.aist.six.oval.model.windows;

import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.SystemObjectType;



/**
 * The lockout policy object is used by a lockout policy test to define
 * those objects to evaluated based on a specified state.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: LockoutPolicyObject.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class LockoutPolicyObject
    extends SystemObjectType
{

    /**
     * Constructor.
     */
    public LockoutPolicyObject()
    {
        this( null, 0 );
    }


    public LockoutPolicyObject(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public LockoutPolicyObject(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.lockoutpolicy;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.LOCKOUTPOLICY;
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
        if (!(obj instanceof LockoutPolicyObject)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "lockoutpolicy_object[" + super.toString()
                        + "]";
    }

}
//LockoutPolicyObject
