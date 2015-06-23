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

import io.opensec.six.oval.model.Element;
import io.opensec.six.oval.model.common.MessageType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



/**
 * An abstract base class for types which represent test results.
 *
 * @author	Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public abstract class ResultsElement
    extends Element
//    extends OvalAnalysisElement
{

    private final Collection<MessageType>  message =
        new ArrayList<MessageType>();
    //{0..*}


    public static final Integer  DEFAULT_VARIABLE_INSTANCE = 1;

    private Integer  variable_instance;
    //{xsd:nonNegativeInteger, optional, default="1"}


    private ResultEnumeration  result;
    //{required}



    /**
     * Constructor.
     */
    public ResultsElement()
    {
    }


    public ResultsElement(
                    final String id,
                    final int version
                    )
    {
        super( id, version );
    }


    public ResultsElement(
                    final String id,
                    final int version,
                    final ResultEnumeration result
                    )
    {
        this( id, version );
        setResult( result );
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



    /**
     */
    public void setVariableInstance(
                    final Integer variable_instance
                    )
    {
        if (variable_instance != null  &&  variable_instance < 0) {
            throw new IllegalArgumentException(
                            "negative variable instance: " + variable_instance );
        }

        this.variable_instance = variable_instance;
    }


    public Integer getVariableInstance()
    {
        return variable_instance;
    }


    public static final Integer variableInstance(
                    final ResultsElement obj
                    )
    {
        Integer  variable_instance = obj.getVariableInstance();
        return (variable_instance == null ? DEFAULT_VARIABLE_INSTANCE : variable_instance);
    }



    /**
     */
    public void setResult(
                    final ResultEnumeration result
                    )
    {
        this.result= result;
    }


    public ResultEnumeration getResult()
    {
        return result;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public int hashCode()
    {
        final int  prime = 37;
        int  hash = super.hashCode();

        hash = prime * hash + variableInstance( this ).hashCode();

        ResultEnumeration  result = getResult();
        hash = prime * hash + ((result == null) ? 0 : result.hashCode());

        return hash;
    }



    @Override
    public boolean equals(
                    final Object obj
                    )
    {
        if (!(obj instanceof ResultsElement)) {
            return false;
        }

        if (super.equals( obj )) {
            ResultsElement  other = (ResultsElement)obj;
            if (getResult() == other.getResult()) {
                if (variableInstance( this ).equals( variableInstance( other ) )) {
                    return true;
                }
            }
        }

        return false;
    }



    @Override
    public String toString()
    {
        return super.toString()
                        + ", result=" + getResult()
                        + ", variable_instance=" + getVariableInstance();
    }

}
//ResultsElement
