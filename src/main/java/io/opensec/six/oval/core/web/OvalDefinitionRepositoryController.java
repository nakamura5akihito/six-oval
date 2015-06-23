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
package io.opensec.six.oval.core.web;

import io.opensec.six.oval.OvalException;
import io.opensec.six.oval.core.repository.OvalDefinitionsGenerator;
import io.opensec.six.oval.model.definitions.DefinitionType;
import io.opensec.six.oval.model.definitions.DefinitionsElement;
import io.opensec.six.oval.model.definitions.OvalDefinitions;
import io.opensec.six.oval.model.definitions.StateType;
import io.opensec.six.oval.model.definitions.SystemObjectType;
import io.opensec.six.oval.model.definitions.TestType;
import io.opensec.six.oval.model.definitions.VariableType;
import io.opensec.six.oval.repository.DefinitionQueryParams;
import io.opensec.six.oval.repository.OvalRepository;
import io.opensec.util.repository.CommonQueryParams;
import io.opensec.util.repository.ObjectNotFoundException;
import io.opensec.util.repository.QueryParams;
import io.opensec.util.repository.QueryResults;
import io.opensec.util.repository.View;
import java.net.URI;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.util.UriTemplate;



/**
 * @author  Akihito Nakamura, AIST
 */
@Controller
public class OvalDefinitionRepositoryController
{

    /**
     * Logger.
     */
    private static final Logger  _LOG_ =
        LoggerFactory.getLogger( OvalDefinitionRepositoryController.class );


    public static final String  DEFINITIONS_REL = "http://opensec.io/six/oval/rels/oval_definitions";
    public static final String  DEFINITION_REL  = "http://opensec.io/six/oval/rels/d/definition";
    public static final String  TEST_REL        = "http://opensec.io/six/oval/rels/d/test";
    public static final String  SC_REL          = "http://opensec.io/six/oval/rels/oval_system_characteristics";
    public static final String  RESULTS_REL     = "http://opensec.io/six/oval/rels/oval_results";
//    public static final String  DEFINITIONS_REL = "http://aist.go.jp/six/oval/rels/oval_definitions";
//    public static final String  DEFINITION_REL  = "http://aist.go.jp/six/oval/rels/d/definition";
//    public static final String  TEST_REL        = "http://aist.go.jp/six/oval/rels/d/test";
//    public static final String  SC_REL          = "http://aist.go.jp/six/oval/rels/oval_system_characteristics";
//    public static final String  RESULTS_REL     = "http://aist.go.jp/six/oval/rels/oval_results";


    // " " space = %20
    // "&" ampa  = %26
    // "*" astah = %2a
    // "." dot   = %2e
    // "/" slash = %2f


    @Autowired
    private OvalRepository  _def_repository;

    private OvalDefinitionsGenerator  _generator;



    /**
     * Constructor.
     */
    public OvalDefinitionRepositoryController()
    {
    }




    /**
     */
    public void setOvalRepository(
                    final OvalRepository database
                    )
    {
        _def_repository = database;
    }


    protected OvalRepository _getOvalRepository()
    {
        return _def_repository;
    }



    /**
     */
    public void setGenerator(
                    final OvalDefinitionsGenerator generator
                    )
    {
        _generator = generator;
    }


    protected OvalDefinitionsGenerator _getGenerator()
    {
        return _generator;
    }




    /**
     */
    protected View _removeView(
                    final QueryParams params
                    )
    {
        String  view_key = CommonQueryParams.Key.VIEW;

        String  view_value = (params == null ? null : params.get( view_key ));
        View  view = (view_value == null ? View.complete : View.valueOf( view_value ));
        _LOG_.debug( "query params view=" + view.name() );
        params.remove( view_key );

        return view;
    }





    //////////////////////////////////////////////////////////////////////
    //  REST support methods
    //////////////////////////////////////////////////////////////////////

    /**
     * Builds a location URI from the specified request URL
     * and the created object ID.
     */
    protected URI _buildResourceLocation(
                    final HttpServletRequest request,
                    final String id
                    )
    {
        String  requestUrl = request.getRequestURL().toString();
        URI  uri = new UriTemplate( "{requestUrl}/{id}" ).expand( requestUrl, id );
//        _LOG_.debug( "Location: " + uri.toASCIIString() );

        return uri;
    }



//    /**
//     * Find one resource by ID.
//     *
//     * @throws  OvalException
//     */
//    protected <K, T extends OvalObject & Persistable<K>>
//    T _findResourceById(
//                    final Class<T> type,
//                    final K id
//                    )
//    {
//        _LOG_.debug( "GET: type=" + type + ", id=" + id );
//        T  resource = _getOvalDefinitionRepository().findById( type, id );
//
//        return resource;
//    }
//
//
//
//    /**
//     * FIND
//     *
//     * @throws  OvalException
//     */
//    protected <K, T extends OvalObject & Persistable<K>>
//    QueryResults<T> _findResource(
//                    final Class<T> type,
//                    final QueryParams params
//                    )
//    {
//        _LOG_.debug( "GET (find): type=" + type + ", params=" + params );
//
//        QueryParams  p = ((params == null  ||  params.size() == 0) ? null : params);
//        List<T>  list = _getOvalDefinitionRepository().find( type, p );
//
//        return _buildQueryResults( params, list );
//    }
//
//
//
//    /**
//     * ID
//     */
//    protected <K, T extends OvalObject & Persistable<K>>
//    QueryResults<K> _findResourceId(
//                    final Class<T> type,
//                    final QueryParams params
//                    )
//    {
//        _LOG_.debug( "GET (find id): type=" + type + ", params=" + params );
//
//        List<K>  list = _getOvalDefinitionRepository().findId( type, params );
//
//        return _buildQueryResults( params, list );
//    }
//
//
//    protected <T extends DefinitionsElement>
//    QueryResults<OvalId> _findResourceOvalId(
//                    final Class<T> type,
//                    final QueryParams params
//                    )
//    {
//        _LOG_.debug( "GET (find id): type=" + type + ", params=" + params );
//
//        List<String>  list = _getOvalDefinitionRepository().findId( type, params );
//        List<OvalId>  id_list = new ArrayList<OvalId>();
//        for (String  id : list) {
//            id_list.add( new OvalId( id ) );
//        }
//
//        return _buildQueryResults( params, id_list );
//    }
//
//
//    protected <T extends Document>
//    QueryResults<DocumentId> _findDocumentResourceId(
//                    final Class<T> type,
//                    final QueryParams params
//                    )
//    {
//        _LOG_.debug( "GET (find id): type=" + type + ", params=" + params );
//
//        List<String>  list = _getOvalDefinitionRepository().findId( type, params );
//        List<DocumentId>  id_list = new ArrayList<DocumentId>();
//        for (String  id : list) {
//            id_list.add( new DocumentId( id ) );
//        }
//
//        return _buildQueryResults( params, id_list );
//    }
//
//
//
//
//
//
//   /**
//    * COUNT
//    */
//    protected <K, T extends OvalObject & Persistable<K>>
//    QueryResults<Void> _findResourceCount(
//                    final Class<T> type,
//                    final QueryParams params
//                    )
//    {
//        _LOG_.debug( "GET (count): type=" + type + ", params=" + params );
//
//        long  count = _getOvalDefinitionRepository().count( type, params );
//        QueryResults<Void>  results = new QueryResults<Void>();
//        results.setTotalResults( count );
//
//        return results;
//
////        return _buildQueryResults( null, Collections.singletonList( count ) );
//    }
//
//
//
//    /**
//     * Creates a resource.
//     *
//     * @throws  OvalException
//     */
//    protected <K, T extends OvalObject & Persistable<K>>
//    ResponseEntity<Void> _saveResource(
//                    final HttpServletRequest request,
//                    final Class<T> type,
//                    final T object
//                    )
//    {
//        _LOG_.debug( "POST: type=" + type + ", object=" + object );
//
//        K  id = _def_repository.save( type, object );
//
//        URI  locationUri = _buildResourceLocation( request, String.valueOf( id ) );
////        _LOG_.debug( "resource created: location=" + locationUri.toASCIIString() );
//
//        HttpHeaders  headers = new HttpHeaders();
//        headers.setLocation( locationUri );
//
//        _LOG_.debug( "HTTP response headers=" + headers );
//
//        return new ResponseEntity<Void>( headers, HttpStatus.CREATED );
//    }
//
//
//
//    /**
//     */
//    protected static <T> QueryResults<T> _buildQueryResults(
//                    final QueryParams params,
//                    final List<T> elements
//                    )
//    {
//        QueryResults<T>  r = _buildQueryResults( elements );
//
//        if (params != null) {
//            String  key = CommonQueryParams.Key.COUNT;
//            if (params.containsKey( key )) {
//                int  count = params.getAsInt( key );
//                r.setItemsPerPage( (long)count );
//            }
//
//            key = CommonQueryParams.Key.START_INDEX;
//            if (params.containsKey( key )) {
//                int  index = params.getAsInt( key );
//                r.setItemsPerPage( (long)index );
//            }
//        }
//
//        return r;
//    }
//
//
//    protected static <T> QueryResults<T> _buildQueryResults(
//                    final List<T> elements
//                    )
//    {
//        return new QueryResults<T>( elements );
//
////        QueryResults<T>  r = new QueryResults<T>( elements );
////        return r;
//    }
//
//
//
//    /**
//     * Retrieves the resources.
//     *
//     * @throws  OvalException
//     */
//    protected <K, T extends OvalObject & Persistable<K>>
//    QueryResults<K> _getResourceId(
//                    final Class<T> type
//                    )
//    {
//        _LOG_.debug( "GET (find id): type=" + type );
//
//        List<K>  list = _getOvalDefinitionRepository().findId( type );
//
//        return _buildQueryResults( list );
//    }


    //////////////////////////////////////////////////////////////////////
    // Exception Handlers, HTTP Status Code
    //////////////////////////////////////////////////////////////////////

//    // 404: Not Found
//    @ExceptionHandler( ObjectRetrievalFailureException.class )
//    @ResponseStatus( HttpStatus.NOT_FOUND )
//    public void handleNotFound(
//                    final ObjectRetrievalFailureException ex
//                    )
//    {
//        _handleException( ex );
//    }


    // 500: Internal Server Error
    @ExceptionHandler( OvalException.class )
    @ResponseStatus( HttpStatus.INTERNAL_SERVER_ERROR )
    public @ResponseBody String handleInternalServerError(
                    final OvalException ex
                    )
    {
        _handleException( ex );
        return ex.getMessage();
    }


    protected void _handleException(
                    final Exception ex
                    )
    {
//        Throwable  rootCause = null;
//        if (ex instanceof NestedRuntimeException) {
//            rootCause = NestedRuntimeException.class.cast( ex ).getRootCause();
//        }

        _LOG_.error( "handle exception: " + ex.getClass().getName()
                            + " - " + ex.getMessage() );
    }



    //////////////////////////////////////////////////////////////////////
    //  REST WS API
    //////////////////////////////////////////////////////////////////////

    //********************************************************************
    // oval-def:definition
    //********************************************************************

    // GET: fetch one by ID
    //
    // NOTE: OVAL IDs contain "." (dot) characters.
    //       The character has special meaning for the Spring framework.
    //
    // about path variables including ".":
    // @see http://forum.springsource.org/showthread.php?78085-Problems-with-RequestMapping&p=263563
    // test: curl -v -X GET -HAccept:application/xml "http://localhost:8080/six-oval/repository/definitions/oval:org%2emitre%2eoval%2etest:def:165"
    // test: curl -v -X GET -HAccept:application/xml "http://localhost:8080/six-oval/repository/definitions/oval:org%2emitre%2eoval:def:7222"
    @RequestMapping(
                    method=RequestMethod.GET
                    ,value="/repository/definitions/{id:.*}"
                    ,headers="Accept=application/xml"
    )
    public @ResponseBody DefinitionType findDefinitionById(
                    @PathVariable final String id
                    )
    {
        return _getOvalRepository().findDefinitionById( id );
//        return _findResourceById( DefinitionType.class, id );
    }



    //NOTE: From URI viewpoint, this path is a special case of findDefinition(params), where params = null.
    //If we activate this method, Spring MVC throws an exception.
//    // GET: fetch all
//    // test: curl -v -X GET -HAccept:application/xml "http://localhost:8080/oval_rep/def/definitions"
//    @RequestMapping(
//                    method=RequestMethod.GET
//                    ,value="/def/definitions"
//                    ,headers="Accept=application/xml"
//    )
//    public @ResponseBody QueryResults<DefinitionType> findAllDefinition()
//    throws OvalException
//    {
//        return _findResource( DefinitionType.class, null );
//    }



    // GET: query
    // test: curl -v -X GET -HAccept:application/xml "http://localhost:8080/six-oval/repository/definitions?platform=Microsoft%20Windows%20XP*,Microsoft%20Windows%207*"
    /**
     *
     * @throws  OvalException
     */
    @RequestMapping(
                    method=RequestMethod.GET
                    ,value="/repository/definitions"
                    ,headers="Accept=application/xml"
    )
    public @ResponseBody QueryResults<?> findDefinition(
                    final DefinitionQueryParams params
                    )
    {
        View  view = _removeView( params );

        QueryResults<?>  results = null;
        if (view == View.id) {
            results = _getOvalRepository().findDefinitionId( params );
        } else if (view == View.count) {
            long  count = _getOvalRepository().countDefinition( params );
            results = new QueryResults<Void>();
            results.setTotalResults( count );
        } else {
            results = _getOvalRepository().findDefinition( params );
        }

        return results;
    }



    // POST (create)



    //********************************************************************
    // oval-def:test, object, state, variable
    //********************************************************************

    // GET: fetch one by ID
    @RequestMapping(
                    method=RequestMethod.GET
                    ,value="/repository/tests/{id:.*}"
                    ,headers="Accept=application/xml"
    )
    public @ResponseBody TestType findTestById(
                    @PathVariable final String id
                    )
    {
        DefinitionsElement  e = _getOvalRepository().findElementById( id );
        if (TestType.class.isInstance( e )) {
            return TestType.class.cast( e );
        }
        throw new ObjectNotFoundException( id );
//        return _findResourceById( TestType.class, id );
    }



    // GET: fetch one by ID
    @RequestMapping(
                    method=RequestMethod.GET
                    ,value="/repository/objects/{id:.*}"
                    ,headers="Accept=application/xml"
    )
    public @ResponseBody SystemObjectType findObjectById(
                    @PathVariable final String id
                    )
    {
        DefinitionsElement  e = _getOvalRepository().findElementById( id );
        if (SystemObjectType.class.isInstance( e )) {
            return SystemObjectType.class.cast( e );
        }
        throw new ObjectNotFoundException( id );
//        return _findResourceById( SystemObjectType.class, id );
    }



    // GET: fetch one by ID
    @RequestMapping(
                    method=RequestMethod.GET
                    ,value="/repository/states/{id:.*}"
                    ,headers="Accept=application/xml"
    )
    public @ResponseBody StateType findStateById(
                    @PathVariable final String id
                    )
    {
        DefinitionsElement  e = _getOvalRepository().findElementById( id );
        if (StateType.class.isInstance( e )) {
            return StateType.class.cast( e );
        }
        throw new ObjectNotFoundException( id );
//        return _findResourceById( StateType.class, id );
    }



    // GET: fetch one by ID
    @RequestMapping(
                    method=RequestMethod.GET
                    ,value="/repository/variables/{id:.*}"
                    ,headers="Accept=application/xml"
    )
    public @ResponseBody VariableType findVariableById(
                    @PathVariable final String id
                    )
    {
        DefinitionsElement  e = _getOvalRepository().findElementById( id );
        if (VariableType.class.isInstance( e )) {
            return VariableType.class.cast( e );
        }
        throw new ObjectNotFoundException( id );
//        return _findResourceById( VariableType.class, id );
    }



    //********************************************************************
    // oval-def:oval_definitions
    //********************************************************************

    // GET: fetch one by ID
    // test: curl -v -X GET -HAccept:application/xml "http://localhost:8080/six-oval/repository/oval_definitions/fa54fd0a-2b71-4d6a-a17c-d1f123a74c2b"
    @RequestMapping(
                    method=RequestMethod.GET
                    ,value="/repository/oval_definitions/{id:.*}"
                    ,headers="Accept=application/xml"
    )
    public @ResponseBody OvalDefinitions findOvalDefinitionsById(
                    @PathVariable final String id
                    )
    {
        return _getOvalRepository().findOvalDefinitionsById( id );
//        return _findResourceById( OvalDefinitions.class, id );
    }



    // returns the list as Atom feed.
//    // GET (list) oval_definitions
//    //
//    // test: curl -v -X GET -HAccept:application/atom+xml http://localhost:8080/oval_rep/d/oval_definitions
//    @RequestMapping(
//                    method=RequestMethod.GET
//                    ,value="/d/oval_definitions"
//                    ,headers="Accept=application/atom+xml"
//    )
//    public @ResponseBody Feed findOvalDefinitions(
//                    final HttpServletRequest request
//                    )
//    throws OvalException
//    {
//        QueryResults<String>  ids = _findResourceIDs( OvalDefinitions.class );
//        if (ids == null) {
//            _LOG_.debug( "oval_definitions: #ids=0" );
//        } else {
//            _LOG_.debug( "oval_definitions: #ids=" + ids.size() );
//        }
//
//        Feed  feed = FeedHelper.buildAtomFeed(
//                        "oval_definitions",
//                        request.getRequestURL().toString(),
//                        DEFINITIONS_REL,
//                        ids.getResultsElements().getElements()
//                        );
//
//        return feed;
//    }



//    // POST (create):
//    //
//    // test: curl -v -X POST -HContent-Type:application/xml --data-binary @definitions.xml http://localhost:8080/six-oval/repository/oval_definitions
//    @RequestMapping(
//                    method=RequestMethod.POST
//                    ,value="/repository/oval_definitions"
//                    ,headers="Content-Type=application/xml"
//    )
//    public ResponseEntity<Void> createOvalDefinitions(
//                    @RequestBody final OvalDefinitions oval_definitions,
//                    final HttpServletRequest request
//                    )
//    {
////        return _getOvalDefinitionRepository().saveOvalDefinitions( oval_definitions );
//        return _saveResource( request, OvalDefinitions.class, oval_definitions );
//    }



//    // POST: generate
//    //
//    // test: curl -v -X POST -HContent-Type:application/xml "http://localhost:8080/six-oval/repository/oval_definitions/generate?searchTerm=win-def:file"
//    @RequestMapping(
//                    method=RequestMethod.POST
//                    ,value="/repository/oval_definitions/generate"
//                    ,headers="Content-Type=application/xml"
//    )
//    public ResponseEntity<Void> generateOvalDefinitions(
//                    final DefinitionQueryParams params,
//                    final HttpServletRequest request
//                    )
//    {
//        String  id = _getGenerator().generateByQuery( params );
//        URI  locationUri = _buildResourceLocation( request, String.valueOf( id ) );
//
//        HttpHeaders  headers = new HttpHeaders();
//        headers.setLocation( locationUri );
//        _LOG_.debug( "HTTP response headers=" + headers );
//
//        return new ResponseEntity<Void>( headers, HttpStatus.CREATED );
//    }

}
//

