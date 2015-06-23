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
package io.opensec.six.oval.model.independent;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.sc.EntityItemRecordType;
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.ItemType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



/**
 * The SQL57 item outlines information collected from a database via an SQL query.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class Sql57Item
    extends ItemType
{

    private EntityItemEngineType  engine;
    //{0..1}

    private EntityItemStringType  version;
    //{0..1}

    private EntityItemStringType  connection_string;
    //{0..1}

    private EntityItemStringType  sql;
    //{0..1}

    private final Collection<EntityItemRecordType>  result =
                    new ArrayList<EntityItemRecordType>();
    //{0..*}



    /**
     * Constructor.
     */
    public Sql57Item()
    {
        this( 0 );
    }


    public Sql57Item(
                    final int id
                    )
    {
        super( id );

        _oval_family = Family.INDEPENDENT;
        _oval_component = ComponentType.SQL57;
    }



    /**
     */
    public void setEngine(
                    final EntityItemEngineType engine
                    )
    {
        this.engine = engine;
    }


    public EntityItemEngineType getEngine()
    {
        return engine;
    }



    /**
     */
    public void setVersion(
                    final EntityItemStringType version
                    )
    {
        this.version = version;
    }


    public EntityItemStringType getVersion()
    {
        return version;
    }



    /**
     */
    public void setConnectionString(
                    final EntityItemStringType connection_string
                    )
    {
        this.connection_string = connection_string;
    }


    public EntityItemStringType getConnectionString()
    {
        return connection_string;
    }



    /**
     */
    public void setSql(
                    final EntityItemStringType sql
                    )
    {
        this.sql = sql;
    }


    public EntityItemStringType getSql()
    {
        return sql;
    }



    /**
     */
    public void setResult(
                    final Collection<? extends EntityItemRecordType> results
                    )
    {
        if (results != result ) {
            result.clear();
            if (results != null  &&  results.size() > 0) {
                result.addAll( results );
            }
        }
    }


    public Collection<EntityItemRecordType> getResult()
    {
        return result;
    }


    public Iterator<EntityItemRecordType> iterateResult()
    {
        return result.iterator();
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
        if (!(obj instanceof Sql57Item)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "sql57_item[" + super.toString()
                        + ", engine="               + getEngine()
                        + ", version="              + getVersion()
                        + ", connection_string="    + getConnectionString()
                        + ", sql="                  + getSql()
                        + ", result="               + getResult()
                        + "]";
    }

}
//
