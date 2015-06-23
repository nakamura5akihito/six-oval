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
package io.opensec.six.oval.model.ios;

import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.definitions.SystemObjectType;
import java.util.Collection;
import java.util.Collections;



/**
 * The snmp object is used by a snmp test to define those objects to evaluated
 * based on a specified state.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class SnmpObject
    extends SystemObjectType
{

    /**
     * Constructor.
     */
    public SnmpObject()
    {
        this( null, 0 );
    }


    public SnmpObject(
                    final String id,
                    final int version
                    )
    {
        super( id, version );

        _oval_family = Family.IOS;
        _oval_component = ComponentType.SNMP;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = Collections.emptyList();

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
        if (!(obj instanceof SnmpObject)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "snmp_object[" + super.toString() + "]";
    }

}
//
