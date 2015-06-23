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
package io.opensec.six.oval.model.sc;

import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.ElementType;
import io.opensec.six.oval.model.OvalObject;




/**
 * The variableValue holds the value to a variable
 * used during the collection of an object.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class VariableValueType
    implements ElementRef, OvalObject
//    implements Dependent<SystemObjectType>
{

    private String  variable_id;
    //{required, oval:VariableIDPattern}


    private String  content;
    //{xsd:anySimpleType}



    /**
     * Constructor.
     */
    public VariableValueType()
    {
    }


    public VariableValueType(
                    final String variable_id,
                    final String content
                    )
    {
        setVariableId( variable_id );
        setContent( content );
    }



    /**
     */
    public void setVariableId(
                    final String id
                    )
    {
        variable_id = id;
    }


    public String getVariableId()
    {
        return variable_id;
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
//    private SystemObjectType  _master;
//
//
//
//    @Override
//    public void setMasterObject(
//                    final SystemObjectType master
//                    )
//    {
//        _master = master;
//    }
//
//
//    @Override
//    public SystemObjectType getMasterObject()
//    {
//        return _master;
//    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "[variable_id=" + getVariableId()
                        + ", " + getContent()
                        + "]";
    }

}
// VariableValueType
