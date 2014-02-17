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
package jp.go.aist.six.oval.model.common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import jp.go.aist.six.oval.model.DocumentGenerator;



/**
 * The Generator type defines an element that is used to hold
 * information about when a particular OVAL document was compiled,
 * what version of the schema was used,
 * what tool compiled the document, and
 * what version of that tools was used.
 *
 * @author	Akihito Nakamura, AIST
 * @version $Id: GeneratorType.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class GeneratorType
    extends DocumentGenerator
{

    private final Collection<GeneratorInformation>  additional_information =
        new ArrayList<GeneratorInformation>();
    //{0..*}



    /**
     * Constructor.
     */
    public GeneratorType()
    {
    }


    public GeneratorType(
                    final String schema_version,
                    final String timestamp
                    )
    {
        super( schema_version, timestamp );
    }


    public GeneratorType(
                    final String schema_version,
                    final String timestamp,
                    final String prod_name,
                    final String prod_version
                    )
    {
        super( schema_version, timestamp, prod_name, prod_version );
    }



    /**
     */
    public void setAdditionalInformation(
                    final Collection<? extends GeneratorInformation> info
                    )
    {
        if (info != additional_information) {
            additional_information.clear();
            if (info != null  &&  info.size() > 0) {
                additional_information.addAll( info );
            }
        }
    }


    public Collection<GeneratorInformation> getAdditionalInformation()
    {
        return additional_information;
    }


    public Iterator<GeneratorInformation> iterateAdditionalInformation()
    {
        return additional_information.iterator();
    }


    public GeneratorType additionalInformation(
                    final GeneratorInformation info
                    )
    {
        additional_information.add( info );
        return this;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

}
//
