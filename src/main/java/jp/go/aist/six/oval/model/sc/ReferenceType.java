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

import jp.go.aist.six.oval.model.OvalObject;



/**
 * The ItemReference specifies an item in the system characteristics.
 * This reference is used to link global OVAL Objects to specific items.
 *
 * @author	Akihito Nakamura, AIST
 * @version $Id: ReferenceType.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class ReferenceType
    implements OvalObject
//    implements Dependent<SystemObjectType>
{

    private Integer  item_ref;
    //{required, oval:ItemIDPattern}



    /**
     * Constructor.
     */
    public ReferenceType()
    {
    }


    public ReferenceType(
                    final int item_ref
                    )
    {
        setItemRef( item_ref );
    }



    /**
     */
    public void setItemRef(
                    final Integer item_ref
                    )
    {
        this.item_ref = item_ref;
    }


    public Integer getItemRef()
    {
        return item_ref;
    }



//    //**************************************************************
//    //  Dependent
//    //**************************************************************
//
//    private SystemObjectType  _master;
//
//
//
//    @Override
//    public void setMasterObject(
//                    final SystemObjectType master
//                    )
//    {
//        _master = master;
//    }
//
//
//    @Override
//    public SystemObjectType getMasterObject()
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

        Integer  item_ref = getItemRef();
        result = prime * result + (item_ref == null ? 0 : item_ref.intValue());

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

        if (!(obj instanceof ReferenceType)) {
            return false;
        }

        ReferenceType  other = (ReferenceType)obj;
        Integer  other_item_ref = other.getItemRef();
        Integer   this_item_ref =  this.getItemRef();
        if (this_item_ref == other_item_ref
                        ||  (this_item_ref != null
                                        &&  other_item_ref.equals( other_item_ref ))) {
            return true;
        }

        return false;
    }



    @Override
    public String toString()
    {
        return "[item_ref=" + getItemRef()
                        + "]";
    }

}
//
