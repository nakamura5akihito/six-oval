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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



/**
 * The concat function takes two or more components
 * and concatenates them together to form a single string.
 *
 * @author	Akihito Nakamura, AIST
 * @version $Id: ConcatFunctionType.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class ConcatFunctionType
    extends FunctionGroup
{

    private final Collection<ComponentGroup>  component =
        new ArrayList<ComponentGroup>();
    //{2..*}



    /**
     * Constructor.
     */
    public ConcatFunctionType()
    {
    }



    /**
     */
    public void setComponent(
                    final Collection<? extends ComponentGroup> component
                    )
    {
        if (component != this.component) {
            this.component.clear();
            if (component != null  &&  component.size() > 0) {
                this.component.addAll( component );
            }
        }
    }


    public boolean addComponent(
                    final ComponentGroup component
                    )
    {
        return this.component.add( component );
    }


    public Collection<ComponentGroup> getComponent()
    {
        return component;
    }


    public Iterator<ComponentGroup> iterateComponent()
    {
        return component.iterator();
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "concat[" + getComponent()
             + "]";
    }

}
// ConcatFunctionType
