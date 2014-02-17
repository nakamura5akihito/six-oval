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
import jp.go.aist.six.oval.model.sc.EntityItemAnySimpleType;
import jp.go.aist.six.oval.model.sc.EntityItemStringType;
import jp.go.aist.six.oval.model.sc.ItemType;
import jp.go.aist.six.oval.model.sc.StatusEnumeration;



/**
 * The file extended attribute item holds information about the individual
 * file extended attributes found on a system.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: FileExtendedAttributeItem.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class FileExtendedAttributeItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType        filepath;
    private EntityItemStringType        path;

    //{nillable="true"}
    private EntityItemStringType        filename = new EntityItemStringType();

    private EntityItemStringType        attribute_name;
    private EntityItemAnySimpleType     value;



    /**
     * Constructor.
     */
    public FileExtendedAttributeItem()
    {
        this( 0 );
    }


    public FileExtendedAttributeItem(
                    final int id
                    )
    {
        this( id, null );
    }


    public FileExtendedAttributeItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        super( id, status );

        _oval_family = Family.UNIX;
        _oval_component = ComponentType.FILEEXTENDEDATTRIBUTE;
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
    public void setAttributeName(
                    final EntityItemStringType attribute_name
                    )
    {
        this.attribute_name = attribute_name;
    }


    public EntityItemStringType getAttributeName()
    {
        return attribute_name;
    }



    /**
     */
    public void setValue(
                    final EntityItemAnySimpleType value
                    )
    {
        this.value = value;
    }


    public EntityItemAnySimpleType getValue()
    {
        return value;
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
        if (!(obj instanceof FileExtendedAttributeItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "fileextendedattribute_item[" + super.toString()
             + ", filepath="        + getFilepath()
             + ", path="            + getPath()
             + ", filename="        + getFilename()
             + ", attribute_name="  + getAttributeName()
             + ", value="           + getValue()
             + "]";
    }

}
//
