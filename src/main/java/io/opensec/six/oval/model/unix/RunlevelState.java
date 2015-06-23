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
import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.definitions.EntityStateBoolType;
import io.opensec.six.oval.model.definitions.EntityStateStringType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;



/**
 * The runlevel state holds information about
 * whether a specific service is scheduled to start or stop at a given runlevel.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class RunlevelState
    extends StateType
{

    //{0..1}
    private EntityStateStringType       service_name;
    private EntityStateStringType       runlevel;
    private EntityStateBoolType         start;
    private EntityStateBoolType         kill;



    /**
     * Constructor.
     */
    public RunlevelState()
    {
        this( null, 0 );
    }


    public RunlevelState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public RunlevelState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.unix;
//        _oval_component_type = OvalComponentType.runlevel;
        _oval_family = Family.UNIX;
        _oval_component = ComponentType.RUNLEVEL;
    }



    /**
     */
    public void setServiceName(
                    final EntityStateStringType service_name
                    )
    {
        this.service_name = service_name;
    }


    public EntityStateStringType getServiceName()
    {
        return service_name;
    }



    /**
     */
    public void setRunlevel(
                    final EntityStateStringType runlevel
                    )
    {
        this.runlevel = runlevel;
    }


    public EntityStateStringType getRunlevel()
    {
        return runlevel;
    }



    /**
     */
    public void setStart(
                    final EntityStateBoolType start
                    )
    {
        this.start = start;
    }


    public EntityStateBoolType getStart()
    {
        return start;
    }



    /**
     */
    public void setKill(
                    final EntityStateBoolType kill
                    )
    {
        this.kill = kill;
    }


    public EntityStateBoolType getKill()
    {
        return kill;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getServiceName() );
        ref_list.add( getRunlevel() );
        ref_list.add( getStart() );
        ref_list.add( getKill() );

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
        if (!(obj instanceof RunlevelState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "runlevel_state[" + super.toString()
                        + ", service_name="     + getServiceName()
                        + ", runlevel="         + getRunlevel()
                        + ", start="            + getStart()
                        + ", kill="             + getKill()
             + "]";
    }

}
//RunlevelState
