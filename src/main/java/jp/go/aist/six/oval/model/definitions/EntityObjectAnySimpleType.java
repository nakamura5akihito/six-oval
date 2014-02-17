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
package jp.go.aist.six.oval.model.definitions;




/**
 * The EntityObjectAnySimpleType is extended by the entities of an individual OVAL Object.
 * This specific type describes any simple data.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: EntityObjectAnySimpleType.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public class EntityObjectAnySimpleType
    extends EntitySimpleBaseType
{

    // defined in a super class
//    public static final DatatypeEnumeration  DEFAULT_DATATYPE = DatatypeEnumeration.STRING;



    /**
     * Constructor.
     */
    public EntityObjectAnySimpleType()
    {
    }


    public EntityObjectAnySimpleType(
                    final String data
                    )
    {
        super( data );
    }
//
//
//    public EntityObjectStringType(
//                    final String data,
//                    final Operation operation
//                    )
//    {
//        this( data, FIXED_DATATYPE, operation );
//    }
//
//
//    public EntityObjectStringType(
//                    final String data,
//                    final Datatype datatype,
//                    final Operation operation
//                    )
//    {
//        super( data, datatype, operation );
//    }
//
//
//    public EntityObjectStringType(
//                    final String varRef,
//                    final Check varCheck
//                    )
//    {
//        super( varRef, varCheck );
//    }



    //**************************************************************
    //  EntityBase
    //**************************************************************

//    @Override
//    public void setDatatype(
//                    final DatatypeEnumeration datatype
//                    )
//    {
//        if (datatype != null  &&  datatype != FIXED_DATATYPE) {
//            throw new IllegalArgumentException( "invalid datatype: " + datatype);
//        }
//
//        super.setDatatype( datatype );
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

        if (!(obj instanceof EntityObjectAnySimpleType)) {
            return false;
        }

        return super.equals( obj );
    }



//    @Override
//    public String toString()
//    {
//        return "[" + super.toString() + "]";
//    }

}
//
