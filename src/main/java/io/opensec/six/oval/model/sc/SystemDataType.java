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
package io.opensec.six.oval.model.sc;

import io.opensec.six.oval.model.Container;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;



/**
 * The SystemData is a container for one or more item elements.
 * Each item defines a specific piece of data on the system.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class SystemDataType
    extends Container<ItemType> //{1..*}
{

    private final Set<ItemType>  item = new HashSet<ItemType>();



    /**
     * Constructor.
     */
    public SystemDataType()
    {
    }


    public SystemDataType(
                    final Collection<? extends ItemType> item_list
                    )
    {
//        super( items );

//        item.addAll( item_list );
        _copy( item, item_list );
    }


    public SystemDataType(
                    final ItemType[] item_list
                    )
    {
//        super( items );

        this( Arrays.asList( item_list ) );
    }



    /**
     */
    public void setItem(
                    final Collection<? extends ItemType> item_list
                    )
    {
        reset( item_list );
//        _setElement( item_list );
    }


    public Collection<ItemType> getItem()
    {
        return _getCollection();
    }


//    public boolean addItem(
//                    final ItemType item
//                    )
//    {
//        return add( item );
//    }
//
//
//    public Iterator<ItemType> iterateItem()
//    {
//        return iterator();
//    }



    //**************************************************************
    //  Container
    //**************************************************************

    @Override
    protected Collection<ItemType> _getCollection()
    {
        return item;
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
