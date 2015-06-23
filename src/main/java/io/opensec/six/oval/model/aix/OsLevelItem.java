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
package io.opensec.six.oval.model.aix;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.sc.EntityItemVersionType;
import io.opensec.six.oval.model.sc.ItemType;



/**
 * Information about the release and maintenance level of AIX operating system.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class OsLevelItem
    extends ItemType
{

    //{0..1}
    private EntityItemVersionType  maintenance_level;



    /**
     * Constructor.
     */
    public OsLevelItem()
    {
        this( 0 );
    }


    public OsLevelItem(
                    final int id
                    )
    {
        super( id );

        _oval_family = Family.AIX;
        _oval_component = ComponentType.OSLEVEL;
    }



    /**
     */
    public void setMaintenanceLevel(
                    final EntityItemVersionType maintenance_level
                    )
    {
        this.maintenance_level = maintenance_level;
    }


    public EntityItemVersionType getMaintenanceLevel()
    {
        return maintenance_level;
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
        if (!(obj instanceof OsLevelItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "oslevel_item[" + super.toString()
                        + ", maintenance_level="    + getMaintenanceLevel()
                        + "]";
    }

}
//
