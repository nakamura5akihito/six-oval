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
package jp.go.aist.six.oval.core.xml.sc;

import jp.go.aist.six.oval.model.sc.StatusEnumeration;
import org.exolab.castor.mapping.GeneralizedFieldHandler;


public class StatusEnumerationHandler
    extends GeneralizedFieldHandler
{

    public StatusEnumerationHandler()
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
        StatusEnumeration  e = StatusEnumeration.class.cast( value );
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
        return StatusEnumeration.fromValue( value.toString() );
    }



    @Override
    public Class<StatusEnumeration> getFieldType()
    {
        return StatusEnumeration.class;
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
// StatusEnumerationHandler
