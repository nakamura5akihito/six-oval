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
package jp.go.aist.six.oval.core.repository;

import java.util.ArrayList;
import java.util.List;
import jp.go.aist.six.oval.core.model.EntityUtil;
import jp.go.aist.six.oval.model.ElementType;
import jp.go.aist.six.oval.model.definitions.DefinitionType;
import jp.go.aist.six.oval.model.definitions.DefinitionsElement;
import jp.go.aist.six.oval.model.definitions.OvalDefinitions;
import jp.go.aist.six.oval.model.definitions.StateType;
import jp.go.aist.six.oval.model.definitions.SystemObjectType;
import jp.go.aist.six.oval.model.definitions.TestType;
import jp.go.aist.six.oval.model.definitions.VariableType;
import jp.go.aist.six.oval.repository.DefinitionsElementQueryParams;
import jp.go.aist.six.oval.repository.OvalDefinitionRepository;
import jp.go.aist.six.util.repository.CommonQueryParams;
import jp.go.aist.six.util.repository.Datastore;
import jp.go.aist.six.util.repository.QueryParams;
import jp.go.aist.six.util.repository.QueryResults;
import jp.go.aist.six.util.repository.RepositoryException;



/**
 * An implementation of OvalRepository using MongoDB.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: OvalDefinitionRepositoryImpl.java 3165 2013-05-22 06:52:13Z nakamura5akihito@gmail.com $
 */
public class OvalDefinitionRepositoryImpl
    implements OvalDefinitionRepository
{

//    /**
//     * Logger.
//     */
//    private static final Logger  _LOG_ =
//        LoggerFactory.getLogger( MongoOvalDefinitionRepository.class );



    private Datastore  _datastore;



    /**
     * Constructor.
     */
    public OvalDefinitionRepositoryImpl()
    {
    }


    public OvalDefinitionRepositoryImpl(
                    final Datastore datastore
                    )
    {
        setDatastore( datastore );
    }



    /**
     *
     */
    public void setDatastore(
                    final Datastore datastore
                    )
    {
        _datastore = datastore;
    }


    protected Datastore _getDatastore()
    {
        return _datastore;
    }



    /**
     */
    protected static <T> QueryResults<T> _buildQueryResults(
                    final QueryParams params,
                    final List<T> elements
                    )
    {
        QueryResults<T>  r = _buildQueryResults( elements );

        if (params != null) {
            String  key = CommonQueryParams.Key.COUNT;
            if (params.containsKey( key )) {
                r.setItemsPerPage( (long)r.size() );
            }

            key = CommonQueryParams.Key.START_INDEX;
            if (params.containsKey( key )) {
                int  index = params.getAsInt( key );
                r.setStartIndex( (long)index );
            }
        }

        return r;
    }


    protected static <T> QueryResults<T> _buildQueryResults(
                    final List<T> elements
                    )
    {
        return new QueryResults<T>( elements );
    }




    //*********************************************************************
    //  implements OvalDefinitionRepository
    //*********************************************************************

    //=====================================================================
    // Definition
    //=====================================================================

    public DefinitionType findDefinitionById(
                    final String oval_id
                    )
    {
        DefinitionType  p_object = _getDatastore().findById( DefinitionType.class, oval_id );
        return p_object;
    }
//    {
////      long  ts_start = System.currentTimeMillis();
//
//      DefinitionType  p_object = null;
//      try {
//          p_object = _getDatabase().findById( DefinitionType.class, oval_id );
//      } catch (Exception ex) {
//          throw new OvalRepositoryException( ex );
//      }
//
////      _LOG_.info( "elapsed time (ms): " +  (System.currentTimeMillis() - ts_start) );
//      return p_object;
//  }



    public QueryResults<DefinitionType> findDefinition()
    {
        List<DefinitionType>  p_list = _getDatastore().find( DefinitionType.class );
        return new QueryResults<DefinitionType>( p_list );
    }



    public QueryResults<DefinitionType> findDefinition(
                    final QueryParams params
                    )
    {
        List<DefinitionType>  p_list = _getDatastore().find( DefinitionType.class, params );
        return new QueryResults<DefinitionType>( params, p_list );
    }



    public QueryResults<String> findDefinitionId()
    {
        List<String>  p_list = _getDatastore().findId( DefinitionType.class );
        return new QueryResults<String>( p_list );
    }



    public QueryResults<String> findDefinitionId(
                    final QueryParams params
                    )
    {
        List<String>  p_list = _getDatastore().findId( DefinitionType.class, params );
        return new QueryResults<String>( params, p_list );
    }



    public long countDefinition()
    {
        long  count = _getDatastore().count( DefinitionType.class );
        return count;
    }



    public long countDefinition(
                    final QueryParams params
                    )
    {
        long  count = _getDatastore().count( DefinitionType.class, params );
        return count;
    }



    public String saveDefinition(
                    final DefinitionType def
                    )
    {
        String  p_id = _getDatastore().save( DefinitionType.class, def );
        return p_id;
    }



    //=====================================================================
    // definitions element (Definition, Test, Object, State, Variable)
    //=====================================================================

    public DefinitionsElement findElementById(
                    final String oval_id
                    )
    {
        Class<? extends DefinitionsElement>  objectType = EntityUtil.javaTypeOf( oval_id );
        DefinitionsElement p_object = _getDatastore().findById( objectType, oval_id );
        return p_object;
    }



    public QueryResults<DefinitionsElement> findElement(
                    final QueryParams params
                    )
    {
        QueryParams  adjustedParams = null;
        if (params == null) {
            adjustedParams = new QueryParams();
        } else {
            try {
                adjustedParams = QueryParams.class.cast( params.clone() );
            } catch (CloneNotSupportedException ex) {
                throw new RepositoryException( ex );
            }
        }
        String  type = adjustedParams.get( DefinitionsElementQueryParams.Key.TYPE );

        List<DefinitionsElement>  p_list = null;
        List<? extends DefinitionsElement>  p_sub_list = null;
        if (type == null) {
            p_list = new ArrayList<DefinitionsElement>();
            p_sub_list = _getDatastore().find( DefinitionType.class,   adjustedParams );
            p_list.addAll( p_sub_list );
            p_sub_list = _getDatastore().find( TestType.class,         adjustedParams );
            p_list.addAll( p_sub_list );
            p_sub_list = _getDatastore().find( SystemObjectType.class, adjustedParams );
            p_list.addAll( p_sub_list );
            p_sub_list = _getDatastore().find( StateType.class,        adjustedParams );
            p_list.addAll( p_sub_list );
            p_sub_list = _getDatastore().find( VariableType.class,     adjustedParams );
            p_list.addAll( p_sub_list );
        } else {
            adjustedParams.remove( DefinitionsElementQueryParams.Key.TYPE );
            Class<? extends DefinitionsElement>  java_type = EntityUtil.javaTypeOf( ElementType.fromValue( type ) );
            p_sub_list = _getDatastore().find( java_type, adjustedParams );
            p_list = new ArrayList<DefinitionsElement>( p_sub_list );
        }

        return new QueryResults<DefinitionsElement>( params, p_list );
    }



    //TODO: How can we sort the result of elements obtained from multiple collections?

//    public List<String> findElementId(
//                    final QueryParams params
//                    )
//    throws OvalRepositoryException
//    {
//    }



    public QueryResults<String> findElementId(
                    final QueryParams params
                    )
    {
        QueryParams  adjusted_params = null;
        if (params == null) {
            adjusted_params = new QueryParams();
        } else {
            try {
                adjusted_params = QueryParams.class.cast( params.clone() );
            } catch (CloneNotSupportedException ex) {
                throw new RepositoryException( ex );
            }
        }
        String  element_type = adjusted_params.get( DefinitionsElementQueryParams.Key.TYPE );

        List<String>  p_list = null;
        if (element_type == null) {
            p_list = new ArrayList<String>();
            List<String>  p_sub_list = null;
            p_sub_list = _getDatastore().findId( DefinitionType.class,   adjusted_params );
            p_list.addAll( p_sub_list );
            p_sub_list = _getDatastore().findId( TestType.class,         adjusted_params );
            p_list.addAll( p_sub_list );
            p_sub_list = _getDatastore().findId( SystemObjectType.class, adjusted_params );
            p_list.addAll( p_sub_list );
            p_sub_list = _getDatastore().findId( StateType.class,        adjusted_params );
            p_list.addAll( p_sub_list );
            p_sub_list = _getDatastore().findId( VariableType.class,     adjusted_params );
            p_list.addAll( p_sub_list );
        } else {
            adjusted_params.remove( DefinitionsElementQueryParams.Key.TYPE );
            Class<? extends DefinitionsElement>  java_type = EntityUtil.javaTypeOf( ElementType.fromValue( element_type ) );
            p_list = _getDatastore().findId( java_type, adjusted_params );
        }

        return new QueryResults<String>( params, p_list );
    }




    public long countElement(
                    final QueryParams params
                    )
    {
        long  p_count = 0L;
        QueryParams  adjustedParams = null;
        if (params == null) {
            adjustedParams = new QueryParams();
        } else {
            try {
                adjustedParams = QueryParams.class.cast( params.clone() );
            } catch (CloneNotSupportedException ex) {
                throw new RepositoryException( ex );
            }
        }
        String  type = adjustedParams.get( DefinitionsElementQueryParams.Key.TYPE );

        if (type == null) {
            long  p_sub_count = 0L;
            p_sub_count = _getDatastore().count( DefinitionType.class,   adjustedParams );
            p_count += p_sub_count;
            p_sub_count = _getDatastore().count( TestType.class,         adjustedParams );
            p_count += p_sub_count;
            p_sub_count = _getDatastore().count( SystemObjectType.class, adjustedParams );
            p_count += p_sub_count;
            p_sub_count = _getDatastore().count( StateType.class,        adjustedParams );
            p_count += p_sub_count;
            p_sub_count = _getDatastore().count( VariableType.class,     adjustedParams );
            p_count += p_sub_count;
        } else {
            adjustedParams.remove( DefinitionsElementQueryParams.Key.TYPE );
            Class<? extends DefinitionsElement>  objectType = EntityUtil.javaTypeOf( ElementType.fromValue( type ) );
            p_count = _getDatastore().count( objectType, adjustedParams );
        }

        return p_count;
    }



    public String saveElement(
                    final DefinitionsElement element
                    )
    {
        ElementType  type = element.ovalGetType();
        String  id = null;
        if (ElementType.DEFINITION == type) {
            id = _getDatastore().save(   DefinitionType.class,   DefinitionType.class.cast( element ) );
        } else if (ElementType.TEST == type) {
            id = _getDatastore().save(         TestType.class,         TestType.class.cast( element ) );
        } else if (ElementType.OBJECT == type) {
            id = _getDatastore().save( SystemObjectType.class, SystemObjectType.class.cast( element ) );
        } else if (ElementType.STATE == type) {
            id = _getDatastore().save(        StateType.class,        StateType.class.cast( element ) );
        } else if (ElementType.VARIABLE == type) {
            id = _getDatastore().save(     VariableType.class,     VariableType.class.cast( element ) );
        }

        return id;
    }



    //=====================================================================
    // OvalDefinitions
    //=====================================================================

    public OvalDefinitions findOvalDefinitionsById(
                    final String id
                    )
    {
        OvalDefinitions  p_object = _getDatastore().findById( OvalDefinitions.class, id );
        return p_object;
    }



    public QueryResults<String> findOvalDefinitionsId()
    {
        List<String>  p_list = _getDatastore().findId( OvalDefinitions.class );
        return new QueryResults<String>( p_list );
    }



    public QueryResults<String> findOvalDefinitionsId(
                    final QueryParams params
                    )
    {
        List<String>  p_list = _getDatastore().findId( OvalDefinitions.class, params );
        return new QueryResults<String>( params, p_list );
    }



    public long countOvalDefinitions()
    {
        long  count = _getDatastore().count( OvalDefinitions.class );
        return count;
    }



    public long countOvalDefinitions(
                    final QueryParams params
                    )
    {
        long  count = _getDatastore().count( DefinitionType.class, params );
        return count;
    }



    public String saveOvalDefinitions(
                    final OvalDefinitions oval_defs
                    )
    {
        String  id = _getDatastore().save( OvalDefinitions.class, oval_defs );
        return id;
    }

}
//
