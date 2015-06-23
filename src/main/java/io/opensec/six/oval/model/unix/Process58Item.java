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
import io.opensec.six.oval.model.sc.EntityItemIntType;
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.ItemType;
import io.opensec.six.oval.model.sc.StatusEnumeration;



/**
 * The file item holds information about the individual files found on a system.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class Process58Item
    extends ItemType
{

    //{0..1}
    private EntityItemStringType   command_line;
    private EntityItemStringType   exec_time;
    private EntityItemIntType      pid;
    private EntityItemIntType      ppid;
    private EntityItemIntType      priority;
    private EntityItemIntType      ruid;
    private EntityItemStringType   scheduling_class;
    private EntityItemStringType   start_time;
    private EntityItemStringType   tty;
    private EntityItemIntType      user_id;
    private EntityItemBoolType     exec_shield;
    private EntityItemIntType      loginuid;
    private EntityItemCapabilityType  posix_capability;
    private EntityItemStringType   selinux_domain_label;
    private EntityItemIntType      session_id;



    /**
     * Constructor.
     */
    public Process58Item()
    {
        this( 0 );
    }


    public Process58Item(
                    final int id
                    )
    {
        this( id, null );
    }


    public Process58Item(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        super( id, status );

//        _oval_platform_type = OvalPlatformType.unix;
//        _oval_component_type = OvalComponentType.process58;
        _oval_family = Family.UNIX;
        _oval_component = ComponentType.PROCESS58;
    }



    /**
     */
    public void setCommandLine(
                    final EntityItemStringType command_line
                    )
    {
        this.command_line = command_line;
    }


    public EntityItemStringType getCommandLine()
    {
        return command_line;
    }



    /**
     */
    public void setExecTime(
                    final EntityItemStringType exec_time
                    )
    {
        this.exec_time = exec_time;
    }


    public EntityItemStringType getExecTime()
    {
        return exec_time;
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
    public void setPpid(
                    final EntityItemIntType ppid
                    )
    {
        this.ppid = ppid;
    }


    public EntityItemIntType getPpid()
    {
        return ppid;
    }



    /**
     */
    public void setPriority(
                    final EntityItemIntType priority
                    )
    {
        this.priority = priority;
    }


    public EntityItemIntType getPriority()
    {
        return priority;
    }



    /**
     */
    public void setRuid(
                    final EntityItemIntType ruid
                    )
    {
        this.ruid = ruid;
    }


    public EntityItemIntType getRuid()
    {
        return ruid;
    }



    /**
     */
    public void setSchedulingClass(
                    final EntityItemStringType scheduling_class
                    )
    {
        this.scheduling_class = scheduling_class;
    }


    public EntityItemStringType getSchedulingClass()
    {
        return scheduling_class;
    }



    /**
     */
    public void setStartTime(
                    final EntityItemStringType start_time
                    )
    {
        this.start_time = start_time;
    }


    public EntityItemStringType getStartTime()
    {
        return start_time;
    }



    /**
     */
    public void setTty(
                    final EntityItemStringType tty
                    )
    {
        this.tty = tty;
    }


    public EntityItemStringType getTty()
    {
        return tty;
    }



    /**
     */
    public void setUserId(
                    final EntityItemIntType user_id
                    )
    {
        this.user_id = user_id;
    }


    public EntityItemIntType getUserId()
    {
        return user_id;
    }



    /**
     */
    public void setExecShield(
                    final EntityItemBoolType exec_shield
                    )
    {
        this.exec_shield= exec_shield;
    }


    public EntityItemBoolType getExecShield()
    {
        return exec_shield;
    }



    /**
     */
    public void setLoginuid(
                    final EntityItemIntType loginuid
                    )
    {
        this.loginuid = loginuid;
    }


    public EntityItemIntType getLoginuid()
    {
        return loginuid;
    }



    /**
     */
    public void setPosixCapability(
                    final EntityItemCapabilityType posix_capability
                    )
    {
        this.posix_capability = posix_capability;
    }


    public EntityItemCapabilityType getPosixCapability()
    {
        return posix_capability;
    }



    /**
     */
    public void setSelinuxDomainLabel(
                    final EntityItemStringType selinux_domain_label
                    )
    {
        this.selinux_domain_label = selinux_domain_label;
    }


    public EntityItemStringType getSelinuxDomainLabel()
    {
        return selinux_domain_label;
    }


    /**
     */
    public void setSessionId(
                    final EntityItemIntType session_id
                    )
    {
        this.session_id = session_id;
    }


    public EntityItemIntType getSessionId()
    {
        return session_id;
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
        if (!(obj instanceof Process58Item)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "process58_item[" + super.toString()
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
//Process58Item
