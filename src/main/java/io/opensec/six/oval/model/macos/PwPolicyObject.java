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
package io.opensec.six.oval.model.macos;

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
 * The pwpolicy object is used by a pwpolicy_test to define the object to be evaluated.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 * @deprecated Deprecated as of version 5.9:
 *             Replaced by the pwpolicy59 object and
 *             will be removed in a future version of the language.
 */
@Deprecated
public class PwPolicyObject
    extends SystemObjectType
{

    //TODO: XSD model.

    private Set  set;
    //{1..1}


    private EntityObjectStringType  username;
    //{1..1}

    private EntityObjectStringType  userpass;
    //{1..1}

    private EntityObjectStringType  directory_node;
    //{1..1}

    private final Collection<Filter>  filter = new ArrayList<Filter>();
    //{0..*}



    /**
     * Constructor.
     */
    public PwPolicyObject()
    {
        this( null, 0 );
    }


    public PwPolicyObject(
                    final String id,
                    final int version
                    )
    {
        super( id, version );

        _oval_family = Family.MACOS;
        _oval_component = ComponentType.PWPOLICY;
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
    public void setUsername(
                    final EntityObjectStringType username
                    )
    {
        this.username = username;
    }


    public EntityObjectStringType getUsername()
    {
        return username;
    }



    /**
     */
    public void setUserpass(
                    final EntityObjectStringType userpass
                    )
    {
        this.userpass = userpass;
    }


    public EntityObjectStringType getUserpass()
    {
        return userpass;
    }



    /**
     */
    public void setDirectoryNode(
                    final EntityObjectStringType directory_node
                    )
    {
        this.directory_node = directory_node;
    }


    public EntityObjectStringType getDirectoryNode()
    {
        return directory_node;
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

        ref_list.add( getUsername() );
        ref_list.add( getUserpass() );
        ref_list.add( getDirectoryNode() );
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
        if (!(obj instanceof PwPolicyObject)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "pwpolicy_object[" + super.toString()
                        + ", set="              + getSet()
                        + ", username="         + getUsername()
                        + ", userpass="         + getUserpass()
                        + ", directory_node="   + getDirectoryNode()
                        + ", filter="           + getFilter()
                        + "]";
    }

}
//
