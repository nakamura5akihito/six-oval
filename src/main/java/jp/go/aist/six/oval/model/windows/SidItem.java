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

import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.sc.EntityItemStringType;
import jp.go.aist.six.oval.model.sc.ItemType;
import jp.go.aist.six.oval.model.sc.StatusEnumeration;



/**
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: SidItem.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class SidItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType   trustee_name;
    private EntityItemStringType   trustee_sid;
    private EntityItemStringType   trustee_domain;



    /**
     * Constructor.
     */
    public SidItem()
    {
        this( 0 );
    }


    public SidItem(
                    final int id
                    )
    {
        this( id, null );
    }


    public SidItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        super( id, status );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.sid;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.SID;
    }



    /**
     */
    public void setTrusteeName(
                    final EntityItemStringType trustee_name
                    )
    {
        this.trustee_name = trustee_name;
    }


    public EntityItemStringType getTrusteeName()
    {
        return trustee_name;
    }



    /**
     */
    public void setTrusteeSid(
                    final EntityItemStringType trustee_sid
                    )
    {
        this.trustee_sid = trustee_sid;
    }


    public EntityItemStringType getTrusteeSid()
    {
        return trustee_sid;
    }



    /**
     */
    public void setTrusteeDomain(
                    final EntityItemStringType trustee_domain
                    )
    {
        this.trustee_domain = trustee_domain;
    }


    public EntityItemStringType getTrusteeDomain()
    {
        return trustee_domain;
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
        if (!(obj instanceof SidItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "sid_item[" + super.toString()
                        + ", trustee_name="    + getTrusteeName()
                        + ", trustee_sid="     + getTrusteeSid()
                        + ", trustee_domain="  + getTrusteeDomain()
             + "]";
    }
}
//SidItem
