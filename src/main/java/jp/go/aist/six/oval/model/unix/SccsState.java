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
import jp.go.aist.six.oval.model.definitions.EntityStateStringType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: SccsState.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 * @deprecated Deprecated as of version 5.10:
 *             The Source Code Control System (SCCS) is obsolete.
 *             The sccs_test may be removed in a future version of the language.
 */
@Deprecated
public class SccsState
    extends StateType
{

    //{0..1}
    private EntityStateStringType   filepath;
    private EntityStateStringType   path;
    private EntityStateStringType   filename;
    private EntityStateStringType   module_name;
    private EntityStateStringType   module_type;
    private EntityStateStringType   release;
    private EntityStateStringType   level;
    private EntityStateStringType   branch;
    private EntityStateStringType   sequence;
    private EntityStateStringType   what_string;



    /**
     * Constructor.
     */
    public SccsState()
    {
        this( null, 0 );
    }


    public SccsState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public SccsState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.UNIX;
        _oval_component = ComponentType.SCCS;
    }



    /**
     */
    public void setFilepath(
                    final EntityStateStringType filepath
                    )
    {
        this.filepath = filepath;
    }


    public EntityStateStringType getFilepath()
    {
        return filepath;
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
    public void setFilename(
                    final EntityStateStringType filename
                    )
    {
        this.filename = filename;
    }


    public EntityStateStringType getFilename()
    {
        return filename;
    }



    /**
     */
    public void setModuleName(
                    final EntityStateStringType module_name
                    )
    {
        this.module_name = module_name;
    }


    public EntityStateStringType getModuleName()
    {
        return module_name;
    }



    /**
     */
    public void setModuleType(
                    final EntityStateStringType module_type
                    )
    {
        this.module_type = module_type;
    }


    public EntityStateStringType getModuleType()
    {
        return module_type;
    }



    /**
     */
    public void setRelease(
                    final EntityStateStringType release
                    )
    {
        this.release = release;
    }


    public EntityStateStringType getRelease()
    {
        return release;
    }



    /**
     */
    public void setLevel(
                    final EntityStateStringType level
                    )
    {
        this.level = level;
    }


    public EntityStateStringType getLevel()
    {
        return level;
    }



    /**
     */
    public void setBranch(
                    final EntityStateStringType branch
                    )
    {
        this.branch = branch;
    }


    public EntityStateStringType getBranch()
    {
        return branch;
    }



    /**
     */
    public void setSequence(
                    final EntityStateStringType sequence
                    )
    {
        this.sequence = sequence;
    }


    public EntityStateStringType getSequence()
    {
        return sequence;
    }



    /**
     */
    public void setWhatString(
                    final EntityStateStringType what_string
                    )
    {
        this.what_string = what_string;
    }


    public EntityStateStringType getWhatString()
    {
        return what_string;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getFilepath() );
        ref_list.add( getPath() );
        ref_list.add( getFilename() );
        ref_list.add( getModuleName() );
        ref_list.add( getModuleType() );
        ref_list.add( getRelease() );
        ref_list.add( getLevel() );
        ref_list.add( getBranch() );
        ref_list.add( getSequence() );
        ref_list.add( getWhatString() );

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
        if (!(obj instanceof SccsState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "sccs_state[" + super.toString()
             + ", filepath="        + getFilepath()
             + ", path="            + getPath()
             + ", filename="        + getFilename()
             + ", module_name="     + getModuleName()
             + ", module_type="     + getModuleType()
             + ", release="         + getRelease()
             + ", level="           + getLevel()
             + ", branch="          + getBranch()
             + ", sequence="        + getSequence()
             + ", what_string="     + getWhatString()
             + "]";
    }

}
//
