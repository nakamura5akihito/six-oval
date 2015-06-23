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
 * A prescription of the OVAL repository basic operations.
 * This repository supports any type of OVAL objects.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/adoption/usecasesguide.html">OVAL Use Case Guide</a>
 */
public interface OvalRepository
    extends OvalDefinitionRepository, OvalResultRepository
{

}
//
