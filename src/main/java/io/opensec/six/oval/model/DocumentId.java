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
package io.opensec.six.oval.model;



/**
 * A document ID container.
 *
 * @author	Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class DocumentId
    implements OvalObject
{

    private String  _value;



    /**
     * Constructor.
     */
    public DocumentId()
    {
    }


    public DocumentId(
                    final String content
                    )
    {
        setValue( content );
    }



    /**
     */
    public void setValue(
                    final String value
                    )
    {
        _value = value;
    }


    public String getValue()
    {
        return _value;
    }



    // **************************************************************
    // java.lang.Object
    // **************************************************************

    @Override
    public String toString()
    {
        return "DocumentId[" + getValue() + "]";
    }

}
//
