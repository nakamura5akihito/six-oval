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
import io.opensec.six.oval.model.OvalObject;




/**
 * The TestedVariable holds the value to a variable
 * used during the evaluation of a test.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class TestedVariableType
    implements ElementRef, OvalObject
//    implements Dependent<TestType>
{

    private String  content;
    //{simpleContent, base=xsd:anySimpleType}


    private String  variable_id;
    //{required, type="oval:VariableIDPattern"}



    /**
     * Constructor.
     */
    public TestedVariableType()
    {
    }


    public TestedVariableType(
                    final String variable_id,
                    final String content
                    )
    {
        setVariableId( variable_id );
        setContent( content );
    }



    /**
     */
    public void setContent(
                    final String content
                    )
    {
        this.content = content;
    }


    public String getContent()
    {
        return content;
    }



    /**
     */
    public void setVariableId(
                    final String variable_id
                    )
    {
        this.variable_id = variable_id;
    }


    public String getVariableId()
    {
        return variable_id;
    }



    //*********************************************************************
    //  ElementRef
    //*********************************************************************

    public String ovalGetRefId()
    {
        return getVariableId();
    }


    public ElementType ovalGetRefType()
    {
        return ElementType.VARIABLE;
    }



//    //**************************************************************
//    //  Dependent
//    //**************************************************************
//
//    private TestType  _master;
//
//
//
//    @Override
//    public void setMasterObject(
//                    final TestType master
//                    )
//    {
//        _master = master;
//    }
//
//
//
//    @Override
//    public TestType getMasterObject()
//    {
//        return _master;
//    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public int hashCode()
    {
        final int  prime = 37;
        int  result = 17;

        String  content = getContent();
        result = prime * result + ((content == null) ? 0 : content.hashCode());

        String  variable_id = getVariableId();
        result = prime * result + ((variable_id == null) ? 0 : variable_id.hashCode());

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

        if (!(obj instanceof TestedVariableType)) {
            return false;
        }

        TestedVariableType  other = (TestedVariableType)obj;
        String  other_content = other.getContent();
        String   this_content =  this.getContent();
        if (this_content == other_content
                        ||  (this_content != null  &&  this_content.equals( other_content ))) {
            String  other_variable_id = other.getVariableId();
            String   this_variable_id =  this.getVariableId();
            if (this_variable_id == other_variable_id
                            ||  (this_variable_id != null  &&  this_variable_id.equals( other_variable_id ))) {
                return true;
            }
        }

        return false;
    }



    @Override
    public String toString()
    {
        return "tested_variable[variable_id=" + getVariableId()
                        + ", content=" + getContent()
                        + "]";
    }

}
// TestedVariableType
