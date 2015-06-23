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
package io.opensec.six.oval.model.independent;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.definitions.EntityStateStringType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;



/**
 * The filehash state contains entities that are used to check the file path,
 * name, and the different hashes associated with a specific file.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 * @deprecated Deprecated as of version 5.8:
 *             Replaced by the filehash58 state and
 *             will be removed in a future version of the language.
 */
@Deprecated
public class FileHashState
    extends StateType
{

    private EntityStateStringType  filepath;
    //{0..1}

    private EntityStateStringType  path;
    //{0..1}

    private EntityStateStringType  filename;
    //{0..1}

    private EntityStateStringType  md5;
    //{0..1}

    private EntityStateStringType  sha1;
    //{0..1}


    private EntityStateWindowsViewType  windows_view;
    //{0..1}



    /**
     * Constructor.
     */
    public FileHashState()
    {
        this( null, 0 );
    }


    public FileHashState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public FileHashState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.independent;
//        _oval_component_type = OvalComponentType.filehash;
        _oval_family = Family.INDEPENDENT;
        _oval_component = ComponentType.FILEHASH;
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
    public void setMd5(
                    final EntityStateStringType md5
                    )
    {
        this.md5 = md5;
    }


    public EntityStateStringType getMd5()
    {
        return md5;
    }



    /**
     */
    public void setSha1(
                    final EntityStateStringType sha1
                    )
    {
        this.sha1 = sha1;
    }


    public EntityStateStringType getSha1()
    {
        return sha1;
    }



    /**
     */
    public void setWindowsView(
                    final EntityStateWindowsViewType windows_view
                    )
    {
        this.windows_view = windows_view;
    }


    public EntityStateWindowsViewType getWindowsView()
    {
        return windows_view;
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
        ref_list.add( getMd5() );
        ref_list.add( getSha1() );
        ref_list.add( getWindowsView() );

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
        if (!(obj instanceof FileHashState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "filehash_state[" + super.toString()
                        + ", filepath="     + getFilepath()
                        + ", path="         + getPath()
                        + ", filename="     + getFilename()
                        + ", md5="          + getMd5()
                        + ", sha1="         + getSha1()
                        + ", windows_view=" + getWindowsView()
                        + "]";
    }

}
// FileHashState
