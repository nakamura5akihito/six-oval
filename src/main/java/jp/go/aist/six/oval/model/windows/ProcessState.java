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

import java.util.ArrayList;
import java.util.Collection;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.EntityStateIntType;
import jp.go.aist.six.oval.model.definitions.EntityStateStringType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 * The process state defines the different metadata
 * associate with a Windows process.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: ProcessState.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 * @deprecated Deprecated as of version 5.8:
 *             Replaced by the process58 object and
 *             will be removed in a future version of the language.
 */
@Deprecated
public class ProcessState
    extends StateType
{

    //{0..1}
    private EntityStateStringType   command_line;
    private EntityStateIntType      pid;
    private EntityStateIntType      ppid;
    private EntityStateStringType   priority;
    private EntityStateStringType   image_path;
    private EntityStateStringType   current_dir;



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

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.process;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.PROCESS;
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
             + ", command_line="        + getCommandLine()
             + ", pid="                 + getPid()
             + ", ppid="                + getPpid()
             + ", priority="            + getPriority()
             + ", image_path="          + getImagePath()
             + ", current_dir="         + getCurrentDir()
             + "]";
    }
}
//ProcessState
