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
import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.definitions.EntityStateStringType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;



/**
 * The wuaupdatesearcher state defines entities that can be tested
 * related to a uaupdatesearcher object.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class WuaUpdateSearcherState
    extends StateType
{

    //{0..1}
    private EntityStateStringType       search_criteria;
    private EntityStateStringType       update_id;



    /**
     * Constructor.
     */
    public WuaUpdateSearcherState()
    {
        this( null, 0 );
    }


    public WuaUpdateSearcherState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public WuaUpdateSearcherState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.wuaupdatesearcher;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.WUAUPDATESEARCHER;
    }



    /**
     */
    public void setSearchCriteria(
                    final EntityStateStringType search_criteria
                    )
    {
        this.search_criteria = search_criteria;
    }


    public EntityStateStringType getSearchCriteria()
    {
        return search_criteria;
    }



    /**
     */
    public void setUpdateId(
                    final EntityStateStringType update_id
                    )
    {
        this.update_id = update_id;
    }


    public EntityStateStringType getUpdateId()
    {
        return update_id;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();

        ref_list.add( getSearchCriteria() );
        ref_list.add( getUpdateId() );

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
        if (!(obj instanceof WuaUpdateSearcherState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "wuaupdatesearcher_state[" + super.toString()
             + ", search_criteria="     + getSearchCriteria()
             + ", update_id="           + getUpdateId()
             + "]";
    }
}
//WuaUpdateSearcherState
