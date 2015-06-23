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
package io.opensec.six.oval.model.esx;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.definitions.EntityObjectStringType;
import io.opensec.six.oval.model.definitions.Set;
import io.opensec.six.oval.model.definitions.SystemObjectType;
import java.util.ArrayList;
import java.util.Collection;



/**
 * The patch_object is used by a patch test to define those objects to be evaluated
 * based on a specified state.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 * @deprecated Deprecated as of version 5.6:
 *             Replaced by the patch56 object and
 *             will be removed in a future version of the language.
 */
@Deprecated
public class PatchObject
    extends SystemObjectType
{

    //TODO: XSD model.
    // choice( set | sequence () )

    private Set  set;
    //{1..1}

    private PatchBehaviors  behaviors;
    //{0..1}

    private EntityObjectStringType  patch_number;
    //{1..1}



    /**
     * Constructor.
     */
    public PatchObject()
    {
        this( null, 0 );
    }


    public PatchObject(
                    final String id,
                    final int version
                    )
    {
        super( id, version );

        _oval_family = Family.ESX;
        _oval_component = ComponentType.PATCH;
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
                    final PatchBehaviors behaviors
                    )
    {
        this.behaviors = behaviors;
    }


    public PatchBehaviors getBehaviors()
    {
        return behaviors;
    }



    /**
     */
    public void setPatchNumber(
                    final EntityObjectStringType patch_number
                    )
    {
        this.patch_number = patch_number;
    }


    public EntityObjectStringType getPatchNumber()
    {
        return patch_number;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getPatchNumber() );

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
        if (!(obj instanceof PatchObject)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "patch_object[" + super.toString()
                        + ", set="          + getSet()
                        + ", behaviors="    + getBehaviors()
                        + ", patch_number=" + getPatchNumber()
                        + "]";
    }

}
//
