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

import jp.go.aist.six.oval.model.common.DatatypeEnumeration;



/**
 * The EntityItemFloatType type is extended by the entities of an individual item.
 * This specific type describes simple float data.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: EntityItemFloatType.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class EntityItemFloatType
    extends EntityItemSimpleBaseType
{

    public static final DatatypeEnumeration  FIXED_DATATYPE = DatatypeEnumeration.FLOAT;
    //{required, fixed="float"}



    /**
     * Constructor.
     */
    public EntityItemFloatType()
    {
    }


    public EntityItemFloatType(
                    final String content
                    )
    {
        super( content );
    }


    public EntityItemFloatType(
                    final long content
                    )
    {
        super( String.valueOf( content ) );
    }



    //**************************************************************
    //  EntityItemBase
    //**************************************************************

    @Override
    public void setDatatype(
                    final DatatypeEnumeration datatype
                    )
    {
        if (datatype != null  &&  datatype != FIXED_DATATYPE) {
            throw new IllegalArgumentException( "invalid datatype: " + datatype);
        }

        super.setDatatype( datatype );
    }


//    @Override
//    public DatatypeEnumeration getDatatype()
//    {
//        return FIXED_DATATYPE;
//    }



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
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityItemFloatType)) {
            return false;
        }

        return super.equals( obj );
    }

}
//
