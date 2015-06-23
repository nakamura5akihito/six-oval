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

import io.opensec.six.oval.model.common.FamilyEnumeration;
import io.opensec.six.oval.model.definitions.EntityStateStringType;



/**
 * The EntityStateFamily type defines a string entity value that is
 * restricted to a set of enumerations.
 * Each valid enumeration is a high-level family of system operating system.
 * The empty string is also allowed to support empty elements
 * associated with variable references.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class EntityStateFamilyType
    extends EntityStateStringType
{

    /**
     * Constructor.
     */
    public EntityStateFamilyType()
    {
    }


    public EntityStateFamilyType(
                    final String content
                    )
    {
        super( content );
    }



    //**************************************************************
    //  EntityBaseType
    //**************************************************************

    @Override
    public void setContent(
                    final String content
                    )
    {
        if (content != null) {
            //validation
            FamilyEnumeration.fromValue( content );
        }

        super.setContent( content );
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
        if (!(obj instanceof EntityStateFamilyType)) {
            return false;
        }

        return super.equals( obj );
    }

}
// EntityStateFamilyType
