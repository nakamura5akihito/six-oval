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

import io.opensec.six.oval.model.OvalObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;




/**
 * The Set enables complex objects to be described.
 * It is a recursive element in that each set element can contain
 * additional set elements as children.
 *
 * @author	Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class Set
    implements OvalObject
{
    /* TODO: XSD model
     * <choice>
     *   <sequence>
     *     <element ref="set" 1..2 />
     *   </sequence>
     *   <sequence>
     *     <element name="object_reference" 1..2 />
     *     <element ref="filter" 0..* />
     *   </sequence>
     * </choice>
     */

    private final Collection<Set>  set = new ArrayList<Set>( 2 );
    //{1..2}


    private final Collection<String>  object_reference = new ArrayList<String>( 2 );
    //{1..2}


    private final Collection<Filter>  filter = new ArrayList<Filter>();
    //{0..*}


    public static final SetOperatorEnumeration  DEFAULT_SET_OPERATOR =
        SetOperatorEnumeration.UNION;

    private SetOperatorEnumeration  set_operator;
    //{optional, default='UNION'}



    /**
     * Constructor.
     */
    public Set()
    {
    }




    /**
     */
    public void setSet(
                    final Collection<? extends Set> filters
                    )
    {
        if (set != filters) {
            int  size = (filters == null ? 0 : filters.size());
            if (filters != null  &&  size > 2) {
                throw new IllegalArgumentException(
                                "invalid number of child 'set' (maxOccurs=2): "
                                + size );
            }

            filter.clear();
            if (size > 0) {
                set.addAll( filters );
            }
        }
    }


    public boolean addSet(
                    final Set set
                    )
    {
        if (set == null) {
            return false;
        }

        if (this.set.size() >= 2) {
            throw new IllegalStateException(
                            "no more child 'set' can't be added (maxOccurs=2)");
        }

        return this.set.add( set );
    }


    public Collection<Set> getSet()
    {
        return set;
    }


    public Iterator<Set> iterateSet()
    {
        return set.iterator();
    }



    /**
     */
    public void setObjectReference(
                    final Collection<String> object_references
                    )
    {
        if (object_reference != object_references) {
            int  size = (object_references == null ? 0 : object_references.size());
            if (object_references != null  &&  size > 2) {
                throw new IllegalArgumentException(
                                "invalid number of child 'object_reference' (maxOccurs=2): "
                                + size );
            }

            object_reference.clear();
            if (size > 0) {
                object_reference.addAll( object_references );
            }
        }
    }


    public boolean addObjectReference(
                    final String object_reference
                    )
    {
        if (object_reference == null) {
            return false;
        }

        if (this.object_reference.size() >= 2) {
            throw new IllegalStateException(
                            "no more child 'object_reference' can't be added (maxOccurs=2)");
        }

        return this.object_reference.add( object_reference );
    }


    public Collection<String> getObjectReference()
    {
        return object_reference;
    }


    public Iterator<String> iterateObjectReference()
    {
        return object_reference.iterator();
    }



    /**
     */
    public void setFilter(
                    final Collection<? extends Filter> filterSeq
                    )
    {
        if (filter != filterSeq) {
            filter.clear();
            if (filterSeq != null  &&  filterSeq.size() > 0) {
                filter.addAll( filterSeq );
            }
        }
    }


    public boolean addFilter(
                    final Filter filter
                    )
    {
        if (filter == null) {
            return false;
        }

        return this.filter.add( filter );
    }


    public Collection<Filter> getFilter()
    {
        return filter;
    }


    public Iterator<Filter> iterateFilter()
    {
        return filter.iterator();
    }



    /**
     */
    public void setSetOperator(
                    final SetOperatorEnumeration action
                    )
    {
        set_operator = action;
    }


    public SetOperatorEnumeration getSetOperator()
    {
        return set_operator;
    }


    public static SetOperatorEnumeration setOperator(
                    final Set obj
                    )
    {
        SetOperatorEnumeration  set_operator = obj.getSetOperator();
        return (set_operator == null ? DEFAULT_SET_OPERATOR : set_operator);
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public int hashCode()
    {
        final int  prime = 37;
        int  result = 17;

        result = prime * result + setOperator( this ).hashCode();

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

        if (!(obj instanceof Set)) {
            return false;
        }

        Set  other = (Set)obj;
        if (setOperator( this ) == setOperator( other )) {
            return true;
        }

        return false;
    }



    @Override
    public String toString()
    {
        return "set[set=" + getSet()
             + ", object_reference=" + getObjectReference()
             + ", filter=" + getFilter()
             + ", set_operator=" + getSetOperator()
             + "]";
    }

}
//Set
