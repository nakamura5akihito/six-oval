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
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.sc.EntityItemAnySimpleType;
import io.opensec.six.oval.model.sc.EntityItemIntType;
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.ItemType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



/**
 * The metabase item gathers information from the specified metabase keys.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class MetabaseItem
    extends ItemType
{

    private EntityItemStringType  key;
    //{0..1}


    private EntityItemIntType  id;
    //{0..1, nillable="true"}


    private EntityItemStringType  name;
    //{0..1}


    private EntityItemStringType  user_type;
    //{0..1}


    private EntityItemStringType  data_type;
    //{0..1}


//    private final Map<MetabaseProperty, EntityAttributeGroup>  _properties =
//        new EnumMap<MetabaseProperty, EntityAttributeGroup>( MetabaseProperty.class );


    private final Collection<EntityItemAnySimpleType>  data =
        new ArrayList<EntityItemAnySimpleType>();
    //{0..*}



    /**
     * Constructor.
     */
    public MetabaseItem()
    {
        this( 0 );
    }


    public MetabaseItem(
                    final int id
                    )
    {
        super( id );

        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.METABASE;
    }



    /**
     */
    public void setKey(
                    final EntityItemStringType key
                    )
    {
        this.key = key;
//        _properties.put( MetabaseProperty.KEY, key );
    }


    public EntityItemStringType getKey()
    {
        return key;
//        return (EntityItemStringType)_properties.get( MetabaseProperty.KEY );
    }



    /**
     * This property is renamed from "id" to "objectID"
     * because the super class ItemType has the property of the same name.
     */
    public void setObjectId(
                    final EntityItemIntType id
                    )
    {
        this.id = id;
    }


    public EntityItemIntType getObjectId()
    {
        return id;
    }



    /**
     */
    public void setObjectName(
                    final EntityItemStringType name
                    )
    {
        this.name = name;
    }


    public EntityItemStringType getObjectName()
    {
        return name;
    }



    /**
     */
    public void setUserType(
                    final EntityItemStringType user_type
                    )
    {
        this.user_type = user_type;
//        _properties.put( MetabaseProperty.USER_TYPE, type );
    }


    public EntityItemStringType getUserType()
    {
        return user_type;
//        return (EntityItemStringType)_properties.get( MetabaseProperty.USER_TYPE );
    }



    /**
     */
    public void setDataType(
                    final EntityItemStringType data_type
                    )
    {
        this.data_type = data_type;
//        _properties.put( MetabaseProperty.DATA_TYPE, type );
    }


    public EntityItemStringType getDataType()
    {
        return data_type;
//        return (EntityItemStringType)_properties.get( MetabaseProperty.DATA_TYPE );
    }



    /**
     */
    public void setData(
                    final Collection<? extends EntityItemAnySimpleType> data
                    )
    {
        if (data != this.data) {
            this.data.clear();
            if (data != null  &&  data.size() > 0) {
                this.data.addAll( data );
            }
        }
    }


    public Collection<EntityItemAnySimpleType> getData()
    {
        return data;
    }


    public Iterator<EntityItemAnySimpleType> iterateData()
    {
        return data.iterator();
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "mtabase_item[" + super.toString()
             + ", key="         + getKey()
             + ", id="          + getObjectId()
             + ", name="        + getObjectName()
             + ", user_type="   + getUserType()
             + ", data_type="   + getDataType()
             + ", data="        + getData()
             + "]";
    }

}
// MetabaseItem
