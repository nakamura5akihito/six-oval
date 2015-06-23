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
package io.opensec.six.oval;

import io.opensec.util.NestedRuntimeException;



/**
 * An exceptional condition that occurred during the OVAL processing.
 *
 * @author  Akihito Nakamura, AIST
 */
public class OvalException
    extends NestedRuntimeException
{

    /**
     * Constructs an OvalException with no detail message.
     */
    public OvalException()
    {
        super();
    }



    /**
     * Constructs an OvalException with the specified detail message.
     *
     * @param  message
     *   the detail message.
     */
    public OvalException(
                    final String message
                    )
    {
        super( message );
    }



    /**
     * Constructs an OvalException with the specified cause.
     *
     * @param   cause
     *  the cause.
     */
    public OvalException(
                    final Throwable cause
                    )
    {
        super( cause );
    }



    /**
     * Constructs an OvalException with the specified
     * detail message and cause.
     *
     * @param   message
     *  the detail message.
     * @param   cause
     *  the cause.
     */
    public OvalException(
                    final String message,
                    final Throwable cause
                    )
    {
        super( message, cause );
    }

}
// OvalException

