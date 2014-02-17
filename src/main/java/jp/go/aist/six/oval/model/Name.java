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
package jp.go.aist.six.oval.model;



/**
 * A generic name used in the OVAL documents.
 *
 * @author	Akihito Nakamura, AIST
 * @version $Id: Name.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public abstract class Name
    implements OvalObject
//  implements Comparable<T> in class T
{

    private String  name;



    /**
     * Constructs an instance.
     */
    public Name()
    {
    }


    public Name(
                    final String name
                    )
    {
        setName( name );
    }



    /**
     */
    public void setName(
                    final String name
                    )
    {
        this.name = name;
    }


    public String getName()
    {
        return name;
    }



//    //**************************************************************
//    //  Comparable
//    //**************************************************************
//
//    @Override
//    public int compareTo(
//                    final NameEntity o
//                    )
//    {
//        return String.CASE_INSENSITIVE_ORDER.compare( getName(), o.getName() );
//    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public int hashCode()
    {
        final int  prime = 37;
        int  result = 17;

        String  name = getName();
        if (name != null) {
            name = name.toLowerCase();
        }
        result = prime * result + ((name == null) ? 0 : name.hashCode());

        return result;
    }



    @Override
    public boolean equals(
                    final Object obj
                    )
    {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Name)) {
            return false;
        }

        Name  other = (Name)obj;
        String  other_name = other.getName();
        String   this_name =  this.getName();
        if (this_name == other_name
                        ||  (this_name != null
                                        &&  this_name.equalsIgnoreCase( other_name ))) {
                return true;
        }

        return false;
    }



    @Override
    public String toString()
    {
        return getName();
    }

}
//
