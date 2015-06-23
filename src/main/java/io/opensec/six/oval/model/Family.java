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
package io.opensec.six.oval.model;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;



/**
 * An operating system family.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public enum Family
    implements OvalEnumeration
{

    AIX(            ComponentType.AIX           ),
//      apache,
//      catos,
//      esx,
    ESX(            ComponentType.ESX           ),
//      freebsd,
    HPUX(           ComponentType.HPUX          ),
    IOS(            ComponentType.IOS           ),
    INDEPENDENT(    ComponentType.INDEPENDENT   ),
    LINUX(          ComponentType.LINUX         ),
    MACOS(          ComponentType.MACOS         ),
    PIXOS(          ComponentType.PIXOS         ),
//        sharepoint,
    SOLARIS(        ComponentType.SOLARIS       ),
    UNIX(           ComponentType.UNIX          ),
    WINDOWS(        ComponentType.WINDOWS       );



    ////////////////////////////////////////////////////////////////

    /**
     * A factory method.
     */
    public static Family fromValue(
                    final String value
                    )
    {
        for (Family  e : Family.values()) {
            if (e.value.equals( value )) {
                return e;
            }
        }

        throw new IllegalArgumentException( value );
    }



    private String  value = null;
    private final Collection<ComponentType>  _components;


    /**
     * Constructor.
     */
    Family(
                    final ComponentType[] components
                    )
    {
        value = name().toLowerCase();
        _components = Collections.unmodifiableCollection( Arrays.asList( components ) );
    }



    /**
     */
    public Collection<ComponentType> getComponents()
    {
        return _components;
    }



    public String value()
    {
        return value;
    }

}
//
