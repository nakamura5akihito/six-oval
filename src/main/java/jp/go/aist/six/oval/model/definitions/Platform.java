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
package jp.go.aist.six.oval.model.definitions;

import jp.go.aist.six.oval.model.Name;



/**
 * A platform name.
 *
 * @author	Akihito Nakamura, AIST
 * @version $Id: Platform.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class Platform
    extends Name
    implements Comparable<Platform>
{

//    @Property( "platform" )
//    private String  name;



    /**
     * Constructs an instance.
     */
    public Platform()
    {
    }


    /**
     * Constructs an instance with the spaceified name.
     */
    public Platform(
                    final String name
                    )
    {
        super( name );
    }



    //**************************************************************
    //  Comparable
    //**************************************************************

    public int compareTo(
                    final Platform o
                    )
    {
        return String.CASE_INSENSITIVE_ORDER.compare( getName(), o.getName() );
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
        if (!(obj instanceof Platform)) {
            return false;
        }

        return super.equals( obj );
    }



//    /**
//     * @see java.lang.Object#toString()
//     */
//    @Override
//    public String toString()
//    {
//        return "Platform[" + getName()
//                    + "]";
//    }

}
//public class Platform
//extends NameEntity
//{
//
///**
// * Constructor.
// */
//public Platform()
//{
//}
//
//
///**
// * Constructor.
// */
//public Platform(
//                final String name
//                )
//{
//    super( name );
//}
//
//
//
////**************************************************************
////  java.lang.Object
////**************************************************************
//
//@Override
//public int hashCode()
//{
//    return super.hashCode();
//}
//
//
//
//@Override
//public boolean equals(
//                final Object obj
//                )
//{
//    if (!(obj instanceof Platform)) {
//        return false;
//    }
//
//    return super.equals( obj );
//}
//
//
//
/////**
//// * @see java.lang.Object#toString()
//// */
////@Override
////public String toString()
////{
////    return "Platform[" + getName()
////                + "]";
////}
//
//}
// Platform
