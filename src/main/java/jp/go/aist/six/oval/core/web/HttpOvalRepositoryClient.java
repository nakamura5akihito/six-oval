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
package jp.go.aist.six.oval.core.web;

import java.util.ArrayList;
import java.util.List;
import jp.go.aist.six.oval.model.DocumentId;
import jp.go.aist.six.oval.model.ElementType;
import jp.go.aist.six.oval.model.common.OvalId;
import jp.go.aist.six.oval.model.definitions.DefinitionType;
import jp.go.aist.six.oval.model.definitions.DefinitionsElement;
import jp.go.aist.six.oval.model.definitions.OvalDefinitions;
import jp.go.aist.six.oval.model.results.OvalResults;
import jp.go.aist.six.oval.model.sc.OvalSystemCharacteristics;
import jp.go.aist.six.oval.repository.OvalRepository;
import jp.go.aist.six.util.repository.CommonQueryParams;
import jp.go.aist.six.util.repository.ObjectNotFoundException;
import jp.go.aist.six.util.repository.QueryParams;
import jp.go.aist.six.util.repository.QueryResults;
import jp.go.aist.six.util.repository.RepositoryException;
import jp.go.aist.six.util.repository.View;
import jp.go.aist.six.util.web.HttpClient;
import jp.go.aist.six.util.web.HttpException;
import jp.go.aist.six.util.web.UrlUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.client.HttpStatusCodeException;



/**
 * An implementation of OvalRepository using MongoDB.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: HttpOvalRepositoryClient.java 3117 2013-04-30 03:33:17Z nakamura5akihito@gmail.com $
 */
public class HttpOvalRepositoryClient
    implements OvalRepository
{

    /**
     * Logger.
     */
    private static final Logger  _LOG_ =
                    LoggerFactory.getLogger( HttpOvalRepositoryClient.class );


    private static final String  _URL_PATH_DELIM_  = "/";


    private String  _baseUrl;
    private HttpClient  _http;

    private List<HttpMessageConverter<?>>  _messageConverters;



    /**
     * Constructor.
     */
    public HttpOvalRepositoryClient()
    {
//        _init();
    }


    public HttpOvalRepositoryClient(
                    final String base_url
                    )
    {
        setBaseUrl( base_url );
    }


//    private void _init()
//    {
//        _LOG_.debug( "initializing..." );
//
//        _repositoryBaseUrl = OvalContext.getProperty( "six.oval.repository.web.base-url" );
//        _LOG_.info( "repository base URL: " + _repositoryBaseUrl );
//
//        _LOG_.debug( "...initialized" );
//    }



    /**
     */
    public void setBaseUrl(
                    final String url
                    )
    {
        String  slash = "/";
        _baseUrl = url;
        if (_baseUrl.endsWith( slash )) {
            _baseUrl = url.substring( 0, url.length() - 1 );
        }
    }


    public String getBaseUrl()
    {
        if (_baseUrl == null) {
            throw new HttpException( "base URL not configured" );
        }

        return _baseUrl;
    }



    /**
    *
    */
   public void setHttpClient(
                   final HttpClient client
                   )
   {
       _http = client;
   }


   public HttpClient _getHttpClient()
   {
       return _http;
   }



   private <T> T _getObject(
                   final String url,
                   final Class<T> response_type,
                   final Object... uri_variables
                   )
   {
       T  object = null;
       try {
           object = _getHttpClient().getObject( url, response_type, uri_variables );
       } catch (RuntimeException ex) {
           Throwable  cause = ex.getCause();
           if (cause == null) {
               throw ex;
           } else {
               if (HttpStatusCodeException.class.isInstance( cause )) {
                   HttpStatusCodeException  sc_ex = (HttpStatusCodeException)cause;
                   HttpStatus  status = sc_ex.getStatusCode();
                   if (status == HttpStatus.NOT_FOUND) {
                       throw new ObjectNotFoundException( cause );
                   } else {
                       throw new RepositoryException( cause );
                   }
               } else {
                   throw ex;
               }
           }
       }

       return object;
   }



   private <T> String _postObject(
                   final String url,
                   final T object,
                   final Class<T> type
                   )
   {
       String  location = null;
       try {
           location = _getHttpClient().postObject( url, object, type );
       } catch (RuntimeException ex) {
           Throwable  cause = ex.getCause();
           if (cause == null) {
               throw ex;
           } else {
               if (HttpStatusCodeException.class.isInstance( cause )) {
                   throw new RepositoryException( cause );
               } else {
                   throw ex;
               }
           }
       }

       return location;
   }




   /**
    */
   private String _buildQueryUrl(
                   final String path,
                   final QueryParams params
                   )
   {
       return getBaseUrl() + path + UrlUtil.toString( params );
   }




   /**
    */
   private QueryParams _buildIdQueryParams(
                   final QueryParams  params
                   )
   {
       QueryParams  b_params = params;
       if (b_params == null) {
           b_params = new QueryParams();
       }

       b_params.set( CommonQueryParams.Key.VIEW, View.id.name() );

       return b_params;
   }



   /**
    */
   private QueryParams _buildCountQueryParams(
                   final QueryParams  params
                   )
   {
       QueryParams  b_params = params;
       if (b_params == null) {
           b_params = new QueryParams();
       }

       b_params.set( CommonQueryParams.Key.VIEW, View.count.name() );

       return b_params;
   }



   /**
    */
   private QueryResults<String> _toStringIdResults(
                   final QueryResults<? extends Object>  id_results
                   )
   {
       List<String>  string_id_list = new ArrayList<String>();
       for (Object  id : id_results.getElements()) {
           string_id_list.add( id.toString() );
       }

       QueryResults<String>  string_id_results = new QueryResults<String>( string_id_list );
       string_id_results.setTimestamp( id_results.getTimestamp() );
       string_id_results.setTotalResults( id_results.getTotalResults() );
       string_id_results.setItemsPerPage( id_results.getItemsPerPage() );

       return string_id_results;
   }



   ////////////////////////////////////////////////////////////////////////
   ////////////////////////////////////////////////////////////////////////
   ////////////////////////////////////////////////////////////////////////
   ////////////////////////////////////////////////////////////////////////
   ////////////////////////////////////////////////////////////////////////
   ////////////////////////////////////////////////////////////////////////
   ////////////////////////////////////////////////////////////////////////
   ////////////////////////////////////////////////////////////////////////


    /**
     */
    public void setMessageConverters(
                    final List<HttpMessageConverter<?>> messageConverters
                    )
    {
        _messageConverters = messageConverters;
    }


    protected List<HttpMessageConverter<?>> _getMessageConverters()
    {
        return _messageConverters;
    }



//    /**
//     * scope="prototype";
//     * i.e. each time this method is called, a new instance is created.
//     */
//    private RestTemplate _newRestTemplate()
//    {
//        RestTemplate  template = new RestTemplate();
//
//        List<HttpMessageConverter<?>>  converters = _getMessageConverters();
//        if (converters != null) {
//            template.setMessageConverters( _getMessageConverters() );
//        }
//
//        return template;
//    }



//    /**
//     * HTTP GET
//     *
//     * @return
//     */
//    private <T> T _httpGet(
//                    final String url_path,
//                    final Class<T> response_type,
//                    final Object... uri_variables
//                    )
//    {
//        _LOG_.debug( "HTTP GET: URL path=" + url_path
//                        + ", response type=" + response_type
//                        + ", variables=" + Arrays.toString( uri_variables ) );
//
//        HttpHeaders  request_headers = new HttpHeaders();
//        request_headers.setContentType( MediaType.APPLICATION_XML );
//        HttpEntity<?> request_entity = new HttpEntity<Void>( request_headers );
//
//        HttpEntity<T>  response = null;
//        try {
//            response = _newRestTemplate().exchange(
//                            getBaseUrl() + url_path, HttpMethod.GET,
//                            request_entity, response_type, uri_variables );
//        } catch (Exception ex) {
//            throw new OvalRepositoryException( ex );
//        }
//
//        T  body = response.getBody();
//
//        return body;
//    }



//    /**
//     * HTTP POST
//     *
//     * @throws  OvalInterpreterException
//     */
//    protected <T> String _httpPost(
//                    final String url_path,
//                    final T object,
//                    final Class<T> type
//                    )
//    {
////        _LOG_.debug( "HTTP POST: to URL=" + to_url
////                        + ", from file=" + from_file
////                        + ", content-type=" + content_type );
//
//        HttpHeaders  request_headers = new HttpHeaders();
//        request_headers.setContentType( MediaType.APPLICATION_XML );
//        HttpEntity<T> request_entity = new HttpEntity<T>( object, request_headers );
//
//        URI  location = null;
//        try {
//            location= _newRestTemplate().postForLocation(
//                            getBaseUrl() + url_path, request_entity );
//        } catch (Exception ex) {
//            throw new OvalRepositoryException( ex );
//        }
//
////        HttpEntity<Void>  response = null;
////        try {
////            response = _newRestTemplate().exchange(
////                            _repositoryBaseUrl + url_path, HttpMethod.POST,
////                            request_entity, Void.class );
////        } catch (Exception ex) {
////            throw new OvalRepositoryException( ex );
////        }
////
////        HttpHeaders  response_headers = response.getHeaders();
////        URI  location = response_headers.getLocation();
////        if (location == null) {
////            throw new OvalRepositoryException( "no location in HTTP headers" );
////        }
//
//        String  path = location.getPath();
//        String  id = path.substring( path.lastIndexOf( '/' ) + 1 );
//
//        return id;
//    }






//    /**
//     *
//     * @param params
//     * @return
//     */
//    private String _toUriQueryStrings(
//                    final QueryParams params
//                    )
//    {
//        if (params == null  ||  params.size() == 0) {
//            return "";
//        }
//
//        StringBuilder  s = new StringBuilder();
//        boolean  first_key = true;
//        for (String  key : params.keys()) {
//            if (first_key) {
//                s.append( "?" );
//                first_key = false;
//            } else {
//                s.append( "&" );
//            }
//
//            String  value = params.get( key );
//            s.append( key ).append( "=" ).append( value );
//        }
//
//        return s.toString();
//    }



//    /**
//     */
//    private QueryResults<String> _toStringOvalIdResults(
//                    final QueryResults<OvalId>  oval_id_results
//                    )
//    {
//        List<String>  id_list = new ArrayList<String>();
//        for (OvalId  oval_id : oval_id_results.getElements()) {
//            id_list.add( oval_id.toString() );
//        }
//
//        QueryResults<String>  query_results = new QueryResults<String>( id_list );
//        query_results.setTimestamp( oval_id_results.getTimestamp() );
//        query_results.setTotalResults( oval_id_results.getTotalResults() );
//        query_results.setItemsPerPage( oval_id_results.getItemsPerPage() );
//
//        return query_results;
//    }


//    private QueryResults<String> _toStringDocumentIdResults(
//                    final QueryResults<DocumentId>  doc_id_results
//                    )
//    {
//        List<String>  id_list = new ArrayList<String>();
//        for (DocumentId  doc_id : doc_id_results.getElements()) {
//            id_list.add( doc_id.toString() );
//        }
//
//        QueryResults<String>  query_results = new QueryResults<String>( id_list );
//        query_results.setTimestamp( doc_id_results.getTimestamp() );
//        query_results.setTotalResults( doc_id_results.getTotalResults() );
//        query_results.setItemsPerPage( doc_id_results.getItemsPerPage() );
//
//        return query_results;
//    }




    //*********************************************************************
    //  implements OvalDefinitionRepository
    //*********************************************************************

    //=====================================================================
    //  Definition
    //=====================================================================

    private static final String  _PATH_BY_ID_           = "/{id}";
    private static final String  _PATH_DEFINITON_       = "/definitions";


    private String  _definitionUrl;

    private String _getDefinitionUrl()
    {
        if (_definitionUrl == null) {
            _definitionUrl = getBaseUrl() + _PATH_DEFINITON_;
        }

        return _definitionUrl;
    }


    private String _getDefinitionQueryUrl(
                    final QueryParams params
                    )
    {
        return _getDefinitionUrl() + UrlUtil.toString( params );
    }



    public DefinitionType findDefinitionById(
                    final String oval_id
                    )
    {
        DefinitionType  object = _getObject(
                        _getDefinitionUrl() + _PATH_BY_ID_, DefinitionType.class, oval_id );
        return object;
    }



    public QueryResults<DefinitionType> findDefinition()
    {
        @SuppressWarnings( "unchecked" )
        QueryResults<DefinitionType>  results = _getObject(
                        _getDefinitionUrl(), QueryResults.class );
        return results;
    }



    public QueryResults<DefinitionType> findDefinition(
                    final QueryParams params
                    )
    {
        @SuppressWarnings( "unchecked" )
        QueryResults<DefinitionType>  results = _getObject(
                        _getDefinitionQueryUrl( params ), QueryResults.class );
        return results;
    }



    public QueryResults<String> findDefinitionId()
    {
        @SuppressWarnings( "unchecked" )
        QueryResults<OvalId>  results = _getObject(
                        _getDefinitionQueryUrl( _buildIdQueryParams( null ) ),
                        QueryResults.class );
        return _toStringIdResults( results );

//
//        QueryParams  ps = new DefinitionQueryParams();
//        ps.set( CommonQueryParams.Key.VIEW, View.id.name() );
//
//        String  query_part = _toUriQueryStrings( ps );
//
//        @SuppressWarnings( "unchecked" )
//        QueryResults<OvalId>  oval_id_results = _httpGet(
//                        _PATH_DEFINITON_ + query_part, QueryResults.class );
//
//        QueryResults<String>  query_results = _toStringOvalIdResults( oval_id_results );
//
//        return query_results;
    }



    public QueryResults<String> findDefinitionId(
                    final QueryParams params
                    )
    {
        @SuppressWarnings( "unchecked" )
        QueryResults<OvalId>  results = _getObject(
                        _getDefinitionQueryUrl( _buildIdQueryParams( params ) ),
                        QueryResults.class );
        return _toStringIdResults( results );

//        QueryParams  ps = null;
//        if (params == null) {
//            ps = new DefinitionQueryParams();
//        } else {
//            try {
//                ps = QueryParams.class.cast( params.clone() );
//            } catch (CloneNotSupportedException ex) {
//                //never thrown
//            }
//        }
//        ps.set( CommonQueryParams.Key.VIEW, View.id.name() );
//
//        String  query_part = _toUriQueryStrings( ps );
//
//        @SuppressWarnings( "unchecked" )
//        QueryResults<OvalId>  oval_id_results = _httpGet(
//                        _PATH_DEFINITON_ + query_part, QueryResults.class );
//
//        QueryResults<String>  query_results = _toStringOvalIdResults( oval_id_results );
//
//        return query_results;
    }



    public long countDefinition()
    {
        return countDefinition( null );
    }



    public long countDefinition(
                    final QueryParams params
                    )
    {
        @SuppressWarnings( "unchecked" )
        QueryResults<Void>  results = _getObject(
                        _getDefinitionQueryUrl( _buildCountQueryParams( params ) ),
                        QueryResults.class );
        return results.getTotalResults();


//        QueryParams  ps = null;
//        if (params == null) {
//            ps = new DefinitionQueryParams();
//        } else {
//            try {
//                ps = QueryParams.class.cast( params.clone() );
//            } catch (CloneNotSupportedException ex) {
//                //never thrown
//            }
//        }
//        ps.set( CommonQueryParams.Key.VIEW, View.count.name() );
//
//        String  query_part = _toUriQueryStrings( ps );
//
//        @SuppressWarnings( "unchecked" )
//        QueryResults<Void>  query_results = _httpGet(
//                        _PATH_DEFINITON_ + query_part, QueryResults.class );
//
//        return query_results.getTotalResults();
    }



    public String saveDefinition(
                    final DefinitionType def
                    )
    {
        String  url = _getDefinitionUrl();
        String  location = _postObject( url, def, DefinitionType.class );

        String  id = null;
        if (location.startsWith( url )) {
            id = url.substring( url.length() + 1 );
        } else {
            throw new HttpException( "unexpected location: " + url );
        }

        return id;

//        String  id = _httpPost( _PATH_DEFINITON_, def, DefinitionType.class );
//        return id;
    }



    //=====================================================================
    // definitions element (Definition, Test, Object, State, Variable)
    //=====================================================================

    private static final String  _PATH_ELEMENT_BY_ID_ = "/{type}s/{id}";

    public DefinitionsElement findElementById(
                    final String oval_id
                    )
    {
        ElementType  type = OvalId.elementTypeOf( oval_id );
        DefinitionsElement  object = _getObject(
                        getBaseUrl() + _PATH_ELEMENT_BY_ID_, DefinitionsElement.class,
                        type.value(), oval_id );
        return object;


//        ElementType  type = OvalId.elementTypeOf( oval_id );
//        DefinitionsElement  element = _httpGet(
//                        _PATH_ELEMENT_BY_ID_, DefinitionsElement.class, type.value(), oval_id );
//        return element;
    }



    public QueryResults<DefinitionsElement> findElement( final QueryParams params )
    {
        throw new UnsupportedOperationException();
    }



    public QueryResults<String> findElementId(
                    final QueryParams params
                    )
    {
        throw new UnsupportedOperationException();
    }



    public long countElement( final QueryParams params )
    {
        throw new UnsupportedOperationException();
    }



    public String saveElement( final DefinitionsElement element )
    {
        throw new UnsupportedOperationException();
    }



    //=====================================================================
    // OvalDefinitions
    //=====================================================================

    private static final String  _PATH_OVAL_DEFINITONS_       = "/oval_definitions";

    private static final String  _PATH_OVAL_DEFINITONS_BY_ID_ = "/oval_definitions/{id}";



    public OvalDefinitions findOvalDefinitionsById(
                    final String id
                    )
    {
        OvalDefinitions  object = _getObject(
                        getBaseUrl() + _PATH_OVAL_DEFINITONS_BY_ID_, OvalDefinitions.class, id );
        return object;


//        OvalDefinitions  oval_defs = _httpGet(
//                        _PATH_OVAL_DEFINITONS_BY_ID_, OvalDefinitions.class, id );
//        return oval_defs;
    }



    public QueryResults<String> findOvalDefinitionsId()
    {
        throw new UnsupportedOperationException();
    }



    public QueryResults<String> findOvalDefinitionsId(
                    final QueryParams params
                    )
    {
        throw new UnsupportedOperationException();
    }



    public long countOvalDefinitions()
    {
        throw new UnsupportedOperationException();
    }



    public long countOvalDefinitions(
                    final QueryParams params
                    )
    {
        throw new UnsupportedOperationException();
    }



    public String saveOvalDefinitions(
                    final OvalDefinitions oval_defs
                    )
    {
        String  url = getBaseUrl() + _PATH_OVAL_DEFINITONS_;
        String  location = _postObject( url, oval_defs, OvalDefinitions.class );

        String  id = null;
        if (location.startsWith( url )) {
            id = url.substring( url.length() + 1 );
        } else {
            throw new HttpException( "unexpected location: " + url );
        }

        return id;

//        String  id = _httpPost( _PATH_OVAL_DEFINITONS_, oval_defs, OvalDefinitions.class );
//        return id;
    }



    //*********************************************************************
    //  implements OvalResultRepository
    //*********************************************************************

    private static final String  _PATH_OVAL_RESULTS_         = "/oval_results";

    private static final String  _PATH_OVAL_RESULTS_BY_ID_   = "/oval_results/{id}";


    public OvalResults findOvalResultsById(
                    final String id
                    )
    {
        OvalResults  object = _getObject(
                        getBaseUrl() + _PATH_OVAL_RESULTS_BY_ID_, OvalResults.class, id );
        return object;


//        OvalResults  oval_results = _httpGet(
//                        _URL_OVAL_RESULTS_BY_ID_, OvalResults.class, id );
//        return oval_results;
    }



    public QueryResults<OvalResults> findOvalResults()
    {
        @SuppressWarnings( "unchecked" )
        QueryResults<OvalResults>  results = _getObject(
                        getBaseUrl() + _PATH_OVAL_RESULTS_, QueryResults.class );
        return results;

//        @SuppressWarnings( "unchecked" )
//        QueryResults<OvalResults>  query_results = _httpGet(
//                        _URL_OVAL_RESULTS_, QueryResults.class );
//
//        return query_results;
    }



    public QueryResults<OvalResults> findOvalResults(
                    final QueryParams params
                    )
    {
        @SuppressWarnings( "unchecked" )
        QueryResults<OvalResults>  results = _getObject(
                        _buildQueryUrl( _PATH_OVAL_RESULTS_, params ),
                        QueryResults.class );
        return results;


//        String  query_part = _toUriQueryStrings( params );
//
//        @SuppressWarnings( "unchecked" )
//        QueryResults<OvalResults>  query_results = _httpGet(
//                        _PATH_OVAL_RESULTS_ + query_part, QueryResults.class );
//
//        return query_results;
    }



    public QueryResults<String> findOvalResultsId()
    {
        return findOvalResultsId( null );
    }



    public QueryResults<String> findOvalResultsId(
                    final QueryParams params
                    )
    {
        @SuppressWarnings( "unchecked" )
        QueryResults<DocumentId>  results = _getObject(
                        _buildQueryUrl( _PATH_OVAL_RESULTS_, _buildIdQueryParams( params ) ),
                        QueryResults.class );
        return _toStringIdResults( results );


//        QueryParams  ps = null;
//        if (params == null) {
//            ps = new OvalResultsQueryParams();
//        } else {
//            try {
//                ps = QueryParams.class.cast( params.clone() );
//            } catch (CloneNotSupportedException ex) {
//                //never thrown
//            }
//        }
//        ps.set( CommonQueryParams.Key.VIEW, View.id.name() );
//
//        String  query_part = _toUriQueryStrings( ps );
//
//        @SuppressWarnings( "unchecked" )
//        QueryResults<DocumentId>  doc_id_results = _httpGet(
//                        _PATH_OVAL_RESULTS_ + query_part, QueryResults.class );
//
//        QueryResults<String>  query_results = _toStringDocumentIdResults( doc_id_results );
//
//        return query_results;
    }



    public long countOvalResults()
    {
        return countOvalResults( null );
    }



    public long countOvalResults(
                    final QueryParams params
                    )
    {
        @SuppressWarnings( "unchecked" )
        QueryResults<Void>  results = _getObject(
                        _buildQueryUrl( _PATH_OVAL_RESULTS_, _buildCountQueryParams( params ) ),
                        QueryResults.class );
        return results.getTotalResults();



//        QueryParams  ps = null;
//        if (params == null) {
//            ps = new OvalResultsQueryParams();
//        } else {
//            try {
//                ps = QueryParams.class.cast( params.clone() );
//            } catch (CloneNotSupportedException ex) {
//                //never thrown
//            }
//        }
//        ps.set( CommonQueryParams.Key.VIEW, View.count.name() );
//
//        String  query_part = _toUriQueryStrings( ps );
//
//        @SuppressWarnings( "unchecked" )
//        QueryResults<Void>  query_results = _httpGet(
//                        _PATH_OVAL_RESULTS_ + query_part, QueryResults.class );
//
//        return query_results.getTotalResults();
    }



    public String saveOvalResults(
                    final OvalResults oval_results
                    )
    {
        String  url = getBaseUrl() + _PATH_OVAL_RESULTS_;
        String  location = _postObject( url, oval_results, OvalResults.class );

        String  id = null;
        if (location.startsWith( url )) {
            id = url.substring( url.length() + 1 );
        } else {
            throw new HttpException( "unexpected location: " + url );
        }

        return id;


//        String  id = _httpPost( _PATH_OVAL_RESULTS_, oval_results, OvalResults.class );
//        return id;
    }



    //=====================================================================
    // OvalSystemCharacteristics
    //=====================================================================

    private static final String  _PATH_OVAL_SCS_         = "/oval_scs";
    private static final String  _PATH_OVAL_SCS_BY_ID_   = "/oval_scs/{id}";


    public OvalSystemCharacteristics findOvalSystemCharacteristicsById(
                    final String id
                    )
    {
        OvalSystemCharacteristics  object = _getObject(
                        getBaseUrl() + _PATH_OVAL_SCS_BY_ID_, OvalSystemCharacteristics.class, id );
        return object;

//        OvalSystemCharacteristics  oval_scs = _httpGet(
//                        _PATH_OVAL_SCS_BY_ID_, OvalSystemCharacteristics.class, id );
//        return oval_scs;
    }



    public QueryResults<OvalSystemCharacteristics> findOvalSystemCharacteristics()
    {
        return findOvalSystemCharacteristics( null );
    }



    public QueryResults<OvalSystemCharacteristics> findOvalSystemCharacteristics(
                    final QueryParams params
                    )
    {
        @SuppressWarnings( "unchecked" )
        QueryResults<OvalSystemCharacteristics>  results = _getObject(
                        _buildQueryUrl( _PATH_OVAL_SCS_, params ),
                        QueryResults.class );
        return results;


//        String  query_part = _toUriQueryStrings( params );
//
//        @SuppressWarnings( "unchecked" )
//        QueryResults<OvalSystemCharacteristics>  query_results = _httpGet(
//                        _PATH_OVAL_SCS_ + query_part, QueryResults.class );
//
//        return query_results;
    }



    public QueryResults<String> findOvalSystemCharacteristicsId()
    {
        return findOvalSystemCharacteristicsId( null );
    }



    public QueryResults<String> findOvalSystemCharacteristicsId(
                    final QueryParams params
                    )
    {
        @SuppressWarnings( "unchecked" )
        QueryResults<DocumentId>  results = _getObject(
                        _buildQueryUrl( _PATH_OVAL_SCS_, _buildIdQueryParams( params ) ),
                        QueryResults.class );
        return _toStringIdResults( results );


//        QueryParams  ps = null;
//        if (params == null) {
//            ps = new OvalSystemCharacteristicsQueryParams();
//        } else {
//            try {
//                ps = QueryParams.class.cast( params.clone() );
//            } catch (CloneNotSupportedException ex) {
//                //never thrown
//            }
//        }
//        ps.set( CommonQueryParams.Key.VIEW, View.id.name() );
//
//        String  query_part = _toUriQueryStrings( ps );
//
//        @SuppressWarnings( "unchecked" )
//        QueryResults<DocumentId>  doc_id_results = _httpGet(
//                        _PATH_OVAL_SCS_ + query_part, QueryResults.class );
//
//        QueryResults<String>  query_results = _toStringDocumentIdResults( doc_id_results );
//
//        return query_results;
    }



    public long countOvalSystemCharacteristics()
    {
        return countOvalSystemCharacteristics( null );
    }



    public long countOvalSystemCharacteristics(
                    final QueryParams params
                    )
    {
        @SuppressWarnings( "unchecked" )
        QueryResults<Void>  results = _getObject(
                        _buildQueryUrl( _PATH_OVAL_SCS_, _buildCountQueryParams( params ) ),
                        QueryResults.class );
        return results.getTotalResults();


//        QueryParams  ps = null;
//        if (params == null) {
//            ps = new OvalSystemCharacteristicsQueryParams();
//        } else {
//            try {
//                ps = QueryParams.class.cast( params.clone() );
//            } catch (CloneNotSupportedException ex) {
//                //never thrown
//            }
//        }
//        ps.set( CommonQueryParams.Key.VIEW, View.count.name() );
//
//        String  query_part = _toUriQueryStrings( ps );
//
//        @SuppressWarnings( "unchecked" )
//        QueryResults<Void>  query_results = _httpGet(
//                        _PATH_OVAL_SCS_ + query_part, QueryResults.class );
//
//        return query_results.getTotalResults();
    }



    public String saveOvalSystemCharacteristics(
                    final OvalSystemCharacteristics oval_scs
                    )
    {
        String  url = getBaseUrl() + _PATH_OVAL_SCS_;
        String  location = _postObject( url, oval_scs, OvalSystemCharacteristics.class );

        String  id = null;
        if (location.startsWith( url )) {
            id = url.substring( url.length() + 1 );
        } else {
            throw new HttpException( "unexpected location: " + url );
        }

        return id;


//        String  id = _httpPost( _PATH_OVAL_SCS_, oval_scs, OvalSystemCharacteristics.class );
//        return id;
    }

}
//
