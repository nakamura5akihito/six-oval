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
package io.opensec.six.oval.model.unix;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.sc.EntityItemBoolType;
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.ItemType;
import io.opensec.six.oval.model.sc.StatusEnumeration;



/**
 * The runlevel item holds information
 * about the start or kill state of a specified service at a given runlevel.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class RunlevelItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType       service_name;
    private EntityItemStringType       runlevel;
    private EntityItemBoolType         start;
    private EntityItemBoolType         kill;



    /**
     * Constructor.
     */
    public RunlevelItem()
    {
        this( 0 );
    }


    public RunlevelItem(
                    final int id
                    )
    {
        this( id, null );
    }


    public RunlevelItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        super( id, status );

//        _oval_platform_type = OvalPlatformType.unix;
//        _oval_component_type = OvalComponentType.runlevel;
        _oval_family = Family.UNIX;
        _oval_component = ComponentType.RUNLEVEL;
    }



    /**
     */
    public void setServiceName(
                    final EntityItemStringType service_name
                    )
    {
        this.service_name = service_name;
    }


    public EntityItemStringType getServiceName()
    {
        return service_name;
    }



    /**
     */
    public void setRunlevel(
                    final EntityItemStringType runlevel
                    )
    {
        this.runlevel = runlevel;
    }


    public EntityItemStringType getRunlevel()
    {
        return runlevel;
    }



    /**
     */
    public void setStart(
                    final EntityItemBoolType start
                    )
    {
        this.start = start;
    }


    public EntityItemBoolType getStart()
    {
        return start;
    }



    /**
     */
    public void setKill(
                    final EntityItemBoolType kill
                    )
    {
        this.kill = kill;
    }


    public EntityItemBoolType getKill()
    {
        return kill;
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
        if (!(obj instanceof RunlevelItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "inetd_item[" + super.toString()
                        + ", service_name="     + getServiceName()
                        + ", runlevel="         + getRunlevel()
                        + ", start="            + getStart()
                        + ", kill="             + getKill()
             + "]";
    }

}
//RunlevelItem
