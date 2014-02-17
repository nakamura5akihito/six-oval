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
package jp.go.aist.six.oval.model.independent;

import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.sc.EntityItemAnySimpleType;
import jp.go.aist.six.oval.model.sc.EntityItemStringType;
import jp.go.aist.six.oval.model.sc.ItemType;



/**
 * This item stores information about an environment variable,
 * the process ID of the process from which it was retrieved, and
 * its corresponding value.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: EnvironmentVariableItem.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
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
