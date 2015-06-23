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

import io.opensec.six.oval.model.OvalObject;




/**
 * An abstract base class for Criteria, Criterion, and ExtendDefinition.
 *
 * @author	Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class CriteriaElement
    implements OvalObject
//    implements Dependent<DefinitionType>
{

    private Boolean  applicability_check;
    //{optional, xsd:boolean}


    public static final Boolean  DEFAULT_NEGATE = Boolean.FALSE;
    private Boolean  negate;
    //{optional, xsd:boolean, default="false"}

    private String  comment;
    //{optional}



    /**
     * Constructor.
     */
    public CriteriaElement()
    {
    }


    /**
     * Constructor.
     */
    public CriteriaElement(
                    final String comment
                    )
    {
        setComment( comment );
    }



    /**
     */
    public Boolean getApplicabilityCheck()
    {
        return applicability_check;
    }


    public void setApplicabilityCheck(
                    final Boolean applicability_check
                    )
    {
        this.applicability_check = applicability_check;
    }



    /**
     */
    public void setNegate(
                    final Boolean negate
                    )
    {
        this.negate = negate;
    }


    public Boolean getNegate()
    {
        return negate;
    }


    public static final Boolean negate(
                    final CriteriaElement ce
                    )
    {
        if (ce == null) {
            throw new IllegalArgumentException( "null CriteriaElement" );
        }

        Boolean  negate = ce.getNegate();

        return (negate == null ? DEFAULT_NEGATE : negate);
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



//    //**************************************************************
//    //  Dependent
//    //**************************************************************
//
//    private DefinitionType  _master;
//
//
//
//    @Override
//    public void setMasterObject(
//                    final DefinitionType master
//                    )
//    {
//        _master = master;
//    }
//
//
//    @Override
//    public DefinitionType getMasterObject()
//    {
//        return _master;
//    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public int hashCode()
    {
        final int  prime = 37;
        int  result = 17;

        Boolean  applicability_check = getApplicabilityCheck();
        result = prime * result + (applicability_check == null ? 0 : applicability_check.hashCode());

        Boolean  negate = getNegate();
        if (negate == null) {
            negate = DEFAULT_NEGATE;
        }
        result = prime * result + (negate ? 0 : 1);

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

        if (!(obj instanceof CriteriaElement)) {
            return false;
        }

        CriteriaElement  other = (CriteriaElement)obj;

        Boolean   this_applicability_check =  this.getApplicabilityCheck();
        Boolean  other_applicability_check = other.getApplicabilityCheck();
        if (this_applicability_check == other_applicability_check
                        ||  (this_applicability_check != null  &&  this_applicability_check.equals( other_applicability_check ))) {

            Boolean  otherNegate = other.getNegate();
            if (otherNegate == null) {
                otherNegate = DEFAULT_NEGATE;
            }
            Boolean  thisNegate = this.getNegate();
            if (thisNegate == null) {
                thisNegate = DEFAULT_NEGATE;
            }
            if (thisNegate.booleanValue() == otherNegate.booleanValue()) {
                return true;
            }
        }

        return false;
    }

}
// CriteriaElement
