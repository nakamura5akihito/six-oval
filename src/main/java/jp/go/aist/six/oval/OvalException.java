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
package jp.go.aist.six.oval;

import jp.go.aist.six.util.NestedRuntimeException;



/**
 * An exceptional condition that occurred during the OVAL processing.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: OvalException.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
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

