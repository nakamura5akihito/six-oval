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
package io.opensec.six.oval.model.definitions;

import io.opensec.six.oval.model.ElementContainer;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.mongodb.morphia.annotations.Reference;



/**
 * A container for one or more Object (SystemObject) instances.
 * The name "objects" in the OVAL Schema is renamed
 * because the name has the special meaning in Java.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class SystemObjectsType
    extends ElementContainer<SystemObjectType>  //{1..*}
//extends Container<SystemObject>  //{1..*}
{

    @Reference
    private final Set<SystemObjectType>  object = new HashSet<SystemObjectType>();



    /**
     * Constructor.
     */
    public SystemObjectsType()
    {
    }


    public SystemObjectsType(
                    final Collection<? extends SystemObjectType> object_list
                    )
    {
//        super( objects );

//        object.addAll( object_list );
        _copy( object, object_list );
    }


    public SystemObjectsType(
                    final SystemObjectType[] object_list
                    )
    {
//        super( objects );

        this( Arrays.asList( object_list ) );
    }



    public void setObject(
                    final Collection<? extends SystemObjectType> object_list
                    )
    {
        reset( object_list );
//        _setElement( object_list );
    }


    public void setObject(
                    final SystemObjectType[] object_list
                    )
    {
        reset( object_list );
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

}
//
