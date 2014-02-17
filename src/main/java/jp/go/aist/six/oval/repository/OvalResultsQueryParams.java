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
package jp.go.aist.six.oval.repository;



/**
 * @author  Akihito Nakamura, AIST
 * @version $Id: OvalResultsQueryParams.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 */
public class OvalResultsQueryParams
    extends OvalSystemCharacteristicsQueryParams
{

    public static class Key
    extends OvalSystemCharacteristicsQueryParams.Key
    {
        public static final String  DEFINITION = "definition";
        public static final String  DEFINITION_TRUE = "definition_true";
    }
    // Key



    /**
     * Constructor.
     */
    public OvalResultsQueryParams()
    {
    }



    /**
     */
    public void setDefinition(
                    final String oval_id
                    )
    {
        set( Key.DEFINITION, oval_id );
    }


    public String getDefinition()
    {
        return get( Key.DEFINITION );
    }



    /**
     */
    public void setDefinitionTrue(
                    final String oval_id
                    )
    {
        set( Key.DEFINITION_TRUE, oval_id );
    }


    public String getDefinitionTrue()
    {
        return get( Key.DEFINITION_TRUE );
    }

}
//OvalResultsQueryParams

