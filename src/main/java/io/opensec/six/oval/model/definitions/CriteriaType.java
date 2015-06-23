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

import io.opensec.six.oval.model.common.OperatorEnumeration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;



/**
 * The Criteria describes a container for a set of sub Criteria,
 * Criteria, Criterion, or ExtendDefinition elements
 * allowing complex logical trees to be constructed.
 *
 * @author	Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class CriteriaType
    extends CriteriaElement
//    implements Iterable<CriteriaElement>
{

    private final Collection<CriteriaElement>  elements =
        new ArrayList<CriteriaElement>();
    //{1..*}

    public static final OperatorEnumeration  DEFAULT_OPERATOR = OperatorEnumeration.AND;
    private OperatorEnumeration  operator;
    //{optional, default="AND"}



    /**
     * Constructor.
     */
    public CriteriaType()
    {
    }


    /**
     * Constructor.
     */
    public CriteriaType(
                    final String comment
                    )
    {
        super( comment );
    }


    public CriteriaType(
                    final OperatorEnumeration operator
                    )
    {
        setOperator( operator );
    }


//    public CriteriaType(
//                    final OperatorEnumeration operator,
//                    final String comment
//                    )
//    {
//        this( operator );
//        setComment( comment );
//    }


    public CriteriaType(
                    final OperatorEnumeration operator,
                    final CriteriaElement[] elements
                    )
    {
        this( operator, (elements == null ? null : Arrays.asList( elements )) );
    }



    public CriteriaType(
                    final OperatorEnumeration operator,
                    final Collection<? extends CriteriaElement> elements
                    )
    {
        this( operator );
        setElements( elements );
    }



    public CriteriaType comment(
                    final String comment
                    )
    {
        setComment( comment );
        return this;
    }



    /**
     */
    public void setOperator(
                    final OperatorEnumeration operator
                    )
    {
        this.operator = operator;
    }


    public OperatorEnumeration getOperator()
    {
        return operator;
    }


    public static OperatorEnumeration operator(
                    final CriteriaType obj
                    )
    {
        OperatorEnumeration  operator = obj.getOperator();
        return (operator == null ? DEFAULT_OPERATOR : operator);
    }



    /**
     */
    public void setElements(
                    final Collection<? extends CriteriaElement> elementSequence
                    )
    {
        if (elementSequence != elements) {
            elements.clear();
            if (elementSequence != null  &&  elementSequence.size() > 0) {
                elements.addAll( elementSequence );
            }
        }
    }


    public Collection<CriteriaElement> getElements()
    {
        return elements;
    }


    public Iterator<CriteriaElement> iterateElements()
    {
        return elements.iterator();
    }


    public CriteriaType element(
                    final CriteriaElement element
                    )
    {
        elements.add( element );
        return this;
    }


    public CriteriaType criteria(
                    final OperatorEnumeration operator
                    )
    {
        return element( new CriteriaType( operator ) );
    }


    public CriteriaType criterion(
                    final String testID,
                    final String comment
                    )
    {
        return element( new CriterionType( testID, comment ) );
    }


    public CriteriaType extendDefinition(
                    final String definitionID,
                    final String comment
                    )
    {
        return element( new ExtendDefinitionType( definitionID, comment ) );
    }



    //**************************************************************
    //  Iterable
    //**************************************************************

//    @Override
    public Iterator<CriteriaElement> iterator()
    {
        return iterateElements();
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public int hashCode()
    {
        final int  prime = 37;
        int  result = super.hashCode();

        Collection<CriteriaElement>  elements = getElements();
        result = prime * result + ((elements == null) ? 0 : elements.hashCode());

        OperatorEnumeration  operator = getOperator();
        result = prime * result + ((operator == null) ? 0 : operator.hashCode());

        return result;
    }



    @Override
    public boolean equals(
                    final Object obj
                    )
    {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof CriteriaType)) {
            return false;
        }

        if (super.equals( obj )) {
            CriteriaType  other = (CriteriaType)obj;
            OperatorEnumeration  other_operator = other.getOperator();
            OperatorEnumeration   this_operator =  this.getOperator();
            if (this_operator == other_operator) {
                Collection<CriteriaElement>  other_elements = other.getElements();
                Collection<CriteriaElement>   this_elements =  this.getElements();
                if (this_elements == other_elements
                                ||  (this_elements != null
                                                &&  this_elements.equals( other_elements ))) {
                    return true;
                }
            }
        }

        return false;
    }



    @Override
    public String toString()
    {
        return "criteria[negate=" + getNegate()
                        + ", operator=" + getOperator()
                        + ", " + getElements()
                        + "]";
    }

}
// CriteriaType
