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
package jp.go.aist.six.oval.core.model;

import java.util.Collection;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Set;
import jp.go.aist.six.oval.OvalException;
import jp.go.aist.six.oval.model.ElementContainer;
import jp.go.aist.six.oval.model.ElementRef;
import jp.go.aist.six.oval.model.ElementType;
import jp.go.aist.six.oval.model.common.OvalId;
import jp.go.aist.six.oval.model.definitions.DefinitionType;
import jp.go.aist.six.oval.model.definitions.DefinitionsElement;
import jp.go.aist.six.oval.model.definitions.DefinitionsType;
import jp.go.aist.six.oval.model.definitions.OvalDefinitions;
import jp.go.aist.six.oval.model.definitions.StateType;
import jp.go.aist.six.oval.model.definitions.StatesType;
import jp.go.aist.six.oval.model.definitions.SystemObjectType;
import jp.go.aist.six.oval.model.definitions.SystemObjectsType;
import jp.go.aist.six.oval.model.definitions.TestType;
import jp.go.aist.six.oval.model.definitions.TestsType;
import jp.go.aist.six.oval.model.definitions.VariableType;
import jp.go.aist.six.oval.model.definitions.VariablesType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * @author  Akihito Nakamura, AIST
 * @version $Id: EntityUtil.java 3046 2013-02-21 09:33:57Z nakamura5akihito@gmail.com $
 */
public final class EntityUtil
{

    /**
     * Logger.
     */
    private static final Logger  _LOG_ = LoggerFactory.getLogger( EntityUtil.class );



    /**
     *
     * @throws  OvalException
     */
    public static boolean containsElement(
                    final OvalDefinitions oval_defs,
                    final String oval_id
                    )
    {
        ElementType  type = OvalId.elementTypeOf( oval_id );
        ElementContainer<? extends DefinitionsElement>  container = _findContainer( oval_defs, type );
        if (container == null) {
            return false;
        }

//        ElementContainer<? extends DefinitionsElement>  container = null;
//        ElementType  type = OvalIdentifier.elementTypeOf( oval_id );
//        if (type == ElementType.DEFINITION) {
//            container = oval_defs.getDefinitions();
//        } else if (type == ElementType.TEST) {
//            container = oval_defs.getTests();
//        } else if (type == ElementType.OBJECT) {
//            container = oval_defs.getObjects();
//        } else if (type == ElementType.STATE) {
//            container = oval_defs.getStates();
//        } else if (type == ElementType.VARIABLE) {
//            container = oval_defs.getVariables();
//        }
//
//        if (container == null) {
//            throw new OvalException( "design error" );
////            return false;
//        }

        return container.containsOvalId( oval_id );
    }



    /**
     *
     * @throws  OvalException
     */
    public static boolean addElement(
                    final OvalDefinitions oval_defs,
                    final DefinitionsElement element
                    )
    {
        if (oval_defs == null  ||  element == null) {
            throw new IllegalArgumentException( "empty OVAL Definitions or element" );
        }

        ElementType  element_type = element.ovalGetType();

        boolean  added = false;
        if (element_type == ElementType.DEFINITION) {
            DefinitionsType  definitions = oval_defs.getDefinitions();
            if (definitions == null) {
                definitions = new DefinitionsType();
                oval_defs.setDefinitions( definitions );
            }
            added = definitions.add( asDefinition( element ) );

        } else if (element_type == ElementType.TEST) {
            TestsType  tests = oval_defs.getTests();
            if (tests == null) {
                tests = new TestsType();
                oval_defs.setTests( tests );
            }
            added = tests.add( asTest( element ) );

        } else if (element_type == ElementType.OBJECT) {
            SystemObjectsType  objects = oval_defs.getObjects();
            if (objects == null) {
                objects = new SystemObjectsType();
                oval_defs.setObjects( objects );
            }
            added = objects.add( asObject( element ) );

        } else if (element_type == ElementType.STATE) {
            StatesType  states = oval_defs.getStates();
            if (states == null) {
                states = new StatesType();
                oval_defs.setStates( states );
            }
            added = states.add( asState( element ) );

        } else if (element_type == ElementType.VARIABLE) {
            VariablesType  variables = oval_defs.getVariables();
            if (variables == null) {
                variables = new VariablesType();
                oval_defs.setVariables( variables );
            }
            added = variables.add( asVariable( element ) );
        }

        return added;
    }
//    {
//        if (oval_defs == null  ||  element == null) {
//            throw new IllegalArgumentException( "empty OVAL Definitions or element" );
//        }
//
//        DefinitionsElement.Type  element_type = element.ovalGetElementType();
//
//        boolean  added = false;
//        if (element_type == DefinitionsElement.Type.DEFINITION) {
//            DefinitionsType  definitions = oval_defs.getDefinitions();
//            if (definitions == null) {
//                definitions = new DefinitionsType();
//                oval_defs.setDefinitions( definitions );
//            }
//            added = definitions.addDefinition( toDefinition( element ) );
//
//        } else if (element_type == DefinitionsElement.Type.TEST) {
//            TestsType  tests = oval_defs.getTests();
//            if (tests == null) {
//                tests = new TestsType();
//                oval_defs.setTests( tests );
//            }
//            added = tests.addTest( toTest( element ) );
//
//        } else if (element_type == DefinitionsElement.Type.OBJECT) {
//            SystemObjectsType  objects = oval_defs.getObjects();
//            if (objects == null) {
//                objects = new SystemObjectsType();
//                oval_defs.setObjects( objects );
//            }
//            added = objects.addObject( toObject( element ) );
//
//        } else if (element_type == DefinitionsElement.Type.STATE) {
//            StatesType  states = oval_defs.getStates();
//            if (states == null) {
//                states = new StatesType();
//                oval_defs.setStates( states );
//            }
//            added = states.addState( toState( element ) );
//
//        } else if (element_type == DefinitionsElement.Type.VARIABLE) {
//            VariablesType  variables = oval_defs.getVariables();
//            if (variables == null) {
//                variables = new VariablesType();
//                oval_defs.setVariables( variables );
//            }
//            added = variables.addVariable( toVariable( element ) );
//        }
//
//        return added;
//    }



    /**
     * @throws  OvalException
     */
    private static ElementContainer<? extends DefinitionsElement> _findContainer(
                    final OvalDefinitions oval_defs,
                    final ElementType type
                    )
    {
        if (oval_defs == null  ||  type == null) {
            throw new IllegalArgumentException( "empty OVAL Definitions or element type" );
        }

        ElementContainer<? extends DefinitionsElement>  container = null;
        if (type == ElementType.DEFINITION) {
            container = oval_defs.getDefinitions();
        } else if (type == ElementType.TEST) {
            container = oval_defs.getTests();
        } else if (type == ElementType.OBJECT) {
            container = oval_defs.getObjects();
        } else if (type == ElementType.STATE) {
            container = oval_defs.getStates();
        } else if (type == ElementType.VARIABLE) {
            container = oval_defs.getVariables();
        }

//        if (container == null) {
//            throw new OvalException( "design error" );
//        }

        return container;
    }



//    private static ElementContainer<? extends DefinitionsElement> _newContainer(
//                    final ElementType type
//                    )
//    throws OvalException
//    {
//        if (type == null) {
//            throw new IllegalArgumentException( "empty OVAL Definitions or element type" );
//        }
//
//        ElementContainer<? extends DefinitionsElement>  container = null;
//        if (type == ElementType.DEFINITION) {
//            container = new DefinitionsType();
//        } else if (type == ElementType.TEST) {
//            container = new TestsType();
//        } else if (type == ElementType.OBJECT) {
//            container = new SystemObjectsType();
//        } else if (type == ElementType.STATE) {
//            container = new StatesType();
//        } else if (type == ElementType.VARIABLE) {
//            container = new VariablesType();
//        }
//
//        if (container == null) {
//            throw new OvalException( "design error" );
//        }
//
//        return container;
//    }



    ///////////////////////////////////////////////////////////////////////
    //  type conversion
    ///////////////////////////////////////////////////////////////////////

    public static DefinitionType asDefinition(
                    final DefinitionsElement element
                    )
    {
        return DefinitionType.class.cast( element );
    }


    public static TestType asTest(
                    final DefinitionsElement element
                    )
    {
        return TestType.class.cast( element );
    }


    public static SystemObjectType asObject(
                    final DefinitionsElement element
                    )
    {
        return SystemObjectType.class.cast( element );
    }


    public static StateType asState(
                    final DefinitionsElement element
                    )
    {
        return StateType.class.cast( element );
    }


    public static VariableType asVariable(
                    final DefinitionsElement element
                    )
    {
        return VariableType.class.cast( element );
    }



    ///////////////////////////////////////////////////////////////////////
    //  type mapping
    ///////////////////////////////////////////////////////////////////////

    /**
     * OVAL entity type - Java class mapping.
     */
    private static EnumMap<ElementType, Class<? extends DefinitionsElement>>  _TYPES_ =
                    new EnumMap<ElementType, Class<? extends DefinitionsElement>>( ElementType.class );

    static {
            _TYPES_.put( ElementType.DEFINITION, DefinitionType.class );
            _TYPES_.put( ElementType.TEST, TestType.class );
            _TYPES_.put( ElementType.OBJECT, SystemObjectType.class );
            _TYPES_.put( ElementType.STATE, StateType.class );
            _TYPES_.put( ElementType.VARIABLE, VariableType.class );
    }


    /**
     *
     * @throws  OvalException
     */
    public static Class<? extends DefinitionsElement> javaTypeOf(
                    final String oval_id
                    )
    {
        return javaTypeOf( OvalId.elementTypeOf( oval_id ) );
    }


    /**
     *
     * @throws  OvalException
     */
    public static Class<? extends DefinitionsElement> javaTypeOf(
                    final ElementType type
                    )
    {
        Class<? extends DefinitionsElement>  javaType = _TYPES_.get( type );
        if (javaType == null) {
            throw new OvalException( "Java type mapping error: element type=" + type );
        }

        return javaType;
    }




    //OLD

//    private static EnumMap<OvalIdentifier.Type, Class<? extends DefinitionsElement>>  _TYPE_MAP_ =
//                    new EnumMap<OvalIdentifier.Type, Class<? extends DefinitionsElement>>( OvalIdentifier.Type.class );
//
//    static {
//            _TYPE_MAP_.put( OvalIdentifier.Type.def, DefinitionType.class );
//            _TYPE_MAP_.put( OvalIdentifier.Type.tst, TestType.class );
//            _TYPE_MAP_.put( OvalIdentifier.Type.obj, SystemObjectType.class );
//            _TYPE_MAP_.put( OvalIdentifier.Type.ste, StateType.class );
//            _TYPE_MAP_.put( OvalIdentifier.Type.var, VariableType.class );
//    }
//
//
//    /**
//     */
//    public static Class<? extends DefinitionsElement> objectTypeOf(
//                    final String oval_id
//                    )
//    throws OvalException
//    {
//        OvalIdentifier.Type  id_type = null;
//        try {
//            id_type = OvalIdentifier.typeOf( oval_id );
//        } catch (Exception ex) {
//            throw new OvalRepositoryException( ex );
//        }
//
//        return objectTypeOf( id_type );
//    }
//
//
//
//    public static Class<? extends DefinitionsElement> objectTypeOf(
//                    final OvalIdentifier.Type id_type
//                    )
//    throws OvalException
//    {
//        Class<? extends DefinitionsElement>  object_type = _TYPE_MAP_.get( id_type );
//        if (object_type == null) {
//            throw new OvalRepositoryException( "unknown OVAL-ID type: " + id_type );
//        }
//
//        return object_type;
//    }
//
//
//
//    public static Class<? extends DefinitionsElement> objectTypeOf(
//                    final DefinitionsElement.Type type
//                    )
//    throws OvalRepositoryException
//    {
//        return objectTypeOf( type.getOvalIdentifierType() );
//    }



    ///////////////////////////////////////////////////////////////////////
    //  reference
    ///////////////////////////////////////////////////////////////////////

    /**
     */
    public static Collection<String> getElementRefId(
                    final DefinitionsElement element
                    )
    {
        _LOG_.debug( "OVAL ID: " + element.getOvalId() );
        Set<String>  ids = new HashSet<String>();
        Collection<ElementRef>  ref_list = element.ovalGetElementRef();
        for (ElementRef  e : ref_list) {
            if (e == null) {
                continue;
            }
            String  id = e.ovalGetRefId();
            if (id != null  &&  id.length() > 0) {
                ids.add( id );
            }
        }

        _LOG_.debug( "referencing OVAL IDs: " + String.valueOf( ids ) );
        return ids;
    }

}
//

