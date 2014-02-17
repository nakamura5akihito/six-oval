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
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: RegistryObject.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class RegistryObject
    extends SystemObjectType
{

    // xsd:choice

    private Set  set;


    private RegistryBehaviors  behaviors;
    //{0..1}


//    @Embedded(concreteClass = java.util.HashMap.class)
//    private final Map<Registry.Entity, EntityAttributeGroup>  _properties =
//    new HashMap<Registry.Entity, EntityAttributeGroup>();


    private EntityObjectRegistryHiveType  hive;
    //{1..1}

    private EntityObjectStringType  key;
//    private EntityObjectStringType  key = new EntityObjectStringType();
    //{1..1, nillable="true"}

    private EntityObjectStringType  name;
//    private EntityObjectStringType  name = new EntityObjectStringType();
    //{1..1, nillable="true"}


    private final Collection<Filter>  filter = new ArrayList<Filter>();



    /**
     * Constructor.
     */
    public RegistryObject()
    {
        this( null, 0 );
    }


    public RegistryObject(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public RegistryObject(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        this( id, version, comment,
                        (EntityObjectRegistryHiveType)null,
                        (EntityObjectStringType)null,
                        (EntityObjectStringType)null
                        );
    }


    public RegistryObject(
                    final String id,
                    final int version,
                    final String comment,
                    final RegistryHiveEnumeration hive,
                    final String key,
                    final String name
                    )
    {
        this( id, version, comment,
                        (hive == null ? null : (new EntityObjectRegistryHiveType( hive.value() ))),
                        (key  == null ? null : (new EntityObjectStringType( key ))),
                        (name == null ? null : (new EntityObjectStringType( name )))
        );
    }


    public RegistryObject(
                    final String id,
                    final int version,
                    final String comment,
                    final EntityObjectRegistryHiveType hive,
                    final EntityObjectStringType key,
                    final EntityObjectStringType name
                    )
    {
        super( id, version, comment );
        setHive( hive );
        setKey( key );
        setName( name );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.registry;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.REGISTRY;
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
    public void setBehaviors(
                    final RegistryBehaviors behaviors
                    )
    {
        this.behaviors = behaviors;
    }


    public RegistryBehaviors getBehaviors()
    {
        return behaviors;
    }


    public RegistryObject behaviors(
                    final RegistryBehaviors behaviors
                    )
    {
        setBehaviors( behaviors );
        return this;
    }



    /**
     */
    public void setHive(
                    final EntityObjectRegistryHiveType hive
                    )
    {
        this.hive = hive;
//        _properties.setEntity( Registry.Entity.hive, hive );
//        _properties.put( Registry.Entity.hive, hive );
    }


    public EntityObjectRegistryHiveType getHive()
    {
        return hive;
//        return _properties.getEntity(
//                        Registry.Entity.hive, EntityObjectRegistryHiveType.class );
//        return EntityObjectRegistryHiveType.class.cast( _properties.get( Registry.Entity.hive ) );
    }


    public RegistryObject hive(
                    final EntityObjectRegistryHiveType hive
                    )
    {
        setHive( hive );
        return this;
    }



    public void setKey(
                    final EntityObjectStringType key
                    )
    {
        this.key = key;
//        _properties.setEntity( Registry.Entity.key, key );
//        _properties.put( Registry.Entity.key, key );
    }


    public EntityObjectStringType getKey()
    {
        return key;
//        return _properties.getEntity(
//                        Registry.Entity.key, EntityObjectStringType.class );
//        return EntityObjectStringType.class.cast( _properties.get( Registry.Entity.key ) );
    }


    public RegistryObject key(
                    final EntityObjectStringType key
                    )
    {
        setKey( key );
        return this;
    }



    public void setName(
                    final EntityObjectStringType name
                    // nillable ="true"
                    )
    {
        this.name = name;
//        _properties.setEntity( Registry.Entity.name, name );
//        _properties.put( Registry.Entity.name, name );

//        EntityObjectString  n = name;
//        if (name != null) {
//            String  data = name.getData();
//            if (data == null  ||  data.length() == 0) {
//                n = null;
//            }
//        }
//
//        _name = n;
    }


    public EntityObjectStringType getName()
    {
        return name;
//        return _properties.getEntity(
//                        Registry.Entity.name, EntityObjectStringType.class );
//        return EntityObjectStringType.class.cast( _properties.get( Registry.Entity.name ) );
    }


    public RegistryObject name(
                    final EntityObjectStringType name
                    )
    {
        setName( name );
        return this;
    }



    /**
     */
    public void setFilter(
                    final Collection<? extends Filter> filterList
                    )
    {
        if (filterList != filter) {
            filter.clear();
            if (filterList != null  &&  filterList.size() > 0) {
                filter.addAll( filterList );
            }
        }
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
        ref_list.add( getHive() );
        ref_list.add( getKey() );
        ref_list.add( getName() );

        return ref_list;
    }
//    {
//        Collection<ElementRef>  ref_list = super.ovalGetElementRef();
//
//        ElementRef[]  refs = new ElementRef[] { getHive(), getKey(), getName() };
//        boolean  all_null = true;
//        for (ElementRef  r : refs) {
//            if (r != null) {
//                if (all_null) {
//                    ref_list = new ArrayList<ElementRef>( ref_list );
//                    all_null = false;
//                }
//                ref_list.add( r );
//            }
//        }
//
//        return ref_list;
//    }



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
        if (!(obj instanceof RegistryObject)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "registry_object[" + super.toString()
                        + ", set=" + getSet()
                        + ", behaviors=" + getBehaviors()
                        + ", hive=" + getHive()
                        + ", key=" + getKey()
                        + ", name=" + getName()
//                        + ", " + String.valueOf( _properties )
                        + ", filter=" + getFilter()
                        + "]";
    }

}
// RegistryObject
