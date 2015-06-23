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
package io.opensec.six.oval.model.variables;

import io.opensec.six.oval.model.common.AbstractDocument;
import io.opensec.six.oval.model.common.GeneratorType;
import org.mongodb.morphia.annotations.Entity;



/**
 * The OvalVariables is an OVAL Variable Document.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
@Entity( "oval.var.oval_variables" )
public class OvalVariables
    extends AbstractDocument
{

//    private GeneratorType  generator = new GeneratorType();
//    //{1..1}


    private VariablesType  variables;
    //{0..1}



    /**
     * Constructor.
     */
    public OvalVariables()
    {
    }


    public OvalVariables(
                    final GeneratorType generator
                    )
    {
        super( generator );
    }



    /**
     */
    public void setVariables(
                    final VariablesType variables
                    )
    {
        this.variables = variables;
    }


    public VariablesType getVariables()
    {
        return variables;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "oval_variables[generator=" + getGenerator()
                        + ", variables=" + getVariables()
                        + "]";
    }

}
//OvalVariables
