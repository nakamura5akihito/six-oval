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

import io.opensec.six.oval.model.common.ClassEnumeration;
import org.mongodb.morphia.annotations.Property;



/**
 * The ClassDirectives presents a set of flags that describe
 * what information has been included in the results document
 * for a specific OVAL Definition class.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class ClassDirectivesType
    extends DirectivesType
{

    @Property( "class" )
    private ClassEnumeration  definition_class;
    //{required}



    /**
     * Constructor.
     */
    public ClassDirectivesType()
    {
    }


    /**
     * Constructor.
     */
    public ClassDirectivesType(
                    final ClassEnumeration definitionClass,
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

        setDefinitionClass( definitionClass );
    }



    /**
     */
    public void setDefinitionClass(
                    final ClassEnumeration definition_class
                    )
    {
        this.definition_class = definition_class;
    }


    public ClassEnumeration getDefinitionClass()
    {
        return definition_class;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public int hashCode()
    {
        final int  prime = 37;
        int  result = super.hashCode();

        ClassEnumeration  definitionClass = getDefinitionClass();
        result = prime * result + ((definitionClass == null) ? 0 : definitionClass.hashCode());

        return result;
    }



    @Override
    public boolean equals(
                    final Object obj
                    )
    {
        if (!(obj instanceof ClassDirectivesType)) {
            return false;
        }


        if (super.equals( obj )) {
            ClassDirectivesType  other = (ClassDirectivesType)obj;
            if (getDefinitionClass() == other.getDefinitionClass()) {
                return true;
            }
        }

        return false;
    }

}
// ClassDirectivesType
