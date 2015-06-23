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
import io.opensec.six.oval.model.sc.EntityItemAnySimpleType;
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.ItemType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



/**
 * This item stores results from checking the contents of an XML file.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class XmlfileContentItem
    extends ItemType
{

    private EntityItemStringType  filepath;
    //{0..1}

    private EntityItemStringType  path;
    //{0..1}

    private EntityItemStringType  filename;
    //{0..1}

    private EntityItemStringType  xpath;
    //{0..1}

    private final Collection<EntityItemAnySimpleType>  value_of = new ArrayList<EntityItemAnySimpleType>();
    //{0..*}

    private EntityItemWindowsViewType  windows_view;
    //{0..1}



    /**
     * Constructor.
     */
    public XmlfileContentItem()
    {
        this( 0 );
    }


    public XmlfileContentItem(
                    final int id
                    )
    {
        super( id );

//        _oval_platform_type = OvalPlatformType.independent;
//        _oval_component_type = OvalComponentType.xmlfilecontent;
        _oval_family = Family.INDEPENDENT;
        _oval_component = ComponentType.XMLFILECONTENT;
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
    public void setXpath(
                    final EntityItemStringType xpath
                    )
    {
        this.xpath = xpath;
    }


    public EntityItemStringType getXpath()
    {
        return xpath;
    }



    /**
     */
    public void setValueOf(
                    final Collection<? extends EntityItemAnySimpleType> value_ofs
                    )
    {
        if (value_of != value_ofs) {
            value_of.clear();
            if (value_ofs != null  &&  value_ofs.size() > 0) {
                for (EntityItemAnySimpleType  result : value_ofs) {
                    addValueOf( result );
                }
            }
        }
    }


    public boolean addValueOf(
                    final EntityItemAnySimpleType value_of
                    )
    {
        if (value_of == null) {
            throw new IllegalArgumentException( "empty value_of" );
        }

        return this.value_of.add( value_of );
    }


    public Collection<EntityItemAnySimpleType> getValueOf()
    {
        return value_of;
    }


    public Iterator<EntityItemAnySimpleType> iterateValueOf()
    {
        return value_of.iterator();
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
        if (!(obj instanceof XmlfileContentItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "xmlfilecontent_item[" + super.toString()
                        + ", filepath="     + getFilepath()
                        + ", path="         + getPath()
                        + ", filename="     + getFilename()
                        + ", xpath="        + getXpath()
                        + ", value_of="     + getValueOf()
                        + ", windows_view=" + getWindowsView()
                        + "]";
    }

}
//XmlfileContentItem
