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
package io.opensec.six.oval.model.unix;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.definitions.EntityObjectStringType;
import io.opensec.six.oval.model.definitions.Filter;
import io.opensec.six.oval.model.definitions.Set;
import io.opensec.six.oval.model.definitions.SystemObjectType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



/**
 * The shadow object is used by a shadow test to define the shadow file to be evaluated.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class ShadowObject
    extends SystemObjectType
{

    //TODO: XSD model.
	// choice(
	//    set
    //    sequence(
    //           username
    //           filter
    //   ))

    private Set  set;
    //{1..1}

    private EntityObjectStringType  username;
    //{1..1}

    private final Collection<Filter>  filter = new ArrayList<Filter>();
    //{0..*}



    /**
     * Constructor.
     */
    public ShadowObject()
    {
        this( null, 0 );
    }


    public ShadowObject(
                    final String id,
                    final int version
                    )
    {
        super( id, version );

//        _oval_platform_type = OvalPlatformType.unix;
//        _oval_component_type = OvalComponentType.shadow;
        _oval_family = Family.UNIX;
        _oval_component = ComponentType.SHADOW;
    }


//    public FileObject(
//                    final String id,
//                    final int version,
//                    final String comment
//                    )
//    {
//        super( id, version, comment );
//    }
//
//
//    public FileObject(
//                    final String id,
//                    final int version,
//                    final String path,
//                    final String filename
//                    )
//    {
//        this( id, version,
//                        new EntityObjectStringType( path ),
//                        new EntityObjectStringType( filename )
//        );
//    }
//
//
//    public FileObject(
//                    final String id,
//                    final int version,
//                    final EntityObjectStringType path,
//                    final EntityObjectStringType filename
//                    )
//    {
//        super( id, version );
//        setPath( path );
//        setFilename( filename );
//    }



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
    public void setUsername(
                    final EntityObjectStringType username
                    )
    {
        this.username = username;
    }


    public EntityObjectStringType getUsername()
    {
        return username;
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
        if (!(obj instanceof ShadowObject)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "shadow_object[" + super.toString()
                        + ", set"       + getSet()
                        + ", username=" + getUsername()
                        + ", filter="   + getFilter()
                        + "]";
    }

}
//ShadowObject
