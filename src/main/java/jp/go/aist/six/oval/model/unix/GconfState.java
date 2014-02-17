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
package jp.go.aist.six.oval.model.unix;

import java.util.ArrayList;
import java.util.Collection;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.EntityStateAnySimpleType;
import jp.go.aist.six.oval.model.definitions.EntityStateBoolType;
import jp.go.aist.six.oval.model.definitions.EntityStateIntType;
import jp.go.aist.six.oval.model.definitions.EntityStateStringType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 * The gconf_state element defines the different information that can be used
 * to evaluate the specified GConf preference key.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: GconfState.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class GconfState
    extends StateType
{

    //{0..1}
    private EntityStateStringType       key;
    private EntityStateStringType       source;
    private EntityStateGconfTypeType    type;
    private EntityStateBoolType         is_writable;
    private EntityStateStringType       mod_user;
    private EntityStateIntType          mod_time;
    private EntityStateBoolType         is_default;
    private EntityStateAnySimpleType    value;



    /**
     * Constructor.
     */
    public GconfState()
    {
        this( null, 0 );
    }


    public GconfState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public GconfState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.UNIX;
        _oval_component = ComponentType.GCONF;
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
    public void setSource(
                    final EntityStateStringType source
                    )
    {
        this.source = source;
    }


    public EntityStateStringType getSource()
    {
        return source;
    }



    /**
     */
    public void setType(
                    final EntityStateGconfTypeType type
                    )
    {
        this.type = type;
    }


    public EntityStateGconfTypeType getType()
    {
        return type;
    }



    /**
     */
    public void setIsWritable(
                    final EntityStateBoolType is_writable
                    )
    {
        this.is_writable= is_writable;
    }


    public EntityStateBoolType getIsWritable()
    {
        return is_writable;
    }



    /**
     */
    public void setModUser(
                    final EntityStateStringType mod_user
                    )
    {
        this.mod_user = mod_user;
    }


    public EntityStateStringType getModUser()
    {
        return mod_user;
    }



    /**
     */
    public void setModTime(
                    final EntityStateIntType mod_time
                    )
    {
        this.mod_time = mod_time;
    }


    public EntityStateIntType getModTime()
    {
        return mod_time;
    }



    /**
     */
    public void setIsDefault(
                    final EntityStateBoolType is_default
                    )
    {
        this.is_default= is_default;
    }


    public EntityStateBoolType getIsDefault()
    {
        return is_default;
    }



    /**
     */
    public void setValue(
                    final EntityStateAnySimpleType value
                    )
    {
        this.value= value;
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
        ref_list.add( getSource() );
        ref_list.add( getType() );
        ref_list.add( getIsWritable() );
        ref_list.add( getModUser() );
        ref_list.add( getModTime() );
        ref_list.add( getIsDefault() );
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
        if (!(obj instanceof GconfState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "file_state[" + super.toString()
             + ", key="             + getKey()
             + ", source="          + getSource()
             + ", type="            + getType()
             + ", is_writable="     + getIsWritable()
             + ", mod_user="        + getModUser()
             + ", mod_time="        + getModTime()
             + ", is_default="      + getIsDefault()
             + ", value="           + getValue()
             + "]";
    }

}
//
