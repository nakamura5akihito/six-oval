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
import jp.go.aist.six.oval.model.definitions.EntityObjectStringType;
import jp.go.aist.six.oval.model.definitions.Filter;
import jp.go.aist.six.oval.model.definitions.Set;
import jp.go.aist.six.oval.model.definitions.SystemObjectType;



/**
 * The pwpolicy59 object is used by a pwpolicy59 test to define the object to be evaluated.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: PwPolicy59Object.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class PwPolicy59Object
    extends SystemObjectType
{

    //TODO: XSD model.

    private Set  set;
    //{1..1}


    private EntityObjectStringType  target_user;
    //{1..1}

    private EntityObjectStringType  username;
//    private EntityObjectStringType  username = new EntityObjectStringType();
    //{1..1, nillable="true"}

    private EntityObjectStringType  userpass;
//    private EntityObjectStringType  userpass = new EntityObjectStringType();
    //{1..1, nillable="true"}

    private EntityObjectStringType  directory_node;
//    private EntityObjectStringType  directory_node = new EntityObjectStringType();
    //{1..1, nillable="true"}

    private final Collection<Filter>  filter = new ArrayList<Filter>();
    //{0..*}



    /**
     * Constructor.
     */
    public PwPolicy59Object()
    {
        this( null, 0 );
    }


    public PwPolicy59Object(
                    final String id,
                    final int version
                    )
    {
        super( id, version );

        _oval_family = Family.MACOS;
        _oval_component = ComponentType.PWPOLICY59;
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
    public void setTargetUser(
                    final EntityObjectStringType target_user
                    )
    {
        this.target_user = target_user;
    }


    public EntityObjectStringType getTargetUser()
    {
        return target_user;
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

        ref_list.add( getTargetUser() );
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
        if (!(obj instanceof PwPolicy59Object)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "pwpolicy59_object[" + super.toString()
                        + ", set="              + getSet()
                        + ", target_user="      + getTargetUser()
                        + ", username="         + getUsername()
                        + ", userpass="         + getUserpass()
                        + ", directory_node="   + getDirectoryNode()
                        + ", filter="           + getFilter()
                        + "]";
    }

}
//
