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
package io.opensec.six.oval.model.independent;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.sc.EntityItemAnySimpleType;
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.ItemType;



/**
 * This item stores information about an environment variable,
 * the process ID of the process from which it was retrieved, and
 * its corresponding value.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 * @deprecated Deprecated as of version 5.8:
 *             Replaced by the environmentvariable58 item and
 *             will be removed in a future version of the language.
 */
@Deprecated
public class EnvironmentVariableItem
    extends ItemType
{

    private EntityItemStringType  name;
    //{0..1}

    private EntityItemAnySimpleType  value;
    //{0..1}



    /**
     * Constructor.
     */
    public EnvironmentVariableItem()
    {
        this( 0 );
    }


    public EnvironmentVariableItem(
                    final int id
                    )
    {
        super( id );

//        _oval_platform_type = OvalPlatformType.independent;
//        _oval_component_type = OvalComponentType.environmentvariable;
        _oval_family = Family.INDEPENDENT;
        _oval_component = ComponentType.ENVIRONMENTVARIABLE;
    }



    /**
     */
    public void setName(
                    final EntityItemStringType name
                    )
    {
        this.name = name;
    }


    public EntityItemStringType getName()
    {
        return name;
    }



    /**
     */
    public void setValue(
                    final EntityItemAnySimpleType value
                    )
    {
        this.value = value;
    }


    public EntityItemAnySimpleType getValue()
    {
        return value;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "environmentvariable_item[" + super.toString()
             + ", name="    + getName()
             + ", value="   + getValue()
             + "]";
    }

}
//EnvironmentVariableItem
