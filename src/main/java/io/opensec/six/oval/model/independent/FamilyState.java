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
package io.opensec.six.oval.model.independent;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.Collection;
import java.util.Collections;



/**
 * The family state contains a single entity that is used
 * to check the family associated with the system.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class FamilyState
    extends StateType
{

    private EntityStateFamilyType  family;
    //{0..1}



    /**
     * Constructor.
     */
    public FamilyState()
    {
        this( null, 0 );
    }


    public FamilyState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public FamilyState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.independent;
//        _oval_component_type = OvalComponentType.family;
        _oval_family = Family.INDEPENDENT;
        _oval_component = ComponentType.FAMILY;
    }




    /**
     */
    public void setFamily(
                    final EntityStateFamilyType family
                    )
    {
        this.family = family;
    }


    public EntityStateFamilyType getFamily()
    {
        return family;
    }


    public FamilyState family(
                    final EntityStateFamilyType family
                    )
    {
        setFamily( family );
        return this;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        ElementRef  ref = getFamily();
        return Collections.singletonList( ref );
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
        if (!(obj instanceof FamilyState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "family_state[" + super.toString()
                        + ", family=" + getFamily()
                        + "]";
    }

}
// FamilyState
