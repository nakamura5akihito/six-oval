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
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.EntityStateAnySimpleType;
import jp.go.aist.six.oval.model.definitions.EntityStateIntType;
import jp.go.aist.six.oval.model.definitions.EntityStateStringType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 * The metabase state defines the different metadata
 * associate with a metabase item.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: MetabaseState.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class MetabaseState
    extends StateType
{

    private EntityStateStringType  key;
    //{0..1}

    private EntityStateIntType  id;
    //{0..1}

    private EntityStateStringType  name;
    //{0..1}

    private EntityStateStringType  user_type;
    //{0..1}

    private EntityStateStringType  data_type;
    //{0..1}

    private EntityStateAnySimpleType  data;
    //{0..1}


//    private final EntityPropertyMap<MetabaseProperty>  _properties =
//        MetabaseProperty.createPropertyMap();



    /**
     * Constructor.
     */
    public MetabaseState()
    {
        this( null, 0 );
    }


    public MetabaseState(
                    final String id,
                    final int version
                    )
    {
        super( id, version );

        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.METABASE;
    }



    /**
     */
    public void setKey(
                    final EntityStateStringType key
                    )
    {
        this.key = key;
//        _properties.setProperty( MetabaseProperty.KEY, key );
    }


    public EntityStateStringType getKey()
    {
        return key;
//        return _properties.getProperty(
//                        MetabaseProperty.KEY, EntityStateStringType.class );
    }


    public MetabaseState key(
                    final EntityStateStringType key
                    )
    {
        setKey( key );
        return this;
    }



    /**
     */
    public void setObjectId(
                    final EntityStateIntType id
                    )
    {
        this.id = id;
    }


    public EntityStateIntType getObjectId()
    {
        return id;
    }


    public MetabaseState objectId(
                    final EntityStateIntType id
                    )
    {
        setObjectId( id );
        return this;
    }



    /**
     */
    public void setObjectName(
                    final EntityStateStringType name
                    )
    {
        this.name = name;
    }


    public EntityStateStringType getObjectName()
    {
        return name;
    }


    public MetabaseState objectName(
                    final EntityStateStringType name
                    )
    {
        setObjectName( name );
        return this;
    }



    /**
     */
    public void setUserType(
                    final EntityStateStringType user_type
                    )
    {
        this.user_type = user_type;
//        _properties.setProperty( MetabaseProperty.USER_TYPE, user_type );
    }


    public EntityStateStringType getUserType()
    {
        return user_type;
//        return _properties.getProperty(
//                        MetabaseProperty.USER_TYPE, EntityStateStringType.class );
    }


    public MetabaseState userType(
                    final EntityStateStringType user_type
                    )
    {
        setUserType( user_type );
        return this;
    }



    /**
     */
    public void setDataType(
                    final EntityStateStringType data_type
                    )
    {
        this.data_type = data_type;
//        _properties.setProperty( MetabaseProperty.DATA_TYPE, dataType );
    }


    public EntityStateStringType getDataType()
    {
        return data_type;
//        return _properties.getProperty(
//                        MetabaseProperty.DATA_TYPE, EntityStateStringType.class );
    }


    public MetabaseState dataType(
                    final EntityStateStringType data_type
                    )
    {
        setDataType( data_type );
        return this;
    }



    /**
     */
    public void setData(
                    final EntityStateAnySimpleType data
                    )
    {
        this.data = data;
//        _properties.setProperty( MetabaseProperty.DATA, data );
    }


    public EntityStateAnySimpleType getData()
    {
        return data;
//        return _properties.getProperty(
//                        MetabaseProperty.DATA, EntityStateAnySimpleType.class );
    }


    public MetabaseState data(
                    final EntityStateAnySimpleType data
                    )
    {
        setData( data );
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
        ref_list.add( getObjectName() );
        ref_list.add( getUserType() );
        ref_list.add( getDataType() );
        ref_list.add( getData() );

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
        if (!(obj instanceof MetabaseState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "metabase_state[" + super.toString()
                        + ", key="          + getKey()
                        + ", id="           + getObjectId()
                        + ", name="         + getObjectName()
                        + ", user_type="    + getUserType()
                        + ", data_type="    + getDataType()
                        + ", data="         + getData()
                        + "]";
    }

}
//
