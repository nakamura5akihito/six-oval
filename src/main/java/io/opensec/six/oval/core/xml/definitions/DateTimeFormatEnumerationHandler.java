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
package io.opensec.six.oval.core.xml.definitions;

import io.opensec.six.oval.model.definitions.DateTimeFormatEnumeration;
import org.exolab.castor.mapping.GeneralizedFieldHandler;


/**
 * 
 * @author Akihito Nakamura (nakamura5akihito@gmail.com)
 */
public class DateTimeFormatEnumerationHandler
    extends GeneralizedFieldHandler
{

    public DateTimeFormatEnumerationHandler()
    {
        super();
    }



    @Override
    public Object convertUponGet(
                    final Object value
                    )
    {
        if (value == null) {
            return null;
        }
        DateTimeFormatEnumeration  e = DateTimeFormatEnumeration.class.cast( value );
        return e.value();
    }



    @Override
    public Object convertUponSet(
                    final Object value
                    )
    {
        if (value == null) {
            return null;
        }
        return DateTimeFormatEnumeration.fromValue( value.toString() );
    }



    @Override
    public Class<DateTimeFormatEnumeration> getFieldType()
    {
        return DateTimeFormatEnumeration.class;
    }


//    public Object newInstance(
//                    final Object parent
//                    )
//    throws IllegalStateException
//    {
//        //-- Since it's marked as a string...just return null,
//        //-- it's not needed.
//        return null;
//    }

}
//DateTimeFormatEnumerationHandler
