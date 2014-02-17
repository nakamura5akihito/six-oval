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
package jp.go.aist.six.oval.model.solaris;

import java.util.ArrayList;
import java.util.Collection;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.EntityStateIntType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 * The patch_state element defines the different information associated
 * with a specific patch installed on the system.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: PatchState.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class PatchState
    extends StateType
{

    //{0..1}
    private EntityStateIntType               base;
    private EntityStateIntType               version;



    /**
     * Constructor.
     */
    public PatchState()
    {
        this( null, 0 );
    }


    public PatchState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public PatchState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.SOLARIS;
        _oval_component = ComponentType.PATCH;
    }



    /**
     */
    public void setBase(
                    final EntityStateIntType pkginst
                    )
    {
        base = pkginst;
    }


    public EntityStateIntType getBase()
    {
        return base;
    }



    /**
     */
    public void setVersion(
                    final EntityStateIntType version
                    )
    {
        this.version = version;
    }


    public EntityStateIntType getVersion()
    {
        return version;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getBase() );
        ref_list.add( getVersion() );

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
        if (!(obj instanceof PatchState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "patch_state[" + super.toString()
                        + ", base="         + getBase()
                        + ", version="      + getVersion()
             + "]";
    }

}
//
