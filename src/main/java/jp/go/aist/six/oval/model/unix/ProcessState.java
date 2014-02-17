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

import java.util.ArrayList;
import java.util.Collection;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.EntityStateIntType;
import jp.go.aist.six.oval.model.definitions.EntityStateStringType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: ProcessState.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 * @deprecated Deprecated as of version 5.8:
 *             Replaced by the process58 state.
 */
@Deprecated
public class ProcessState
    extends StateType
{

    //{0..1}
    private EntityStateStringType   command;
    private EntityStateStringType   exec_time;
    private EntityStateIntType      pid;
    private EntityStateIntType      ppid;
    private EntityStateIntType      priority;
    private EntityStateIntType      ruid;
    private EntityStateStringType   scheduling_class;
    private EntityStateStringType   start_time;
    private EntityStateStringType   tty;
    private EntityStateIntType      user_id;



    /**
     * Constructor.
     */
    public ProcessState()
    {
        this( null, 0 );
    }


    public ProcessState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public ProcessState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.unix;
//        _oval_component_type = OvalComponentType.process;
        _oval_family = Family.UNIX;
        _oval_component = ComponentType.PROCESS;
    }



    /**
     */
    public void setCommand(
                    final EntityStateStringType command
                    )
    {
        this.command = command;
    }


    public EntityStateStringType getCommand()
    {
        return command;
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



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getCommand() );
        ref_list.add( getExecTime() );
        ref_list.add( getPid() );
        ref_list.add( getPpid() );
        ref_list.add( getPriority() );
        ref_list.add( getRuid() );
        ref_list.add( getSchedulingClass() );
        ref_list.add( getStartTime() );
        ref_list.add( getTty() );
        ref_list.add( getUserId() );

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
        if (!(obj instanceof ProcessState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "process_state[" + super.toString()
             + ", command="             + getCommand()
             + ", exec_time="           + getExecTime()
             + ", pid="                 + getPid()
             + ", ppid="                + getPpid()
             + ", priority="            + getPriority()
             + ", ruid="                + getRuid()
             + ", scheduling_class="    + getSchedulingClass()
             + ", start_time="          + getStartTime()
             + ", tty="                 + getTty()
             + ", user_id="             + getUserId()
             + "]";
    }

}
//ProcessState
