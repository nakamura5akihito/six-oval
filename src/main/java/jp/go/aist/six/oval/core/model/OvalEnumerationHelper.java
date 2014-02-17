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
package jp.go.aist.six.oval.core.model;

import java.lang.reflect.Method;
import java.util.HashMap;
import jp.go.aist.six.oval.OvalException;
import jp.go.aist.six.oval.model.OvalEnumeration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * Helper functions for the OvalEnumeration.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: OvalEnumerationHelper.java 3062 2013-02-25 03:18:33Z nakamura5akihito@gmail.com $
 */
public final class OvalEnumerationHelper
{

    /**
     * Logger.
     */
    private static final Logger  _LOG_ = LoggerFactory.getLogger( OvalEnumerationHelper.class );


    private static final HashMap<Class<? extends OvalEnumeration>, Method>
    _FROM_VALUE_METHODS_ = new HashMap<Class<? extends OvalEnumeration>, Method>();



    /**
     * Invokes the static fromValue(String) method of the given OvalEnumeration class.
     *
     * @param   type
     *  the concrete OvalEnumeration type.
     * @param   value
     *  the value of the enumeration.
     * @return
     *  the OvalEnumeration instance of the given type and value.
     * @throws  OvalException
     */
    public static <T extends OvalEnumeration> T fromValue(
                    final Class<T> type,
                    final String value
                    )
    {
        if (type == null) {
            throw new IllegalArgumentException( "empty type" );
        }

        Object  obj = null;
        Method  method = _FROM_VALUE_METHODS_.get( type );
        try {
            if (method == null) {
                method = type.getMethod( "fromValue", String.class );
                              //throws NoSuchMethodexception
                _FROM_VALUE_METHODS_.put( type, method );
            }
            obj = method.invoke( null, value );
                         //throws IllegalAccessException, InvocationTargetException
        } catch (Exception ex) {
            _LOG_.error( ex.getMessage() );
            throw new OvalException( ex );
        }

        return type.cast( obj );
    }



    /**
     * Invokes the value() method of the given OvalEnumeration instance.
     *
     * @param   obj
     *  the OvalEnumeration instance.
     * @return
     *  the return value of the value() method.
     * @throws  OvalException
     */
    public static String value(
                    final OvalEnumeration obj
                    )
    {
        if (obj == null) {
            throw new IllegalArgumentException( "empty object" );
        }

        _LOG_.trace( String.valueOf( obj.getClass() ) );
        return obj.value();
    }

}
//

