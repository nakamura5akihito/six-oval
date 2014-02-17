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
package jp.go.aist.six.oval.model.sc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import jp.go.aist.six.oval.model.ElementContainer;



/**
 * A collection of all the objects that have been collected
 * by the system characteristics file.
 * The name "objects" in the OVAL Schema is renamed
 * because the name has the special meaning in Java.
 *
 * <p>Constraints:
 * The combination of id, version, and variable instance of each object is unique in this container.
 * </p>
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: CollectedSystemObjectsType.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class CollectedSystemObjectsType
    extends ElementContainer<SystemObjectType>    //{1..*}
{

    //TODO: Uniqueness constraints, i.e. xsd:key.
    private final Collection<SystemObjectType>  object = new ArrayList<SystemObjectType>();
    //{1..*}



    /**
     * Constructor.
     */
    public CollectedSystemObjectsType()
    {
    }


    public CollectedSystemObjectsType(
                    final Collection<? extends SystemObjectType> object_list
                    )
    {
//        super( objects );

//        object.addAll( object_list );
        _copy( object, object_list );
    }


    public CollectedSystemObjectsType(
                    final SystemObjectType[] object_list
                    )
    {
//        super( objects );

        this( Arrays.asList( object_list ) );
    }



    /**
     */
    public void setObject(
                    final Collection<? extends SystemObjectType> object_list
                    )
    {
        reset( object_list );
//        _setElement( object );
    }


    public void setObject(
                    final SystemObjectType[] object_list
                    )
    {
        reset( object_list );
//        _setElement( object );
    }


    public Collection<SystemObjectType> getObject()
    {
        return _getCollection();
    }



//    public boolean addObject(
//                    final SystemObjectType object
//                    )
//    {
//        return add( object );
//    }
//
//
//    public Iterator<SystemObjectType> iterateObject()
//    {
//        return iterator();
//    }



    //**************************************************************
    //  Container
    //**************************************************************

    @Override
    protected Collection<SystemObjectType> _getCollection()
    {
        return object;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

//    @Override
//    public String toString()
//    {
//        return "["
//                        + _getCollection()
//                        + "]";
//    }

}
//