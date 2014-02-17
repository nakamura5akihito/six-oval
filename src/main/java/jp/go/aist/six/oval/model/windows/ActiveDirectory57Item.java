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
package jp.go.aist.six.oval.model.windows;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.sc.EntityItemAnySimpleType;
import jp.go.aist.six.oval.model.sc.EntityItemStringType;
import jp.go.aist.six.oval.model.sc.ItemType;



/**
 * The activedirectory57_item holds information about specific entries in the Windows Active Directory.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: ActiveDirectory57Item.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class ActiveDirectory57Item
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
    public ActiveDirectory57Item()
    {
        this( 0 );
    }


    public ActiveDirectory57Item(
                    final int id
                    )
    {
        super( id );

        _oval_family = Family.WINDOWS;
        _oval_component = ComponentType.ACTIVEDIRECTORY57;
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
        return "activedirectory57_item[" + super.toString()
             + ", naming_context="  + getNamingContext()
             + ", relative_dn="     + getRelativeDn()
             + ", attribute="       + getAttribute()
             + ", object_class="    + getObjectClass()
             + ", asdtype="         + getAdstype()
             + ", value="           + getValue()
             + "]";
    }

}
//
