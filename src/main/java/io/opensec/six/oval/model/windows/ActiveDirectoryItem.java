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
import io.opensec.six.oval.model.sc.EntityItemAnySimpleType;
import io.opensec.six.oval.model.sc.EntityItemStringType;
import io.opensec.six.oval.model.sc.ItemType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



/**
 * The active directory item holds information about specific entries
 * in the Windows Active Directory.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class ActiveDirectoryItem
    extends ItemType
{

    private EntityItemNamingContextType  naming_context;
    //{0..1}

    private EntityItemStringType  relative_dn;
    //{0..1, nillable="true"}

    private EntityItemStringType  attribute;
    //{0..1, nillable="true"}

    private EntityItemStringType  object_class;
    //{0..1}

    private EntityItemAdstypeType  adstype;
    //{0..1}


    private final Collection<EntityItemAnySimpleType>  value =
        new ArrayList<EntityItemAnySimpleType>();
    //{0..*}



    /**
     * Constructor.
     */
    public ActiveDirectoryItem()
    {
        this( 0 );
    }


    public ActiveDirectoryItem(
                    final int id
                    )
    {
        super( id );

//        _oval_platform_type = OvalPlatformType.windows;
//        _oval_component_type = OvalComponentType.activedirectory;
        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.ACTIVEDIRECTORY;
    }



    /**
     */
    public void setNamingContext(
                    final EntityItemNamingContextType hive
                    )
    {
        naming_context = hive;
    }


    public EntityItemNamingContextType getNamingContext()
    {
        return naming_context;
    }



    /**
     */
    public EntityItemStringType getRelativeDn()
    {
        return relative_dn;
    }


    public void setRelativeDn(
                    final EntityItemStringType relative_dn
                    )
    {
        this.relative_dn = relative_dn;
    }



    /**
     */
    public EntityItemStringType getAttribute()
    {
        return attribute;
    }


    public void setAttribute(
                    final EntityItemStringType attribute
                    )
    {
        this.attribute = attribute;
    }



    /**
     */
    public void setObjectClass(
                    final EntityItemStringType object_class
                    )
    {
        this.object_class = object_class;
    }


    public EntityItemStringType getObjectClass()
    {
        return object_class;
    }



    /**
     */
    public EntityItemAdstypeType getAdstype()
    {
        return adstype;
    }


    public void setAdstype(
                    final EntityItemAdstypeType adstype
                    )
    {
        this.adstype = adstype;
    }



    /**
     */
    public void setValue(
                    final Collection<? extends EntityItemAnySimpleType> value
                    )
    {
        if (this.value != value) {
            this.value.clear();
            if (value != null  &&  value.size() > 0) {
                this.value.addAll( value );
            }
        }
    }


    public Collection<EntityItemAnySimpleType> getValue()
    {
        return value;
    }


    public Iterator<EntityItemAnySimpleType> iterateValue()
    {
        return value.iterator();
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "activedirectory_item[" + super.toString()
             + ", naming_context="  + getNamingContext()
             + ", relative_dn="     + getRelativeDn()
             + ", attribute="       + getAttribute()
             + ", object_class="    + getObjectClass()
             + ", asdtype="         + getAdstype()
             + ", value="           + getValue()
             + "]";
    }

}
//ActiveDirectoryItem
