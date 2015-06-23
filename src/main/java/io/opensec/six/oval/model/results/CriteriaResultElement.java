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

import io.opensec.six.oval.model.OvalObject;



/**
 * An abstract base class for the criteria-related types.
 *
 * @author	Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public abstract class CriteriaResultElement
    implements OvalObject
{

    public static final Boolean  DEFAULT_NEGATE = Boolean.FALSE;

    private Boolean  negate;
    //{xsd:boolean, optional, default="false"}


    private ResultEnumeration  result;
    //{required}



    /**
     * Constructor.
     */
    public CriteriaResultElement()
    {
    }


    public CriteriaResultElement(
                    final ResultEnumeration result
                    )
    {
        setResult( result );
    }


//    public CriteriaResultElement(
//                    final ResultEnumeration result,
//                    final boolean negate
//                    )
//    {
//        setResult( result );
//        setNegate( negate );
//    }



    /**
     */
    public void setNegate(
                    final Boolean negate
                    )
    {
        this.negate = negate;
    }


    public Boolean isNegate()
    {
        return negate;
    }


    public static final Boolean negate(
                    final CriteriaResultElement obj
                    )
    {
        Boolean  negate = obj.isNegate();
        return (negate == null ? DEFAULT_NEGATE : negate);
    }



    /**
     */
    public void setResult(
                    final ResultEnumeration result
                    )
    {
        this.result = result;
    }


    public ResultEnumeration getResult()
    {
        return result;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "negate=" + isNegate()
                        + ", result=" + getResult()
                        ;
    }

}
// CriteriaResultElement
