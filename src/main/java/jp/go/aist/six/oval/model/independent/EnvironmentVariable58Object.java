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
package jp.go.aist.six.oval.model.independent;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.EntityObjectIntType;
import jp.go.aist.six.oval.model.definitions.EntityObjectStringType;
import jp.go.aist.six.oval.model.definitions.Filter;
import jp.go.aist.six.oval.model.definitions.Set;
import jp.go.aist.six.oval.model.definitions.SystemObjectType;



/**
 * The environmentvariable58 object is used by an environmentvariable test
 * to define the specific environment variable(s) and process IDs to be evaluated.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: EnvironmentVariable58Object.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class EnvironmentVariable58Object
    extends SystemObjectType
{
    //TODO: XSD model

    private Set  set;
    //{1..1}


    private EntityObjectIntType  pid;
//    private EntityObjectIntType  pid = new EntityObjectIntType();
    //{1..1, nillable="true"}

    private EntityObjectStringType  name;
    //{1..1}

    private final Collection<Filter>  filter = new ArrayList<Filter>();
    //{0..*}



    /**
     * Constructor.
     */
    public EnvironmentVariable58Object()
    {
        this( null, 0 );
    }


    public EnvironmentVariable58Object(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public EnvironmentVariable58Object(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.INDEPENDENT;
        _oval_component = ComponentType.ENVIRONMENTVARIABLE58;
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
    public void setPid(
                    final EntityObjectIntType pid
                    )
    {
        this.pid = pid;
    }


    public EntityObjectIntType getPid()
    {
        return pid;
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


    public EnvironmentVariable58Object filter(
                    final Filter filter
                    )
    {
        addFilter( filter );
        return this;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getPid() );
        ref_list.add( getName() );
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
        if (!(obj instanceof EnvironmentVariable58Object)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "environmentvariable58_object[" + super.toString()
                        + ", set=" + getSet()
                        + ", pid=" + getPid()
                        + ", name=" + getName()
                        + ", filter=" + getFilter()
                        + "]";
    }

}
// EnvironmentVariable58Object
