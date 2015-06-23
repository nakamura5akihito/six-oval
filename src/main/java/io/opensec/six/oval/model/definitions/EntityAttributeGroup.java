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
package io.opensec.six.oval.model.definitions;

import io.opensec.six.oval.model.ElementRef;
import io.opensec.six.oval.model.ElementType;
import io.opensec.six.oval.model.OvalObject;
import io.opensec.six.oval.model.common.CheckEnumeration;
import io.opensec.six.oval.model.common.DatatypeEnumeration;
import io.opensec.six.oval.model.common.OperationEnumeration;



/**
 * The EntityAttributeGroup is a collection of attributes that are common to all entities.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public abstract class EntityAttributeGroup
    implements ElementRef, OvalObject
{

    public static final DatatypeEnumeration  DEFAULT_DATATYPE =
        DatatypeEnumeration.STRING;

    private DatatypeEnumeration  datatype;
    //{optional, default="string"}


    public static final OperationEnumeration  DEFAULT_OPERATION =
        OperationEnumeration.EQUALS;

    private OperationEnumeration  operation;
    //{optional, default="equals"}


    public static final Boolean  DEFAULT_MASK = Boolean.FALSE;

    private Boolean  mask;
    //{optional, default="false"}


    private String  var_ref;
    //{optional, type="oval:VariableIDPattern"}


//    public static final CheckEnumeration  DEFAULT_VAR_CHECK =
//        CheckEnumeration.ALL;

    private CheckEnumeration  var_check;
    //{optional}: 5.10 (30358)
    //{optional, default="all"}: 5.9



    /**
     * Constructor.
     */
    public EntityAttributeGroup()
    {
    }


//    public EntityAttributeGroup(
//                    final OperationEnumeration operation
//                    )
//    {
//        this( DEFAULT_DATATYPE, operation );
//    }
//
//
//    public EntityAttributeGroup(
//                    final DatatypeEnumeration datatype,
//                    final OperationEnumeration operation
//                    )
//    {
//        setDatatype( datatype );
//        setOperation( operation );
//    }


    public EntityAttributeGroup(
                    final DatatypeEnumeration datatype,
                    final OperationEnumeration operation,
                    final Boolean mask,
                    final String var_ref,
                    final CheckEnumeration var_check
                    )
    {
        setDatatype( datatype );
        setOperation( operation );
        setMask( mask );
        setVarRef( var_ref );
        setVarCheck( var_check );
    }


    public EntityAttributeGroup(
                    final String datatype,
                    final String operation,
                    final Boolean mask,
                    final String var_ref,
                    final String var_check
                    )
    {
        this(
                        (datatype == null ? null : DatatypeEnumeration.fromValue( datatype )),
                        (operation == null ? null : OperationEnumeration.fromValue( operation )),
                        mask,
                        var_ref,
                        (var_check == null ? null : CheckEnumeration.fromValue( var_check ))
        );
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


    public static DatatypeEnumeration datatype(
                    final EntityAttributeGroup obj
                    )
    {
        if (obj == null) {
            throw new IllegalArgumentException( "null EntityAttributeGroup" );
        }

        DatatypeEnumeration  datatype = obj.getDatatype();
        return (datatype == null ? DEFAULT_DATATYPE : datatype);
    }



    /**
     */
    public void setOperation(
                    final OperationEnumeration operation
                    )
    {
        this.operation = operation;
    }


    public OperationEnumeration getOperation()
    {
        return operation;
    }


    public static OperationEnumeration operation(
                    final EntityAttributeGroup obj
                    )
    {
        if (obj == null) {
            throw new IllegalArgumentException( "null EntityAttributeGroup" );
        }

        OperationEnumeration  operation = obj.getOperation();
        return (operation == null ? DEFAULT_OPERATION : operation);
    }



    /**
     */
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


    public static Boolean mask(
                    final EntityAttributeGroup obj
                    )
    {
        if (obj == null) {
            throw new IllegalArgumentException( "null EntityAttributeGroup" );
        }

        Boolean  mask = obj.getMask();
        return (mask == null ? DEFAULT_MASK : mask);
    }



    /**
     */
    public void setVarRef(
                    final String var_ref
                    )
    {
        this.var_ref= var_ref;
    }


    public String getVarRef()
    {
        return var_ref;
    }



    /**
     */
    public void setVarCheck(
                    final CheckEnumeration var_check
                    )
    {
        this.var_check = var_check;
    }


    public CheckEnumeration getVarCheck()
    {
        return var_check;
    }


//    public static final CheckEnumeration varCheck(
//                    final EntityAttributeGroup eag
//                    )
//    {
//        if (eag == null) {
//            throw new IllegalArgumentException( "null EntityAttributeGroup" );
//        }
//
//        CheckEnumeration  var_check = eag.getVarCheck();
//        if (var_check == null) {
//            var_check = DEFAULT_VAR_CHECK;
//        }
//
//        return var_check;
//    }



    //*********************************************************************
    //  ElementRef
    //*********************************************************************

    public String ovalGetRefId()
    {
        return getVarRef();
    }



    public ElementType ovalGetRefType()
    {
        return ElementType.VARIABLE;
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

        result = prime * result + operation( this ).hashCode();

        result = prime * result + mask( this ).hashCode();

        String  var_ref = getVarRef();
        result = prime * result + ((var_ref == null) ? 0 : var_ref.hashCode());

        CheckEnumeration  var_check = getVarCheck();
        result = prime * result + ((var_check == null) ? 0 : var_check.hashCode());

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
        if (datatype( this ) == datatype( other )) {
            if (operation( this ) == operation( other )) {
                if (this.getVarCheck() == other.getVarCheck()) {
                    final String  other_var_ref = other.getVarRef();
                    final String   this_var_ref =  this.getVarRef();
                    if (this_var_ref == other_var_ref
                                    ||  (this_var_ref != null
                                                    &&  this_var_ref.equals( other_var_ref ))) {
                        if (mask( this ) == mask( other )) {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }



    @Override
    public String toString()
    {
        return "datatype=" + getDatatype()
                        + ", operation=" + getOperation()
                        + ", mask=" + getMask()
                        + ", var_ref=" + getVarRef()
                        + ", var_check=" + getVarCheck()
                        ;
    }

}
// EntityAttributeGroup
