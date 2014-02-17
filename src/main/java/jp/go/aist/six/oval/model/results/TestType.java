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

import java.util.ArrayList;
import java.util.Collection;
import jp.go.aist.six.oval.model.ElementType;
import jp.go.aist.six.oval.model.common.CheckEnumeration;
import jp.go.aist.six.oval.model.common.ExistenceEnumeration;
import jp.go.aist.six.oval.model.common.OperatorEnumeration;



/**
 * The TestResult provides a reference to every item
 * that matched the object section of the original test
 * as well as providing an overall test result based on those items.
 *
 * @author	Akihito Nakamura, AIST
 * @version $Id: TestType.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class TestType
    extends ResultsElement
//    implements Dependent<SystemType>
{

    private String  test_id;
    //{oval:TestIDPattern, required}


    private final Collection<TestedItemType>  tested_item =
                    new ArrayList<TestedItemType>();
    //{0..*}


    private final Collection<TestedVariableType>  tested_variable=
                    new ArrayList<TestedVariableType>();
    //{0..*}


    public static final ExistenceEnumeration  DEFAULT_CHECK_EXISTENCE =
                    ExistenceEnumeration.AT_LEAST_ONE_EXISTS;

    private ExistenceEnumeration  check_existence;
    //{optional, default="at_least_one_exists"}


    private CheckEnumeration  check;
    //{required}


    public static final OperatorEnumeration  DEFAULT_STATE_OPERATOR =
                    OperatorEnumeration.AND;

    private OperatorEnumeration  state_operator;
    //{optional, default="AND"}



    /**
     * Constructor.
     */
    public TestType()
    {
    }


    public TestType(
                    final String id,
                    final int version
                    )
    {
        super( id, version );
    }


    public TestType(
                    final String id,
                    final int version,
                    final ResultEnumeration result
                    )
    {
        super( id, version, result );
    }



    /**
     */
    public void setTestedItem(
                    final Collection<? extends TestedItemType> tested_item
                    )
    {
        if (tested_item != this.tested_item) {
            this.tested_item.clear();
            if (tested_item != null  &&  tested_item.size() > 0) {
                this.tested_item.addAll( tested_item );
            }
        }
    }


    public boolean addTestedItem(
                    final TestedItemType tested_item
                    )
    {
        return this.tested_item.add( tested_item );
    }


    public Collection<TestedItemType> getTestedItem()
    {
        return tested_item;
    }


    public TestType testedItem(
                    final TestedItemType item
                    )
    {
        addTestedItem( item );
        return this;
    }



    /**
     */
    public void setTestedVariable(
                    final Collection<? extends TestedVariableType> variableList
                    )
    {
        if (variableList != tested_variable) {
            tested_variable.clear();
            if (variableList != null  &&  variableList.size() > 0) {
                tested_variable.addAll( variableList );
            }
        }
    }


    public boolean addTestedVariable(
                    final TestedVariableType tested_variable
                    )
    {
        return this.tested_variable.add( tested_variable );
    }


    public Collection<TestedVariableType> getTestedVariable()
    {
        return tested_variable;
    }


    public TestType testedVariable(
                    final TestedVariableType variable
                    )
    {
        addTestedVariable( variable );
        return this;
    }



    /**
     */
    public void setTestId(
                    final String test_id
                    )
    {
        this.test_id = test_id;
    }


    public String getTestId()
    {
        return test_id;
    }



    /**
     */
    public void setCheckExistence(
                    final ExistenceEnumeration check_existence
                    )
    {
        this.check_existence = check_existence;
    }


    public ExistenceEnumeration getCheckExistence()
    {
        return check_existence;
    }


//    public TestType checkExistence(
//                    final ExistenceEnumeration check_existence
//                    )
//    {
//        setCheckExistence( check_existence );
//        return this;
//    }


    public static final ExistenceEnumeration checkExistence(
                    final TestType obj
                    )
    {
        ExistenceEnumeration  check_existence = obj.getCheckExistence();
        return (check_existence == null ? DEFAULT_CHECK_EXISTENCE : check_existence);
    }



    /**
     */
    public void setCheck(
                    final CheckEnumeration check
                    )
    {
        this.check = check;
    }


    public CheckEnumeration getCheck()
    {
        return check;
    }


//    public TestType check(
//                    final CheckEnumeration check
//                    )
//    {
//        setCheck( check );
//        return this;
//    }



    /**
     */
    public void setStateOperator(
                    final OperatorEnumeration state_operator
                    )
    {
        this.state_operator = state_operator;
    }


//    public TestType stateOperator(
//                    final OperatorEnumeration state_operator
//                    )
//    {
//        setStateOperator( state_operator );
//        return this;
//    }


    public OperatorEnumeration getStateOperator()
    {
        return state_operator;
    }


    public static final OperatorEnumeration stateOperator(
                    final TestType obj
                    )
    {
        OperatorEnumeration  state_operator = obj.getStateOperator();
        return (state_operator == null ? DEFAULT_STATE_OPERATOR : state_operator);
    }



    //*********************************************************************
    //  Element
    //*********************************************************************

    @Override
    public void setOvalId(
                    final String id
                    )
    {
        setTestId( id );
    }


    @Override
    public String getOvalId()
    {
        return getTestId();
    }



    @Override
    public final ElementType ovalGetType()
    {
        return ElementType.TEST;
    }



//    //**************************************************************
//    //  Dependent
//    //**************************************************************
//
//    private SystemType _master;
//
//
//
//    @Override
//    public void setMasterObject(
//                    final SystemType master
//                    )
//    {
//        _master = master;
//    }
//
//
//
//    @Override
//    public SystemType getMasterObject()
//    {
//        return _master;
//    }



//    private String _masterPersistentID;
//
//
//
//    public void setMasterPersistentID(
//                    final String id
//                    )
//    {
//        _masterPersistentID = id;
//    }
//
//
//
//    public String getMasterPersistentID()
//    {
//        if (_masterPersistentID == null) {
//            SystemResult  master = getMasterObject();
//            if (master != null) {
//                setMasterPersistentID( master.getPersistentID() );
//            }
//        }
//
//        return _masterPersistentID;
//    }



    // **************************************************************
    // java.lang.Object
    // **************************************************************

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
        if (!(obj instanceof TestType)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "test[" + super.toString()
                        + ", check_existence=" + getCheckExistence()
                        + ", check=" + getCheck()
                        + ", tested_item=" + getTestedItem()
                        + ", tested_variable=" + getTestedVariable()
                        + "]";
    }

}
// TestType
