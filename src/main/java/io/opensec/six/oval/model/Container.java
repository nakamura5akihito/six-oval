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
import java.util.Iterator;



/**
 * A generic container which can contain objects.
 * Every element MUST NOT be null.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public abstract class Container<E>
    implements OvalObject
{

    /*
     * (1) Rename the methods and make them public!
     * add(E), addAll(Collection<? extends E>), addAll(E[]),
     * clear(), remove(E),
     * iterator(), contains(E), size(), isEmpty(),
     * toArray(), toArray(T[])
     *
     * (2) Prevent the collection to be exposed, in the subclasses!
     * Implements two kinds of methods: iterateXxx and addXxx.
     * http://www.castor.org/how-to-prevent-collection-from-being-exposed.html
     */

    /**
     * Constructs a container.
     */
    public Container()
    {
    }


//    public Container(
//                    final Collection<? extends E> elements
//                    )
//    {
//        _setElement( elements );
//    }
//
//
//    public Container(
//                    final E[] elements
//                    )
//    {
//        _setElement( elements );
//    }



    ///////////////////////////////////////////////////////////////////////

    /**
     * Returns the internal collection object to hold the elements.
     *
     * @return
     *  internal collection object.
     */
    protected abstract Collection<E> _getCollection();


    /**
     * Reset this container with the specified elements.
     * That is, removes all of the existing elements and add all the specified elements.
     *
     * @param element_list
     *  collection containing the elements to be reset.
     */
    public void reset(
                    final Collection<? extends E> element_list
                    )
    {
        Collection<E>  this_collection = _getCollection();

        if (this_collection != element_list) {
            this_collection.clear();
            if (element_list != null  &&  element_list.size() > 0) {
                addAll( element_list );
            }
        }
    }


    /**
     * Reset this container with the specified elements.
     * That is, removes all of the existing elements and add all the specified elements.
     *
     * @param element_list
     *  collection containing the elements to be reset.
     */
    public void reset(
                    final E[] element_list
                    )
    {
        if (element_list == null) {
            return;
        }

        reset( Arrays.asList( element_list ) );
    }



    /**
     * Appends the specified element to this container, if it is not contained.
     *
     * @param e
     *  element whose presence in this container is to be ensured.
     * @return
     *  true if this container changed as a result of operation.
     * @throws  NullPointerException
     *  if the specified element is null.
     */
    public boolean add(
                    final E e
                    )
    {
        if (e == null) {
            throw new NullPointerException( "adding null element" );
        }

        return _getCollection().add( e );
    }



    /**
     * Appends all of the elements in the specified collection to this container.
     *
     * @param c
     *  collection containing elements to be added to this container.
     * @return
     *  true if this collection changed as a result of the operation.
     * @throws  NullPointerException
     *  if the specified collection contains a null element,
     *  or if the specified collection is null.
     */
    public boolean addAll(
                    final Collection<? extends E> c
                    )
    {
        if (c == null) {
            throw new NullPointerException( "adding null collection" );
        }

        boolean  modified = false;
        Iterator<? extends E>  e = c.iterator();
        while (e.hasNext()) {
            if (add( e.next() )) {
                modified = true;
            }
        }

        return modified;
    }


    /**
     * Appends all of the elements in the specified array to this container.
     *
     * @param a
     *  array containing elements to be added to this container.
     * @return
     *  true if this collection changed as a result of the operation.
     * @throws  NullPointerException
     *  if the specified array contains a null element,
     *  or if the specified array is null.
     */
    public boolean addAll(
                    final E[] a
                    )
    {
        if (a == null) {
            throw new NullPointerException( "adding null array" );
        }

        return addAll( Arrays.asList( a ) );
    }



    /**
     * Removes all of the elements from this container.
     */
    public void clear()
    {
        _getCollection().clear();
    }



    /**
     * Removes a single instance of the specified element from this collection, if it is present.
     *
     * @param e
     *  element to be removed from this container.
     * @return
     *  true if an element is removed.
     * @throws  NullPointerException
     *  if the specified element is null.
     */
    public boolean remove(
                    final E e
                    )
    {
        if (e == null) {
            throw new NullPointerException( "removing null element" );
        }

        return _getCollection().remove( e );
    }



    /**
     * Returns an iterator over the elements in this container.
     *
     * @return
     *  an Iterator over the elements in this container.
     */
    public Iterator<E> iterator()
    {
        return _getCollection().iterator();
    }



    /**
     * Returns true if this container contains the specified element.
     *
     * @param e
     *  element whose presence in this container is to be tested.
     * @return
     *  true if this container contains the specified element.
     */
    public boolean contains(
                    final E e
                    )
    {
        if (e == null) {
            throw new NullPointerException( "testing null element" );
        }

        return _getCollection().contains( e );
    }



    /**
     * Returns the number of elements in this container.
     *
     * @return
     *  the number of elements in this container.
     */
    public int size()
    {
        return _getCollection().size();
    }



    /**
     * Returns true if this container contains no elements.
     *
     * @return
     *  true if this container contains no elements.
     */
    public boolean isEmpty()
    {
        return (size() == 0);
    }



    /**
     * Returns an array containing all of the elements in this container.
     *
     * @return
     *  an array containing all of the elements in this container.
     */
    public Object[] toArray()
    {
        return _getCollection().toArray();
    }


    /**
     * Returns an array containing all of the elements in this container;
     * the runtime type of the returned array is that of the specified array.
     *
     * @param a
     *  the array into which the elements of this collection are to be stored,
     *  if it is big enough;
     *  otherwise, a new array of the same runtime type is allocated for this purpose.
     * @return
     *  an array containing all of the elements in this container.
     */
    public <T> T[] toArray(
                    final T[] a
                    )
    {
        return _getCollection().toArray( a );
    }



    /**
     * A utility function.
     */
    protected static <T> void _copy(
                    final Collection<T> dst,
                    final Collection<? extends T> src
                    )
    {
        for (T  e : src) {
            if (e != null) {
                dst.add( e );
            }
        }
    }



    //*********************************************************************
    //  java.lang.Object
    //*********************************************************************

    @Override
    public int hashCode()
    {
        return _getCollection().hashCode();
    }



    @Override
    public boolean equals(
                    final Object obj
                    )
    {
        if (this == obj) {
            return true;
        }

        if (! Container.class.isInstance( obj )) {
            return false;
        }

        @SuppressWarnings( "unchecked" )
        Container<E>  other = (Container<E>)obj;
        Collection<E>  other_elements = other._getCollection();
        Collection<E>   this_elements =  this._getCollection();
        if (this_elements == other_elements
                        ||  (this_elements != null
                                        &&  this_elements.equals( other_elements ))) {
            return true;
        }

        return false;
    }



    @Override
    public String toString()
    {
        return String.valueOf( _getCollection() );
    }

}
//
