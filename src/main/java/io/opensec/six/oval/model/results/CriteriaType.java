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
package io.opensec.six.oval.model.results;

import io.opensec.six.oval.model.common.OperatorEnumeration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



/**
 * The CriteriaResult describes the high level container
 * for all the tests and represents the meat of the definition.
 *
 * @author	Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class CriteriaType
    extends CriteriaResultElement
{

    private final Collection<CriteriaResultElement>  elements =
        new ArrayList<CriteriaResultElement>();
    //{1..*}


    private OperatorEnumeration  operator;
    //{required}



    /**
     * Constructor.
     */
    public CriteriaType()
    {
    }


    public CriteriaType(
                    final OperatorEnumeration operator,
                    final ResultEnumeration result
                    )
    {
        super( result );
        setOperator( operator );
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



    public void setElements(
                    final Collection<? extends CriteriaResultElement> elementList
                    )
    {
        if (elementList != elements) {
            elements.clear();
            if (elementList != null  &&  elementList.size() > 0) {
                elements.addAll( elementList );
            }
        }
    }


    public boolean addElement(
                    final CriteriaResultElement element
                    )
    {
        if (element == null) {
            return false;
        }

        return elements.add( element );
    }


    public Collection<CriteriaResultElement> getElements()
    {
        return elements;
    }


    public Iterator<CriteriaResultElement> iterateElements()
    {
        return elements.iterator();
    }


    public CriteriaType element(
                    final CriteriaResultElement element
                    )
    {
        addElement( element );
        return this;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "criteria[" + super.toString()
                        + ", operator=" + getOperator()
                        + ", " + getElements()
                        + "]";
    }

}
// CriteriaType
