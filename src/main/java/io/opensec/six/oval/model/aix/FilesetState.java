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
package io.opensec.six.oval.model.aix;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.definitions.EntityStateStringType;
import io.opensec.six.oval.model.definitions.EntityStateVersionType;
import io.opensec.six.oval.model.definitions.StateType;
import java.util.ArrayList;
import java.util.Collection;



/**
 * The fileset_state defines the different information
 * associated with filesets installed on the system.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class FilesetState
    extends StateType
{

    //{0..1}
    private EntityStateStringType           flstinst;
    private EntityStateVersionType          level;
    private EntityStateFilesetStateType     state;
    private EntityStateStringType           description;



    /**
     * Constructor.
     */
    public FilesetState()
    {
        this( null, 0 );
    }


    public FilesetState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public FilesetState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.AIX;
        _oval_component = ComponentType.FILESET;
    }




    /**
     */
    public void setFlstinst(
                    final EntityStateStringType flstinst
                    )
    {
        this.flstinst = flstinst;
    }


    public EntityStateStringType getFlstinst()
    {
        return flstinst;
    }



    /**
     */
    public void setLevel(
                    final EntityStateVersionType level
                    )
    {
        this.level = level;
    }


    public EntityStateVersionType getLevel()
    {
        return level;
    }



    /**
     */
    public void setState(
                    final EntityStateFilesetStateType state
                    )
    {
        this.state = state;
    }


    public EntityStateFilesetStateType getState()
    {
        return state;
    }



    /**
     */
    public void setDescription(
                    final EntityStateStringType description
                    )
    {
        this.description = description;
    }


    public EntityStateStringType getDescription()
    {
        return description;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getFlstinst() );
        ref_list.add( getLevel() );
        ref_list.add( getState() );
        ref_list.add( getDescription() );

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
        if (!(obj instanceof FilesetState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "fileset_state[" + super.toString()
                        + ", flstinst="         + getFlstinst()
                        + ", level="            + getLevel()
                        + ", state="            + getState()
                        + ", description="      + getDescription()
             + "]";
    }

}
//
