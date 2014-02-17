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
package jp.go.aist.six.oval.model.sc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.OvalObject;
import jp.go.aist.six.oval.model.common.MessageType;



/**
 * The abstract Item holds information about a specific item on a system.
 * An item might be a file, a rpm, a process, etc.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: ItemType.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
// NOTE: This class must be abstract and dependent.
// Castor fails to load polymorphic objects
// if the common abstract super class is mapped to a super table.
//public abstract class Item
public class ItemType
    implements OvalObject
//    implements Dependent<OvalSystemCharacteristics>
{

    private final Collection<MessageType>  message = new ArrayList<MessageType>();
    //{0..50}

    private Integer  id;
    //{oval:ItemIDPattern, required}


    /**
     * The default status: "exists".
     */
    public static final StatusEnumeration  DEFAULT_STATUS = StatusEnumeration.EXISTS;

    private StatusEnumeration  status;
    //{optional, default="exists"}


    // SIX extension
    protected Family       _oval_family;
    protected ComponentType    _oval_component;



    /**
     * Constructor.
     */
    public ItemType()
    {
    }


    public ItemType(
                    final int id
                    )
    {
        this( id, null );
    }


    public ItemType(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        setId( id );
        setStatus( status );
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
//                    final MessageType message
//                    )
//    {
//        _message = message;
//    }
//
//
//    public MessageType getMessage()
//    {
//        return _message;
//    }



    /**
     */
    public void setId(
                    final Integer id
                    )
    {
        this.id = id;
    }


    public Integer getId()
    {
        return id;
    }



    /**
     */
    public void setStatus(
                    final StatusEnumeration status
                    )
    {
        this.status = status;
    }


    public StatusEnumeration getStatus()
    {
        return status;
    }


    public static final StatusEnumeration status(
                    final ItemType obj
                    )
    {
        StatusEnumeration  status = obj.getStatus();
        return (status == null ? DEFAULT_STATUS : status);
    }



//    //**************************************************************
//    //  Dependent
//    //**************************************************************
//
//    private OvalSystemCharacteristics  _master;
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



//    private String  _masterPersistentID;
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
//    public String getMasterPersistentID()
//    {
//        if (_masterPersistentID == null) {
//            OvalSystemCharacteristics  master = getMasterObject();
//            if (master != null) {
//                _masterPersistentID = master.getPersistentID();
//            }
//        }
//
//        return _masterPersistentID;
//    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

//    @Override
//    public int hashCode()
//    {
//        final int  prime = 37;
//        int  result = 17;
//
//        int  id = getID();
//        result = prime * result + id;
//
//        return result;
//    }
//
//
//
//    @Override
//    public boolean equals(
//                    final Object obj
//                    )
//    {
//        if (this == obj) {
//            return true;
//        }
//
//        if (!(obj instanceof Item)) {
//            return false;
//        }
//
//        Item  other = (Item)obj;
//        int  other_id = other.getID();
//        int   this_id =  this.getID();
//        if (this_id == other_id) {
//            return true;
//        }
//
//        return false;
//    }



    @Override
    public String toString()
    {
        return "id=" + getId()
                + ", status=" + getStatus();
    }

}
// ItemType
