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

import jp.go.aist.six.oval.model.OvalEnumeration;



/**
 * The valid machine targets that can be specified in the PE file header.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: PeTargetMachineEnumeration.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public enum PeTargetMachineEnumeration
    implements OvalEnumeration
{

    IMAGE_FILE_MACHINE_UNKNOWN,
    IMAGE_FILE_MACHINE_ALPHA,
    IMAGE_FILE_MACHINE_ARM,
    IMAGE_FILE_MACHINE_ALPHA64,
    IMAGE_FILE_MACHINE_I386,
    IMAGE_FILE_MACHINE_IA64,
    IMAGE_FILE_MACHINE_M68K,
    IMAGE_FILE_MACHINE_MIPS16,
    IMAGE_FILE_MACHINE_MIPSFPU,
    IMAGE_FILE_MACHINE_MIPSFPU16,
    IMAGE_FILE_MACHINE_POWERPC,
    IMAGE_FILE_MACHINE_R3000,
    IMAGE_FILE_MACHINE_R4000,
    IMAGE_FILE_MACHINE_R10000,
    IMAGE_FILE_MACHINE_SH3,
    IMAGE_FILE_MACHINE_SH4,
    IMAGE_FILE_MACHINE_THUMB;



    /**
     * A factory method.
     */
    public static PeTargetMachineEnumeration fromValue(
                    final String value
                    )
    {
        for (PeTargetMachineEnumeration  e : PeTargetMachineEnumeration.values()) {
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
    PeTargetMachineEnumeration()
    {
        value = name();
    }


    PeTargetMachineEnumeration(
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
