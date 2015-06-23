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
package io.opensec.six.oval.model.common;

import io.opensec.six.oval.model.ElementType;
import io.opensec.six.oval.model.OvalObject;
import java.io.Serializable;
import java.util.Arrays;



/**
 * An OVAL-ID.
 * The instances are immutable.
 *
 * @author	Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/language/">OVAL Language</a>
 */
public final class OvalId
    implements OvalObject, Cloneable, Serializable
{

    public static final String  PREFIX = "oval";

    public static final String  SEPARATOR = ":";


    /**
     * The types of OVAL element for which the OVAL-ID is used.
     */
    public enum Type
    {
        def( ElementType.DEFINITION ),
        tst( ElementType.TEST       ),
        obj( ElementType.OBJECT     ),
        ste( ElementType.STATE      ),
        var( ElementType.VARIABLE   );


        private ElementType  _elementType;

        Type( final ElementType element_type )
        {
            _elementType = element_type;
        }


        public ElementType elementType()
        {
            return _elementType;
        }
    }




    ///////////////////////////////////////////////////////////////////////
    //  functions
    ///////////////////////////////////////////////////////////////////////

    /**
     */
    public static final void validate(
                    final String oval_id
                    )
    throws OvalIdSyntaxException
    {
        if (oval_id == null) {
            throw new OvalIdSyntaxException( "empty OVAL-ID (null)" );
        }

        //validation
        new OvalId( oval_id );
    }



    /**
     */
    public static final Type typeOf(
                    final String oval_id
                    )
    throws OvalIdSyntaxException
    {
        if (oval_id == null) {
            throw new OvalIdSyntaxException( "empty OVAL-ID (null)" );
        }

        String[]  components = oval_id.split( SEPARATOR );
        if (components.length != 4) {
            throw new OvalIdSyntaxException(
                            "insufficient or surplus components: " + oval_id );
        }

        return Type.valueOf( components[2] );
    }



    /**
     */
    public static final ElementType elementTypeOf(
                    final String oval_id
                    )
    throws OvalIdSyntaxException
    {
        Type  type = typeOf( oval_id );

        return type.elementType();
    }



    ///////////////////////////////////////////////////////////////////////
    //  instance definition
    ///////////////////////////////////////////////////////////////////////

    private String  _namespace;
    private Type    _type;
    private int     _idValue;

    private String  _id;



    /**
     * Constructor.
     */
    protected OvalId()
    {
    }


    public OvalId(
                    final String oval_id
                    )
    throws OvalIdSyntaxException
    {
        _set( oval_id );

//        this( oval_id.split( SEPARATOR ) );
    }


    public OvalId(
                    final String[] components
                    )
    throws OvalIdSyntaxException
    {
        _set( components );

//        if (components.length == 3) {
//            _set( PREFIX, components[0], components[1], components[2] );
//        } else if (components.length == 4) {
//            _set( components[0], components[1], components[2], components[3] );
//        } else {
//
//            throw new OvalIdSyntaxException(
//                            "insufficient or surplus components: "
//                                            + Arrays.toString( components ) );
//        }
    }


    public OvalId(
                    final String namespace,
                    final String type,
                    final String id_value
                    )
    throws OvalIdSyntaxException
    {
        this( PREFIX, namespace, type, id_value );
    }


    public OvalId(
                    final String namespace,
                    final Type type,
                    final int id_value
                    )
    throws OvalIdSyntaxException
    {
        this( PREFIX, namespace, type, id_value );
    }


    public OvalId(
                    final String prefix,
                    final String namespace,
                    final String type,
                    final String id_value
                    )
    throws OvalIdSyntaxException
    {
        _set( prefix, namespace, type, id_value );
    }


    public OvalId(
                    final String prefix,
                    final String namespace,
                    final Type type,
                    final int id_value
                    )
    throws OvalIdSyntaxException
    {
        _set( prefix, namespace, type, id_value );
    }



    /**
     */
    private void _set(
                    final String oval_id
                    )
    throws OvalIdSyntaxException
    {
        String[] components = null;
        try {
            components = oval_id.split( SEPARATOR );
        } catch (Exception ex) {
            throw new OvalIdSyntaxException( "invalid OVAL-ID: " + oval_id
                            + ", cause=" + ex.getMessage()
                            );
        }

        _set( components );
    }


    private void _set(
                    final String[] components
                    )
    throws OvalIdSyntaxException
    {
        if (components.length == 3) {
            _set( PREFIX, components[0], components[1], components[2] );
        } else if (components.length == 4) {
            _set( components[0], components[1], components[2], components[3] );
        } else {

            throw new OvalIdSyntaxException(
                            "insufficient or surplus components: "
                                            + Arrays.toString( components ) );
        }
    }


    private void _set(
                    final String prefix,
                    final String namespace,
                    final String type,
                    final String id_value
                    )
    {
        try {
            _set( prefix, namespace, Type.valueOf( type ), Integer.valueOf( id_value ).intValue() );
            //throws IllegalArgumentException, NullPointerException, NumberFormatException
        } catch (OvalIdSyntaxException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new OvalIdSyntaxException( "invalid OVAL-ID: prefix=" + prefix
                            + ", namespace=" + namespace
                            + ", type=" + type
                            + ", ID value=" + id_value
                            + ", cause=" + ex.getMessage()
                            );
        }
    }



    /**
     */
    private void _set(
                    final String prefix,
                    final String namespace,
                    final Type type,
                    final int id_value
                    )
    {
        try {
            _setPrefix( prefix );
            _setNamespace( namespace );
            _setType( type );
            _setIdValue( id_value );
        } catch (OvalIdSyntaxException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new OvalIdSyntaxException( "invalid OVAL-ID: prefix=" + prefix
                            + ", namespace=" + namespace
                            + ", type=" + type
                            + ", ID value=" + id_value
                            + ", cause=" + ex.getMessage()
                            );
        }

        _id = PREFIX + SEPARATOR + _namespace + SEPARATOR + _type.name() + SEPARATOR + _idValue;
    }



    /**
     */
    private void _setPrefix(
                    final String prefix
                    )
    {
        if (PREFIX == prefix  ||  PREFIX.equals( prefix )) {
            //valid
        } else {
            throw new IllegalArgumentException( "empty or invalid prefix" );
//            throw new OvalIdSyntaxException( "invalid prefix: " + prefix );
        }
    }


    public String getPrefix()
    {
        return PREFIX;
    }



    /**
     */
    private void _setNamespace(
                    final String namespace
                    )
    {
        if (namespace == null  ||  namespace.length() == 0) {
            throw new IllegalArgumentException( "empty or invalid namespace" );
//            throw new OvalIdSyntaxException( "empty or invalid namespace: " + namespace );
        }

        _namespace = namespace;
    }


    public String getNamespace()
    {
        return _namespace;
    }



    /**
     */
    private void _setType(
                    final Type type
                    )
    {
        if (type == null) {
            throw new IllegalArgumentException( "empty type" );
//            throw new OvalIdSyntaxException( "empty type" );
        }

        _type = type;
    }


    public Type getType()
    {
        return _type;
    }



    /**
     */
    private void _setIdValue(
                    final int idValue
                    )
    {
        _idValue = idValue;
    }


    public int getIdValue()
    {
        return _idValue;
    }



    /**
     * Returns the string representation.
     */
    public String value()
    {
        return _id;
    }



    /**
     *
     */
    public ElementType getElementType()
    {
        return _type.elementType();
    }



    /**
     */
    public boolean isDefinition()
    {
        return (Type.def == _type);
    }


    public boolean isTest()
    {
        return (Type.tst == _type);
    }


    public boolean isObject()
    {
        return (Type.obj == _type);
    }


    public boolean isState()
    {
        return (Type.ste == _type);
    }


    public boolean isVariable()
    {
        return (Type.var == _type);
    }



    //**************************************************************
    //  Comparable
    //**************************************************************

//    @Override
//    public int compareTo(
//                    final OvalIdD o
//                    )
//    {
//        String  id1 = getValue();
//        String  id2 = o.getValue();
//
//        return id1.compareTo( id2 );
//    }



    //**************************************************************
    //  java.lang.Cloneable
    //**************************************************************

    @Override
    public Object clone()
    throws CloneNotSupportedException
    {
        return (new OvalId( _namespace, _type, _idValue ));
    }



    //**************************************************************
    //  java.lang.Object
    //**************************************************************

    @Override
    public int hashCode()
    {
        final int  prime = 37;
        int  result = 17;

        result = prime * result + (_namespace == null ? 0 : _namespace.hashCode());
        result = prime * result + (_type == null ? 0 : _type.hashCode());
        result = prime * result + _idValue;

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

        if (!(obj instanceof OvalId)) {
            return false;
        }

        OvalId  other = (OvalId)obj;
        String  other_id = other.toString();
        String   this_id = this.toString();
        if (this_id == other_id
                        ||  (this_id != null  &&  this_id.equalsIgnoreCase( other_id ))) {
            return true;
        }

        return false;
    }



    @Override
    public String toString()
    {
        return _id;
//        return PREFIX + SEPARATOR + _namespace + SEPARATOR + _type.name() + SEPARATOR + _idValue;
    }

}
//
