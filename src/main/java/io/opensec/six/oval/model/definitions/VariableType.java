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
import io.opensec.six.oval.model.OvalEnumeration;
import io.opensec.six.oval.model.common.DatatypeEnumeration;
import java.util.Collection;
import java.util.Collections;
import org.mongodb.morphia.annotations.Entity;



/**
 * The OVAL Variable describes different sources
 * for obtaining a value(s) for the variable.
 * There are currently three types of variables;
 * local, external, and constant.
 *
 * @author	Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
@Entity( "oval.def.variable" )
public class VariableType
    extends DefinitionsComponent
{

    public enum Type
    implements OvalEnumeration
    {
        CONSTANT,
        LOCAL,
        EXTERNAL;


        /**
         * A factory method.
         */
        public static Type fromValue(
                        final String value
                        )
        {
//            return valueOf( value.toUpperCase() );

            for (Type  e : Type.values()) {
                if (e.value.equals( value )) {
                    return e;
                }
            }

            throw new IllegalArgumentException( value );
        }



        private String  value = null;


        Type()
        {
            value = name().toLowerCase();
        }



        public String value()
        {
            return value;
        }



        @Override
        public String toString()
        {
            return value;
        }
    }
    //Type



    ////////////////////////////////////////////////////////////////

    private DatatypeEnumeration  datatype;
    //{required}



    /**
     * Constructor.
     */
    public VariableType()
    {
        this( null, 0 );
    }


    public VariableType(
                    final String id,
                    final int version
                    )
    {
        this( id, version, null );
    }


    public VariableType(
                    final String id,
                    final int version,
                    final String comment
                    )
    {
        this( id, version, comment, null );
    }


    public VariableType(
                    final String id,
                    final int version,
                    final String comment,
                    final DatatypeEnumeration datatype
                    )
    {
        super( id, version, comment );
        setDatatype( datatype );

//        _oval_entity_type = OvalEntityType.variable;
//        _definitions_element_type = DefinitionsElement.Type.variable;
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



    //*********************************************************************
    //  Element
    //*********************************************************************

    @Override
    public final ElementType ovalGetType()
    {
        return ElementType.VARIABLE;
    }



    //*********************************************************************
    //  DefinitionsElement
    //*********************************************************************

//    @Override
//    public final DefinitionsElement.Type ovalGetElementType()
//    {
//        return DefinitionsElement.Type.VARIABLE;
//    }


    @Override
    public Collection<ElementRef> ovalGetElementRef()
    {
        return Collections.emptyList();
//        Collection<ElementRef>  ref_list = new ArrayList<ElementRef>();
//        return ref_list;
    }



    public VariableType.Type ovalGetVariableType()
    {
        throw new UnsupportedOperationException(
                        "concrete VariableType must return its type.");

//        return Type.LOCAL;
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public String toString()
    {
        return super.toString()
                        + ", datatype=" + getDatatype();
    }

}
//
