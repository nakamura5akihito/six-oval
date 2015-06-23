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
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.ItemType;



/**
 * The filehash58 item stores a hash value associated with a specific file.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class FileHash58Item
    extends ItemType
{

    private EntityItemStringType  filepath;
    //{0..1}

    private EntityItemStringType  path;
    //{0..1}

    private EntityItemStringType  filename;
    //{0..1}

    private EntityItemHashTypeType  hash_type;
    //{0..1}

    private EntityItemStringType  hash;
    //{0..1}


    private EntityItemWindowsViewType  windows_view;
    //{0..1}



    /**
     * Constructor.
     */
    public FileHash58Item()
    {
        this( 0 );
    }


    public FileHash58Item(
                    final int id
                    )
    {
        super( id );

//        _oval_platform_type = OvalPlatformType.independent;
//        _oval_component_type = OvalComponentType.filehash58;
        _oval_family = Family.INDEPENDENT;
        _oval_component = ComponentType.FILEHASH58;
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
    public void setHashType(
                    final EntityItemHashTypeType hash_type
                    )
    {
        this.hash_type = hash_type;
    }


    public EntityItemHashTypeType getHashType()
    {
        return hash_type;
    }



    /**
     */
    public void setHash(
                    final EntityItemStringType hash
                    )
    {
        this.hash = hash;
    }


    public EntityItemStringType getHash()
    {
        return hash;
    }



    /**
     */
    public void setWindowsView(
                    final EntityItemWindowsViewType windows_view
                    )
    {
        this.windows_view = windows_view;
    }


    public EntityItemWindowsViewType getWindowsView()
    {
        return windows_view;
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
        if (!(obj instanceof FileHash58Item)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "filehash58_item[" + super.toString()
                        + ", filepath="     + getFilepath()
                        + ", path="         + getPath()
                        + ", filename="     + getFilename()
                        + ", hash_type="    + getHashType()
                        + ", hash="         + getHash()
                        + ", windows_view=" + getWindowsView()
                        + "]";
    }

}
// FileHash58Item
