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
import io.opensec.six.oval.model.definitions.EntityStateIntType;
import io.opensec.six.oval.model.definitions.EntityStateStringType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;



/**
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class Process58State
    extends StateType
{

    //{0..1}
    private EntityStateStringType   command_line;
    private EntityStateStringType   exec_time;
    private EntityStateIntType      pid;
    private EntityStateIntType      ppid;
    private EntityStateIntType      priority;
    private EntityStateIntType      ruid;
    private EntityStateStringType   scheduling_class;
    private EntityStateStringType   start_time;
    private EntityStateStringType   tty;
    private EntityStateIntType      user_id;
    private EntityStateBoolType     exec_shield;
    private EntityStateIntType      loginuid;
    private EntityStateCapabilityType  posix_capability;
    private EntityStateStringType   selinux_domain_label;
    private EntityStateIntType      session_id;



    /**
     * Constructor.
     */
    public Process58State()
    {
        this( null, 0 );
    }


    public Process58State(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public Process58State(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.unix;
//        _oval_component_type = OvalComponentType.process58;
        _oval_family = Family.UNIX;
        _oval_component = ComponentType.PROCESS58;
    }



    /**
     */
    public void setCommandLine(
                    final EntityStateStringType command_line
                    )
    {
        this.command_line = command_line;
    }


    public EntityStateStringType getCommandLine()
    {
        return command_line;
    }



    /**
     */
    public void setExecTime(
                    final EntityStateStringType exec_time
                    )
    {
        this.exec_time = exec_time;
    }


    public EntityStateStringType getExecTime()
    {
        return exec_time;
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
    public void setPpid(
                    final EntityStateIntType ppid
                    )
    {
        this.ppid = ppid;
    }


    public EntityStateIntType getPpid()
    {
        return ppid;
    }



    /**
     */
    public void setPriority(
                    final EntityStateIntType priority
                    )
    {
        this.priority = priority;
    }


    public EntityStateIntType getPriority()
    {
        return priority;
    }



    /**
     */
    public void setRuid(
                    final EntityStateIntType ruid
                    )
    {
        this.ruid = ruid;
    }


    public EntityStateIntType getRuid()
    {
        return ruid;
    }



    /**
     */
    public void setSchedulingClass(
                    final EntityStateStringType scheduling_class
                    )
    {
        this.scheduling_class = scheduling_class;
    }


    public EntityStateStringType getSchedulingClass()
    {
        return scheduling_class;
    }



    /**
     */
    public void setStartTime(
                    final EntityStateStringType start_time
                    )
    {
        this.start_time = start_time;
    }


    public EntityStateStringType getStartTime()
    {
        return start_time;
    }



    /**
     */
    public void setTty(
                    final EntityStateStringType tty
                    )
    {
        this.tty = tty;
    }


    public EntityStateStringType getTty()
    {
        return tty;
    }



    /**
     */
    public void setUserId(
                    final EntityStateIntType user_id
                    )
    {
        this.user_id = user_id;
    }


    public EntityStateIntType getUserId()
    {
        return user_id;
    }



    /**
     */
    public void setExecShield(
                    final EntityStateBoolType exec_shield
                    )
    {
        this.exec_shield= exec_shield;
    }


    public EntityStateBoolType getExecShield()
    {
        return exec_shield;
    }



    /**
     */
    public void setLoginuid(
                    final EntityStateIntType loginuid
                    )
    {
        this.loginuid = loginuid;
    }


    public EntityStateIntType getLoginuid()
    {
        return loginuid;
    }



    /**
     */
    public void setPosixCapability(
                    final EntityStateCapabilityType posix_capability
                    )
    {
        this.posix_capability = posix_capability;
    }


    public EntityStateCapabilityType getPosixCapability()
    {
        return posix_capability;
    }



    /**
     */
    public void setSelinuxDomainLabel(
                    final EntityStateStringType selinux_domain_label
                    )
    {
        this.selinux_domain_label = selinux_domain_label;
    }


    public EntityStateStringType getSelinuxDomainLabel()
    {
        return selinux_domain_label;
    }


    /**
     */
    public void setSessionId(
                    final EntityStateIntType session_id
                    )
    {
        this.session_id = session_id;
    }


    public EntityStateIntType getSessionId()
    {
        return session_id;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getCommandLine() );
        ref_list.add( getExecTime() );
        ref_list.add( getPid() );
        ref_list.add( getPpid() );
        ref_list.add( getPriority() );
        ref_list.add( getRuid() );
        ref_list.add( getSchedulingClass() );
        ref_list.add( getStartTime() );
        ref_list.add( getTty() );
        ref_list.add( getUserId() );
        ref_list.add( getExecShield() );
        ref_list.add( getLoginuid() );
        ref_list.add( getPosixCapability() );
        ref_list.add( getSelinuxDomainLabel() );
        ref_list.add( getSessionId() );

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
        if (!(obj instanceof Process58State)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "process58_state[" + super.toString()
             + ", command_line="            + getCommandLine()
             + ", exec_time="               + getExecTime()
             + ", pid="                     + getPid()
             + ", ppid="                    + getPpid()
             + ", priority="                + getPriority()
             + ", ruid="                    + getRuid()
             + ", scheduling_class="        + getSchedulingClass()
             + ", start_time="              + getStartTime()
             + ", tty="                     + getTty()
             + ", user_id="                 + getUserId()
             + ", exec_shield="             + getExecShield()
             + ", loginuid="                + getLoginuid()
             + ", posix_capability="        + getPosixCapability()
             + ", selinux_domain_label="    + getSelinuxDomainLabel()
             + ", session_id="              + getSessionId()
             + "]";
    }

}
//Process58State
