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

import io.opensec.six.oval.model.OvalObject;



/**
 * The LdapBehaviors defines a number of behaviors that allow
 * a more detailed definition of the ldap_object being specified.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class LdapBehaviors
    implements OvalObject
{

    public static final LdapBehaviorsEnumeration  DEFAULT_SCOPE =
        LdapBehaviorsEnumeration.BASE;

    private LdapBehaviorsEnumeration  scope;
    //{optional, default='BASE'}



    /**
     * Constructor.
     */
    public LdapBehaviors()
    {
    }



    /**
     */
    public void setScope(
                    final LdapBehaviorsEnumeration scope
                    )
    {
        this.scope = scope;
    }


    public LdapBehaviorsEnumeration getScope()
    {
        return scope;
    }


    public static final LdapBehaviorsEnumeration scope(
                    final LdapBehaviors obj
                    )
    {
        LdapBehaviorsEnumeration  scope = obj.getScope();
        return (scope == null ? DEFAULT_SCOPE : scope);
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public int hashCode()
    {
        final int  prime = 37;
        int  result = super.hashCode();

        result = prime * result + scope( this ).hashCode();

        return result;
    }



    @Override
    public boolean equals(
                    final Object obj
                    )
    {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof LdapBehaviors)) {
            return false;
        }

        if (super.equals( obj )) {
            LdapBehaviors  other = (LdapBehaviors)obj;
            if (scope( this ) == scope( other )) {
                return true;
            }
        }

        return false;
    }



    @Override
    public String toString()
    {
        return super.toString()
                        + ", scope=" + getScope()
                        ;
    }

}
// LdapBehaviors
