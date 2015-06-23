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



/**
 * The DefaultDirectives presents the default set of flags
 * that describe what information has been included in the results document.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class DefaultDirectivesType
    extends DirectivesType
{

    public static final Boolean  DEFAULT_INCLUDE_SOURCE_DEFINITIONS = Boolean.TRUE;

    private Boolean  include_source_definitions;
    //{optional, default='true'}



    /**
     * Constructor.
     */
    public DefaultDirectivesType()
    {
    }


    /**
     * Constructor.
     */
    public DefaultDirectivesType(
                    final boolean includeSourceDefinitions,
                    final DirectiveType definitionTrue,
                    final DirectiveType definitionFalse,
                    final DirectiveType definitionUnknown,
                    final DirectiveType definitionError,
                    final DirectiveType definitionNotEvaluated,
                    final DirectiveType definitionNotApplicable
                    )
    {
        super(
                        definitionTrue,
                        definitionFalse,
                        definitionUnknown,
                        definitionError,
                        definitionNotEvaluated,
                        definitionNotApplicable
        );

        setIncludeSourceDefinitions( includeSourceDefinitions );
    }



    /**
     */
    public void setIncludeSourceDefinitions(
                    final Boolean include_source_definitions
                    )
    {
        this.include_source_definitions = include_source_definitions;
    }


    public Boolean isIncludeSourceDefinitions()
    {
        return include_source_definitions;
    }


    public static final Boolean includeSourceDefinitions(
                    final DefaultDirectivesType obj
                    )
    {
        Boolean  include_source_definitions = obj.isIncludeSourceDefinitions();
        return (include_source_definitions == null
                        ? DEFAULT_INCLUDE_SOURCE_DEFINITIONS
                        : include_source_definitions);
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public int hashCode()
    {
        final int  prime = 37;
        int  result = super.hashCode();

        result = prime * result + includeSourceDefinitions( this ).hashCode();

        return result;
    }



    @Override
    public boolean equals(
                    final Object obj
                    )
    {
        if (!(obj instanceof DefaultDirectivesType)) {
            return false;
        }


        if (super.equals( obj )) {
            DefaultDirectivesType  other = (DefaultDirectivesType)obj;
            if (includeSourceDefinitions( this ) == includeSourceDefinitions( other )) {
                return true;
            }
        }

        return false;
    }

}
// DefaultDirectives
