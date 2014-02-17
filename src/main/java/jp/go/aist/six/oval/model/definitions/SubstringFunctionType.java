/**
 * SIX OVAL - http://code.google.com/p/six-oval/
 * Copyright (C) 2010
 *   National Institute of Advanced Industrial Science and Technology (AIST)
 *   Registration Number: H22PRO-1124
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
package jp.go.aist.six.oval.model.definitions;



/**
 * The substring function takes a single string component and
 * produces a single value that contains a portion of the original string.
 *
 * @author	Akihito Nakamura, AIST
 * @version $Id: SubstringFunctionType.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class SubstringFunctionType
    extends FunctionGroup
{

    private ComponentGroup  component;
    //{1..1}


    private int  substring_start;
    //{required}


    private int  substring_length;
    //{required}



    /**
     * Constructor.
     */
    public SubstringFunctionType()
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
    public void setSubstringStart(
                    final int substring_start
                    )
    {
        this.substring_start = substring_start;
    }


    public int getSubstringStart()
    {
        return substring_start;
    }



    /**
     */
    public void setSubstringLength(
                    final int substring_length
                    )
    {
        this.substring_length = substring_length;
    }


    public int getSubstringLength()
    {
        return substring_length;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "substring[" + getComponent()
             + ", substring_start=" + getSubstringStart()
             + ", substring_length=" + getSubstringLength()
             + "]";
    }

}
// SubstringFunctionType
