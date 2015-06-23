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
package io.opensec.six.oval.model.windows;

import io.opensec.six.oval.model.definitions.EntityMap;



/**
 * The Windows file properties.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class File
{

    public enum Entity
    {
        FILEPATH, PATH, FILENAME, OWNER, SIZE, // Int
        A_TIME, // Int
        C_TIME, // Int
        M_TIME, // Int
        MS_CHECKSUM,
        VERSION, // Version
        TYPE, // FileType
        DEVELOPMENT_CLASS,
        COMPANY,
        INTERNAL_NAME,
        LANGUAGE,
        ORIGINAL_FILENAME,
        PRODUCT_NAME,
        PRODUCT_VERSION; // Version
    }



    /**
     */
    public static EntityMap<File.Entity> createEntityMap()
    {
        return (new EntityMap<File.Entity>());
    }

}
//
