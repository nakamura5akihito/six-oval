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
package io.opensec.six.oval.core.repository.morphia;

import io.opensec.six.oval.core.model.OvalEnumerationHelper;
import io.opensec.six.oval.model.ComponentType;
import io.opensec.six.oval.model.Family;
import io.opensec.six.oval.model.OvalEnumeration;
import io.opensec.six.oval.model.common.ClassEnumeration;
import io.opensec.six.oval.model.common.FamilyEnumeration;
import io.opensec.six.oval.model.definitions.DefinitionType;
import io.opensec.six.oval.model.definitions.DefinitionsElement;
import io.opensec.six.oval.model.results.OvalResults;
import io.opensec.six.oval.model.results.ResultEnumeration;
import io.opensec.six.oval.model.sc.OvalSystemCharacteristics;
import io.opensec.six.oval.repository.DefinitionQueryParams;
import io.opensec.six.oval.repository.DefinitionsElementQueryParams;
import io.opensec.six.oval.repository.OvalResultsQueryParams;
import io.opensec.six.oval.repository.OvalSystemCharacteristicsQueryParams;
import io.opensec.util.core.repository.morphia.MorphiaQueryBuilder.CommonBuilder;
import io.opensec.util.core.repository.morphia.QueryBuilder;
import io.opensec.util.core.repository.morphia.QueryBuilderFactory;
import io.opensec.util.repository.CommonQueryParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.mongodb.morphia.query.Criteria;
import org.mongodb.morphia.query.Query;




/**
 * A query builder for OVAL repository.
 *
 * @author  Akihito Nakamura, AIST
 */
public class OvalQueryBuilder
    extends CommonBuilder
    implements QueryBuilderFactory
{

//    /**
//     * Logger.
//     */
//    private static final Logger  _LOG_ = LoggerFactory.getLogger( OvalQueryBuilder.class );



    /**
     * Constructor.
     */
    protected OvalQueryBuilder()
    {
    }



    //*********************************************************************
    //  implements QueryBuilderFactory
    //*********************************************************************

    @Override
    public QueryBuilder newBuilder(
                    final Class<?> type
                    )
    {
        if (DefinitionType.class.isAssignableFrom( type )) {
            return DefinitionBuilder.INSTANCE;
        } else if (DefinitionsElement.class.isAssignableFrom( type )) {
            return DefinitionsElementBuilder.INSTANCE;
        } else if (OvalSystemCharacteristics.class.isAssignableFrom( type )) {
            return OvalSystemCharacteristicsBuilder.INSTANCE;
        } else if (OvalResults.class.isAssignableFrom( type )) {
            return OvalResultsBuilder.INSTANCE;
        }

        return CommonBuilder.INSTANCE;
    }




    ///////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////


//    /**
//     * A factory method.
//     */
//    public static QueryBuilder getInstance(
//                    final Class<?> type
//                    )
//    {
//        if (DefinitionType.class.isAssignableFrom( type )) {
//            return DefinitionBuilder.INSTANCE;
//        } else if (DefinitionsElement.class.isAssignableFrom( type )) {
//            return DefinitionsElementBuilder.INSTANCE;
//        } else if (OvalSystemCharacteristics.class.isAssignableFrom( type )) {
//            return OvalSystemCharacteristicsBuilder.INSTANCE;
//        } else if (OvalResults.class.isAssignableFrom( type )) {
//            return OvalResultsBuilder.INSTANCE;
//        }
//
//        return CommonBuilder.INSTANCE;
//    }



    ///////////////////////////////////////////////////////////////////////
    //  Handler variations
    ///////////////////////////////////////////////////////////////////////

    protected static class BooleanHandler
    implements Handler
    {
        public static final BooleanHandler  INSTANCE = new BooleanHandler();


        public BooleanHandler()
        {
        }


        @Override
        public void build(
                        final Query<?> query,
                        final String field,
                        final String value
                        )
        {
            if (_isEmpty( value )) {
                return;
            }

            char  operator = value.charAt( 0 );
            if (operator == '!') {
                Boolean  bool_value = Boolean.valueOf( value.substring( 1 ) );
                query.filter( field + " !=", bool_value );
            } else {
                Boolean  bool_value = Boolean.valueOf( value );
                query.filter( field, bool_value );
            }
        }
    }
    //Boolean


    protected static class OvalEnumerationListHandler
    implements Handler
    {

        private final Class<? extends OvalEnumeration>  _type;


        public OvalEnumerationListHandler(
                        final Class<? extends OvalEnumeration> type
                        )
        {
            _type = type;
        }


        @Override
        public void build(
                        final Query<?> query,
                        final String field,
                        final String value
                        )
        {
            if (_isEmpty( value )) {
                return;
            }

            if (_isList( value )) {
                String[]  value_elem = _asList( value );
                List<OvalEnumeration>  list = new ArrayList<OvalEnumeration>();
                for (String  v : value_elem) {
                    list.add( OvalEnumerationHelper.fromValue( _type, v ) );
                }
                query.filter( field + " in", list );
            } else {
                query.filter( field, OvalEnumerationHelper.fromValue( _type, value ) );
            }
        }
    }
    //OvalEnumerationList



    ///////////////////////////////////////////////////////////////////////
    //  QueryBuilder variations
    ///////////////////////////////////////////////////////////////////////


    /**
     * oval-def:{definition,test,object,state,variable}
     */
    public static class DefinitionsElementBuilder
    extends CommonBuilder
    {
        public static final DefinitionsElementBuilder  INSTANCE = new DefinitionsElementBuilder();


        protected static Map<String, String> _createFieldMapping()
        {
            Map<String, String>  mapping = new HashMap<String, String>();
            mapping.put( DefinitionsElementQueryParams.Key.ID,          "oval_id" );
            mapping.put( DefinitionsElementQueryParams.Key.VERSION,     "oval_version" );
            mapping.put( DefinitionsElementQueryParams.Key.DEPRECATED,  "deprecated" );
            mapping.put( DefinitionsElementQueryParams.Key.TYPE,        null );
            //NOTE: TYPE parameter is handled by the Repository implementation class.
            mapping.put( DefinitionsElementQueryParams.Key.FAMILY,      "_oval_family" );
            mapping.put( DefinitionsElementQueryParams.Key.COMPONENT,   "_oval_component" );
            mapping.put( DefinitionsElementQueryParams.Key.SCHEMA,      "_oval_generator.schema_version" );

            //override:
            mapping.put( CommonQueryParams.Key.SEARCH_TERMS,            "comment" );

            return mapping;
        }

        private static final Map<String, String>  _FIELDS_ = _createFieldMapping();


        protected static Map<String, Handler> _createHandlers()
        {
            Map<String, Handler>  mapping = CommonBuilder._createHandlerMapping();

            //common//
            mapping.put( CommonQueryParams.Key.SEARCH_TERMS,            SearchTermsHandler2.INSTANCE );
//          mapping.put( CommonQueryParams.Key.SEARCH_TERMS,            SearchTermsHandler.INSTANCE ); //slower

            //definitions element//
            mapping.put( DefinitionsElementQueryParams.Key.ID,          PatternListHandler.INSTANCE );
            mapping.put( DefinitionsElementQueryParams.Key.VERSION,     IntegerHandler.INSTANCE );

            // TODO:
            mapping.put( DefinitionsElementQueryParams.Key.DEPRECATED,  BooleanHandler.INSTANCE );

            mapping.put( DefinitionsElementQueryParams.Key.TYPE,        IgnoringHandler.INSTANCE );
            mapping.put( DefinitionsElementQueryParams.Key.SCHEMA,      FilterHandler2.INSTANCE );
            mapping.put( DefinitionsElementQueryParams.Key.FAMILY,      new OvalEnumerationListHandler( Family.class ) );
            mapping.put( DefinitionsElementQueryParams.Key.COMPONENT,   new OvalEnumerationListHandler( ComponentType.class ) );

            return mapping;
        }

        private static final Map<String, Handler>  _HANDLERS_ = _createHandlers();



        public DefinitionsElementBuilder()
        {
        }


        @Override
        protected Map<String, Handler> _handlerMapping()
        {
            return _HANDLERS_;
        }


        @Override
        protected Map<String, String> _fieldMapping()
        {
            return _FIELDS_;
        }

    }
    //DefinitionsElement



    /**
     * oval-def:definition
     */
    public static class DefinitionBuilder
    extends DefinitionsElementBuilder
    {
        public static final DefinitionBuilder  INSTANCE = new DefinitionBuilder();


        protected static Map<String, String> _createFieldMapping()
        {
            Map<String, String>  mapping = DefinitionsElementBuilder._createFieldMapping();
            mapping.put( DefinitionQueryParams.Key.DEFINITION_CLASS,    "class" );
            mapping.put( DefinitionQueryParams.Key.FAMILY,              "metadata.affected.family" );   //override
            mapping.put( DefinitionQueryParams.Key.PLATFORM,            "metadata.affected.platform" );
            mapping.put( DefinitionQueryParams.Key.PRODUCT,             "metadata.affected.product" );
            mapping.put( DefinitionQueryParams.Key.REF_SOURCE,          "metadata.reference.source" );
            mapping.put( DefinitionQueryParams.Key.REF_ID,              "metadata.reference.ref_id" );
            mapping.put( DefinitionQueryParams.Key.CVE,                 "metadata.reference.ref_id" );

            // override
            mapping.put( CommonQueryParams.Key.SEARCH_TERMS,            "metadata.title,metadata.description" );

            return mapping;
        }

        private static final Map<String, String>  _FIELDS_ = _createFieldMapping();


        protected static Map<String, Handler> _createHandlerMapping()
        {
            Map<String, Handler>  mapping = DefinitionsElementBuilder._createHandlers();

            //override//
            mapping.put( DefinitionsElementQueryParams.Key.FAMILY,      new OvalEnumerationListHandler( FamilyEnumeration.class ) );
//          mapping.put( CommonQueryParams.Key.SEARCH_TERMS,            SearchTermHandler.INSTANCE );

            //def:definition//
            mapping.put( DefinitionQueryParams.Key.DEFINITION_CLASS,    new OvalEnumerationListHandler( ClassEnumeration.class ) );
            mapping.put( DefinitionQueryParams.Key.PLATFORM,            PatternListHandler.INSTANCE );
            mapping.put( DefinitionQueryParams.Key.PRODUCT,             PatternListHandler.INSTANCE );
            mapping.put( DefinitionQueryParams.Key.REF_SOURCE,          HasAnyOfHandler.INSTANCE );
            mapping.put( DefinitionQueryParams.Key.REF_ID,              PatternListHandler.INSTANCE );
            mapping.put( DefinitionQueryParams.Key.CVE,                 PatternListHandler.INSTANCE );

            return mapping;
        }

        private static final Map<String, Handler>  _HANDLERS_ = _createHandlerMapping();



        public DefinitionBuilder()
        {
        }


        @Override
        protected Map<String, Handler> _handlerMapping()
        {
            return _HANDLERS_;
        }


        @Override
        protected Map<String, String> _fieldMapping()
        {
            return _FIELDS_;
        }

    }
    //Definition



    /**
     * oval-sc:oval_system_characteristics
     */
    public static class OvalSystemCharacteristicsBuilder
    extends CommonBuilder
    {
        public static final OvalSystemCharacteristicsBuilder  INSTANCE = new OvalSystemCharacteristicsBuilder();


        protected static Map<String, String> _createFieldMapping()
        {
            Map<String, String>  mapping = new HashMap<String, String>();
            mapping.put( OvalSystemCharacteristicsQueryParams.Key.HOST,         "system_info.primary_host_name" );
            mapping.put( OvalSystemCharacteristicsQueryParams.Key.OS,           "system_info.os_name" );
            mapping.put( OvalSystemCharacteristicsQueryParams.Key.OS_VERSION,   "system_info.os_version" );
            mapping.put( OvalSystemCharacteristicsQueryParams.Key.IP,           "system_info.interfaces.interface.ip_address" );
            mapping.put( OvalSystemCharacteristicsQueryParams.Key.MAC,          "system_info.interfaces.interface.mac_address" );

            return mapping;
        }

        private static final Map<String, String>  _FIELDS_ = _createFieldMapping();


        protected static Map<String, Handler> _createHandlerMapping()
        {
            Map<String, Handler>  mapping = CommonBuilder._createHandlerMapping();

            //override
//          mapping.put( CommonQueryParams.Key.SEARCH_TERMS,            SearchTermsHandler2.INSTANCE );

            //sc//
            mapping.put( OvalSystemCharacteristicsQueryParams.Key.HOST,         PatternListHandler.INSTANCE );
            mapping.put( OvalSystemCharacteristicsQueryParams.Key.OS,           PatternListHandler.INSTANCE );
            mapping.put( OvalSystemCharacteristicsQueryParams.Key.OS_VERSION,   FilterHandler.INSTANCE );
//            mapping.put( OvalSystemCharacteristicsQueryParams.Key.OS_VERSION,   FilterHandler2.INSTANCE );
            mapping.put( OvalSystemCharacteristicsQueryParams.Key.IP,           PatternListHandler.INSTANCE );
            mapping.put( OvalSystemCharacteristicsQueryParams.Key.MAC,          PatternListHandler.INSTANCE );

            return mapping;
        }

        private static final Map<String, Handler>  _HANDLERS_ = _createHandlerMapping();



        public OvalSystemCharacteristicsBuilder()
        {
        }


        @Override
        protected Map<String, Handler> _handlerMapping()
        {
            return _HANDLERS_;
        }


        @Override
        protected Map<String, String> _fieldMapping()
        {
            return _FIELDS_;
        }

    }
    //OvalSystemCharacteristics



    /**
     * oval-res:oval_results
     */
    public static class OvalResultsBuilder
    extends CommonBuilder
    {
        public static final OvalResultsBuilder  INSTANCE = new OvalResultsBuilder();


        protected static Map<String, String> _createFieldMapping()
        {
            Map<String, String>  mapping = OvalSystemCharacteristicsBuilder._createFieldMapping();
            for (String  key : mapping.keySet()) {
                String  field = mapping.get( key );
                field = "results.system.oval_system_characteristics." + field;
                mapping.put( key, field );
            }

            mapping.put( OvalResultsQueryParams.Key.DEFINITION,         "results.system.definitions.definition.oval_id" );
            mapping.put( OvalResultsQueryParams.Key.DEFINITION_TRUE,    "results.system.definitions.definition" );

            return mapping;
        }

        private static final Map<String, String>  _FIELDS_ = _createFieldMapping();


        protected static Map<String, Handler> _createHandlerMapping()
        {
            Handler  definition_true_handler = new Handler()
            {
                @Override
                public void build(
                                final Query<?> query,
                                final String field,
                                final String value  //def's oval_id
                                )
                {
                    if (_isEmpty( value )) {
                        return;
                    }

                    if (_isList( value )) {
                        String[]  value_elem = _asList( value );
                        int  num_value_elem = value_elem.length;
                        Criteria[]  criteria = new Criteria[num_value_elem];
                        for (int  i = 0; i < num_value_elem; i++) {
                            io.opensec.six.oval.model.results.DefinitionType  result_def =
                                            new io.opensec.six.oval.model.results.DefinitionType();
                            result_def.setOvalId( value_elem[i] );
                            result_def.setResult( ResultEnumeration.TRUE );
                            criteria[i] = query.criteria( field ).hasThisElement( result_def );
                        }
                        query.or( criteria );
                    } else {
                        io.opensec.six.oval.model.results.DefinitionType  result_def =
                                        new io.opensec.six.oval.model.results.DefinitionType();
                        result_def.setDefinitionId( value );
                        result_def.setResult( ResultEnumeration.TRUE );
                        query.filter( field + " elem", result_def );
                    }

                }
            };


            Map<String, Handler>  mapping = OvalSystemCharacteristicsBuilder._createHandlerMapping();
            mapping.put( OvalResultsQueryParams.Key.DEFINITION_TRUE,    definition_true_handler );
            mapping.put( OvalResultsQueryParams.Key.DEFINITION,         HasAnyOfHandler.INSTANCE );

            return mapping;
        }

        private static final Map<String, Handler>  _HANDLERS_ = _createHandlerMapping();



        public OvalResultsBuilder()
        {
        }


        @Override
        protected Map<String, Handler> _handlerMapping()
        {
            return _HANDLERS_;
        }


        @Override
        protected Map<String, String> _fieldMapping()
        {
            return _FIELDS_;
        }

    }
    //OvalResults

}
//

