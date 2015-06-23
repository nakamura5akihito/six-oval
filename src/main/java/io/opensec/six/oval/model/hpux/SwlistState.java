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
package io.opensec.six.oval.model.hpux;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.definitions.EntityStateAnySimpleType;
import io.opensec.six.oval.model.definitions.EntityStateStringType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;



/**
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class SwlistState
    extends StateType
{

    //{0..1}
    private EntityStateStringType               swlist;
    private EntityStateStringType               bundle;
    private EntityStateStringType               fileset;
    private EntityStateAnySimpleType            version;
    private EntityStateStringType               title;
    private EntityStateStringType               vendor;



    /**
     * Constructor.
     */
    public SwlistState()
    {
        this( null, 0 );
    }


    public SwlistState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public SwlistState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.HPUX;
        _oval_component = ComponentType.SWLIST;
    }



    /**
     */
    public void setSwlist(
                    final EntityStateStringType swlist
                    )
    {
        this.swlist = swlist;
    }


    public EntityStateStringType getSwlist()
    {
        return swlist;
    }



    /**
     */
    public EntityStateStringType getBundle()
    {
        return bundle;
    }


    public void setBundle(
                    final EntityStateStringType bundle
                    )
    {
        this.bundle = bundle;
    }



    /**
     */
    public EntityStateStringType getFileset()
    {
        return fileset;
    }


    public void setFileset(
                    final EntityStateStringType fileset
                    )
    {
        this.fileset = fileset;
    }



    /**
     */
    public void setVersion(
                    final EntityStateAnySimpleType version
                    )
    {
        this.version = version;
    }


    public EntityStateAnySimpleType getVersion()
    {
        return version;
    }



    /**
     */
    public EntityStateStringType getTitle()
    {
        return title;
    }


    public void setTitle(
                    final EntityStateStringType title
                    )
    {
        this.title = title;
    }



    /**
     */
    public EntityStateStringType getVendor()
    {
        return vendor;
    }


    public void setVendor(
                    final EntityStateStringType vendor
                    )
    {
        this.vendor = vendor;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getSwlist() );
        ref_list.add( getBundle() );
        ref_list.add( getFileset() );
        ref_list.add( getVersion() );
        ref_list.add( getTitle() );
        ref_list.add( getVendor() );

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
        if (!(obj instanceof SwlistState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "swlist_state[" + super.toString()
                        + ", swlist="         + getSwlist()
                        + ", bundle="         + getBundle()
                        + ", fileset="        + getFileset()
                        + ", version="        + getVersion()
                        + ", title="          + getTitle()
                        + ", vendor="         + getVendor()
             + "]";
    }

}
//
