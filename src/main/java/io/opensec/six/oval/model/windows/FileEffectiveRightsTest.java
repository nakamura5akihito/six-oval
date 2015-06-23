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

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.common.CheckEnumeration;
import io.opensec.six.oval.model.definitions.StateRefType;
import io.opensec.six.oval.model.definitions.SystemObjectRefType;
import io.opensec.six.oval.model.definitions.TestType;



/**
 * The file effective rights test is used to check
 * the effective rights associated with Windows files.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 * @deprecated Deprecated as of version 5.3:
 *             Replaced by the fileeffectiverights53 test and
 *             will be removed in version 6.0 of the language.
 */
@Deprecated
public class FileEffectiveRightsTest
    extends TestType
{

    /**
     * Constructor.
     */
    public FileEffectiveRightsTest()
    {
        this( null, 0 );
    }


    public FileEffectiveRightsTest(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null, null );
    }


    public FileEffectiveRightsTest(
                    final String id,
                    final int version,
                    final String comment,
                    final CheckEnumeration check
                    )
    {
        this( id, version, comment, check, null, null );
    }


    public FileEffectiveRightsTest(
                    final String id,
                    final int version,
                    final String comment,
                    final CheckEnumeration check,
                    final SystemObjectRefType object,
                    final StateRefType[] stateList
                    )
    {
        super( id, version, comment, check, object, stateList );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.fileeffectiverights;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.FILEEFFECTIVERIGHTS;
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
        if (!(obj instanceof FileEffectiveRightsTest)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "fileeffectiverights_test[" + super.toString() + "]";
    }

}
//FileEffectiveRightsTest
