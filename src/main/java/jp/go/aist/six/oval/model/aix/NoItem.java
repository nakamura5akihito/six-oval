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
package jp.go.aist.six.oval.model.aix;

import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.sc.EntityItemAnySimpleType;
import jp.go.aist.six.oval.model.sc.EntityItemStringType;
import jp.go.aist.six.oval.model.sc.ItemType;



/**
 * The no_item is used to hold information related to
 * the /usr/sbin/no command and the tunable parameters it manages.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: NoItem.java 3148 2013-05-13 07:59:01Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class NoItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType  tunable;
    private EntityItemAnySimpleType  value;



    /**
     * Constructor.
     */
    public NoItem()
    {
        this( 0 );
    }


    public NoItem(
                    final int id
                    )
    {
        super( id );

        _oval_family = Family.AIX;
        _oval_component = ComponentType.NO;
    }



    /**
     */
    public void setTunable(
                    final EntityItemStringType tunable
                    )
    {
        this.tunable = tunable;
    }


    public EntityItemStringType getTunable()
    {
        return tunable;
    }



    /**
     */
    public void setValue(
                    final EntityItemAnySimpleType value
                    )
    {
        this.value = value;
    }


    public EntityItemAnySimpleType getValue()
    {
        return value;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

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
        if (!(obj instanceof NoItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "no_item[" + super.toString()
                        + ", tunable="      + getTunable()
                        + ", value="        + getValue()
                        + "]";
    }

}
//
