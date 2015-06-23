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
import io.opensec.six.oval.model.common.FamilyEnumeration;
import io.opensec.six.oval.model.sc.ItemType;



/**
 * This element stores high level system OS type,
 * otherwise known as the family.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class FamilyItem
    extends ItemType
{

    private EntityItemFamilyType  family;
    //{0..1}



    /**
     * Constructor.
     */
    public FamilyItem()
    {
        this( 0 );
    }


    public FamilyItem(
                    final int id
                    )
    {
        super( id );

//        _oval_platform_type = OvalPlatformType.independent;
//        _oval_component_type = OvalComponentType.family;
        _oval_family = Family.INDEPENDENT;
        _oval_component = ComponentType.FAMILY;
    }



    /**
     */
    public void setFamily(
                    final EntityItemFamilyType family
                    )
    {
        this.family = family;
    }


    public EntityItemFamilyType getFamily()
    {
        return family;
    }


    public FamilyItem family(
                    final FamilyEnumeration family
                    )
    {
        setFamily( new EntityItemFamilyType( family ) );
        return this;
    }


    public FamilyItem family(
                    final EntityItemFamilyType family
                    )
    {
        setFamily( family );
        return this;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "family_item[family=" + getFamily()
             + ", " + super.toString()
             + "]";
    }

}
// FamilyItem
