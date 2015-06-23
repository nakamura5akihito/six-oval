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
package io.opensec.six.oval.model.definitions;

import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.ElementType;



/**
 * The ExtendDefinition allows existing definitions
 * to be extended by another definition.
 *
 * @author	Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class ExtendDefinitionType
    extends CriteriaElement
    implements ElementRef
{

    private String  definition_ref;
    //{required, oval:DefinitionIDPattern}



    /**
     * Constructor.
     */
    public ExtendDefinitionType()
    {
    }


    public ExtendDefinitionType(
                    final String definitionID
                    )
    {
        this( definitionID, null );
    }


    public ExtendDefinitionType(
                    final String definitionID,
                    final String comment
                    )
    {
        super( comment );
        setDefinitionRef( definitionID );
    }



    /**
     */
    public void setDefinitionRef(
                    final String definitionID
                    )
    {
        definition_ref = definitionID;
    }


    public String getDefinitionRef()
    {
        return definition_ref;
    }



    //*********************************************************************
    //  ElementRef
    //*********************************************************************

    public String ovalGetRefId()
    {
        return getDefinitionRef();
    }


    public ElementType ovalGetRefType()
    {
        return ElementType.DEFINITION;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public int hashCode()
    {
        final int  prime = 37;
        int  result = super.hashCode();

        String  defRef = getDefinitionRef();
        result = prime * result + ((defRef == null) ? 0 : defRef.hashCode());

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

        if (!(obj instanceof ExtendDefinitionType)) {
            return false;
        }

        if (super.equals( obj )) {
            ExtendDefinitionType  other = (ExtendDefinitionType)obj;
            String  other_defRef = other.getDefinitionRef();
            String   this_defRef =  this.getDefinitionRef();
            if (this_defRef == other_defRef
                            ||  (this_defRef != null
                                            &&  this_defRef.equals( other_defRef ))) {
                return true;
            }
        }

        return false;
    }



    @Override
    public String toString()
    {
        return "extend_definition[negate=" + getNegate()
                        + ", definition_ref=" + getDefinitionRef()
                        + ", comment=" + getComment()
                        + "]";
    }

}
// ExtendDefinitionType
