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
package io.opensec.six.oval.repository;



/**
 * @author  Akihito Nakamura, AIST
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

