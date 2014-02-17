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
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.EntityStateAnySimpleType;
import jp.go.aist.six.oval.model.definitions.EntityStateStringType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 * The SQL state contains two entities that are used to check
 * the name of the specified field and the value associated with it.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: SqlState.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 * @deprecated Deprecated as of version 5.7:
 *             Replaced by the sql57 state and
 *             will be removed in a future version of the language.
 */
@Deprecated
public class SqlState
    extends StateType
{

    private EntityStateEngineType  engine;
    //{0..1}

    private EntityStateStringType  version;
    //{0..1}

    private EntityStateStringType  connection_string;
    //{0..1}

    private EntityStateStringType  sql;
    //{0..1}

    private EntityStateAnySimpleType  result;
    //{0..1}



    /**
     * Constructor.
     */
    public SqlState()
    {
        this( null, 0 );
    }


    public SqlState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public SqlState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.independent;
//        _oval_component_type = OvalComponentType.sql;
        _oval_family = Family.INDEPENDENT;
        _oval_component = ComponentType.SQL;
    }



    /**
     */
    public void setEngine(
                    final EntityStateEngineType engine
                    )
    {
        this.engine = engine;
    }


    public EntityStateEngineType getEngine()
    {
        return engine;
    }



    /**
     */
    public void setVersion(
                    final EntityStateStringType version
                    )
    {
        this.version = version;
    }


    public EntityStateStringType getVersion()
    {
        return version;
    }



    /**
     */
    public void setConnectionString(
                    final EntityStateStringType connection_string
                    )
    {
        this.connection_string = connection_string;
    }


    public EntityStateStringType getConnectionString()
    {
        return connection_string;
    }



    /**
     */
    public void setSql(
                    final EntityStateStringType sql
                    )
    {
        this.sql = sql;
    }


    public EntityStateStringType getSql()
    {
        return sql;
    }



    /**
     */
    public void setResult(
                    final EntityStateAnySimpleType result
                    )
    {
        this.result = result;
    }


    public EntityStateAnySimpleType getResult()
    {
        return result;
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
        ref_list.add( getResult() );

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
        if (!(obj instanceof SqlState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "sql_state[" + super.toString()
                        + ", engine="           + getEngine()
                        + ", version="          + getVersion()
                        + ", conection_string=" + getConnectionString()
                        + ", sql="              + getSql()
                        + ", result="           + getResult()
                        + "]";
    }

}
// SqlState
