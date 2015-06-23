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
package io.opensec.six.oval.model.macos;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.definitions.EntityStateAnySimpleType;
import io.opensec.six.oval.model.definitions.EntityStateIntType;
import io.opensec.six.oval.model.definitions.EntityStateStringType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;



/**
 * The plist510 state defines the different information that can be used to evaluate
 * the specified property list preference key.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class Plist510State
    extends StateType
{

    //{0..1}
    private EntityStateStringType       key;
    private EntityStateStringType       app_id;
    private EntityStateStringType       filepath;
    private EntityStateIntType          instance;
    private EntityStatePlistTypeType    type;
    private EntityStateAnySimpleType    value;



    /**
     * Constructor.
     */
    public Plist510State()
    {
        this( null, 0 );
    }


    public Plist510State(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public Plist510State(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.MACOS;
        _oval_component = ComponentType.PLIST510;
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



    /**
     */
    public void setAppId(
                    final EntityStateStringType app_id
                    )
    {
        this.app_id = app_id;
    }


    public EntityStateStringType getAppId()
    {
        return app_id;
    }



    /**
     */
    public void setFilepath(
                    final EntityStateStringType filepath
                    )
    {
        this.filepath = filepath;
    }


    public EntityStateStringType getFilepath()
    {
        return filepath;
    }



    /**
     */
    public void setInstance(
                    final EntityStateIntType instance
                    )
    {
        this.instance = instance;
    }


    public EntityStateIntType getInstance()
    {
        return instance;
    }



    /**
     */
    public void setType(
                    final EntityStatePlistTypeType type
                    )
    {
        this.type = type;
    }


    public EntityStatePlistTypeType getType()
    {
        return type;
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



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();

        ref_list.add( getKey() );
        ref_list.add( getAppId() );
        ref_list.add( getFilepath() );
        ref_list.add( getInstance() );
        ref_list.add( getType() );
        ref_list.add( getValue() );

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
        if (!(obj instanceof Plist510State)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "plist510_state[" + super.toString()
             + ", key="         + getKey()
             + ", app_id="      + getAppId()
             + ", filepath="    + getFilepath()
             + ", instance="    + getInstance()
             + ", type="        + getType()
             + ", value="       + getValue()
             + "]";
    }
}
//
