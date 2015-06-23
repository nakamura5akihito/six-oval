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
package io.opensec.six.oval.interpreter;

import java.io.Serializable;




/**
 * The OVAL Interpreter option.
 *
 * @author  Akihito Nakamura, AIST
 */
public class Option
    implements Serializable
{

    public final String   description;
    public final String   command;
    public final boolean  hasArgument;
    public final String   argumentName;
    public final String   defaultArgument;
    public final String   contentType;
    public final String   systemProperty;



    /**
     * Constructor.
     */
    public Option(
                    final String  description,
                    final String  command,
                    final boolean hasArgument,
                    final String  argumentName,
                    final String  defaultArgument,
                    final String  contentType,
                    final String  systemProperty
                    )
    {
        this.description        = description;
        this.command            = command;
        this.hasArgument        = hasArgument;
        this.argumentName       = argumentName;
        this.defaultArgument    = defaultArgument;
        this.contentType        = contentType;
        this.systemProperty     = systemProperty;
    }




//    /**
//     */
//    public static Collection<Option> values()
//    {
//        return _VALUES_;
//    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "Option["
                + (command != null ? command : "")
                + (hasArgument ? (" " + argumentName) : "")
//                + " = " + description
//                + " (default: " + defaultArgument
                + (contentType != null ? ("(" + contentType + ")") : "")
                + "]";
    }

}
// Option

