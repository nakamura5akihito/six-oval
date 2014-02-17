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
package jp.go.aist.six.oval.model.windows;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.EntityObjectStringType;
import jp.go.aist.six.oval.model.definitions.Filter;
import jp.go.aist.six.oval.model.definitions.Set;
import jp.go.aist.six.oval.model.definitions.SystemObjectType;



/**
 * The regkeyeffectiverights53 object is used by a registry key effective rights test
 * to define the objects used to evaluate against the specified state.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: RegkeyEffectiveRights53Object.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class RegkeyEffectiveRights53Object
    extends SystemObjectType
{

    //TODO: XSD model.
	// choice(
	//    set
    //    sequence(
    //           behaviors
    //           hive
    //           key
    //           trustee_sid
    //           filter
    //   ))

    private Set  set;
    //{1..1}

    private RegkeyEffectiveRights53Behaviors  behaviors;
    //{0..1}

    private EntityObjectRegistryHiveType  hive;
    //{1..1}

    private EntityObjectStringType  key;
//    private EntityObjectStringType  key = new EntityObjectStringType();
    //{1..1, nillable="true"}

    private EntityObjectStringType  trustee_sid;
    //{1..1}

    private final Collection<Filter>  filter = new ArrayList<Filter>();
    //{0..*}



    /**
     * Constructor.
     */
    public RegkeyEffectiveRights53Object()
    {
        this( null, 0 );
    }


    public RegkeyEffectiveRights53Object(
                    final String id,
                    final int version
                    )
    {
        super( id, version );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.regkeyeffectiverights53;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.REGKEYEFFECTIVERIGHTS53;
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
    public void setBehaviors(
                    final RegkeyEffectiveRights53Behaviors behaviors
                    )
    {
        this.behaviors = behaviors;
    }


    public RegkeyEffectiveRights53Behaviors getBehaviors()
    {
        return behaviors;
    }



    /**
     */
    public void setHive(
                    final EntityObjectRegistryHiveType hive
                    )
    {
        this.hive = hive;
    }


    public EntityObjectRegistryHiveType getHive()
    {
        return hive;
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
    public void setTrusteeSid(
                    final EntityObjectStringType trustee_sid
                    )
    {
        this.trustee_sid = trustee_sid;
    }


    public EntityObjectStringType getTrusteeSid()
    {
        return trustee_sid;
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

        ref_list.add( getHive() );
        ref_list.add( getKey() );
        ref_list.add( getTrusteeSid() );
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
        if (!(obj instanceof RegkeyEffectiveRights53Object)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "regkeyeffectiverights53_object[" + super.toString()
                        + ", set=" 			+ getSet()
                        + ", behaviors="	+ getBehaviors()
                        + ", hive="		    + getHive()
                        + ", key=" 		    + getKey()
                        + ", trustee_sid="  + getTrusteeSid()
                        + ", filter=" 		+ getFilter()
                        + "]";
    }

}
//RegkeyEffectiveRights53Object
