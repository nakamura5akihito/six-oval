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
package io.opensec.six.oval.model.windows;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.definitions.EntityObjectIntType;
import io.opensec.six.oval.model.definitions.EntityObjectStringType;
import io.opensec.six.oval.model.definitions.Filter;
import io.opensec.six.oval.model.definitions.Set;
import io.opensec.six.oval.model.definitions.SystemObjectType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



/**
 * The metabase object is used by a metabase test to define
 * the specific metabase item(s) to be evaluated.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class MetabaseObject
    extends SystemObjectType
{

    // XSD model:
    // choice(
    //          oval-def:set
    //          sequence(
    //                    key
    //                    id
    //                    filter
    //          )
    // )

    private Set  set;
    //{1..1}


    private EntityObjectStringType  key;
    //{1..1}

    private EntityObjectIntType  id = new EntityObjectIntType();
    //{1..1, nillable="true"}


//    private final EntityPropertyMap<MetabaseProperty>  _properties =
//        MetabaseProperty.createPropertyMap();


    private final Collection<Filter>  filter = new ArrayList<Filter>();
    //{0..*}



    /**
     * Constructor.
     */
    public MetabaseObject()
    {
        this( null, 0 );
    }


    public MetabaseObject(
                    final String id,
                    final int version
                    )
    {
        this( id, version, (EntityObjectStringType)null, (EntityObjectIntType)null );
    }


    public MetabaseObject(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        this( id, version );
        setComment( comment );
    }


    public MetabaseObject(
                    final String id,
                    final int version,
                    final String mbKey,
                    final String mbID
                    )
    {
        this( id, version,
                        (mbKey == null ? null : new EntityObjectStringType( mbKey )),
                        (mbID  == null ? null : new EntityObjectIntType( mbID ))
        );
    }


    public MetabaseObject(
                    final String id,
                    final int version,
                    final EntityObjectStringType mbKey,
                    final EntityObjectIntType mbID
                    )
    {
        super( id, version );
        setKey( mbKey );
        setObjectId( mbID );

        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.METABASE;
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
    public void setKey(
                    final EntityObjectStringType key
                    )
    {
        this.key = key;
//        _properties.setProperty( MetabaseProperty.KEY, key );
    }


    public EntityObjectStringType getKey()
    {
        return key;
//        return _properties.getProperty(
//                        MetabaseProperty.KEY, EntityObjectStringType.class );
    }


    public MetabaseObject key(
                    final EntityObjectStringType key
                    )
    {
        setKey( key );
        return this;
    }



    /**
     */
    public void setObjectId(
                    final EntityObjectIntType id
                    )
    {
        this.id = id;
    }


    public EntityObjectIntType getObjectId()
    {
        return id;
    }


    public MetabaseObject objectId(
                    final EntityObjectIntType id
                    )
    {
        setObjectId( id );
        return this;
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


    public MetabaseObject filter(
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

        ref_list.add( getKey() );
        ref_list.add( getObjectId() );
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
        if (!(obj instanceof MetabaseObject)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "metabase_object[" + super.toString()
                        + ", set=" + getSet()
                        + ", key=" + getKey()
                        + ", id=" + getObjectId()
                        + ", filter=" + getFilter()
                        + "]";
    }

}
//
