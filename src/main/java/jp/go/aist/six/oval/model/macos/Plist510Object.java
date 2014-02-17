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
package jp.go.aist.six.oval.model.macos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.EntityObjectIntType;
import jp.go.aist.six.oval.model.definitions.EntityObjectStringType;
import jp.go.aist.six.oval.model.definitions.Filter;
import jp.go.aist.six.oval.model.definitions.Set;
import jp.go.aist.six.oval.model.definitions.SystemObjectType;



/**
 * The plist510 object is used by a plist_test to define the preference keys to collect
 * and where to look for them.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: Plist510Object.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class Plist510Object
    extends SystemObjectType
{

    //TODO: XSD model

    private Set  set;
    //{1..1}


    private EntityObjectStringType  key;
//    private EntityObjectStringType  key = new EntityObjectStringType();
    //{1..1, nillable="true"}

    private EntityObjectStringType  app_id;
    //{1..1}

    private EntityObjectStringType  filepath;
    //{1..1}

    private EntityObjectIntType  instance;
    //{1..1}

    private final Collection<Filter>  filter = new ArrayList<Filter>();
    //{0..*}



    /**
     * Constructor.
     */
    public Plist510Object()
    {
        this( null, 0 );
    }


    public Plist510Object(
                    final String id,
                    final int version
                    )
    {
        super( id, version );

        _oval_family = Family.MACOS;
        _oval_component = ComponentType.PLIST510;
    }


//    public FileObject(
//                    final String id,
//                    final int version,
//                    final String comment
//                    )
//    {
//        super( id, version, comment );
//    }
//
//
//    public FileObject(
//                    final String id,
//                    final int version,
//                    final String path,
//                    final String filename
//                    )
//    {
//        this( id, version,
//                        new EntityObjectStringType( path ),
//                        new EntityObjectStringType( filename )
//        );
//    }
//
//
//    public FileObject(
//                    final String id,
//                    final int version,
//                    final EntityObjectStringType path,
//                    final EntityObjectStringType filename
//                    )
//    {
//        super( id, version );
//        setPath( path );
//        setFilename( filename );
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
    public void setKey(
                    final EntityObjectStringType key
                    )
    {
        this.key = key;
    }


    public EntityObjectStringType getKey()
    {
        return key;
    }



    /**
     */
    public void setAppId(
                    final EntityObjectStringType app_id
                    )
    {
        this.app_id = app_id;
    }


    public EntityObjectStringType getAppId()
    {
        return app_id;
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
    public void setInstance(
                    final EntityObjectIntType instance
                    )
    {
        this.instance = instance;
    }


    public EntityObjectIntType getInstance()
    {
        return instance;
    }



    /**
     */
    public void setFilter(
                    final Collection<? extends Filter> filter_list
                    )
    {
        if (filter != filter_list) {
            filter.clear();
            if (filter_list != null  &&  filter_list.size() > 0) {
                filter.addAll( filter_list );
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

        ref_list.add( getKey() );
        ref_list.add( getAppId() );
        ref_list.add( getFilepath() );
        ref_list.add( getInstance() );
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
        if (!(obj instanceof Plist510Object)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "plist510_object[" + super.toString()
                        + ", set=" 			+ getSet()
                        + ", filepath="		+ getKey()
                        + ", path=" 		+ getAppId()
                        + ", filename=" 	+ getFilepath()
                        + ", instance="     + getInstance()
                        + ", filter=" 		+ getFilter()
                        + "]";
    }

}
//
