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

import io.opensec.six.oval.model.OvalObject;
import io.opensec.six.oval.model.common.OperationEnumeration;



/**
 * The RestrictionType outlines a restriction that is placed
 * on expected values for an external variable.
 * For example, a possible value may be restricted to a integer less than 10.
 *
 * @author	Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class RestrictionType
    implements OvalObject
{

    private String  content;

    private OperationEnumeration  operation;
    //{required}




    /**
     * Constructor.
     */
    public RestrictionType()
    {
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
    public void setOperation(
                    final OperationEnumeration operation
                    )
    {
        this.operation = operation;
    }


    public OperationEnumeration getOperation()
    {
        return operation;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "[" + getContent()
            + ", operation=" + getOperation()
            + "]";
    }

}
//RestrictionType
