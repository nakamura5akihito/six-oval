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
 * The registry state defines the different metadata
 * associate with a Windows registry key.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: RegistryState.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class RegistryState
    extends StateType
{

    private EntityStateRegistryHiveType  hive;
    //{0..1}

    private EntityStateStringType  key;
    //{0..1}

    private EntityStateStringType  name;
    //{0..1}

    private EntityStateIntType  last_write_time;
    //{0..1}: 5.10

    private EntityStateRegistryTypeType  type;
    //{0..1}

    private EntityStateAnySimpleType  value;
    //{0..1}

    private EntityStateWindowsViewType  windows_view;
    //{0..1}



    /**
     * Constructor.
     */
    public RegistryState()
    {
        this( null, 0 );
    }


    public RegistryState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public RegistryState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.registry;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.REGISTRY;
    }



    /**
     */
    public void setHive(
                    final EntityStateRegistryHiveType hive
                    )
    {
        this.hive = hive;
    }


    public EntityStateRegistryHiveType getHive()
    {
        return hive;
    }


    public RegistryState hive(
                    final EntityStateRegistryHiveType hive
                    )
    {
        setHive( hive );
        return this;
    }



    /**
     */
    public void setKey(
                    final EntityStateStringType key
                    )
    {
        this.key = key;
    }


    public EntityStateStringType getKey()
    {
        return key;
    }


    public RegistryState key(
                    final EntityStateStringType key
                    )
    {
        setKey( key );
        return this;
    }



    /**
     */
    public void setName(
                    final EntityStateStringType name
                    )
    {
        this.name = name;
    }


    public EntityStateStringType getName()
    {
        return name;
    }


    public RegistryState name(
                    final EntityStateStringType name
                    )
    {
        setName( name );
        return this;
    }



    /**
     */
    public void setLastWriteTime(
                    final EntityStateIntType last_write_time
                    )
    {
        this.last_write_time = last_write_time;
    }


    public EntityStateIntType getLastWriteTime()
    {
        return last_write_time;
    }



    /**
     */
    public void setType(
                    final EntityStateRegistryTypeType type
                    )
    {
        this.type = type;
    }


    public EntityStateRegistryTypeType getType()
    {
        return type;
    }


    public RegistryState type(
                    final EntityStateRegistryTypeType type
                    )
    {
        setType( type );
        return this;
    }



    /**
     */
    public void setValue(
                    final EntityStateAnySimpleType value
                    )
    {
        this.value = value;
    }


    public EntityStateAnySimpleType getValue()
    {
        return value;
    }


    public RegistryState value(
                    final EntityStateAnySimpleType value
                    )
    {
        setValue( value );
        return this;
    }



    /**
     */
    public void setWindowsView(
                    final EntityStateWindowsViewType windows_view
                    )
    {
        this.windows_view = windows_view;
    }


    public EntityStateWindowsViewType getWindowsView()
    {
        return windows_view;
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
        ref_list.add( getLastWriteTime() );
        ref_list.add( getType() );
        ref_list.add( getValue() );
        ref_list.add( getWindowsView() );

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
        if (!(obj instanceof RegistryState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "registry_state[" + super.toString()
                        + ", hive="             + getHive()
                        + ", key="              + getKey()
                        + ", name="             + getName()
                        + ", last_write_time="  + getLastWriteTime()
                        + ", type="             + getType()
                        + ", value="            + getValue()
                        + ", windows_view="     + getWindowsView()
                        + "]";
    }

}
// RegistryState
