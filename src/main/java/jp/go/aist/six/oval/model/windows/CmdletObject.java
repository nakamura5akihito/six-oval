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
import jp.go.aist.six.oval.model.definitions.EntityObjectRecordType;
import jp.go.aist.six.oval.model.definitions.EntityObjectStringType;
import jp.go.aist.six.oval.model.definitions.EntityObjectVersionType;
import jp.go.aist.six.oval.model.definitions.Filter;
import jp.go.aist.six.oval.model.definitions.Set;
import jp.go.aist.six.oval.model.definitions.SystemObjectType;



/**
 * The cmdlet_object is used by a cmdlet_test to identify the set of cmdlets to use and
 * the parameters to provide to them for checking the state of a system.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: CmdletObject.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class CmdletObject
    extends SystemObjectType
{

    // xsd:choice

    private Set  set;


    private EntityObjectStringType  module_name;
//    private EntityObjectStringType  module_name = new EntityObjectStringType();
    //{1..1, nillable="true"}

    private EntityObjectGUIDType  module_id;
//    private EntityObjectGUIDType  module_id = new EntityObjectGUIDType();
    //{1..1, nillable="true"}

    private EntityObjectVersionType  module_version;
//    private EntityObjectVersionType  module_version = new EntityObjectVersionType();
    //{1..1, nillable="true"}

    private EntityObjectCmdletVerbType  verb;
    //{1..1}

    private EntityObjectStringType  noun;
    //{1..1}

    private EntityObjectRecordType  parameters;
//    private EntityObjectRecordType  parameters = new EntityObjectRecordType();
    //{1..1, nillable="true"}

    private EntityObjectRecordType  select;
//    private EntityObjectRecordType  select = new EntityObjectRecordType();
    //{1..1, nillable="true"}

    private final Collection<Filter>  filter = new ArrayList<Filter>();
    //{0..*}



    /**
     * Constructor.
     */
    public CmdletObject()
    {
        this( null, 0 );
    }


    public CmdletObject(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public CmdletObject(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.CMDLET;
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
    public void setModuleName(
                    final EntityObjectStringType module_name
                    )
    {
        this.module_name = module_name;
    }


    public EntityObjectStringType getModuleName()
    {
        return module_name;
    }



    /**
     */
    public void setModuleId(
                    final EntityObjectGUIDType module_id
                    )
    {
        this.module_id = module_id;
    }


    public EntityObjectGUIDType getModuleId()
    {
        return module_id;
    }



    /**
     */
    public void setModuleVersion(
                    final EntityObjectVersionType module_version
                    )
    {
        this.module_version = module_version;
    }


    public EntityObjectVersionType getModuleVersion()
    {
        return module_version;
    }



    /**
     */
    public void setVerb(
                    final EntityObjectCmdletVerbType verb
                    )
    {
        this.verb = verb;
    }


    public EntityObjectCmdletVerbType getVerb()
    {
        return verb;
    }



    /**
     */
    public void setNoun(
                    final EntityObjectStringType noun
                    )
    {
        this.noun = noun;
    }


    public EntityObjectStringType getNoun()
    {
        return noun;
    }



    /**
     */
    public void setParameters(
                    final EntityObjectRecordType parameters
                    )
    {
        this.parameters = parameters;
    }


    public EntityObjectRecordType getParameters()
    {
        return parameters;
    }



    /**
     */
    public void setSelect(
                    final EntityObjectRecordType select
                    )
    {
        this.select = select;
    }


    public EntityObjectRecordType getSelect()
    {
        return select;
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

        ref_list.add( getModuleName() );
        ref_list.add( getModuleId() );
        ref_list.add( getModuleVersion() );
        ref_list.add( getVerb() );
        ref_list.add( getNoun() );
        ref_list.add( getParameters() );
        ref_list.add( getSelect() );

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
        if (!(obj instanceof CmdletObject)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "cmdlet_object[" + super.toString()
                        + ", set="              + getSet()
                        + ", module_name="      + getModuleName()
                        + ", module_id="        + getModuleId()
                        + ", module_version="   + getModuleVersion()
                        + ", verb="             + getVerb()
                        + ", noun="             + getNoun()
                        + ", parameters="       + getParameters()
                        + ", select="           + getSelect()
                        + ", filter="           + getFilter()
                        + "]";
    }

}
//
