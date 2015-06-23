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
package io.opensec.six.oval.model.windows;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.ItemType;
import io.opensec.six.oval.model.sc.StatusEnumeration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



/**
 * The wuaupdatesearcher item outlines information defined
 * through the Search method of the IUpdateSearcher interface
 * as part of Microsoft's WUA (Windows Update Agent) API.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class WuaUpdateSearcherItem
    extends ItemType
{

    private EntityItemStringType  search_criteria;
    //{0..1}

    private final Collection<EntityItemStringType>  update_id = new ArrayList<EntityItemStringType>();
    //{0..*}



    /**
     * Constructor.
     */
    public WuaUpdateSearcherItem()
    {
        this( 0 );
    }


    public WuaUpdateSearcherItem(
                    final int id
                    )
    {
        this( id, null );
    }


    public WuaUpdateSearcherItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        super( id, status );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.wuaupdatesearcher;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.WUAUPDATESEARCHER;
    }



    /**
     */
    public void setSearchCriteria(
                    final EntityItemStringType search_criteria
                    )
    {
        this.search_criteria = search_criteria;
    }


    public EntityItemStringType getSearchCriteria()
    {
        return search_criteria;
    }



    /**
     */
    public void setUpdateId(
                    final Collection<? extends EntityItemStringType> update_ids
                    )
    {
        if (update_id != update_ids) {
            update_id.clear();
            if (update_ids != null  &&  update_ids.size() > 0) {
                update_id.addAll( update_ids );
            }
        }
    }


    public boolean addUpdateId(
                    final EntityItemStringType update_id
                    )
    {
        if (update_id == null) {
            return false;
        }

        return this.update_id.add( update_id );
    }


    public Collection<EntityItemStringType> getUpdateId()
    {
        return update_id;
    }


    public Iterator<EntityItemStringType> iterateUpdateId()
    {
        return update_id.iterator();
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
        if (!(obj instanceof WuaUpdateSearcherItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "wuaupdatesearcher_item[" + super.toString()
                        + ", search_criteria="  + getSearchCriteria()
                        + ", update_id="        + getUpdateId()
             + "]";
    }
}
//WuaUpdateSearcherItem
