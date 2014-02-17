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
import jp.go.aist.six.oval.model.common.DatatypeEnumeration;



/**
 * The ConstantVariable extends the VariableType and
 * defines a variable with a constant value(s).
 *
 * @author	Akihito Nakamura, AIST
 * @version $Id: ConstantVariable.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class ConstantVariable
    extends VariableType
{

    private final Collection<ValueType>  value = new ArrayList<ValueType>();



    /**
     * Constructor.
     */
    public ConstantVariable()
    {
        this( null, 0 );
    }


    public ConstantVariable(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public ConstantVariable(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        this( id, version, comment, null );
    }


    public ConstantVariable(
                    final String id,
                    final int version,
                    final String comment,
                    final DatatypeEnumeration datatype
                    )
    {
        super( id, version, comment, datatype );

//        _oval_component_type = OvalComponentType.constant;
    }



    /**
     */
    public void setValue(
                    final Collection<? extends ValueType> values
                    )
    {
        value.clear();
        if (values != null  &&  values.size() > 0) {
            for (ValueType  value : values) {
                addValue( value );
            }
        }
    }


    public boolean addValue(
                    final ValueType value
                    )
    {
        if (value == null) {
            throw new IllegalArgumentException( "empty value" );
        }

        return this.value.add( value );
    }


    public Collection<ValueType> getValue()
    {
        return value;
    }


    public Iterator<ValueType> iterateValue()
    {
        return value.iterator();
    }



    //**************************************************************
    //  SIX extension
    //**************************************************************

    @Override
    public VariableType.Type ovalGetVariableType()
    {
        return VariableType.Type.CONSTANT;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public int hashCode()
    {
        return super.hashCode();
    }



    @Override
    public boolean equals(
                    final Object obj
                    )
    {
        if (!(obj instanceof ConstantVariable)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "constant_variable[" + super.toString()
             + ", value=" + getValue()
             + "]";
    }

}
// ConstantVariable
