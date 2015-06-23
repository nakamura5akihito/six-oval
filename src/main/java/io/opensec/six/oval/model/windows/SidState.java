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
package io.opensec.six.oval.model.windows;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.definitions.EntityStateStringType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;



/**
 * The sid state defines the different metadata
 * associate with a Windows trustee (identified by name).
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class SidState
    extends StateType
{

    //{0..1}
    private EntityStateStringType   trustee_name;
    private EntityStateStringType   trustee_sid;
    private EntityStateStringType   trustee_domain;



    /**
     * Constructor.
     */
    public SidState()
    {
        this( null, 0 );
    }


    public SidState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public SidState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.sid;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.SID;
    }



    /**
     */
    public void setTrusteeName(
                    final EntityStateStringType trustee_name
                    )
    {
        this.trustee_name = trustee_name;
    }


    public EntityStateStringType getTrusteeName()
    {
        return trustee_name;
    }



    /**
     */
    public void setTrusteeSid(
                    final EntityStateStringType trustee_sid
                    )
    {
        this.trustee_sid = trustee_sid;
    }


    public EntityStateStringType getTrusteeSid()
    {
        return trustee_sid;
    }



    /**
     */
    public void setTrusteeDomain(
                    final EntityStateStringType trustee_domain
                    )
    {
        this.trustee_domain = trustee_domain;
    }


    public EntityStateStringType getTrusteeDomain()
    {
        return trustee_domain;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();

        ref_list.add( getTrusteeSid() );
        ref_list.add( getTrusteeName() );
        ref_list.add( getTrusteeDomain() );

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
        if (!(obj instanceof SidState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "sid_state[" + super.toString()
             + ", trustee_name="    + getTrusteeName()
             + ", trustee_sid="     + getTrusteeSid()
             + ", trustee_domain="  + getTrusteeDomain()
             + "]";
    }
}
//SidState
