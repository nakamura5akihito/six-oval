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
import io.opensec.six.oval.model.definitions.EntityStateStringType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;



/**
 * The authorizationdb_state element defines a value used to evaluate the result 
 * of a specific authorizationdb_object item.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class AuthorizationDbState
    extends StateType
{

    //{0..1}
    private EntityStateStringType       right_name;
    private EntityStateStringType       xpath;
    private EntityStateAnySimpleType	value_of;



    /**
     * Constructor.
     */
    public AuthorizationDbState()
    {
        this( null, 0 );
    }


    public AuthorizationDbState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public AuthorizationDbState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.MACOS;
        _oval_component = ComponentType.AUTHORIZATIONDB;
    }



    /**
     */
    public void setRightName(
                    final EntityStateStringType right_name
                    )
    {
        this.right_name = right_name;
    }


    public EntityStateStringType getRightName()
    {
        return right_name;
    }



    /**
     */
    public void setXpath(
                    final EntityStateStringType xpath
                    )
    {
        this.xpath = xpath;
    }


    public EntityStateStringType getXpath()
    {
        return xpath;
    }



    /**
     */
    public void setValueOf(
                    final EntityStateAnySimpleType value_of
                    )
    {
        this.value_of = value_of;
    }


    public EntityStateAnySimpleType getValueOf()
    {
        return value_of;
    }




    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getRightName() );
        ref_list.add( getXpath() );
        ref_list.add( getValueOf() );

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
        if (!(obj instanceof AuthorizationDbState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "authorizationdb_state[" + super.toString()
                        + ", right_name="   + getRightName()
                        + ", Xpath="        + getXpath()
                        + ", value_of="		+ getValueOf()
             + "]";
    }

}
//
