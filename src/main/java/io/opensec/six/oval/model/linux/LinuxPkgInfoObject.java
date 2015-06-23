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
package io.opensec.six.oval.model.linux;

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
public abstract class LinuxPkgInfoObject
    extends SystemObjectType
{

    // xsd:choice


    private Set  set;
    //{1..1}


    private EntityObjectStringType  name;
    //{1..1}


    private final Collection<Filter>  filter = new ArrayList<Filter>();
    //{0..*}



    /**
     * Constructor.
     */
    public LinuxPkgInfoObject()
    {
        this( null, 0 );
    }


    public LinuxPkgInfoObject(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public LinuxPkgInfoObject(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );
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
    public void setName(
                    final EntityObjectStringType name
                    )
    {
        this.name = name;
    }


    public EntityObjectStringType getName()
    {
        return name;
    }



    /**
     */
    public void setFilter(
                    final Collection<? extends Filter> filterList
                    )
    {
        if (filter != filterList) {
            filter.clear();
            if (filterList != null  &&  filterList.size() > 0) {
                filter.addAll( filterList );
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



    //**************************************************************
    //  SystemObjectType
    //**************************************************************

//    @Override
//    public Iterator<EntityAttributeGroup> iterateProperties()
//    {
//        EntityAttributeGroup  p = getName();
//        return Collections.singletonList( p ).iterator();
//    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        EntityObjectStringType  name = getName();
        Collection<Filter>  filter = getFilter();
        return "name=" + (name == null ? null : name.getContent())
                        + ", filter=" + filter
                        + ", " + super.toString();
    }

}
// LinuxPkgInfoObject
