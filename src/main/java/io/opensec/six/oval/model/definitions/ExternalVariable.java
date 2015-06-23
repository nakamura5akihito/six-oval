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
package io.opensec.six.oval.model.definitions;

import io.opensec.six.oval.model.common.DatatypeEnumeration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



/**
 * The external variable extends the VariableType and
 * defines a variable with some external source.
 *
 * @author	Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class ExternalVariable
    extends VariableType
{

    private final Collection<PossibleValueType>  possible_value = new ArrayList<PossibleValueType>();
    //{0..*}

    private final Collection<PossibleRestrictionType>  possible_restriction = new ArrayList<PossibleRestrictionType>();
    //{1..*}



    /**
     * Constructor.
     */
    public ExternalVariable()
    {
        this( null, 0 );
    }


    public ExternalVariable(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public ExternalVariable(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        this( id, version, comment, null );
    }


    public ExternalVariable(
                    final String id,
                    final int version,
                    final String comment,
                    final DatatypeEnumeration datatype
                    )
    {
        super( id, version, comment, datatype );

//        _oval_component_type = OvalComponentType.external;
    }



    /**
     */
    public void setPossibleValue(
                    final Collection<? extends PossibleValueType> possible_values
                    )
    {
        if (possible_values != possible_value) {
            possible_value.clear();
            if (possible_values != null  &&  possible_values.size() > 0) {
                for (PossibleValueType  value : possible_values) {
                    addPossibleValue( value );
                }
            }
        }
    }


    public boolean addPossibleValue(
                    final PossibleValueType possible_value
                    )
    {
        if (possible_value == null) {
            return false;
        }

        return this.possible_value.add( possible_value );
    }


    public Collection<PossibleValueType> getPossibleValue()
    {
        return possible_value;
    }


    public Iterator<PossibleValueType> iteratePossibleValue()
    {
        return possible_value.iterator();
    }



    /**
     */
    public void setPossibleRestriction(
                    final Collection<? extends PossibleRestrictionType> restrictions
                    )
    {
        if (restrictions != possible_restriction) {
            possible_restriction.clear();
            if (restrictions != null  &&  restrictions.size() > 0) {
                for (PossibleRestrictionType  restriction : restrictions) {
                    addPossibleRestriction( restriction );
                }
            }
        }
    }


    public boolean addPossibleRestriction(
                    final PossibleRestrictionType restriction
                    )
    {
        if (restriction == null) {
            return false;
        }

        return possible_restriction.add( restriction );
    }


    public Collection<PossibleRestrictionType> getPossibleRestriction()
    {
        return possible_restriction;
    }


    public Iterator<PossibleRestrictionType> iteratePossibleRestriction()
    {
        return possible_restriction.iterator();
    }




    //**************************************************************
    //  SIX extension
    //**************************************************************

    @Override
    public VariableType.Type ovalGetVariableType()
    {
        return VariableType.Type.EXTERNAL;
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
        if (!(obj instanceof ExternalVariable)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "external_variable[" + super.toString()
             + ", possible_value=" + getPossibleValue()
             + ", possible_restriction=" + getPossibleRestriction()
             + "]";
    }

}
//ExternalVariable
