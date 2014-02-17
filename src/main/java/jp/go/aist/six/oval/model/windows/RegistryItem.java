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
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.sc.EntityItemAnySimpleType;
import jp.go.aist.six.oval.model.sc.EntityItemIntType;
import jp.go.aist.six.oval.model.sc.EntityItemStringType;
import jp.go.aist.six.oval.model.sc.ItemType;



/**
 * The registry item specifies information that can be collected
 * about a particular registry key.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: RegistryItem.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class RegistryItem
    extends ItemType
{

    private EntityItemRegistryHiveType  hive;
    //{0..1}

    private EntityItemStringType  key;
    //{0..1, nillable="true"}

    private EntityItemStringType  name;
    //{0..1, nillable="true"}

    private EntityItemIntType  last_write_time;
    //{0..1}: 5.10, 30891

    private EntityItemRegistryTypeType  type;
    //{0..1}


    private final Collection<EntityItemAnySimpleType>  value =
        new ArrayList<EntityItemAnySimpleType>();
    //{0..*}
//    private EntityItemAnySimpleType  _value;
    // We have never found a registry item that has more than one value!!! //

    private EntityItemWindowsViewType  windows_view;
    //{0..1}



    /**
     * Constructor.
     */
    public RegistryItem()
    {
        this( 0 );
    }


    public RegistryItem(
                    final int id
                    )
    {
        super( id );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.registry;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.REGISTRY;
    }



    /**
     */
    public void setHive(
                    final EntityItemRegistryHiveType hive
                    )
    {
        this.hive = hive;
    }


    public EntityItemRegistryHiveType getHive()
    {
        return hive;
    }



    /**
     */
    public EntityItemStringType getKey()
    {
        return key;
    }


    public void setKey(
                    final EntityItemStringType key
                    )
    {
        this.key = key;
    }



    /**
     */
    public EntityItemStringType getName()
    {
        return name;
    }


    public void setName(
                    final EntityItemStringType name
                    )
    {
        this.name = name;
    }



    /**
     */
    public void setLastWriteTime(
                    final EntityItemIntType last_write_time
                    )
    {
        this.last_write_time = last_write_time;
    }


    public EntityItemIntType getLastWriteTime()
    {
        return last_write_time;
    }



    /**
     */
    public EntityItemRegistryTypeType getType()
    {
        return type;
    }


    public void setType(
                    final EntityItemRegistryTypeType type
                    )
    {
        this.type = type;
    }



    /**
     */
    public void setValue(
                    final Collection<? extends EntityItemAnySimpleType> value
                    )
    {
        if (this.value != value) {
            this.value.clear();
            if (value != null  &&  value.size() > 0) {
                this.value.addAll( value );
            }
        }
    }


    public Collection<EntityItemAnySimpleType> getValue()
    {
        return value;
    }


    public Iterator<EntityItemAnySimpleType> iterateValue()
    {
        return value.iterator();
    }


//    /**
//     */
//    public void setValue(
//                    final EntityItemAnySimpleType value
//                    )
//    {
//        _value = value;
//    }
//
//
//    public EntityItemAnySimpleType getValue()
//    {
//        return _value;
//    }



    /**
     */
    public void setWindowsView(
                    final EntityItemWindowsViewType windows_view
                    )
    {
        this.windows_view = windows_view;
    }


    public EntityItemWindowsViewType getWindowsView()
    {
        return windows_view;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "registry_item[" + super.toString()
             + ", hive="            + getHive()
             + ", key="             + getKey()
             + ", name="            + getName()
             + ", last_write_time=" + getLastWriteTime()
             + ", type="            + getType()
             + ", value="           + getValue()
             + ", windows_view="    + getWindowsView()
             + "]";
    }

}
//RegistryItem
