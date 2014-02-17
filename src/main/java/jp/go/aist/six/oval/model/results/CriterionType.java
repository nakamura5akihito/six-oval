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
package jp.go.aist.six.oval.model.results;

import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.ElementType;



/**
 * The CriterionResult identifies a specific test that is included
 * in the definition's criteria.
 *
 * @author	Akihito Nakamura, AIST
 * @version $Id: CriterionType.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class CriterionType
    extends CriteriaResultLeafElement
    implements ElementRef
{

    private String  test_ref;
    //{oval:TestIDPattern, required}



    /**
     * Constructor.
     */
    public CriterionType()
    {
    }


    public CriterionType(
                    final String testID,
                    final int version
                    )
    {
        super( testID, version );
    }


    public CriterionType(
                    final String id,
                    final int version,
                    final ResultEnumeration result
                    )
    {
        super( id, version, result );
    }



    /**
     */
    public void setTestRef(
                    final String test_ref
                    )
    {
        _setEntityRef( test_ref );
    }


    public String getTestRef()
    {
        return _getEntityRef();
    }



    //**************************************************************
    //  CriteriaResultElement
    //**************************************************************

    @Override
    protected void _setEntityRef(
                    final String test_ref
    )
    {
        this.test_ref = test_ref;
    }


    @Override
    protected String _getEntityRef()
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
    public String toString()
    {
        return "criterion[test_ref=" + getTestRef()
                        + ", " + super.toString()
                        + "]";
    }

}
// CriterionType
