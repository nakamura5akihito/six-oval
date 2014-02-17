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
package jp.go.aist.six.oval.model.esx;

import java.util.ArrayList;
import java.util.Collection;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.EntityStateIntType;
import jp.go.aist.six.oval.model.definitions.EntityStateVersionType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 * The version state defines the information about the release and build version.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: VersionState.java 3150 2013-05-14 03:03:02Z nakamura5akihito@gmail.com $
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
