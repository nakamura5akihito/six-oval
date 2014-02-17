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
package jp.go.aist.six.oval.model.unix;

import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.sc.EntityItemIntType;
import jp.go.aist.six.oval.model.sc.EntityItemStringType;
import jp.go.aist.six.oval.model.sc.ItemType;
import jp.go.aist.six.oval.model.sc.StatusEnumeration;



/**
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: ProcessItem.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 * @deprecated Deprecated as of version 5.8:
 *             Replaced by the process58 item.
 */
@Deprecated
public class ProcessItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType   command;
    private EntityItemStringType   exec_time;
    private EntityItemIntType      pid;
    private EntityItemIntType      ppid;
    private EntityItemIntType      priority;
    private EntityItemIntType      ruid;
    private EntityItemStringType   scheduling_class;
    private EntityItemStringType   start_time;
    private EntityItemStringType   tty;
    private EntityItemIntType      user_id;



    /**
     * Constructor.
     */
    public ProcessItem()
    {
        this( 0 );
    }


    public ProcessItem(
                    final int id
                    )
    {
        this( id, null );
    }


    public ProcessItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        super( id, status );

//        _oval_platform_type = OvalPlatformType.unix;
//        _oval_component_type = OvalComponentType.process;
        _oval_family = Family.UNIX;
        _oval_component = ComponentType.PROCESS;
    }



    /**
     */
    public void setCommand(
                    final EntityItemStringType command
                    )
    {
        this.command = command;
    }


    public EntityItemStringType getCommand()
    {
        return command;
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
        if (!(obj instanceof ProcessItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "process_item[" + super.toString()
                        + ", command="              + getCommand()
                        + ", exec_time="            + getExecTime()
                        + ", pid="                  + getPid()
                        + ", ppid="                 + getPpid()
                        + ", priority="             + getPriority()
                        + ", ruid="                 + getRuid()
                        + ", scheduling_class="     + getSchedulingClass()
                        + ", start_time="           + getStartTime()
                        + ", tty="                  + getTty()
                        + ", user_id="              + getUserId()
             + "]";
    }

}
//ProcessItem
