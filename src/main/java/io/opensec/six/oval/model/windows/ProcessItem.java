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
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.sc.EntityItemBoolType;
import io.opensec.six.oval.model.sc.EntityItemIntType;
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.ItemType;
import io.opensec.six.oval.model.sc.StatusEnumeration;



/**
 * This item stores the information about running processes.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class ProcessItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType   command_line;
    private EntityItemIntType      pid;
    private EntityItemIntType      ppid;
    private EntityItemStringType   priority;
    private EntityItemStringType   image_path;
    private EntityItemStringType   current_dir;
    private EntityItemIntType      creation_time;
    private EntityItemBoolType     dep_enabled;
    private EntityItemStringType   primary_window_text;



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

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.process;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.PROCESS;
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
                    final EntityItemStringType priority
                    )
    {
        this.priority = priority;
    }


    public EntityItemStringType getPriority()
    {
        return priority;
    }



    /**
     */
    public void setImagePath(
                    final EntityItemStringType image_path
                    )
    {
        this.image_path = image_path;
    }


    public EntityItemStringType getImagePath()
    {
        return image_path;
    }



    /**
     */
    public void setCurrentDir(
                    final EntityItemStringType current_dir
                    )
    {
        this.current_dir = current_dir;
    }


    public EntityItemStringType getCurrentDir()
    {
        return current_dir;
    }



    /**
     */
    public void setCreationTime(
                    final EntityItemIntType creation_time
                    )
    {
        this.creation_time = creation_time;
    }


    public EntityItemIntType getCreationTime()
    {
        return creation_time;
    }



    /**
     */
    public void setDepEnabled(
                    final EntityItemBoolType dep_enabled
                    )
    {
        this.dep_enabled = dep_enabled;
    }


    public EntityItemBoolType getDepEnabled()
    {
        return dep_enabled;
    }



    /**
     */
    public void setPrimaryWindowText(
                    final EntityItemStringType primary_window_text
                    )
    {
        this.primary_window_text = primary_window_text;
    }


    public EntityItemStringType getPrimaryWindowText()
    {
        return primary_window_text;
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
//ProcessItem
