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
 * The valid subsystem types that can be specified in the PE file header
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public enum PeSubsystemEnumeration
    implements OvalEnumeration
{

    IMAGE_SUBSYSTEM_UNKNOWN,
    IMAGE_SUBSYSTEM_NATIVE,
    IMAGE_SUBSYSTEM_WINDOWS_GUI,
    IMAGE_SUBSYSTEM_WINDOWS_CUI,
    IMAGE_SUBSYSTEM_OS2_CUI,
    IMAGE_SUBSYSTEM_POSIX_CUI,
    IMAGE_SUBSYSTEM_WINDOWS_CE_GUI,
    IMAGE_SUBSYSTEM_EFI_APPLICATION,
    IMAGE_SUBSYSTEM_EFI_BOOT_SERVICE_DRIVER,
    IMAGE_SUBSYSTEM_EFI_RUNTIME_DRIVER,
    IMAGE_SUBSYSTEM_EFI_ROM,
    IMAGE_SUBSYSTEM_XBOX,
    IMAGE_SUBSYSTEM_WINDOWS_BOOT_APPLICATION;



    /**
     * A factory method.
     */
    public static PeSubsystemEnumeration fromValue(
                    final String value
                    )
    {
        for (PeSubsystemEnumeration  e : PeSubsystemEnumeration.values()) {
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
    PeSubsystemEnumeration()
    {
        value = name();
    }


    PeSubsystemEnumeration(
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
//
