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
package jp.go.aist.six.oval.model.windows;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.EntityObjectStringType;
import jp.go.aist.six.oval.model.definitions.Filter;
import jp.go.aist.six.oval.model.definitions.Set;
import jp.go.aist.six.oval.model.definitions.SystemObjectType;



/**
 * The activedirectory57_object is used by an active directory test to define those objects
 * to evaluated based on a specified state.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: ActiveDirectory57Object.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class ActiveDirectory57Object
    extends SystemObjectType
{

    // xsd:choice

    private Set  set;


    private EntityObjectNamingContextType  naming_context;
    //{1..1}

    private EntityObjectStringType  relative_dn;
//    private EntityObjectStringType  relative_dn = new EntityObjectStringType();
    //{1..1, nillable="true"}

    private EntityObjectStringType  attribute;
//    private EntityObjectStringType  attribute = new EntityObjectStringType();
    //{1..1, nillable="true"}

    private final Collection<Filter>  filter = new ArrayList<Filter>();
    //{0..*}



    /**
     * Constructor.
     */
    public ActiveDirectory57Object()
    {
        this( null, 0 );
    }


    public ActiveDirectory57Object(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public ActiveDirectory57Object(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        this( id, version, comment,
                        (EntityObjectNamingContextType)null,
                        (EntityObjectStringType)null,
                        (EntityObjectStringType)null
                        );
    }


    public ActiveDirectory57Object(
                    final String id,
                    final int version,
                    final String comment,
                    final NamingContextEnumeration naming_context,
                    final String relative_dn,
                    final String attribute
                    )
    {
        this( id, version, comment,
                        (naming_context == null ? null : (new EntityObjectNamingContextType( naming_context.value() ))),
                        (relative_dn  == null ? null : (new EntityObjectStringType( relative_dn ))),
                        (attribute == null ? null : (new EntityObjectStringType( attribute )))
        );
    }


    public ActiveDirectory57Object(
                    final String id,
                    final int version,
                    final String comment,
                    final EntityObjectNamingContextType naming_context,
                    final EntityObjectStringType relative_dn,
                    final EntityObjectStringType attribute
                    )
    {
        super( id, version, comment );
        setNamingContext( naming_context );
        setRelativeDn( relative_dn );
        setAttribute( attribute );

        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.ACTIVEDIRECTORY57;
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
    public void setNamingContext(
                    final EntityObjectNamingContextType naming_context
                    )
    {
        this.naming_context = naming_context;
    }


    public EntityObjectNamingContextType getNamingContext()
    {
        return naming_context;
    }




    public void setRelativeDn(
                    final EntityObjectStringType relative_dn
                    )
    {
        this.relative_dn = relative_dn;
    }


    public EntityObjectStringType getRelativeDn()
    {
        return relative_dn;
    }



    public void setAttribute(
                    final EntityObjectStringType attribute
                    // nillable ="true"
                    )
    {
        this.attribute = attribute;
    }


    public EntityObjectStringType getAttribute()
    {
        return attribute;
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

        ref_list.add( getNamingContext() );
        ref_list.add( getRelativeDn() );
        ref_list.add( getAttribute() );

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
        if (!(obj instanceof ActiveDirectory57Object)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "activedirectory57_object[" + super.toString()
                        + ", set="              + getSet()
                        + ", naming_context="   + getNamingContext()
                        + ", relative_dn="      + getRelativeDn()
                        + ", attribute="        + getAttribute()
                        + "]";
    }

}
//
