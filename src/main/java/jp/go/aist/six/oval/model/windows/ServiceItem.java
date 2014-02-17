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
import jp.go.aist.six.oval.model.sc.EntityItemBoolType;
import jp.go.aist.six.oval.model.sc.EntityItemIntType;
import jp.go.aist.six.oval.model.sc.EntityItemStringType;
import jp.go.aist.six.oval.model.sc.ItemType;
import jp.go.aist.six.oval.model.sc.StatusEnumeration;



/**
 * This item stores information about Windows services that are present on the system.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: ServiceItem.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class ServiceItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType                   service_name;
    private EntityItemStringType                   display_name;
    private EntityItemStringType                   description;
    private EntityItemServiceTypeType              service_type;
    private EntityItemServiceStartTypeType         start_type;
    private EntityItemServiceCurrentStateType      current_state;
    private EntityItemServiceControlsAcceptedType  controls_accepted;
    private EntityItemStringType                   start_name;
    private EntityItemStringType                   path;
    private EntityItemIntType                      pid;
    private EntityItemBoolType                     service_flag;
    private EntityItemStringType                   dependencies;



    /**
     * Constructor.
     */
    public ServiceItem()
    {
        this( 0 );
    }


    public ServiceItem(
                    final int id
                    )
    {
        this( id, null );
    }


    public ServiceItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        super( id, status );

        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.SERVICE;
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
    public void setDisplayName(
                    final EntityItemStringType display_name
                    )
    {
        this.display_name = display_name;
    }


    public EntityItemStringType getDisplayName()
    {
        return display_name;
    }



    /**
     */
    public void setDescription(
                    final EntityItemStringType description
                    )
    {
        this.description = description;
    }


    public EntityItemStringType getDescription()
    {
        return description;
    }



    /**
     */
    public void setServiceType(
                    final EntityItemServiceTypeType service_type
                    )
    {
        this.service_type = service_type;
    }


    public EntityItemServiceTypeType getServiceType()
    {
        return service_type;
    }



    /**
     */
    public void setStartType(
                    final EntityItemServiceStartTypeType start_type
                    )
    {
        this.start_type = start_type;
    }


    public EntityItemServiceStartTypeType getStartType()
    {
        return start_type;
    }



    /**
     */
    public void setCurrentState(
                    final EntityItemServiceCurrentStateType current_state
                    )
    {
        this.current_state = current_state;
    }


    public EntityItemServiceCurrentStateType getCurrentState()
    {
        return current_state;
    }



    /**
     */
    public void setControlsAccepted(
                    final EntityItemServiceControlsAcceptedType controls_accepted
                    )
    {
        this.controls_accepted = controls_accepted;
    }


    public EntityItemServiceControlsAcceptedType getControlsAccepted()
    {
        return controls_accepted;
    }



    /**
     */
    public void setStartName(
                    final EntityItemStringType start_name
                    )
    {
        this.start_name = start_name;
    }


    public EntityItemStringType getStartName()
    {
        return start_name;
    }



    /**
     */
    public void setPath(
                    final EntityItemStringType path
                    )
    {
        this.path = path;
    }


    public EntityItemStringType getPath()
    {
        return path;
    }



    /**
     */
    public void setPid(
                    final EntityItemIntType pid
                    )
    {
        this.pid = pid;
    }


    public EntityItemIntType getPid()
    {
        return pid;
    }



    /**
     */
    public void setServiceFlag(
                    final EntityItemBoolType service_flag
                    )
    {
        this.service_flag = service_flag;
    }


    public EntityItemBoolType getServiceFlag()
    {
        return service_flag;
    }



    /**
     */
    public void setDependencies(
                    final EntityItemStringType dependencies
                    )
    {
        this.dependencies = dependencies;
    }


    public EntityItemStringType getDependencies()
    {
        return dependencies;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "service_item[" + super.toString()
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
