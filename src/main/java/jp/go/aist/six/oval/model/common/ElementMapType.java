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

import jp.go.aist.six.oval.model.OvalObject;




/**
 * The ElementMapType is used to document the association between 
 * OVAL test, object, state, and item entities.
 *
 * @author	Akihito Nakamura, AIST
 * @version $Id: ElementMapType.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class ElementMapType
    implements OvalObject
{

    private ElementMapItemType  test;
    //{1..1}

    private ElementMapItemType  object;
    //{0..1}

    private ElementMapItemType  state;
    //{0..1}

    private ElementMapItemType  item;
    //{0..1}



    /**
     * Constructor.
     */
    public ElementMapType()
    {
    }



    /**
     */
    public void setTest(
                    final ElementMapItemType test
                    )
    {
        this.test = test;
    }


    public ElementMapItemType getTest()
    {
        return test;
    }



    /**
     */
    public void setObject(
                    final ElementMapItemType object
                    )
    {
        this.object = object;
    }


    public ElementMapItemType getObject()
    {
        return object;
    }



    /**
     */
    public void setState(
                    final ElementMapItemType state
                    )
    {
        this.state = state;
    }


    public ElementMapItemType getState()
    {
        return state;
    }



    /**
     */
    public void setItem(
                    final ElementMapItemType item
                    )
    {
        this.item = item;
    }


    public ElementMapItemType getItem()
    {
        return item;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "[test=" 	+ getTest()
             + ", object=" 	+ getObject()
             + ", state=" 	+ getState()
             + ", item=" 	+ getItem()
             + "]";
    }

}
//
