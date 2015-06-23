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
 * The process58 state defines the different metadata
 * associate with a Windows process.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class Process58State
    extends StateType
{

    //{0..1}
    private EntityStateStringType   command_line;
    private EntityStateIntType      pid;
    private EntityStateIntType      ppid;
    private EntityStateStringType   priority;
    private EntityStateStringType   image_path;
    private EntityStateStringType   current_dir;
    private EntityStateIntType      creation_time;
    private EntityStateBoolType     dep_enabled;
    private EntityStateStringType   primary_window_text;



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

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.process58;
        _oval_family = Family.WINDOWS;
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
                    final EntityStateStringType priority
                    )
    {
        this.priority = priority;
    }


    public EntityStateStringType getPriority()
    {
        return priority;
    }



    /**
     */
    public void setImagePath(
                    final EntityStateStringType image_path
                    )
    {
        this.image_path = image_path;
    }


    public EntityStateStringType getImagePath()
    {
        return image_path;
    }



    /**
     */
    public void setCurrentDir(
                    final EntityStateStringType current_dir
                    )
    {
        this.current_dir = current_dir;
    }


    public EntityStateStringType getCurrentDir()
    {
        return current_dir;
    }



    /**
     */
    public void setCreationTime(
                    final EntityStateIntType creation_time
                    )
    {
        this.creation_time = creation_time;
    }


    public EntityStateIntType getCreationTime()
    {
        return creation_time;
    }



    /**
     */
    public void setDepEnabled(
                    final EntityStateBoolType dep_enabled
                    )
    {
        this.dep_enabled = dep_enabled;
    }


    public EntityStateBoolType getDepEnabled()
    {
        return dep_enabled;
    }



    /**
     */
    public void setPrimaryWindowText(
                    final EntityStateStringType primary_window_text
                    )
    {
        this.primary_window_text = primary_window_text;
    }


    public EntityStateStringType getPrimaryWindowText()
    {
        return primary_window_text;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();

        ref_list.add( getCommandLine() );
        ref_list.add( getPid() );
        ref_list.add( getPpid() );
        ref_list.add( getPriority() );
        ref_list.add( getImagePath() );
        ref_list.add( getCurrentDir() );
        ref_list.add( getCreationTime() );
        ref_list.add( getDepEnabled() );
        ref_list.add( getPrimaryWindowText() );

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
             + ", command_line="        + getCommandLine()
             + ", pid="                 + getPid()
             + ", ppid="                + getPpid()
             + ", priority="            + getPriority()
             + ", image_path="          + getImagePath()
             + ", current_dir="         + getCurrentDir()
             + ", creation_time="       + getCreationTime()
             + ", dep_enabled="         + getDepEnabled()
             + ", primary_window_text=" + getPrimaryWindowText()
             + "]";
    }
}
//Process58State
