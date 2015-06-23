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
import io.opensec.six.oval.model.sc.EntityItemIntType;
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.ItemType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



/**
 * The textfilecontent item looks at the contents of a text file
 * (aka a configuration file) by looking at individual lines.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class TextfileContentItem
    extends ItemType
{

    private EntityItemStringType  filepath;
    //{0..1}

    private EntityItemStringType  path;
    //{0..1}

    private EntityItemStringType  filename;
    //{0..1}

    private EntityItemStringType  pattern;
    //{0..1}

    private EntityItemIntType  instance;
    //{0..1}

    private EntityItemStringType  line;
    //{0..1}

    private EntityItemAnySimpleType  text;
    //{0..1}

    private final Collection<EntityItemAnySimpleType>  subexpression =
        new ArrayList<EntityItemAnySimpleType>();
    //{0..1}



    /**
     * Constructor.
     */
    public TextfileContentItem()
    {
        this( 0 );
    }


    public TextfileContentItem(
                    final int id
                    )
    {
        super( id );

//        _oval_platform_type = OvalPlatformType.independent;
//        _oval_component_type = OvalComponentType.textfilecontent;
        _oval_family = Family.INDEPENDENT;
        _oval_component = ComponentType.TEXTFILECONTENT;
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


    public TextfileContentItem filepath(
                    final EntityItemStringType filepath
                    )
    {
        setFilepath( filepath );
        return this;
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


    public TextfileContentItem path(
                    final EntityItemStringType path
                    )
    {
        setPath( path );
        return this;
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


    public TextfileContentItem filename(
                    final EntityItemStringType filename
                    )
    {
        setFilename( filename );
        return this;
    }



    /**
     */
    public void setPattern(
                    final EntityItemStringType pattern
                    )
    {
        this.pattern = pattern;
    }


    public EntityItemStringType getPattern()
    {
        return pattern;
    }


    public TextfileContentItem pattern(
                    final EntityItemStringType pattern
                    )
    {
        setPattern( pattern );
        return this;
    }



    /**
     */
    public void setInstance(
                    final EntityItemIntType instance
                    )
    {
        this.instance = instance;
    }


    public EntityItemIntType getInstance()
    {
        return instance;
    }


    public TextfileContentItem instance(
                    final EntityItemIntType instance
                    )
    {
        setInstance( instance );
        return this;
    }



    /**
     */
    public void setLine(
                    final EntityItemStringType line
                    )
    {
        this.line = line;
    }


    public EntityItemStringType getLine()
    {
        return line;
    }


    public TextfileContentItem line(
                    final EntityItemStringType line
                    )
    {
        setLine( line );
        return this;
    }



    /**
     */
    public void setText(
                    final EntityItemAnySimpleType text
                    )
    {
        this.text = text;
    }


    public EntityItemAnySimpleType getText()
    {
        return text;
    }


    public TextfileContentItem text(
                    final EntityItemAnySimpleType text
                    )
    {
        setText( text );
        return this;
    }



    /**
     */
    public void setSubexpression(
                    final Collection<? extends EntityItemAnySimpleType> subexpression
                    )
    {
        if (this.subexpression != subexpression) {
            this.subexpression.clear();
            if (subexpression != null  &&  subexpression.size() > 0) {
                this.subexpression.addAll( subexpression );
            }
        }
    }


    public Collection<EntityItemAnySimpleType> getSubexpression()
    {
        return subexpression;
    }


    public Iterator<EntityItemAnySimpleType> iterateSubexpression()
    {
        return subexpression.iterator();
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "textfilecontent_item[" + super.toString()
             + ", filepath="        + getFilepath()
             + ", path="            + getPath()
             + ", filename="        + getFilename()
             + ", pattern="         + getPattern()
             + ", instance="        + getInstance()
             + ", line="            + getLine()
             + ", text="            + getText()
             + ", subexpression="   + getSubexpression()
//           + ", " + String.valueOf( _properties )
             + "]";
    }

}
// TextFileContentItem
