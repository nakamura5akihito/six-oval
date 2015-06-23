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
package io.opensec.six.oval.model.aix;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.definitions.EntityStateAnySimpleType;
import io.opensec.six.oval.model.definitions.EntityStateStringType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;



/**
 * The no_state defines the different information associated with
 * a specific call to /usr/sbin/no.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class NoState
    extends StateType
{

    //{0..1}
    private EntityStateStringType           tunable;
    private EntityStateAnySimpleType        value;



    /**
     * Constructor.
     */
    public NoState()
    {
        this( null, 0 );
    }


    public NoState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public NoState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.AIX;
        _oval_component = ComponentType.NO;
    }




    /**
     */
    public void setTunable(
                    final EntityStateStringType tunable
                    )
    {
        this.tunable = tunable;
    }


    public EntityStateStringType getTunable()
    {
        return tunable;
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
        ref_list.add( getTunable() );
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
        if (!(obj instanceof NoState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "no_state[" + super.toString()
                        + ", tunable="      + getTunable()
                        + ", value="        + getValue()
             + "]";
    }

}
//
