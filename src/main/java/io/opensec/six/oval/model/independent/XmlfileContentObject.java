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
import io.opensec.six.oval.model.definitions.EntityObjectStringType;
import io.opensec.six.oval.model.definitions.Filter;
import io.opensec.six.oval.model.definitions.Set;
import io.opensec.six.oval.model.definitions.SystemObjectType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



/**
 * The xmlfilecontent object is used by an XML file content test
 * to define the specific piece of an xml file(s) to be evaluated.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class XmlfileContentObject
    extends SystemObjectType
{
    // XSD model:
    // choice(
    //         set
    //         sequence(
    //                   behaviors
    //                   choice(
    //                           filepath
    //                           sequence( path filename )
    //                   )
    //                   xpath
    //                   filter
    //          )
    // )

    private Set  set;
    //{1..1}


    private FileBehaviors  behaviors;
    //{0..1}

    private EntityObjectStringType  filepath;
    //{1..1}

    private EntityObjectStringType  path;
    //{1..1}

    private EntityObjectStringType  filename;
    //{1..1}

    private EntityObjectStringType  xpath;
    //{1..1}

    private final Collection<Filter>  filter = new ArrayList<Filter>();
    //{0..*}



    /**
     * Constructor.
     */
    public XmlfileContentObject()
    {
        this( null, 0 );
    }


    public XmlfileContentObject(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public XmlfileContentObject(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.independent;
//        _oval_component_type = OvalComponentType.xmlfilecontent;
        _oval_family = Family.INDEPENDENT;
        _oval_component = ComponentType.XMLFILECONTENT;
    }


//    public TextfileContent54Object(
//                    final String id,
//                    final int version,
//                    final String path,
//                    final String filename,
//                    final String pattern,
//                    final String instance
//                    )
//    {
//        this( id, version,
//                        (path == null     ? null : new EntityObjectStringType( path )),
//                        (filename == null ? null : new EntityObjectStringType( filename )),
//                        (pattern == null  ? null : new EntityObjectStringType( pattern )),
//                        (instance == null ? null : new EntityObjectIntType( instance ))
//                        );
//    }
//
//
//    public TextfileContent54Object(
//                    final String id,
//                    final int version,
//                    final EntityObjectStringType path,
//                    final EntityObjectStringType filename,
//                    final EntityObjectStringType pattern,
//                    final EntityObjectIntType instance
//                    )
//    {
//        super( id, version );
//        setPath( path );
//        setFilename( filename );
//        setPattern( pattern );
//        setInstance( instance );
//    }



    /**
     */
    public void setSet(
                    final Set set
                    )
    {
        this.set = set;
    }


    public Set getSet()
    {
        return set;
    }



    /**
     */
    public void setBehaviors(
                    final FileBehaviors behaviors
                    )
    {
        this.behaviors = behaviors;
    }


    public FileBehaviors getBehaviors()
    {
        return behaviors;
    }



    /**
     */
    public void setFilepath(
                    final EntityObjectStringType filepath
                    )
    {
        this.filepath = filepath;
    }


    public EntityObjectStringType getFilepath()
    {
        return filepath;
    }



    /**
     */
    public void setPath(
                    final EntityObjectStringType path
                    )
    {
        this.path = path;
    }


    public EntityObjectStringType getPath()
    {
        return path;
    }



    /**
     */
    public void setFilename(
                    final EntityObjectStringType filename
                    )
    {
        this.filename = filename;
    }


    public EntityObjectStringType getFilename()
    {
        return filename;
    }



    /**
     */
    public void setXpath(
                    final EntityObjectStringType xpath
                    )
    {
        this.xpath = xpath;
    }


    public EntityObjectStringType getXpath()
    {
        return xpath;
    }



    /**
     */
    public void setFilter(
                    final Collection<? extends Filter> filters
                    )
    {
        if (filter != filters) {
            filter.clear();
            if (filters != null  &&  filters.size() > 0) {
                filter.addAll( filters );
            }
        }
    }


    public boolean addFilter(
                    final Filter filter
                    )
    {
        if (filter == null) {
            return false;
        }

        return this.filter.add( filter );
    }


    public Collection<Filter> getFilter()
    {
        return filter;
    }


    public Iterator<Filter> iterateFilter()
    {
        return filter.iterator();
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
        ref_list.add( getXpath() );
        ref_list.addAll( getFilter() );

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
        if (!(obj instanceof XmlfileContentObject)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "xmlfilecontent_object[" + super.toString()
                        + ", set="          + getSet()
                        + ", behaviors="    + getBehaviors()
                        + ", filepath="     + getFilepath()
                        + ", path="         + getPath()
                        + ", filename="     + getFilename()
                        + ", xpath="        + getXpath()
                        + ", filter="       + getFilter()
                        + "]";
    }

}
//XmlfileContentObject
