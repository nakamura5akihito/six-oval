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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.sc.EntityItemRecordType;
import jp.go.aist.six.oval.model.sc.EntityItemStringType;
import jp.go.aist.six.oval.model.sc.ItemType;



/**
 * This item holds information about specific entries in the LDAP directory.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: Ldap57Item.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class Ldap57Item
    extends ItemType
{

    private EntityItemStringType  suffix;
    //{0..1}

    private EntityItemStringType  relative_dn;
    //{0..1, nillable="true"}

    private EntityItemStringType  attribute;
    //{0..1, nillable="true"}

    private EntityItemStringType  object_class;
    //{0..1}

    private EntityItemLdaptypeType  ldaptype;
    //{0..1}


    private final Collection<EntityItemRecordType>  value = new ArrayList<EntityItemRecordType>();
    //{0..*}



    /**
     * Constructor.
     */
    public Ldap57Item()
    {
        this( 0 );
    }


    public Ldap57Item(
                    final int id
                    )
    {
        super( id );

        _oval_family = Family.INDEPENDENT;
        _oval_component = ComponentType.LDAP57;
    }



    /**
     */
    public void setSuffix(
                    final EntityItemStringType suffix
                    )
    {
        this.suffix = suffix;
    }


    public EntityItemStringType getSuffix()
    {
        return suffix;
    }



    /**
     */
    public void setRelativeDn(
                    final EntityItemStringType relative_dn
                    )
    {
        this.relative_dn = relative_dn;
    }


    public EntityItemStringType getRelativeDn()
    {
        return relative_dn;
    }



    /**
     */
    public void setAttribute(
                    final EntityItemStringType attribute
                    )
    {
        this.attribute = attribute;
    }


    public EntityItemStringType getAttribute()
    {
        return attribute;
    }



    /**
     */
    public void setLdaptype(
                    final EntityItemLdaptypeType ldaptype
                    )
    {
        this.ldaptype = ldaptype;
    }


    public EntityItemLdaptypeType getLdaptype()
    {
        return ldaptype;
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
    public void setValue(
                    final Collection<? extends EntityItemRecordType> values
                    )
    {
        value.clear();
        if (values != null  &&  values.size() > 0) {
            for (EntityItemRecordType  value : values) {
                addValue( value );
            }
        }
    }


    public boolean addValue(
                    final EntityItemRecordType value
                    )
    {
        if (value == null) {
            throw new IllegalArgumentException( "empty value" );
        }

        return this.value.add( value );
    }


    public Collection<EntityItemRecordType> getValue()
    {
        return value;
    }


    public Iterator<EntityItemRecordType> iterateValue()
    {
        return value.iterator();
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
        if (!(obj instanceof Ldap57Item)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "ldap57_item[" + super.toString()
                        + ", suffix="       + getSuffix()
                        + ", relative_dn="  + getRelativeDn()
                        + ", attribute="    + getAttribute()
                        + ", ldaptype="     + getLdaptype()
                        + ", object_class=" + getObjectClass()
                        + ", value="        + getValue()
                        + "]";
    }

}
//
