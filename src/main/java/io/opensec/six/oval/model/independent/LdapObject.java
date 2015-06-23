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
import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.definitions.EntityObjectStringType;
import io.opensec.six.oval.model.definitions.Set;
import io.opensec.six.oval.model.definitions.SystemObjectType;
import java.util.ArrayList;
import java.util.Collection;



/**
 * The ldap object is used by an LDAP test to define the objects
 * to be evaluated based on a specified state.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class LdapObject
    extends SystemObjectType
{
    //TODO:  XSD model choice( ... )

    private Set  set;

    private LdapBehaviors  behaviors;
    //{0..1}

    private EntityObjectStringType  suffix;

    private EntityObjectStringType  relative_dn;
//    private EntityObjectStringType  relative_dn = new EntityObjectStringType();
    //{nillable="true"}

    private EntityObjectStringType  attribute;
//    private EntityObjectStringType  attribute = new EntityObjectStringType();
    //{nillable="true"}



    /**
     * Constructor.
     */
    public LdapObject()
    {
        this( null, 0 );
    }


    public LdapObject(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public LdapObject(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.INDEPENDENT;
        _oval_component = ComponentType.LDAP;
    }



    /**
     */
    public void setSet(
                    final Set set
                    )
    {
        this.set = set;
    }


    public Set getSet()
    {
        return set;
    }



    /**
     */
    public void setBehaviors(
                    final LdapBehaviors behaviors
                    )
    {
        this.behaviors = behaviors;
    }


    public LdapBehaviors getBehaviors()
    {
        return behaviors;
    }



    /**
     */
    public void setSuffix(
                    final EntityObjectStringType suffix
                    )
    {
        this.suffix = suffix;
    }


    public EntityObjectStringType getSuffix()
    {
        return suffix;
    }



    /**
     */
    public void setRelativeDn(
                    final EntityObjectStringType relative_dn
                    )
    {
        this.relative_dn = relative_dn;
    }


    public EntityObjectStringType getRelativeDn()
    {
        return relative_dn;
    }



    /**
     */
    public void setAttribute(
                    final EntityObjectStringType attribute
                    )
    {
        this.attribute = attribute;
    }


    public EntityObjectStringType getAttribute()
    {
        return attribute;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getSuffix() );
        ref_list.add( getRelativeDn() );
        ref_list.add( getAttribute() );

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
        if (!(obj instanceof LdapObject)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "ldap_object[" + super.toString()
                        + ", set="       + getSet()
                        + ", behaviors=" + getBehaviors()
                        + ", suffix="    + getSuffix()
                        + ", relative_dn=" + getRelativeDn()
                        + ", attribute=" + getAttribute()
                       + "]";
    }

}
//
