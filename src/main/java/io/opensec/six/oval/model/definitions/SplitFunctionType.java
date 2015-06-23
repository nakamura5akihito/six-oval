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



/**
 * The split function takes a single string component and
 * turns it into multiple values based on a delimiter string.
 *
 * @author	Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class SplitFunctionType
    extends FunctionGroup
{

    private ComponentGroup  component;
    //{1..1}


    private String  delimiter;
    //{required}



    /**
     * Constructor.
     */
    public SplitFunctionType()
    {
    }



    /**
     */
    public void setComponent(
                    final ComponentGroup component
                    )
    {
        this.component = component;
    }


    public ComponentGroup getComponent()
    {
        return component;
    }



    /**
     */
    public void setDelimiter(
                    final String delimiter
                    )
    {
        this.delimiter = delimiter;
    }


    public String getDelimiter()
    {
        return delimiter;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "split[" + getComponent()
             + ", delimiter=" + getDelimiter()
             + "]";
    }

}
// SplitFunctionType
