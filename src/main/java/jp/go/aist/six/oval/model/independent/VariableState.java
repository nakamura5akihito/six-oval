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
package jp.go.aist.six.oval.model.independent;

import java.util.ArrayList;
import java.util.Collection;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.definitions.EntityStateAnySimpleType;
import jp.go.aist.six.oval.model.definitions.StateType;



/**
 * The variable state contains two entities that are used
 * to check the var_ref of the specified varible and the value associated with it.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: VariableState.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class VariableState
    extends StateType
{

    private EntityStateVariableRefType  var_ref;
    //{0..1}

    private EntityStateAnySimpleType  value;
    //{0..1}



    /**
     * Constructor.
     */
    public VariableState()
    {
        this( null, 0 );
    }


    public VariableState(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public VariableState(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_platform_type = OvalPlatformType.independent;
//        _oval_component_type = OvalComponentType.variable;
        _oval_family = Family.INDEPENDENT;
        _oval_component = ComponentType.VARIABLE;
    }



    /**
     */
    public void setVarRef(
                    final EntityStateVariableRefType var_ref
                    )
    {
        this.var_ref = var_ref;
    }


    public EntityStateVariableRefType getVarRef()
    {
        return var_ref;
    }



    /**
     */
    public void setValue(
                    final EntityStateAnySimpleType value
                    )
    {
        this.value = value;
    }


    public EntityStateAnySimpleType getValue()
    {
        return value;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
        ref_list.add( getVarRef() );
        ref_list.add( getValue() );

        return ref_list;
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
        if (!(obj instanceof VariableState)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "variable_state[" + super.toString()
                        + ", var_ref="       + getVarRef()
                        + ", value="        + getValue()
                        + "]";
    }

}
//VariableState
