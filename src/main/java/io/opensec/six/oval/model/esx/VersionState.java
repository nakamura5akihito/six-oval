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
import io.opensec.six.oval.model.definitions.EntityStateIntType;
import io.opensec.six.oval.model.definitions.EntityStateVersionType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;



/**
 * The version state defines the information about the release and build version.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class VersionState
    extends StateType
{

    //{0..1}
    private EntityStateVersionType  release;
    private EntityStateIntType      build;



    /**
     * Constructor.
     */
    public VersionState()
    {
        this( null, 0 );
    }


    public VersionState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public VersionState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.ESX;
        _oval_component = ComponentType.VERSION;
    }



    /**
     */
    public void setRelease(
                    final EntityStateVersionType release
                    )
    {
        this.release = release;
    }


    public EntityStateVersionType getRelease()
    {
        return release;
    }



    /**
     */
    public void setBuild(
                    final EntityStateIntType build
                    )
    {
        this.build = build;
    }


    public EntityStateIntType getBuild()
    {
        return build;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getRelease() );
        ref_list.add( getBuild() );

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
        if (!(obj instanceof VersionState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "version_state[" + super.toString()
                        + ", release="      + getRelease()
                        + ", build="        + getBuild()
             + "]";
    }

}
//
