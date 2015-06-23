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
/*
*  @product.title@
 *  Copyright (C) @product.copyright-year@
 *    @product.vendor@
 *    Registration Number: @product.registration-number@
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

import io.opensec.six.oval.model.OvalObject;
import io.opensec.six.oval.model.common.DatatypeEnumeration;



/**
 * The EntityAttributeGroup is a collection of attributes that are common to all entities.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public abstract class EntityAttributeGroup
    implements OvalObject
{

    public static final DatatypeEnumeration  DEFAULT_DATATYPE = DatatypeEnumeration.STRING;

    private DatatypeEnumeration  datatype;
    //{optional, default="string"}


    public static final Boolean  DEFAULT_MASK = Boolean.FALSE;

    private Boolean  mask;
    //{optional, default="false"}


    public static final StatusEnumeration  DEFAULT_STATUS = StatusEnumeration.EXISTS;

    private StatusEnumeration  status;
    //{optional, default="exists"}



    /**
     * Constructor.
     */
    public EntityAttributeGroup()
    {
    }



    /**
     */
    public void setDatatype(
                    final DatatypeEnumeration datatype
                    )
    {
        this.datatype = datatype;
    }


    public DatatypeEnumeration getDatatype()
    {
        return datatype;
    }


    public static final DatatypeEnumeration datatype(
                    final EntityAttributeGroup obj
                    )
    {
        DatatypeEnumeration  datatype = obj.getDatatype();
        return (datatype == null ? DEFAULT_DATATYPE : datatype);
    }



    public void setMask(
                    final Boolean mask
                    )
    {
        this.mask = mask;
    }


    public Boolean getMask()
    {
        return mask;
    }


    public static final Boolean mask(
                    final EntityAttributeGroup obj
                    )
    {
        Boolean  mask = obj.getMask();
        return (mask == null ? DEFAULT_MASK : mask);
    }



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
                    final EntityAttributeGroup obj
                    )
    {
        StatusEnumeration  status = obj.getStatus();
        return (status == null ? DEFAULT_STATUS : status);
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public int hashCode()
    {
        final int  prime = 37;
        int  result = 17;

        result = prime * result + datatype( this ).hashCode();
        result = prime * result + mask( this ).hashCode();
        result = prime * result + status( this ).hashCode();

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

        if (!(obj instanceof EntityAttributeGroup)) {
            return false;
        }

        EntityAttributeGroup  other = (EntityAttributeGroup)obj;
        if (status( this ) == status( other )) {
            if (datatype( this ) == datatype( other )) {
                if (mask( this ) == mask( other )) {
                    return true;
                }
            }
        }

        return false;
    }



    @Override
    public String toString()
    {
        return "datatype=" + getDatatype()
             + ", mask=" + getMask()
             + ", status=" + getStatus()
             ;
    }

}
// EntityAttributeGroup
