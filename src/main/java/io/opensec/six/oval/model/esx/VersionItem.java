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
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.sc.EntityItemIntType;
import io.opensec.six.oval.model.sc.EntityItemVersionType;
import io.opensec.six.oval.model.sc.ItemType;



/**
 * Information about the release and build version of VMware ESX server.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class VersionItem
    extends ItemType
{

    //{0..1}
    private EntityItemVersionType           release;
    private EntityItemIntType               build;



    /**
     * Constructor.
     */
    public VersionItem()
    {
        this( 0 );
    }


    public VersionItem(
                    final int id
                    )
    {
        super( id );

        _oval_family = Family.ESX;
        _oval_component = ComponentType.VERSION;
    }



    /**
     */
    public void setRelease(
                    final EntityItemVersionType release
                    )
    {
        this.release = release;
    }


    public EntityItemVersionType getRelease()
    {
        return release;
    }



    /**
     */
    public void setBuild(
                    final EntityItemIntType build
                    )
    {
        this.build = build;
    }


    public EntityItemIntType getBuild()
    {
        return build;
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
        if (!(obj instanceof VersionItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "version_item[" + super.toString()
                        + ", release="  + getRelease()
                        + ", build="    + getBuild()
                        + "]";
    }

}
//
