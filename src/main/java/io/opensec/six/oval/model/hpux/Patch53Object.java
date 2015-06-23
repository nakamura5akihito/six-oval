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
package io.opensec.six.oval.model.hpux;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.definitions.EntityObjectStringType;
import io.opensec.six.oval.model.definitions.Filter;
import io.opensec.six.oval.model.definitions.Set;
import io.opensec.six.oval.model.definitions.SystemObjectType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



/**
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class Patch53Object
    extends SystemObjectType
{

    //TODO: XSD model.
    // choice( set | sequence () )

    private Set  set;
    //{1..1}

    private Patch53Behaviors  behaviors;
    //{0..1}

    private EntityObjectStringType  swtype;
    //{1..1}

    private EntityObjectStringType  area_patched;
    //{1..1}

    private EntityObjectStringType  patch_base;
    //{1..1}

    private final Collection<Filter>  filter = new ArrayList<Filter>();
    //{0..*}



    /**
     * Constructor.
     */
    public Patch53Object()
    {
        this( null, 0 );
    }


    public Patch53Object(
                    final String id,
                    final int version
                    )
    {
        super( id, version );

        _oval_family = Family.HPUX;
        _oval_component = ComponentType.PATCH53;
    }



    /**
     */
    public void setSet(
                    final Set set
                    )
    {
        this.set = set;
    }


    public Set getSet()
    {
        return set;
    }



    /**
     */
    public void setBehaviors(
                    final Patch53Behaviors behaviors
                    )
    {
        this.behaviors = behaviors;
    }


    public Patch53Behaviors getBehaviors()
    {
        return behaviors;
    }



    /**
     */
    public void setSwtype(
                    final EntityObjectStringType swtype
                    )
    {
        this.swtype = swtype;
    }


    public EntityObjectStringType getSwtype()
    {
        return swtype;
    }



    /**
     */
    public void setAreaPatched(
                    final EntityObjectStringType area_patched
                    )
    {
        this.area_patched = area_patched;
    }


    public EntityObjectStringType getAreaPatched()
    {
        return area_patched;
    }



    /**
     */
    public void setPatchBase(
                    final EntityObjectStringType base
                    )
    {
        patch_base = base;
    }


    public EntityObjectStringType getPatchBase()
    {
        return patch_base;
    }



    /**
     */
    public void setFilter(
                    final Collection<? extends Filter> filters
                    )
    {
        if (filter != filters) {
            filter.clear();
            if (filters != null  &&  filters.size() > 0) {
                filter.addAll( filters );
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



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getSwtype() );
        ref_list.add( getAreaPatched() );
        ref_list.add( getPatchBase() );
        ref_list.addAll( getFilter() );

        return ref_list;
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
        if (!(obj instanceof Patch53Object)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "patch53_object[" + super.toString()
                        + ", set="          + getSet()
                        + ", behaviors="    + getBehaviors()
                        + ", swtype="       + getSwtype()
                        + ", area_patched=" + getAreaPatched()
                        + ", patch_base="   + getPatchBase()
                        + ", filter="       + getFilter()
                        + "]";
    }

}
//
