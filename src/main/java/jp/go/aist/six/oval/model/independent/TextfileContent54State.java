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
package jp.go.aist.six.oval.model.independent;

import java.util.ArrayList;
import java.util.Collection;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.EntityStateAnySimpleType;
import jp.go.aist.six.oval.model.definitions.EntityStateIntType;
import jp.go.aist.six.oval.model.definitions.EntityStateStringType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 * The textfilecontent54 state contains entities that are used to check
 * the file path and name, as well as the text block in question
 * and the value of the subexpressions.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: TextfileContent54State.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class TextfileContent54State
    extends StateType
{

    private EntityStateStringType  filepath;
    //{0..1}

    private EntityStateStringType  path;
    //{0..1}

    private EntityStateStringType  filename;
    //{0..1}

    private EntityStateStringType  pattern;
    //{0..1}

    private EntityStateIntType  instance;
    //{0..1}

    private EntityStateAnySimpleType  text;
    //{0..1}

    private EntityStateAnySimpleType  subexpression;
    //{0..1}


    private EntityStateWindowsViewType  windows_view;
    //{0..1}

//    private final EntityPropertyMap<TextfileContentProperty>  _properties =
//        TextfileContentProperty.createPropertyMap();



    /**
     * Constructor.
     */
    public TextfileContent54State()
    {
        this( null, 0 );
    }


    public TextfileContent54State(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public TextfileContent54State(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.independent;
//        _oval_component_type = OvalComponentType.textfilecontent54;
        _oval_family = Family.INDEPENDENT;
        _oval_component = ComponentType.TEXTFILECONTENT54;
    }



    /**
     */
    public void setFilepath(
                    final EntityStateStringType filepath
                    )
    {
        this.filepath = filepath;
//        _properties.setProperty( TextfileContentProperty.FILEPATH, filepath );
    }


    public EntityStateStringType getFilepath()
    {
        return filepath;
//        return _properties.getProperty(
//                        TextfileContentProperty.FILEPATH, EntityStateStringType.class );
    }


    public TextfileContent54State filepath(
                    final EntityStateStringType filepath
                    )
    {
        setFilepath( filepath );
        return this;
    }



    /**
     */
    public void setPath(
                    final EntityStateStringType path
                    )
    {
        this.path = path;
//        _properties.setProperty( TextfileContentProperty.PATH, path );
    }


    public EntityStateStringType getPath()
    {
        return path;
//        return _properties.getProperty(
//                        TextfileContentProperty.PATH, EntityStateStringType.class );
    }


    public TextfileContent54State path(
                    final EntityStateStringType path
                    )
    {
        setPath( path );
        return this;
    }



    /**
     */
    public void setFilename(
                    final EntityStateStringType filename
                    )
    {
        this.filename = filename;
//        _properties.setProperty( TextfileContentProperty.FILENAME, filename );
    }


    public EntityStateStringType getFilename()
    {
        return filename;
//        return _properties.getProperty(
//                        TextfileContentProperty.FILENAME, EntityStateStringType.class );
    }


    public TextfileContent54State filename(
                    final EntityStateStringType filename
                    )
    {
        setFilename( filename );
        return this;
    }



    /**
     */
    public void setPattern(
                    final EntityStateStringType pattern
                    )
    {
        this.pattern = pattern;
//        _properties.setProperty( TextfileContentProperty.PATTERN, pattern );
    }


    public EntityStateStringType getPattern()
    {
        return pattern;
//        return _properties.getProperty(
//                        TextfileContentProperty.PATTERN, EntityStateStringType.class );
    }


    public TextfileContent54State pattern(
                    final EntityStateStringType pattern
                    )
    {
        setPattern( pattern );
        return this;
    }



    /**
     */
    public void setInstance(
                    final EntityStateIntType instance
                    )
    {
        this.instance = instance;
//        _properties.setProperty( TextfileContentProperty.INSTANCE, instance );
    }


    public EntityStateIntType getInstance()
    {
        return instance;
//        return _properties.getProperty(
//                        TextfileContentProperty.INSTANCE, EntityStateIntType.class );
    }


    public TextfileContent54State instance(
                    final EntityStateIntType instance
                    )
    {
        setInstance( instance );
        return this;
    }



    /**
     */
    public void setText(
                    final EntityStateAnySimpleType text
                    )
    {
        this.text = text;
//        _properties.setProperty( TextfileContentProperty.TEXT, text );
    }


    public EntityStateAnySimpleType getText()
    {
        return text;
//        return _properties.getProperty(
//                        TextfileContentProperty.TEXT, EntityStateAnySimpleType.class );
    }


    public TextfileContent54State text(
                    final EntityStateAnySimpleType text
                    )
    {
        setText( text );
        return this;
    }



    /**
     */
    public void setSubexpression(
                    final EntityStateAnySimpleType subexpression
                    )
    {
        this.subexpression = subexpression;
//        _properties.setProperty( TextfileContentProperty.SUBEXPRESSION, subexpression );
    }


    public EntityStateAnySimpleType getSubexpression()
    {
        return subexpression;
//        return _properties.getProperty(
//                        TextfileContentProperty.SUBEXPRESSION, EntityStateAnySimpleType.class );
    }


    public TextfileContent54State subexpression(
                    final EntityStateAnySimpleType subexpression
                    )
    {
        setSubexpression( subexpression );
        return this;
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
        ref_list.add( getPattern() );
        ref_list.add( getInstance() );
        ref_list.add( getText() );
        ref_list.add( getSubexpression() );
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
        if (!(obj instanceof TextfileContent54State)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "textfilecontent54_state[" + super.toString()
                        + ", filepath="      + getFilepath()
                        + ", path="          + getPath()
                        + ", filename="      + getFilename()
                        + ", pattern="       + getPattern()
                        + ", instance="      + getInstance()
                        + ", text="          + getText()
                        + ", subexpression=" + getSubexpression()
//                        + ", " + String.valueOf( _properties )
                        + "]";
    }

}
// TextFileContent54State
