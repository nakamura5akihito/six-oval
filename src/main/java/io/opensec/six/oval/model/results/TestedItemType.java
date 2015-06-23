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
import io.opensec.six.oval.model.common.MessageType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



/**
 * The TestedItem holds a reference to a system characteristic item
 * that matched the object specified in a test.
 *
 * @author	Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class TestedItemType
    implements OvalObject
//    implements Dependent<TestType>
{

    private final Collection<MessageType>  message = new ArrayList<MessageType>();
    //{0..*}


    private int  item_id;
    //{required}


    private ResultEnumeration  result;
    //{required}



    /**
     * Constructor.
     */
    public TestedItemType()
    {
    }


    public TestedItemType(
                    final int item_id,
                    final ResultEnumeration result
                    )
    {
        setItemId( item_id );
        setResult( result );
    }



    /**
     */
    public void setMessage(
                    final Collection<? extends MessageType> message
                    )
    {
        if (this.message != message) {
            this.message.clear();
            if (message != null  &&  message.size() > 0) {
                this.message.addAll( message );
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
    public void setItemId(
                    final int item_id
                    )
    {
        this.item_id = item_id;
    }


    public int getItemId()
    {
        return item_id;
    }



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



//    //**************************************************************
//    //  Dependent
//    //**************************************************************
//
//    private TestType  _master;
//
//
//
//    @Override
//    public void setMasterObject(
//                    final TestType master
//                    )
//    {
//        _master = master;
//    }
//
//
//
//    @Override
//    public TestType getMasterObject()
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
        int  hash = 17;

        int  item_id = getItemId();
        hash = prime * hash + item_id;

        ResultEnumeration  result = getResult();
        hash = prime * hash + ((result == null) ? 0 : result.hashCode());

        return hash;
    }



    @Override
    public boolean equals(
                    final Object obj
                    )
    {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof TestedItemType)) {
            return false;
        }

        TestedItemType  other = (TestedItemType)obj;
        int  other_item_id = other.getItemId();
        int   this_item_id =  this.getItemId();
        if (this_item_id == other_item_id) {
            ResultEnumeration  other_reault = other.getResult();
            ResultEnumeration   this_result =  this.getResult();
            if (this_result == other_reault) {
                return true;
            }
        }

        return false;
    }



    @Override
    public String toString()
    {
        return "tested_item[item_id=" + getItemId()
                        + ", result=" + getResult()
                        + "]";
    }

}
// TestedItemType
