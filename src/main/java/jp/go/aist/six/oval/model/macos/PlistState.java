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
package jp.go.aist.six.oval.model.macos;

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
 * The plist state defines the different information that can be used to evaluate
 * the specified property list preference key.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: PlistState.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 * @deprecated Deprecated as of version 5.10:
 *             Replaced by the plist510 state and
 *             will be removed in a future version of the language.
 */
@Deprecated
public class PlistState
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
    public PlistState()
    {
        this( null, 0 );
    }


    public PlistState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public PlistState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.MACOS;
        _oval_component = ComponentType.PLIST;
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
        if (!(obj instanceof PlistState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "plist_state[" + super.toString()
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
