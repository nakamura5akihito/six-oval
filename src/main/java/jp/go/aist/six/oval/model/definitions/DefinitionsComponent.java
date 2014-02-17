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
package jp.go.aist.six.oval.model.definitions;

import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.Family;




/**
 *
 * @author	Akihito Nakamura, AIST
 * @version $Id: DefinitionsComponent.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public abstract class DefinitionsComponent
    extends DefinitionsElement
{

    private String  comment;
    //{required:TestType}
    //{optional:ObjectType}
    //{optional:StateType}


    protected Family       _oval_family;
    protected ComponentType    _oval_component;



    /**
     * Constructor.
     */
    public DefinitionsComponent()
    {
    }


    /**
     * Constructor.
     */
    public DefinitionsComponent(
                    final String id,
                    final int version
                    )
    {
        super( id, version );
    }


    /**
     * Constructor.
     */
    public DefinitionsComponent(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version );
        setComment( comment );
    }



    /**
     */
    public void setComment(
                    final String comment
                    )
    {
        this.comment = comment;
    }


    public String getComment()
    {
        return comment;
    }


    public DefinitionsComponent comment(
                    final String comment
                    )
    {
        setComment( comment );
        return this;
    }

}
//
