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
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.EntityStateRecordType;
import jp.go.aist.six.oval.model.definitions.EntityStateStringType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 * The ldap57 state defines the different information that can be used
 * to evaluate the specified entries in an LDAP directory.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: Ldap57State.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class Ldap57State
    extends StateType
{

    private EntityStateStringType  suffix;
    //{0..1}

    private EntityStateStringType  relative_dn;
    //{0..1}

    private EntityStateStringType  attribute;
    //{0..1}

    private EntityStateStringType  object_class;
    //{0..1}

    private EntityStateLdaptypeType  ldaptype;
    //{0..1}

    private EntityStateRecordType  value;
    //{0..1}



    /**
     * Constructor.
     */
    public Ldap57State()
    {
        this( null, 0 );
    }


    public Ldap57State(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public Ldap57State(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

        _oval_family = Family.INDEPENDENT;
        _oval_component = ComponentType.LDAP57;
    }



    /**
     */
    public void setSuffix(
                    final EntityStateStringType suffix
                    )
    {
        this.suffix = suffix;
    }


    public EntityStateStringType getSuffix()
    {
        return suffix;
    }



    /**
     */
    public void setRelativeDn(
                    final EntityStateStringType relative_dn
                    )
    {
        this.relative_dn = relative_dn;
    }


    public EntityStateStringType getRelativeDn()
    {
        return relative_dn;
    }



    /**
     */
    public void setAttribute(
                    final EntityStateStringType attribute
                    )
    {
        this.attribute = attribute;
    }


    public EntityStateStringType getAttribute()
    {
        return attribute;
    }



    /**
     */
    public void setObjectClass(
                    final EntityStateStringType object_class
                    )
    {
        this.object_class = object_class;
    }


    public EntityStateStringType getObjectClass()
    {
        return object_class;
    }



    /**
     */
    public void setLdaptype(
                    final EntityStateLdaptypeType ldaptype
                    )
    {
        this.ldaptype = ldaptype;
    }


    public EntityStateLdaptypeType getLdaptype()
    {
        return ldaptype;
    }



    /**
     */
    public void setValue(
                    final EntityStateRecordType value
                    )
    {
        this.value = value;
    }


    public EntityStateRecordType getValue()
    {
        return value;
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
        ref_list.add( getObjectClass() );
        ref_list.add( getLdaptype() );
        ref_list.add( getValue() );

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
        if (!(obj instanceof Ldap57State)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "ldap57_state[" + super.toString()
                        + ", suffix="       + getSuffix()
                        + ", relative_dn="  + getRelativeDn()
                        + ", attribute="    + getAttribute()
                        + ", object_class=" + getObjectClass()
                        + ", ldaptype="     + getLdaptype()
                        + ", value="        + getValue()
                        + "]";
    }

}
//
