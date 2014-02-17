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

import jp.go.aist.six.oval.OvalException;
import jp.go.aist.six.oval.model.results.OvalResults;
import jp.go.aist.six.oval.model.sc.OvalSystemCharacteristics;
import jp.go.aist.six.oval.repository.OvalResultsQueryParams;
import jp.go.aist.six.oval.repository.OvalSystemCharacteristicsQueryParams;
import jp.go.aist.six.util.repository.QueryResults;
import jp.go.aist.six.util.repository.View;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



/**
 * @author  Akihito Nakamura, AIST
 * @version $Id: OvalRepositoryController.java 3115 2013-04-30 02:26:50Z nakamura5akihito@gmail.com $
 */
@Controller
public class OvalRepositoryController
    extends OvalDefinitionRepositoryController
{

//    /**
//     * Logger.
//     */
//    private static final Logger  _LOG_ =
//        LoggerFactory.getLogger( OvalRepositoryController.class );



    /**
     * Constructor.
     */
    public OvalRepositoryController()
    {
    }



    //////////////////////////////////////////////////////////////////////
    //  REST WS API
    //////////////////////////////////////////////////////////////////////


    //********************************************************************
    // oval-sc:oval_system_characteristics
    //********************************************************************

    // GET: fetch one by ID
    // test: curl -v -X GET -HAccept:application/xml "http://localhost:8080/six-oval/repository/oval_scs/fa54fd0a-2b71-4d6a-a17c-d1f123a74c2b"
    /**
     * @throws  OvalException
     */
    @RequestMapping(
                    method=RequestMethod.GET
                    ,value="/repository/oval_scs/{id:.*}"
                    ,headers="Accept=application/xml"
    )
    public @ResponseBody OvalSystemCharacteristics findOvalSystemCharacteristicsById(
                    @PathVariable final String id
                    )
    {
        return _getOvalRepository().findOvalSystemCharacteristicsById( id );
//        return _findResourceById( OvalSystemCharacteristics.class, id );
    }



    // GET: query
    // test: curl -v -X GET -HAccept:application/xml "http://localhost:8080/six-oval/repository/oval_scs?host=server.foo.org"
    @RequestMapping(
                    method=RequestMethod.GET
                    ,value="/repository/oval_scs"
                    ,headers="Accept=application/xml"
    )
    public @ResponseBody QueryResults<?> findOvalSystemCharacteristics(
                    final OvalSystemCharacteristicsQueryParams params
                    )
    {
        View  view = _removeView( params );

        QueryResults<?>  results = null;
        if (view == View.id) {
            results = _getOvalRepository().findOvalSystemCharacteristicsId( params );
        } else if (view == View.count) {
            long  count = _getOvalRepository().countOvalSystemCharacteristics( params );
            results = new QueryResults<Void>();
            results.setTotalResults( count );
        } else {
            results = _getOvalRepository().findOvalSystemCharacteristics( params );
        }

        return results;
//        return _findResource( OvalSystemCharacteristics.class, params );
    }



//    // POST: create
//    //
//    // test: curl -v -X POST -HContent-Type:application/xml --data-binary @results.xml http://localhost:8080/six-oval/repository/oval_scs
//    @RequestMapping(
//                    method=RequestMethod.POST
//                    ,value="/repository/oval_scs"
//                    ,headers="Content-Type=application/xml"
//    )
//    public ResponseEntity<Void> createOvalSystemCharacteristics(
//                    @RequestBody final OvalSystemCharacteristics oval_scs,
//                    final HttpServletRequest request
//                    )
//    {
//        return _saveResource( request, OvalSystemCharacteristics.class, oval_scs );
//    }



    //********************************************************************
    // oval-res:oval_results
    //********************************************************************

    // GET: fetch one by ID
    // test: curl -v -X GET -HAccept:application/xml "http://localhost:8080/six-oval/repository/oval_results/fa54fd0a-2b71-4d6a-a17c-d1f123a74c2b"
    /**
     * @throws  OvalException
     */
    @RequestMapping(
                    method=RequestMethod.GET
                    ,value="/repository/oval_results/{id:.*}"
                    ,headers="Accept=application/xml"
    )
    public @ResponseBody OvalResults findOvalResultsById(
                    @PathVariable final String id
                    )
    {
        return _getOvalRepository().findOvalResultsById( id );
//        return _findResourceById( OvalResults.class, id );
    }



    // GET: query
    // test: curl -v -X GET -HAccept:application/xml "http://localhost:8080/six-oval/repository/oval_results?definitionTrue=oval:org%2emitre%2eoval:def:6210"
    /**
     * @throws  OvalException
     */
    @RequestMapping(
                    method=RequestMethod.GET
                    ,value="/repository/oval_results"
                    ,headers="Accept=application/xml"
    )
    public @ResponseBody QueryResults<?> findOvalResults(
                    final OvalResultsQueryParams params
                    )
    {
        View  view = _removeView( params );

        QueryResults<?>  results = null;
        if (view == View.id) {
            results = _getOvalRepository().findOvalResultsId( params );
        } else if (view == View.count) {
            long  count = _getOvalRepository().countOvalResults( params );
            results = new QueryResults<Void>();
            results.setTotalResults( count );
        } else {
            results = _getOvalRepository().findOvalResults( params );
        }

        return results;
    }



//    // POST: create
//    //
//    // test: curl -v -X POST -HContent-Type:application/xml --data-binary @results.xml http://localhost:8080/six-oval/repository/oval_results
//    /**
//     * @throws  OvalException
//     */
//    @RequestMapping(
//                    method=RequestMethod.POST
//                    ,value="/repository/oval_results"
//                    ,headers="Content-Type=application/xml"
//    )
//    public ResponseEntity<Void> createOvalResults(
//                    @RequestBody final OvalResults oval_results,
//                    final HttpServletRequest request
//                    )
//    {
//        return _saveResource( request, OvalResults.class, oval_results );
//    }

}
//

