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
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.EntityItemVersionType;
import io.opensec.six.oval.model.sc.ItemType;



/**
 * Output of /usr/bin/lslpp -l FilesetName.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class FilesetItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType  flstinst;
    private EntityItemVersionType  level;
    private EntityItemFilesetStateType  state;
    private EntityItemStringType  description;



    /**
     * Constructor.
     */
    public FilesetItem()
    {
        this( 0 );
    }


    public FilesetItem(
                    final int id
                    )
    {
        super( id );

        _oval_family = Family.AIX;
        _oval_component = ComponentType.FILESET;
    }



    /**
     */
    public void setFlstinst(
                    final EntityItemStringType flstinst
                    )
    {
        this.flstinst = flstinst;
    }


    public EntityItemStringType getFlstinst()
    {
        return flstinst;
    }



    /**
     */
    public void setLevel(
                    final EntityItemVersionType level
                    )
    {
        this.level = level;
    }


    public EntityItemVersionType getLevel()
    {
        return level;
    }



    /**
     */
    public void setState(
                    final EntityItemFilesetStateType state
                    )
    {
        this.state = state;
    }


    public EntityItemFilesetStateType getState()
    {
        return state;
    }



    /**
     */
    public void setDescription(
                    final EntityItemStringType description
                    )
    {
        this.description = description;
    }


    public EntityItemStringType getDescription()
    {
        return description;
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
        if (!(obj instanceof FilesetItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "fileset_item[" + super.toString()
                        + ", flstinst="     + getFlstinst()
                        + ", level="        + getLevel()
                        + ", state="        + getState()
                        + ", description="  + getDescription()
                        + "]";
    }

}
//
