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
import io.opensec.six.oval.model.definitions.EntityStateBoolType;
import io.opensec.six.oval.model.definitions.EntityStateIntType;
import io.opensec.six.oval.model.definitions.EntityStateStringType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;



/**
 * The service_state defines the different metadata associated with a Windows service.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class ServiceState
    extends StateType
{

    //{0..1}
    private EntityStateStringType                   service_name;
    private EntityStateStringType                   display_name;
    private EntityStateStringType                   description;
    private EntityStateServiceTypeType              service_type;
    private EntityStateServiceStartTypeType         start_type;
    private EntityStateServiceCurrentStateType      current_state;
    private EntityStateServiceControlsAcceptedType  controls_accepted;
    private EntityStateStringType                   start_name;
    private EntityStateStringType                   path;
    private EntityStateIntType                      pid;
    private EntityStateBoolType                     service_flag;
    private EntityStateStringType                   dependencies;



    /**
     * Constructor.
     */
    public ServiceState()
    {
        this( null, 0 );
    }


    public ServiceState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public ServiceState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.SERVICE;
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
    public void setDisplayName(
                    final EntityStateStringType display_name
                    )
    {
        this.display_name = display_name;
    }


    public EntityStateStringType getDisplayName()
    {
        return display_name;
    }



    /**
     */
    public void setDescription(
                    final EntityStateStringType description
                    )
    {
        this.description = description;
    }


    public EntityStateStringType getDescription()
    {
        return description;
    }



    /**
     */
    public void setServiceType(
                    final EntityStateServiceTypeType service_type
                    )
    {
        this.service_type = service_type;
    }


    public EntityStateServiceTypeType getServiceType()
    {
        return service_type;
    }



    /**
     */
    public void setStartType(
                    final EntityStateServiceStartTypeType start_type
                    )
    {
        this.start_type = start_type;
    }


    public EntityStateServiceStartTypeType getStartType()
    {
        return start_type;
    }



    /**
     */
    public void setCurrentState(
                    final EntityStateServiceCurrentStateType current_state
                    )
    {
        this.current_state = current_state;
    }


    public EntityStateServiceCurrentStateType getCurrentState()
    {
        return current_state;
    }



    /**
     */
    public void setControlsAccepted(
                    final EntityStateServiceControlsAcceptedType controls_accepted
                    )
    {
        this.controls_accepted = controls_accepted;
    }


    public EntityStateServiceControlsAcceptedType getControlsAccepted()
    {
        return controls_accepted;
    }



    /**
     */
    public void setStartName(
                    final EntityStateStringType start_name
                    )
    {
        this.start_name = start_name;
    }


    public EntityStateStringType getStartName()
    {
        return start_name;
    }



    /**
     */
    public void setPath(
                    final EntityStateStringType path
                    )
    {
        this.path = path;
    }


    public EntityStateStringType getPath()
    {
        return path;
    }



    /**
     */
    public void setPid(
                    final EntityStateIntType pid
                    )
    {
        this.pid = pid;
    }


    public EntityStateIntType getPid()
    {
        return pid;
    }



    /**
     */
    public void setServiceFlag(
                    final EntityStateBoolType service_flag
                    )
    {
        this.service_flag = service_flag;
    }


    public EntityStateBoolType getServiceFlag()
    {
        return service_flag;
    }



    /**
     */
    public void setDependencies(
                    final EntityStateStringType dependencies
                    )
    {
        this.dependencies = dependencies;
    }


    public EntityStateStringType getDependencies()
    {
        return dependencies;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getServiceName() );
        ref_list.add( getDisplayName() );
        ref_list.add( getDescription() );
        ref_list.add( getServiceType() );
        ref_list.add( getStartType() );
        ref_list.add( getCurrentState() );
        ref_list.add( getControlsAccepted() );
        ref_list.add( getStartName() );
        ref_list.add( getPath() );
        ref_list.add( getPid() );
        ref_list.add( getServiceFlag() );
        ref_list.add( getDependencies() );

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
        if (!(obj instanceof ServiceState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "service_state[" + super.toString()
             + ", service_name="        + getServiceName()
             + ", display_name="        + getDisplayName()
             + ", description="         + getDescription()
             + ", service_type="        + getServiceType()
             + ", start_type="          + getStartType()
             + ", current_state="       + getCurrentState()
             + ", controls_accepted="   + getControlsAccepted()
             + ", start_name="          + getStartName()
             + ", path="                + getPath()
             + ", pid="                 + getPid()
             + ", service_flag="        + getServiceFlag()
             + ", dependencies="        + getDependencies()
             + "]";
    }

}
//
