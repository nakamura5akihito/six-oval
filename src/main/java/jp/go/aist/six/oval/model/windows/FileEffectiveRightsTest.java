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
import jp.go.aist.six.oval.model.common.CheckEnumeration;
import jp.go.aist.six.oval.model.definitions.StateRefType;
import jp.go.aist.six.oval.model.definitions.SystemObjectRefType;
import jp.go.aist.six.oval.model.definitions.TestType;



/**
 * The file effective rights test is used to check
 * the effective rights associated with Windows files.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: FileEffectiveRightsTest.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
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
