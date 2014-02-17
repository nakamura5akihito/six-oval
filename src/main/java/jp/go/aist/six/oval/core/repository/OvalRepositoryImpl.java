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

import java.util.List;
import jp.go.aist.six.oval.model.results.OvalResults;
import jp.go.aist.six.oval.model.sc.OvalSystemCharacteristics;
import jp.go.aist.six.oval.repository.OvalRepository;
import jp.go.aist.six.util.repository.QueryParams;
import jp.go.aist.six.util.repository.QueryResults;



/**
 * An implementation of OvalRepository using MongoDB.
 *
 * @author  Akihito Nakamura, AIST
 * @version $Id: OvalRepositoryImpl.java 3165 2013-05-22 06:52:13Z nakamura5akihito@gmail.com $
 */
public class OvalRepositoryImpl
    extends OvalDefinitionRepositoryImpl
    implements OvalRepository
{

//    /**
//     * Logger.
//     */
//    private static final Logger  _LOG_ =
//        LoggerFactory.getLogger( MongoOvalDefinitionResultRepository.class );



    /**
     * Constructor.
     */
    public OvalRepositoryImpl()
    {
    }



    //*********************************************************************
    //  OvalResultsRepository
    //*********************************************************************

    public OvalResults findOvalResultsById(
                    final String id
                    )
    {
        OvalResults  p_object = _getDatastore().findById( OvalResults.class, id );
        return p_object;
    }



    public QueryResults<OvalResults> findOvalResults()
    {
        List<OvalResults>  p_list = _getDatastore().find( OvalResults.class );
        return new QueryResults<OvalResults>( p_list );
    }



    public QueryResults<OvalResults> findOvalResults(
                    final QueryParams params
                    )
    {
        List<OvalResults>  p_list = _getDatastore().find( OvalResults.class, params );
        return new QueryResults<OvalResults>( params, p_list );
    }



    public QueryResults<String> findOvalResultsId()
    {
        List<String>  list = _getDatastore().findId( OvalResults.class );
        return new QueryResults<String>( list );
    }



    public QueryResults<String> findOvalResultsId(
                    final QueryParams params
                    )
    {
        List<String>  p_list = _getDatastore().findId( OvalResults.class, params );
        return new QueryResults<String>( params, p_list );
    }



    public long countOvalResults()
    {
        long  count = _getDatastore().count( OvalResults.class );
        return count;
    }



    public long countOvalResults(
                    final QueryParams params
                    )
    {
        long  count = _getDatastore().count( OvalResults.class, params );
        return count;
    }



    public String saveOvalResults(
                    final OvalResults oval_results
                    )
    {
        String  id = _getDatastore().save( OvalResults.class, oval_results );
        return id;
    }



    //=====================================================================
    // OvalSystemCharacteristics
    //=====================================================================

    public OvalSystemCharacteristics findOvalSystemCharacteristicsById(
                    final String id
                    )
    {
        OvalSystemCharacteristics  p_object = _getDatastore().findById( OvalSystemCharacteristics.class, id );
        return p_object;
    }



    public QueryResults<OvalSystemCharacteristics> findOvalSystemCharacteristics()
    {
        List<OvalSystemCharacteristics>  p_list = _getDatastore().find( OvalSystemCharacteristics.class );
        return new QueryResults<OvalSystemCharacteristics>( p_list );
    }



    public QueryResults<OvalSystemCharacteristics> findOvalSystemCharacteristics(
                    final QueryParams params
                    )
    {
        List<OvalSystemCharacteristics>  p_list = _getDatastore().find( OvalSystemCharacteristics.class, params );
        return new QueryResults<OvalSystemCharacteristics>( params, p_list );
    }



    public QueryResults<String> findOvalSystemCharacteristicsId()
    {
        List<String>  list = _getDatastore().findId( OvalSystemCharacteristics.class );
        return new QueryResults<String>( list );
    }



    public QueryResults<String> findOvalSystemCharacteristicsId(
                    final QueryParams params
                    )
    {
        List<String>  p_list = _getDatastore().findId( OvalSystemCharacteristics.class, params );
        return new QueryResults<String>( params, p_list );
    }



    public long countOvalSystemCharacteristics()
    {
        long  count = _getDatastore().count( OvalSystemCharacteristics.class );
        return count;
    }



    public long countOvalSystemCharacteristics(
                    final QueryParams params
                    )
    {
        long  count = _getDatastore().count( OvalSystemCharacteristics.class, params );
        return count;
    }



    public String saveOvalSystemCharacteristics(
                    final OvalSystemCharacteristics oval_sc
                    )
    {
        String  id = _getDatastore().save( OvalSystemCharacteristics.class, oval_sc );
        return id;
    }

}
//
