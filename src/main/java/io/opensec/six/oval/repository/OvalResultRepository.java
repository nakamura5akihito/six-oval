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
package io.opensec.six.oval.repository;

import io.opensec.six.oval.model.results.OvalResults;
import io.opensec.six.oval.model.sc.OvalSystemCharacteristics;
import io.opensec.util.repository.QueryParams;
import io.opensec.util.repository.QueryResults;



/**
 * A prescription of the OVAL result repository basic operations.
 *
 * @author  Akihito Nakamura, AIST
 */
public interface OvalResultRepository
{

    //=====================================================================
    // OvalResults
    //=====================================================================

    /**
     * Returns the OVAL Results Document of the specified ID.
     * If no such object exists, this method returns null.
     *
     * @param   id
     *  the ID.
     * @return
     *  the OVAL Results Document if exists, null otherwise.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public OvalResults findOvalResultsById( String id );



    /**
     * Returns all the OVAL Results Documents in the repository.
     *
     * @return
     *  all the OVAL Results Documents .
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public QueryResults<OvalResults> findOvalResults();
//    public List<OvalResults> findOvalResults();



    /**
     * Searches for the OVAL Results Documents that match the specified query parameters.
     *
     * @param   params
     *  the query parameters.
     * @return
     *  the OVAL Results.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public QueryResults<OvalResults> findOvalResults( QueryParams params );
//    public List<OvalResults> findOvalResults( QueryParams params );



    /**
     * Returns the IDs of all the OVAL Results Documents in the repository.
     *
     * @return
     *  the IDs of all the OVAL Results Documents.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public QueryResults<String> findOvalResultsId();
//    public List<String> findOvalResultsId();



    /**
     * Searches for the OVAL Results Documents that match the specified query parameters
     * and returns their IDs.
     *
     * @param   params
     *  the query parameters.
     * @return
     *  the IDs of OVAL Results Documents.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public QueryResults<String> findOvalResultsId( QueryParams params );
//    public List<String> findOvalResultsId( QueryParams params );



    /**
     * Returns the number of OVAL Results Documents in the repository.
     *
     * @return
     *  the number of OVAL Results Documents.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public long countOvalResults();



    /**
     * Returns the number of OVAL Results Documents that match the specified query parameters.
     *
     * @param   params
     *  the query parameters.
     * @return
     *  the number of OVAL Results Documents.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public long countOvalResults( QueryParams params );



    /**
     * Saves the OVAL Results Document.
     *
     * @param   oval_results
     *  the OVAL Results Document.
     * @return
     *  the ID of the document.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public String saveOvalResults( OvalResults oval_results );



    //=====================================================================
    // OvalSystemCharacteristics
    //=====================================================================

    /**
     * Returns the OVAL System Characteristics Document of the specified ID.
     * If no such object exists, this method returns null.
     *
     * @param   id
     *  the ID.
     * @return
     *  the OVAL System Characteristics Document if exists, null otherwise.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public OvalSystemCharacteristics findOvalSystemCharacteristicsById( String id );



    /**
     * Returns all the OVAL System Characteristics Documents in the repository.
     *
     * @return
     *  the OVAL System Characteristics Documents.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public QueryResults<OvalSystemCharacteristics> findOvalSystemCharacteristics();



    /**
     * Searches for the OVAL System Characteristics Documents that match the specified query parameters.
     *
     * @param   params
     *  the query parameters.
     * @return
     *  the OVAL System Characteristics Documents.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public QueryResults<OvalSystemCharacteristics> findOvalSystemCharacteristics( QueryParams params );
//    public List<OvalSystemCharacteristics> findOvalSystemCharacteristics( QueryParams params );



    /**
     * Returns the IDs of all the OVAL System Characteristics Documents.
     *
     * @return
     *  the IDs of all the OVAL System Characteristics Documents.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public QueryResults<String> findOvalSystemCharacteristicsId();



    /**
     * Searches for the OVAL System Characteristics Documents that match the specified query parameters
     * and returns their IDs.
     *
     * @param   params
     *  the query parameters.
     * @return
     *  the IDs of OVAL System Characteristics Documents.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public QueryResults<String> findOvalSystemCharacteristicsId( QueryParams params );



    /**
     * Returns the number of OVAL System Characteristics Documents in the repository.
     *
     * @return
     *  the number of OVAL System Characteristics Documents.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public long countOvalSystemCharacteristics();



    /**
     * Returns the number of OVAL System Characteristics Documents that match the specified query parameters.
     *
     * @param   params
     *  the query parameters.
     * @return
     *  the number of OVAL System Characteristics Documents.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public long countOvalSystemCharacteristics( QueryParams params );



    /**
     * Saves the OVAL System Characteristics Document.
     *
     * @param   oval_scs
     *  the OVAL System Characteristics Document.
     * @return
     *  the ID of the OVAL System Characteristics Document.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public String saveOvalSystemCharacteristics( OvalSystemCharacteristics oval_scs );

}
//
