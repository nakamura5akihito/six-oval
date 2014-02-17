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
package jp.go.aist.six.oval.model.pixos;

import java.util.ArrayList;
import java.util.Collection;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.EntityStateIntType;
import jp.go.aist.six.oval.model.definitions.EntityStateStringType;
import jp.go.aist.six.oval.model.definitions.EntityStateVersionType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 * The version state defines the version information held within a Cisco PIX software release.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: VersionState.java 3197 2013-07-05 08:11:39Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class VersionState
    extends StateType
{

    //{0..1}
    private EntityStateStringType           pix_release;
    private EntityStateVersionType          pix_major_release;
    private EntityStateVersionType          pix_minor_release;
    private EntityStateIntType              pix_build;



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

        _oval_family = Family.PIXOS;
        _oval_component = ComponentType.VERSION;
    }



    /**
     */
    public void setPixRelease(
                    final EntityStateStringType pix_release
                    )
    {
        this.pix_release = pix_release;
    }


    public EntityStateStringType getPixRelease()
    {
        return pix_release;
    }



    /**
     */
    public void setPixMajorRelease(
                    final EntityStateVersionType pix_major_release
                    )
    {
        this.pix_major_release = pix_major_release;
    }


    public EntityStateVersionType getPixMajorRelease()
    {
        return pix_major_release;
    }



    /**
     */
    public void setPixMinorRelease(
                    final EntityStateVersionType pix_minor_release
                    )
    {
        this.pix_minor_release = pix_minor_release;
    }


    public EntityStateVersionType getPixMinorRelease()
    {
        return pix_minor_release;
    }



    /**
     */
    public void setPixBuild(
                    final EntityStateIntType pix_build
                    )
    {
        this.pix_build = pix_build;
    }


    public EntityStateIntType getPixBuild()
    {
        return pix_build;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();

        ref_list.add( getPixRelease() );
        ref_list.add( getPixMajorRelease() );
        ref_list.add( getPixMinorRelease() );
        ref_list.add( getPixBuild() );

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
                        + ", pix_release="          + getPixRelease()
                        + ", pix_major_release="    + getPixMajorRelease()
                        + ", pix_minor_release="    + getPixMinorRelease()
                        + ", pix_build="            + getPixBuild()
             + "]";
    }
}
//
