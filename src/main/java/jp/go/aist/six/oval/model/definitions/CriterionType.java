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

import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.ElementType;



/**
 * The Criterion identifies a specific test
 * to be included in the definition's criteria.
 *
 * @author	Akihito Nakamura, AIST
 * @version $Id: CriterionType.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class CriterionType
    extends CriteriaElement
    implements ElementRef
{

    private String  test_ref;
    //{required, oval:TestIDPattern}



    /**
     * Constructor.
     */
    public CriterionType()
    {
    }


    public CriterionType(
                    final String testID
                    )
    {
        this( testID, null );
    }


    public CriterionType(
                    final String testID,
                    final String comment
                    )
    {
        super( comment );
        setTestRef( testID );
    }



    /**
     */
    public void setTestRef(
                    final String testID
                    )
    {
        test_ref = testID;
    }


    public String getTestRef()
    {
        return test_ref;
    }



    //*********************************************************************
    //  ElementRef
    //*********************************************************************

    public String ovalGetRefId()
    {
        return getTestRef();
    }



    public ElementType ovalGetRefType()
    {
        return ElementType.TEST;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public int hashCode()
    {
        final int  prime = 37;
        int  result = super.hashCode();

        String  testRef = getTestRef();
        result = prime * result + ((testRef == null) ? 0 : testRef.hashCode());

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

        if (!(obj instanceof CriterionType)) {
            return false;
        }

        if (super.equals( obj )) {
            CriterionType  other = (CriterionType)obj;
            String  other_testRef = other.getTestRef();
            String   this_testRef =  this.getTestRef();
            if (this_testRef == other_testRef
                            ||  (this_testRef != null
                                            &&  this_testRef.equals( other_testRef ))) {
                return true;
            }
        }

        return false;
    }



    @Override
    public String toString()
    {
        return "criterion[negate=" + getNegate()
                        + ", test_ref=" + getTestRef()
                        + ", comment=" + getComment()
                        + "]";
    }

}
// CriterionType
