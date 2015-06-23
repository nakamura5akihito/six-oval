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
import io.opensec.six.oval.model.common.OperatorEnumeration;
import java.util.Collection;
import java.util.Collections;
import org.mongodb.morphia.annotations.Entity;



/**
 * An OVAL State is a collection of one or more characteristics
 * pertaining to a specific object type.
 * The OVAL State is used by an OVAL Test to determine
 * if a set of items identified on a system meet
 * certain characteristics.
 *
 * @author	Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
@Entity( "oval.def.state" )
public class StateType
    extends DefinitionsComponent
{

    private NotesType  notes;
    //{0..1}


    public static final OperatorEnumeration  DEFAULT_OPERATOR =
        OperatorEnumeration.AND;

    private OperatorEnumeration  operator;
    //{optional, default="AND"}



    /**
     * Constructor.
     */
    public StateType()
    {
        this( null, 0 );
    }


    public StateType(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public StateType(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        super( id, version, comment );

//        _oval_entity_type = OvalEntityType.state;
//        _definitions_element_type = DefinitionsElement.Type.state;
    }



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


//    public StateType operator(
//                    final OperatorEnumeration operator
//                    )
//    {
//        setOperator( operator );
//        return this;
//    }


    public static OperatorEnumeration operator(
                    final StateType state
                    )
    {
        if (state == null) {
            throw new IllegalArgumentException( "null StateType" );
        }

        OperatorEnumeration  operator = state.getOperator();
        return (operator == null ? DEFAULT_OPERATOR : operator);
    }



    //*********************************************************************
    //  Element
    //*********************************************************************

    @Override
    public final ElementType ovalGetType()
    {
        return ElementType.STATE;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

//    @Override
//    public final Type ovalGetElementType()
//    {
//        return DefinitionsElement.Type.STATE;
//    }



    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        return Collections.emptyList();
//        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
//        return ref_list;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

}
// StateType
