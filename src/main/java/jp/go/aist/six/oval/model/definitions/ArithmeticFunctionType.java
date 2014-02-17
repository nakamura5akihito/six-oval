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
 * The arithmetic function takes two or more integer or float components
 * and performs a basic mathematical function on them.
 *
 * @author	Akihito Nakamura, AIST
 * @version $Id: ArithmeticFunctionType.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class ArithmeticFunctionType
    extends FunctionGroup
{

    private final Collection<ComponentGroup>  component =
        new ArrayList<ComponentGroup>();
    //{2..*}


    private ArithmeticEnumeration  arithmetic_operation;
    //{required}



    /**
     * Constructor.
     */
    public ArithmeticFunctionType()
    {
    }



    /**
     */
    public void setComponent(
                    final Collection<? extends ComponentGroup> components
                    )
    {
        if (components != component) {
            component.clear();
            if (components != null  &&  components.size() > 0) {
                for (ComponentGroup  component : components) {
                    addComponent( component );
                }
//                this.component.addAll( components );
            }
        }
    }


    public boolean addComponent(
                    final ComponentGroup component
                    )
    {
        if (component == null) {
            return false;
        }

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



    /**
     *
     */
    public void setArithmeticOperation(
                    final ArithmeticEnumeration arithmetic_operation
                    )
    {
        this.arithmetic_operation = arithmetic_operation;
    }


    public ArithmeticEnumeration getArithmeticOperation()
    {
        return arithmetic_operation;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "arithmetic[" + getComponent()
                        + ", arithmetic_operation=" + getArithmeticOperation()
             + "]";
    }

}
// ArithmeticFunctionType
