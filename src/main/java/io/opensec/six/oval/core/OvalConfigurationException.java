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
package io.opensec.six.oval.core;

import io.opensec.six.oval.OvalException;



/**
 * A serious configuration error.
 *
 * @author  Akihito Nakamura, AIST
 */
public class OvalConfigurationException
    extends OvalException
{

    /**
     * Constructs an OvalConfigurationException with no detail message.
     */
    public OvalConfigurationException()
    {
        super();
    }



    /**
     * Constructs an OvalConfigurationException with the specified detail message.
     *
     * @param  message
     *   the detail message.
     */
    public OvalConfigurationException(
                    final String message
                    )
    {
        super( message );
    }



    /**
     * Constructs an OvalConfigurationException with the specified cause.
     *
     * @param   cause
     *  the cause.
     */
    public OvalConfigurationException(
                    final Throwable cause
                    )
    {
        super( cause );
    }



    /**
     * Constructs an OvalConfigurationException with the specified
     * detail message and cause.
     *
     * @param   message
     *  the detail message.
     * @param   cause
     *  the cause.
     */
    public OvalConfigurationException(
                    final String message,
                    final Throwable cause
                    )
    {
        super( message, cause );
    }

}
//

