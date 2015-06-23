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
package io.opensec.six.oval.model.results;

import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.ElementType;



/**
 * The ExtendDefinitionResult identifies a specific definition
 * that has been extended by the criteria.
 *
 * @author	Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class ExtendDefinitionType
    extends CriteriaResultLeafElement
    implements ElementRef
{

    private String  definition_ref;
    //{oval:DefinitionIDPattern, required}



    /**
     * Constructor.
     */
    public ExtendDefinitionType()
    {
    }


    public ExtendDefinitionType(
                    final String testID,
                    final int version
                    )
    {
        super( testID, version );
    }


    public ExtendDefinitionType(
                    final String id,
                    final int version,
                    final ResultEnumeration result
                    )
    {
        super( id, version, result );
    }



    /**
     */
    public void setDefinitionRef(
                    final String definition_ref
                    )
    {
        _setEntityRef( definition_ref );
    }


    public String getDefinitionRef()
    {
        return _getEntityRef();
    }



    //**************************************************************
    //  CriteriaResultElement
    //**************************************************************

    @Override
    protected void _setEntityRef(
                    final String definition_ref
    )
    {
        this.definition_ref = definition_ref;
    }


    @Override
    protected String _getEntityRef()
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
    public String toString()
    {
        return "extend_definition[definition_ref=" + getDefinitionRef()
                        + ", " + super.toString()
                        + "]";
    }

}
// ExtendDefinitionType
