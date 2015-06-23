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
package io.opensec.six.oval.model.sc;

import io.opensec.six.oval.model.Element;
import io.opensec.six.oval.model.ElementType;
import io.opensec.six.oval.model.common.MessageType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;



/**
 * A reference between items collected and a related global OVAL Object.
 * The name "object" in the OVAL Schema is renamed
 * because the name has the special meaning in Java.
 *
 * @author	Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class SystemObjectType
    extends Element
//    implements Dependent<OvalSystemCharacteristics>
{

    private String  oval_id;
    //{required, oval:ObjectIDPattern}


    private final Collection<MessageType>  message = new ArrayList<MessageType>();
    //{0..*}
//    /*** We have never seen a result which has multiple messages. ***/
//    private String  _message;


    private final Collection<VariableValueType>  variable_value =
        new ArrayList<VariableValueType>();
    //{0..*}


    private final Collection<ReferenceType>  reference =
        new ArrayList<ReferenceType>();
    //{0..*}


    public static final Integer  DEFAULT_VARIABLE_INSTANCE = 1;

    private Integer  variable_instance;
    //{xsd:nonNegativeInteger, optional, default="1"}


    private String  comment;
    //{optional}


    private FlagEnumeration  flag;
    //{required}



    /**
     * Constructor.
     */
    public SystemObjectType()
    {
    }


    public SystemObjectType(
                    final String id,
                    final int version
                    )
    {
        super( id, version );
    }


    public SystemObjectType(
                    final String id,
                    final int version,
                    final FlagEnumeration flag
                    )
    {
        super( id, version );
        setFlag( flag);
    }


    public SystemObjectType(
                    final String id,
                    final int version,
                    final FlagEnumeration flag,
                    final ReferenceType[] items
                    )
    {
        this( id, version, flag, Arrays.asList( items ) );
    }


    public SystemObjectType(
                    final String id,
                    final int version,
                    final FlagEnumeration flag,
                    final Collection<? extends ReferenceType> items
                    )
    {
        this( id, version, flag );
        setReference( items );
    }



    /**
     */
    public void setMessage(
                    final Collection<? extends MessageType> messageList
                    )
    {
        if (message != messageList) {
            message.clear();
            if (messageList != null  &&  messageList.size() > 0) {
                message.addAll( messageList );
            }
        }
    }


    public Collection<MessageType> getMessage()
    {
        return message;
    }


    public Iterator<MessageType> iterateMessage()
    {
        return message.iterator();
    }

//    /**
//     */
//    public void setMessage(
//                    final String message
//                    )
//    {
//        _message = message;
//    }
//
//
//    public String getMessage()
//    {
//        return _message;
//    }



    /**
     */
    public void setVariableValue(
                    final Collection<? extends VariableValueType> variable_value
                    )
    {
        if (variable_value != this.variable_value) {
            this.variable_value.clear();
            if (variable_value != null  &&  variable_value.size() > 0) {
                this.variable_value.addAll( variable_value );
            }
        }
    }


    public boolean addVariableValue(
                    final VariableValueType variable_value
                    )
    {
        if (variable_value == null) {
            return false;
        }

        return this.variable_value.add( variable_value );
    }


    public Collection<VariableValueType> getVariableValue()
    {
        return variable_value;
    }


    public SystemObjectType variableValue(
                    final VariableValueType variable_value
                    )
    {
        addVariableValue( variable_value );
        return this;
    }



    /**
     */
    public void setReference(
                    final Collection<? extends ReferenceType> reference
                    )
    {
        if (reference != this.reference) {
            this.reference.clear();
            if (reference != null  &&  reference.size() > 0) {
                this.reference.addAll( reference );
            }
        }
    }


    public boolean addReference(
                    final ReferenceType reference
                    )
    {
        if (reference == null) {
            return false;
        }

        return this.reference.add( reference );
    }


    public Collection<ReferenceType> getReference()
    {
        return reference;
    }


    public Iterator<ReferenceType> iterateReference()
    {
        return reference.iterator();
    }


    public SystemObjectType reference(
                    final ReferenceType reference
                    )
    {
        addReference( reference );
        return this;
    }


    public SystemObjectType reference(
                    final int item_ref
                    )
    {
        addReference( new ReferenceType( item_ref ) );
        return this;
    }



    /**
     */
    public void setVariableInstance(
                    final Integer variable_instance
                    )
    {
        this.variable_instance = variable_instance;
    }


    public Integer getVariableInstance()
    {
        return variable_instance;
    }


    public static final Integer variableInstance(
                    final SystemObjectType obj
                    )
    {
        Integer  variable_instance = obj.getVariableInstance();
        return (variable_instance == null ? DEFAULT_VARIABLE_INSTANCE : variable_instance);
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


    public SystemObjectType comment(
                    final String comment
                    )
    {
        setComment( comment );
        return this;
    }



    /**
     */
    public void setFlag(
                    final FlagEnumeration flag
                    )
    {
        this.flag = flag;
    }


    public FlagEnumeration getFlag()
    {
        return flag;
    }



    //*********************************************************************
    //  Element
    //*********************************************************************

    @Override
    public void setOvalId(
                    final String id
                    )
    {
        oval_id = id;
    }


    @Override
    public String getOvalId()
    {
        return oval_id;
    }



    @Override
    public final ElementType ovalGetType()
    {
        return ElementType.OBJECT;
    }



//    //**************************************************************
//    //  Dependent
//    //**************************************************************
//
//    private OvalSystemCharacteristics  _master;
//
//
//
//    @Override
//    public void setMasterObject(
//                    final OvalSystemCharacteristics master
//                    )
//    {
//        _master = master;
//    }
//
//
//    @Override
//    public OvalSystemCharacteristics getMasterObject()
//    {
//        return _master;
//    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return "object[" + super.toString()
                        + ", flag=" + getFlag()
                        + ", variable_values=" + getVariableValue()
                        + ", reference=" + getReference()
                        + ", variable_instance=" + getVariableInstance()
                        + ", message=" + getMessage()
                        + "]";
    }

}
//
