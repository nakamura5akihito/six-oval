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
package jp.go.aist.six.oval.core.repository.morphia;

import jp.go.aist.six.util.core.repository.morphia.MorphiaMongoDatastore;



/**
 * A MongoDB-Morphia-based implementation of the OvalDatastore.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: OvalDatastore.java 3109 2013-04-26 10:34:18Z nakamura5akihito@gmail.com $
 */
public class OvalDatastore
    extends MorphiaMongoDatastore
{

    /**
     * Constructor.
     */
    public OvalDatastore()
    {
        super( new OvalQueryBuilder() );
    }

}
//
