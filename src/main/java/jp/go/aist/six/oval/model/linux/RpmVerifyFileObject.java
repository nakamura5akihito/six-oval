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
package jp.go.aist.six.oval.model.linux;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.EntityObjectAnySimpleType;
import jp.go.aist.six.oval.model.definitions.EntityObjectStringType;
import jp.go.aist.six.oval.model.definitions.Filter;
import jp.go.aist.six.oval.model.definitions.Set;
import jp.go.aist.six.oval.model.definitions.SystemObjectType;



/**
 * The rpmverifyfile_object is used by a rpmverifyfile_test to define a set of files
 * within a set of RPMs to verify.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: RpmVerifyFileObject.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class RpmVerifyFileObject
    extends SystemObjectType
{

    //TODO: XSD model
    // xsd:choice(set | xsd:sequence( ... ))


    private Set  set;
    //{1..1}

    private RpmVerifyFileBehaviors  behaviors;
    //{0..1}

    private EntityObjectStringType  name;
    //{0..1}

    //TODO: XSD model, more restriction to EntityObjectAnySimpleType
    private EntityObjectAnySimpleType  epoch;
    //{0..1}

    //TODO: XSD model, more restriction to EntityObjectAnySimpleType
    private EntityObjectAnySimpleType  version;
    //{0..1}

    //TODO: XSD model, more restriction to EntityObjectAnySimpleType
    private EntityObjectAnySimpleType  release;
    //{0..1}

    private EntityObjectStringType  arch;
    //{0..1}

    private EntityObjectStringType  filepath;
    //{1..1}

    private final Collection<Filter>  filter = new ArrayList<Filter>();
    //{0..*}




    /**
     * Constructor.
     */
    public RpmVerifyFileObject()
    {
        this( null, 0 );
    }


    public RpmVerifyFileObject(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public RpmVerifyFileObject(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.LINUX;
        _oval_component = ComponentType.RPMVERIFYFILE;
    }



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
                    final RpmVerifyFileBehaviors behaviors
                    )
    {
        this.behaviors = behaviors;
    }


    public RpmVerifyFileBehaviors getBehaviors()
    {
        return behaviors;
    }



    /**
     */
    public void setName(
                    final EntityObjectStringType name
                    )
    {
        this.name = name;
    }


    public EntityObjectStringType getName()
    {
        return name;
    }



    /**
     */
    public void setEpoch(
                    final EntityObjectAnySimpleType epoch
                    )
    {
        this.epoch = epoch;
    }


    public EntityObjectAnySimpleType getEpoch()
    {
        return epoch;
    }



    /**
     */
    public void setVersion(
                    final EntityObjectAnySimpleType version
                    )
    {
        this.version = version;
    }


    public EntityObjectAnySimpleType getVersion()
    {
        return version;
    }



    /**
     */
    public void setRelease(
                    final EntityObjectAnySimpleType release
                    )
    {
        this.release = release;
    }


    public EntityObjectAnySimpleType getRelease()
    {
        return release;
    }



    /**
     */
    public void setArch(
                    final EntityObjectStringType arch
                    )
    {
        this.arch = arch;
    }


    public EntityObjectStringType getArch()
    {
        return arch;
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
        ref_list.add( getName() );
        ref_list.add( getEpoch() );
        ref_list.add( getVersion() );
        ref_list.add( getRelease() );
        ref_list.add( getArch() );
        ref_list.add( getFilepath() );
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
        if (!(obj instanceof RpmVerifyFileObject)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "rpmverifyfile_object[" + super.toString()
                        + ", set="          + getSet()
                        + ", behaviors="    + getBehaviors()
                        + ", name="         + getName()
                        + ", epoch="        + getEpoch()
                        + ", version="      + getVersion()
                        + ", release="      + getRelease()
                        + ", arch="         + getArch()
                        + ", filepath="     + getFilepath()
                        + ", filter="       + getFilter()
                        + "]";
    }

}
//
