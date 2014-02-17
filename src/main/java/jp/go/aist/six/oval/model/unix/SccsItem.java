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
import jp.go.aist.six.oval.model.sc.EntityItemStringType;
import jp.go.aist.six.oval.model.sc.ItemType;
import jp.go.aist.six.oval.model.sc.StatusEnumeration;



/**
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: SccsItem.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 * @deprecated Deprecated as of version 5.10:
 *             The Source Code Control System (SCCS) is obsolete.
 *             The sccs_test may be removed in a future version of the language.
 */
@Deprecated
public class SccsItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType   filepath;
    private EntityItemStringType   path;
    private EntityItemStringType   filename;
    private EntityItemStringType   module_name;
    private EntityItemStringType   module_type;
    private EntityItemStringType   release;
    private EntityItemStringType   level;
    private EntityItemStringType   branch;
    private EntityItemStringType   sequence;
    private EntityItemStringType   what_string;



    /**
     * Constructor.
     */
    public SccsItem()
    {
        this( 0 );
    }


    public SccsItem(
                    final int id
                    )
    {
        this( id, null );
    }


    public SccsItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        super( id, status );

        _oval_family = Family.UNIX;
        _oval_component = ComponentType.SCCS;
    }



    /**
     */
    public void setFilepath(
                    final EntityItemStringType filepath
                    )
    {
        this.filepath = filepath;
    }


    public EntityItemStringType getFilepath()
    {
        return filepath;
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
    public void setFilename(
                    final EntityItemStringType filename
                    )
    {
        this.filename = filename;
    }


    public EntityItemStringType getFilename()
    {
        return filename;
    }



    /**
     */
    public void setModuleName(
                    final EntityItemStringType module_name
                    )
    {
        this.module_name = module_name;
    }


    public EntityItemStringType getModuleName()
    {
        return module_name;
    }



    /**
     */
    public void setModuleType(
                    final EntityItemStringType module_type
                    )
    {
        this.module_type = module_type;
    }


    public EntityItemStringType getModuleType()
    {
        return module_type;
    }



    /**
     */
    public void setRelease(
                    final EntityItemStringType release
                    )
    {
        this.release = release;
    }


    public EntityItemStringType getRelease()
    {
        return release;
    }



    /**
     */
    public void setLevel(
                    final EntityItemStringType level
                    )
    {
        this.level = level;
    }


    public EntityItemStringType getLevel()
    {
        return level;
    }



    /**
     */
    public void setBranch(
                    final EntityItemStringType branch
                    )
    {
        this.branch = branch;
    }


    public EntityItemStringType getBranch()
    {
        return branch;
    }



    /**
     */
    public void setSequence(
                    final EntityItemStringType sequence
                    )
    {
        this.sequence = sequence;
    }


    public EntityItemStringType getSequence()
    {
        return sequence;
    }



    /**
     */
    public void setWhatString(
                    final EntityItemStringType what_string
                    )
    {
        this.what_string = what_string;
    }


    public EntityItemStringType getWhatString()
    {
        return what_string;
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
        if (!(obj instanceof SccsItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "sccs_item[" + super.toString()
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
