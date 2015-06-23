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
package io.opensec.six.oval.model.linux;

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
 * The partition object is used by a partition test to define
 * which partitions on the local system should be collected.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class PartitionObject
    extends SystemObjectType
{

    //TODO: XSD model:
    //xsd:choice(
    //            set
    //            xsd:sequence(
    //                         mount_point
    //                         filter
    //            )
    //)

    private Set  set;
    //{1..1}

    private EntityObjectStringType  mount_point;
    //{1..1}

    private final Collection<Filter>  filter = new ArrayList<Filter>();
    //{0..*}



    /**
     * Constructor.
     */
    public PartitionObject()
    {
        this( null, 0 );
    }


    public PartitionObject(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public PartitionObject(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.linux;
//        _oval_component_type = OvalComponentType.partition;
        _oval_family = Family.LINUX;
        _oval_component = ComponentType.PARTITION;
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
    public void setMountPoint(
                    final EntityObjectStringType mount_point
                    )
    {
        this.mount_point = mount_point;
    }


    public EntityObjectStringType getMountPoint()
    {
        return mount_point;
    }



    /**
     */
    public void setFilter(
                    final Collection<? extends Filter> filters
                    )
    {
        if (filters != filter) {
            filter.clear();
            if (filters != null  &&  filters.size() > 0) {
                filter.addAll( filters );
            }
        }
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
        ref_list.add( getMountPoint() );
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
        if (!(obj instanceof PartitionObject)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "partition_object[" + super.toString()
                        + ", set="              + getSet()
                        + ", mount_point="      + getMountPoint()
                        + ", filter="           + getFilter()
                        + "]";
    }

}
//PartitionObject
