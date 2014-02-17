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
import jp.go.aist.six.oval.model.definitions.EntityObjectStringType;
import jp.go.aist.six.oval.model.definitions.Filter;
import jp.go.aist.six.oval.model.definitions.Set;
import jp.go.aist.six.oval.model.definitions.SystemObjectType;



/**
 * The SQL57 object is used by a sql test to define the specific database
 * and query to be evaluated.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: Sql57Object.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class Sql57Object
    extends SystemObjectType
{
    // XSD model:
    // choice(
    //         set
    //         sequence(
    //                   engine
    //                   version
    //                   connection_string
    //                   sql
    //                   filter
    //          )
    // )

    private Set  set;

    private EntityObjectEngineType  engine;
    //{1..1}

    private EntityObjectStringType  version;
    //{1..1}

    private EntityObjectStringType  connection_string;
    //{1..1}

    private EntityObjectStringType  sql;
    //{1..1}

    private final Collection<Filter>  filter = new ArrayList<Filter>();
    //{0..*}



    /**
     * Constructor.
     */
    public Sql57Object()
    {
        this( null, 0 );
    }


    public Sql57Object(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public Sql57Object(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.INDEPENDENT;
        _oval_component = ComponentType.SQL57;
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
    public void setEngine(
                    final EntityObjectEngineType engine
                    )
    {
        this.engine = engine;
    }


    public EntityObjectEngineType getEngine()
    {
        return engine;
    }



    /**
     */
    public void setVersion(
                    final EntityObjectStringType version
                    )
    {
        this.version = version;
    }


    public EntityObjectStringType getVersion()
    {
        return version;
    }



    /**
     */
    public void setConnectionString(
                    final EntityObjectStringType connection_string
                    )
    {
        this.connection_string = connection_string;
    }


    public EntityObjectStringType getConnectionString()
    {
        return connection_string;
    }



    /**
     */
    public void setSql(
                    final EntityObjectStringType sql
                    )
    {
        this.sql = sql;
    }


    public EntityObjectStringType getSql()
    {
        return sql;
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



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getEngine() );
        ref_list.add( getVersion() );
        ref_list.add( getConnectionString() );
        ref_list.add( getSql() );
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
        if (!(obj instanceof Sql57Object)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "sql57_object[" + super.toString()
                        + ", set="              + getSet()
                        + ", engine="           + getEngine()
                        + ", version="          + getVersion()
                        + ", conection_string=" + getConnectionString()
                        + ", sql="              + getSql()
                        + ", filter="           + getFilter()
                       + "]";
    }

}
//
