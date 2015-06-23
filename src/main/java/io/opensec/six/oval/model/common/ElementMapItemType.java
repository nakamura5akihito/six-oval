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
package io.opensec.six.oval.model.common;

import io.opensec.six.oval.model.OvalObject;




/**
 * Defines a reference to an OVAL entity using the schema namespace and element name.
 *
 * @author	Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class ElementMapItemType
    implements OvalObject
{

    private String  content;


    private String  target_namespace;
    //{optional, type="xsd:anyURI"}



    /**
     * Constructor.
     */
    public ElementMapItemType()
    {
    }



    /**
     */
    public void setContent(
                    final String content
                    )
    {
        this.content = content;
    }


    public String getContent()
    {
        return content;
    }



    /**
     */
    public void setTargetNamespace(
                    final String target_namespace
                    )
    {
        this.target_namespace = target_namespace;
    }


    public String getTargetNamespace()
    {
        return target_namespace;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "[target_namespace=" + getTargetNamespace()
             + ", " + getContent()
             + "]";
    }

}
//
