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
package jp.go.aist.six.oval.model.windows;

import java.util.ArrayList;
import java.util.Collection;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.EntityStateStringType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 * The sid_sid state defines the different metadata
 * associate with a Windows trustee (identified by SID).
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: SidSidState.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class SidSidState
    extends StateType
{

    //{0..1}
    private EntityStateStringType   trustee_sid;
    private EntityStateStringType   trustee_name;
    private EntityStateStringType   trustee_domain;



    /**
     * Constructor.
     */
    public SidSidState()
    {
        this( null, 0 );
    }


    public SidSidState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public SidSidState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.sid_sid;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.SID_SID;
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
        if (!(obj instanceof SidSidState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "sid_sid_state[" + super.toString()
             + ", trustee_sid="     + getTrusteeSid()
             + ", trustee_name="    + getTrusteeName()
             + ", trustee_domain="  + getTrusteeDomain()
             + "]";
    }
}
//SidSidState
