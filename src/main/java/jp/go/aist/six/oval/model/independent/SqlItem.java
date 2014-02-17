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
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.sc.EntityItemAnySimpleType;
import jp.go.aist.six.oval.model.sc.EntityItemStringType;
import jp.go.aist.six.oval.model.sc.ItemType;



/**
 * The SQL item outlines information collected from a database via an SQL query.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: SqlItem.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 * @deprecated Deprecated as of version 5.7:
 *             Replaced by the sql57 item and
 *             will be removed in a future version of the language.
 */
@Deprecated
public class SqlItem
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

    private final Collection<EntityItemAnySimpleType>  result = new ArrayList<EntityItemAnySimpleType>();
    //{0..*}



    /**
     * Constructor.
     */
    public SqlItem()
    {
        this( 0 );
    }


    public SqlItem(
                    final int id
                    )
    {
        super( id );

//        _oval_platform_type = OvalPlatformType.independent;
//        _oval_component_type = OvalComponentType.sql;
        _oval_family = Family.INDEPENDENT;
        _oval_component = ComponentType.SQL;
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
                    final Collection<? extends EntityItemAnySimpleType> results
                    )
    {
        result.clear();
        if (results != null  &&  results.size() > 0) {
            for (EntityItemAnySimpleType  result : results) {
                addResult( result );
            }
        }
    }


    public boolean addResult(
                    final EntityItemAnySimpleType result
                    )
    {
        if (result == null) {
            throw new IllegalArgumentException( "empty result" );
        }

        return this.result.add( result );
    }


    public Collection<EntityItemAnySimpleType> getResult()
    {
        return result;
    }


    public Iterator<EntityItemAnySimpleType> iterateResult()
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
        if (!(obj instanceof SqlItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "sql_item[" + super.toString()
                        + ", engine="               + getEngine()
                        + ", version="              + getVersion()
                        + ", connection_string="    + getConnectionString()
                        + ", sql="                  + getSql()
                        + ", result="               + getResult()
                        + "]";
    }

}
//
