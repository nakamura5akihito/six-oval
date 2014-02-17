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
 * The RecurseFileSystemEnumeration defines the file system limitation of any recursion,
 * either 'local' limiting data collection to local file systems
 * (as opposed to file systems mounted from an external system),
 * or 'defined' to keep any recursion within the file system
 * that the file_object (path+filename) has specified.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: RecurseFileSystemEnumeration.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public enum RecurseFileSystemEnumeration
    implements OvalEnumeration
{

    ALL       ( "all" ),
    LOCAL     ( "local" ),
    DEFINED   ( "defined" );



    /**
     * A factory method.
     */
    public static RecurseFileSystemEnumeration fromValue(
                    final String value
                    )
    {
        for (RecurseFileSystemEnumeration  e : RecurseFileSystemEnumeration.values()) {
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
    RecurseFileSystemEnumeration(
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
// RecurseFileSystemEnumeration
