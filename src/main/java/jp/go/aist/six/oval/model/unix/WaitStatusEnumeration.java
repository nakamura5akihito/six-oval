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
package jp.go.aist.six.oval.model.unix;

import jp.go.aist.six.oval.model.OvalEnumeration;



/**
 * The set of status types that specify whether the server that is invoked by inetd
 * will take over the listening socket associated with the service,
 * and whether once launched, inetd will wait for that server to exit, if ever,
 * before it resumes listening for new service requests.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: WaitStatusEnumeration.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public enum WaitStatusEnumeration
    implements OvalEnumeration
{

    WAIT        ( "wait" ),
    NOWAIT      ( "nowait" ),
    NONE        ( "" );



    /**
     * A factory method.
     */
    public static WaitStatusEnumeration fromValue(
                    final String value
                    )
    {
        for (WaitStatusEnumeration  e : WaitStatusEnumeration.values()) {
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
    WaitStatusEnumeration(
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
//WaitStatusEnumeration
