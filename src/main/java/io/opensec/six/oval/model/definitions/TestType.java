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

import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.ElementType;
import io.opensec.six.oval.model.common.CheckEnumeration;
import io.opensec.six.oval.model.common.ExistenceEnumeration;
import io.opensec.six.oval.model.common.OperatorEnumeration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.mongodb.morphia.annotations.Entity;



/**
 * The Test is used to compare an object(s) against a defined state.
 *
 * @author	Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
@Entity( "oval.def.test" )
public class TestType
    extends DefinitionsComponent
{

    private NotesType  notes;
    //{0..1}


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


    private SystemObjectRefType  object;
    //{1..1}
    //{0/UnknownTest}


    private final Collection<StateRefType>  state = new ArrayList<StateRefType>();
    // {0..*}



    /**
     * Constructor.
     */
    public TestType()
    {
        this( null, 0 );
    }


    public TestType(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public TestType(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        this( id, version, comment, null );
    }


    public TestType(
                    final String id,
                    final int version,
                    final String comment,
                    final CheckEnumeration check
                    )
    {
        super( id, version, comment );
        setCheck( check );

//        _oval_entity_type = OvalEntityType.test;
//        _definitions_element_type = DefinitionsElement.Type.test;
    }


    public TestType(
                    final String id,
                    final int version,
                    final String comment,
                    final CheckEnumeration check,
                    final SystemObjectRefType object,
                    final StateRefType[] stateList
                    )
    {
        this( id, version, comment, check );

        setObject( object );
        setState( stateList );
    }


//    public TestType(
//                    final String id,
//                    final int version,
//                    final ExistenceEnumeration check_existence,
//                    final CheckEnumeration check,
//                    final OperatorEnumeration state_operator,
//                    final String comment,
//                    final Boolean deprecated,
//                    final NotesType notes
//                    )
//    {
//        super( id, version, comment );
//        setCheckExistence( check_existence );
//        setCheck( check );
//        setStateOperator( state_operator );
//        setDeprecated( deprecated );
//        setNotes( notes );
//    }




    /**
     */
    public void setNotes(
                    final NotesType notes
                    )
    {
        this.notes = notes;
    }


    public NotesType getNotes()
    {
        return notes;
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


    public static ExistenceEnumeration checkExistence(
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


    public TestType check(
                    final CheckEnumeration check
                    )
    {
        setCheck( check );
        return this;
    }



    /**
     */
    public void setStateOperator(
                    final OperatorEnumeration stateOperator
                    )
    {
        state_operator = stateOperator;
    }


    public OperatorEnumeration getStateOperator()
    {
        return state_operator;
    }


//    public TestType stateOperator(
//                    final OperatorEnumeration state_operator
//                    )
//    {
//        setStateOperator( state_operator );
//        return this;
//    }


    public static OperatorEnumeration stateOperator(
                    final TestType obj
                    )
    {
        OperatorEnumeration  state_operator = obj.getStateOperator();
        return (state_operator == null ? DEFAULT_STATE_OPERATOR : state_operator);
    }



    /**
     */
    public void setObject(
                    final SystemObjectRefType object
                    )
    {
        this.object = object;
    }


    public SystemObjectRefType getObject()
    {
        return object;
    }


    public TestType object(
                    final SystemObjectRefType objectRef
                    )
    {
        setObject( objectRef );
        return this;
    }


    public TestType object(
                    final String objectRef
                    )
    {
        return object( new SystemObjectRefType( objectRef ) );
    }



    /**
     */
    public void setState(
                    final Collection<? extends StateRefType> state_list
                    )
    {
        if (state_list != state) {
            state.clear();
            if (state_list != null  &&  state_list.size() > 0) {
                state.addAll( state_list );
            }
        }
    }


    public void setState(
                    final StateRefType[] stateList
                    )
    {
        if (stateList != null  &&  stateList.length > 0) {
            for (StateRefType  state : stateList) {
                if (state != null) {
                    this.state.add( state );
                }
            }
        }
    }


    public Collection<StateRefType> getState()
    {
        return state;
    }


    public Iterator<StateRefType> iterateState()
    {
        return state.iterator();
    }


    public void clearState()
    {
        state.clear();
    }


    public TestType state(
                    final StateRefType stateRef
                    )
    {
        state.add( stateRef );
        return this;
    }


    public TestType state(
                    final String stateRef
                    )
    {
        return state( new StateRefType( stateRef ) );
    }



    //*********************************************************************
    //  Element
    //*********************************************************************

    @Override
    public final ElementType ovalGetType()
    {
        return ElementType.TEST;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

//    @Override
//    public final Type ovalGetElementType()
//    {
//        return DefinitionsElement.Type.TEST;
//    }



    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();

        ref_list.add(    getObject() );
        ref_list.addAll( getState()  );

        return ref_list;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return super.toString()
                        + ", check_existence=" + getCheckExistence()
                        + ", check=" + getCheck()
                        + ", state_operator=" + getStateOperator()
                        + ", object_ref=" + getObject()
                        + ", state_ref=" + getState();
//                      + ", notes=" + getNotes();
    }

}
// TestType
