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
package jp.go.aist.six.oval.model.hpux;

import java.util.ArrayList;
import java.util.Collection;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.EntityStateStringType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: Patch53State.java 3090 2013-03-14 09:57:58Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class Patch53State
    extends StateType
{

    //{0..1}
    private EntityStateStringType       swtype;
    private EntityStateStringType       area_patched;
    private EntityStateStringType       patch_base;



    /**
     * Constructor.
     */
    public Patch53State()
    {
        this( null, 0 );
    }


    public Patch53State(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public Patch53State(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.HPUX;
        _oval_component = ComponentType.PATCH53;
    }



    /**
     */
    public void setSwtype(
                    final EntityStateStringType swtype
                    )
    {
        this.swtype = swtype;
    }


    public EntityStateStringType getSwtype()
    {
        return swtype;
    }



    /**
     */
    public EntityStateStringType getAreaPatched()
    {
        return area_patched;
    }


    public void setAreaPatched(
                    final EntityStateStringType area_patched
                    )
    {
        this.area_patched = area_patched;
    }



    /**
     */
    public void setPatchBase(
                    final EntityStateStringType patch_base
                    )
    {
        this.patch_base = patch_base;
    }


    public EntityStateStringType getPatchBase()
    {
        return patch_base;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getSwtype() );
        ref_list.add( getAreaPatched() );
        ref_list.add( getPatchBase() );

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
        if (!(obj instanceof Patch53State)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "patch53_state[" + super.toString()
                        + ", swtype="       + getSwtype()
                        + ", area_patched=" + getAreaPatched()
                        + ", patch_base="   + getPatchBase()
             + "]";
    }

}
//
