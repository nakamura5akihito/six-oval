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
import io.opensec.six.oval.model.sc.ItemType;
import org.mongodb.morphia.annotations.Property;



/**
 * From emgr -l -u VUID Command.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class InterimFixItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType  vuid;
    private EntityItemStringType  label;

    //renamed from "abstract" to "description" because "abstract" is Java reserved word.
    @Property( "abstract" )
    private EntityItemStringType  description;

    private EntityItemInterimFixStateType  state;



    /**
     * Constructor.
     */
    public InterimFixItem()
    {
        this( 0 );
    }


    public InterimFixItem(
                    final int id
                    )
    {
        super( id );

        _oval_family = Family.AIX;
        _oval_component = ComponentType.INTERIM_FIX;
    }



    /**
     */
    public void setVuid(
                    final EntityItemStringType vuid
                    )
    {
        this.vuid = vuid;
    }


    public EntityItemStringType getVuid()
    {
        return vuid;
    }



    /**
     */
    public void setLabel(
                    final EntityItemStringType label
                    )
    {
        this.label = label;
    }


    public EntityItemStringType getLabel()
    {
        return label;
    }



    /**
     */
    public void setAbstract(
                    final EntityItemStringType description
                    )
    {
        this.description = description;
    }


    public EntityItemStringType getAbstract()
    {
        return description;
    }



    /**
     */
    public void setState(
                    final EntityItemInterimFixStateType state
                    )
    {
        this.state = state;
    }


    public EntityItemInterimFixStateType getState()
    {
        return state;
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
        if (!(obj instanceof InterimFixItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "interim_fix_item[" + super.toString()
                        + ", vuid="     + getVuid()
                        + ", label="    + getLabel()
                        + ", abstract=" + getAbstract()
                        + ", state="    + getState()
                        + "]";
    }

}
//
