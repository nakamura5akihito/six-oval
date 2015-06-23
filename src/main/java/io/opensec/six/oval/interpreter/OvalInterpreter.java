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
package io.opensec.six.oval.interpreter;



/**
 * A prescription of the OVAL Interpreter basic interface.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/interpreter.html">OVAL Interpreter</a>
 */
public interface OvalInterpreter
{

    /**
     * Starts a new OVAL interpreter process.
     *
     * @throws  OvalInterpreterException
     */
    public int execute();



    /**
     */
    public void setOptions( Options options );
//  public OvalDefinitionInterpreter setOptions( Options options );

    public Options getOptions();

}
//

