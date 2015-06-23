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
package io.opensec.six.oval.model.directives;

import io.opensec.six.oval.model.common.AbstractDocument;
import io.opensec.six.oval.model.common.GeneratorType;
import io.opensec.six.oval.model.results.ClassDirectivesType;
import io.opensec.six.oval.model.results.DefaultDirectivesType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.mongodb.morphia.annotations.Entity;



/**
 * The OvalDirectives is an OVAL Directive Document.
 * Its purpose is to bind together the generator and the set of directives contained in the document.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
@Entity( "oval.directives.oval_directives" )
public class OvalDirectives
    extends AbstractDocument
{

    private DefaultDirectivesType  directives;
    //{1..1}


    private final Collection<ClassDirectivesType>  class_directives = new ArrayList<ClassDirectivesType>();
    //{1..5}



    /**
     * Constructor.
     */
    public OvalDirectives()
    {
    }


    public OvalDirectives(
                    final GeneratorType generator
                    )
    {
        super( generator );
    }



    /**
     */
    public void setDirectives(
                    final DefaultDirectivesType variables
                    )
    {
        directives = variables;
    }


    public DefaultDirectivesType getDirectives()
    {
        return directives;
    }



    /**
     */
    public void setClassDirectives(
                    final Collection<? extends ClassDirectivesType> classDirectives
                    )
    {
        if (classDirectives != class_directives) {
            class_directives.clear();
            if (classDirectives != null  &&  classDirectives.size() > 0) {
                class_directives.addAll( classDirectives );
            }
        }
    }


    public Collection<ClassDirectivesType> getClassDirectives()
    {
        return class_directives;
    }


    public Iterator<ClassDirectivesType> iterateClassDirectives()
    {
        return class_directives.iterator();
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "oval_directives[generator=" + getGenerator()
                        + ", directives=" + getDirectives()
                        + ", class_directives=" + getDirectives()
                        + "]";
    }

}
//OvalDirectives
