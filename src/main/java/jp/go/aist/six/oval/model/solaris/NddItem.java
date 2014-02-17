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
package jp.go.aist.six.oval.model.solaris;

import jp.go.aist.six.oval.model.ComponentType;
import jp.go.aist.six.oval.model.Family;
import jp.go.aist.six.oval.model.sc.EntityItemAnySimpleType;
import jp.go.aist.six.oval.model.sc.EntityItemIntType;
import jp.go.aist.six.oval.model.sc.EntityItemStringType;
import jp.go.aist.six.oval.model.sc.ItemType;
import jp.go.aist.six.oval.model.sc.StatusEnumeration;



/**
 * This item represents data collected by the ndd command.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: NddItem.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class NddItem
    extends ItemType
{

    //{0..1}
    private EntityItemStringType        device;
    private EntityItemIntType           instance;
    private EntityItemStringType        parameter;
    private EntityItemAnySimpleType		value;



    /**
     * Constructor.
     */
    public NddItem()
    {
        this( 0 );
    }


    public NddItem(
                    final int id
                    )
    {
        this( id, null );
    }


    public NddItem(
                    final int id,
                    final StatusEnumeration status
                    )
    {
        super( id, status );

        _oval_family = Family.SOLARIS;
        _oval_component = ComponentType.NDD;
    }



    /**
     */
    public void setDevice(
                    final EntityItemStringType device
                    )
    {
        this.device = device;
    }


    public EntityItemStringType getDevice()
    {
        return device;
    }



    /**
     */
    public void setInstance(
                    final EntityItemIntType instance
                    )
    {
        this.instance = instance;
    }


    public EntityItemIntType getInstance()
    {
        return instance;
    }



    /**
     */
    public void setParameter(
                    final EntityItemStringType parameter
                    )
    {
        this.parameter = parameter;
    }


    public EntityItemStringType getParameter()
    {
        return parameter;
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
        if (!(obj instanceof NddItem)) {
            return false;
        }

        return super.equals( obj );
    }



    @Override
    public String toString()
    {
        return "ndd_item[" + super.toString()
                		+ ", device="       + getDevice()
                        + ", instance="     + getInstance()
                        + ", parameter="    + getParameter()
                        + ", value="        + getValue()
             + "]";
    }

}
//
