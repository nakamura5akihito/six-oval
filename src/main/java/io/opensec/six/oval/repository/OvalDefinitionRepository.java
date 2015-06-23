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

import io.opensec.six.oval.model.definitions.DefinitionType;
import io.opensec.six.oval.model.definitions.DefinitionsElement;
import io.opensec.six.oval.model.definitions.OvalDefinitions;
import io.opensec.util.repository.QueryParams;
import io.opensec.util.repository.QueryResults;



/**
 * A prescription of the OVAL Definition repository basic operations.
 *
 * @author  Akihito Nakamura, AIST
 * @see <a href="http://oval.mitre.org/adoption/usecasesguide.html">OVAL Use Case Guide</a>
 */
public interface OvalDefinitionRepository
{

    //==============================================================
    // Definition
    //==============================================================

    /**
     * Returns the Definition of the specified OVAL-ID.
     * If no such Definition exists, this method returns null.
     *
     * @param   oval_id
     *  the OVAL-ID of the Definition.
     * @return
     *  the found Definition, or null if such Definition does not exist.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public DefinitionType findDefinitionById( String oval_id );



    /**
     * Returns all the Definitions in the repository.
     *
     * @return
     *  all the Definitions.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public QueryResults<DefinitionType> findDefinition();
//    public List<DefinitionType> findDefinition();



    /**
     * Searches for the Definitions that match the specified query parameters.
     *
     * @param   params
     *  the query parameters.
     * @return
     *  the found Definitions.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public QueryResults<DefinitionType> findDefinition( QueryParams params );
//    public List<DefinitionType> findDefinition( QueryParams params );



    /**
     * Returns all the Definition IDs.
     *
     * @return
     *  the found Definition IDs.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public QueryResults<String> findDefinitionId();



    /**
     * Searches for the Definition IDs that match the specified query parameters.
     *
     * @param   params
     *  the query parameters.
     * @return
     *  the found Definition IDs.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public QueryResults<String> findDefinitionId( QueryParams params );
//    public List<String> findDefinitionId( QueryParams params );



    /**
     * Returns the number of Definitions in the repository.
     *
     * @return
     *  the number of Definitions.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public long countDefinition();



    /**
     * Returns the number of Definitions that match the specified query parameters.
     *
     * @param   params
     *  the query parameters.
     * @return
     *  the number of Definitions.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public long countDefinition( QueryParams params );



    /**
     * Saves the Definition, either inserting or updating the existing one.
     *
     * @param   def
     *  the Definition to save.
     * @return
     *  the ID of the Definition.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public String saveDefinition( DefinitionType def );



    //=====================================================================
    // definitions element (Definition, Test, Object, State, Variable)
    //=====================================================================

    /**
     * Returns the element of the specified OVAL-ID.
     * If no such element exists, this method returns null.
     *
     * @param   oval_id
     *  the OVAL-ID.
     * @return
     *  the found entity, or null if such entity does not exist.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public DefinitionsElement findElementById( String oval_id );



    /**
     * Searches for the elements that match the specified query parameters.
     *
     * @param   params
     *  the query parameters.
     * @return
     *  the found entities.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public QueryResults<DefinitionsElement> findElement( QueryParams params );
//    public List<DefinitionsElement> findElement( QueryParams params );



    /**
     * Searches for the element IDs that match the specified query parameters.
     *
     * @param   params
     *  the query parameters.
     * @return
     *  the found element IDs.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public QueryResults<String> findElementId( QueryParams params );



    /**
     * Returns the number of elements that match the specified query parameters.
     *
     * @param   params
     *  the query parameters.
     * @return
     *  the number of entities.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public long countElement( QueryParams params );



    /**
     * Saves the entity, either inserting or updating the existing one.
     *
     * @param   element
     *  the entity to save.
     * @return
     *  the ID of the entity.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public String saveElement( DefinitionsElement element );



//    /**
//     * Saves the entities which are contained in the specified OVAL Definitions document.
//     *
//     * @param   oval_defs
//     *  the OVAL Definitions document.
//     * @return
//     *  the IDs of the entities.
//    * @throws  OvalRepositoryException
//    *  when an exceptional condition occurred during the OVAL repository processing.
//     */
//    public List<String> saveEntities(
//                    OvalDefinitions oval_defs
//                    );



//    /**
//     * Updates the existing entity.
//     *
//     * @param   entity
//     *  the entity to update.
//     * @return
//     *  the ID of the entity.
//    * @throws  OvalRepositoryException
//    *  when an exceptional condition occurred during the OVAL repository processing.
//     */
//    public String updateEntity(
//                    OvalEntity entity
//                    );



    //=====================================================================
    // OvalDefinitions
    //=====================================================================

    /**
     * Returns the OVAL Definitions Document of the specified ID.
     * If no such object exists, this method returns null.
     *
     * @param   id
     *  the ID.
     * @return
     *  the found OVAL Definition Document, or null if such object does not exist.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public OvalDefinitions findOvalDefinitionsById( String id );



    /**
     * Returns the IDs of all the OVAL Definitions Documents.
     *
     * @return
     *  the found IDs.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public QueryResults<String> findOvalDefinitionsId();



    /**
     * Searches for the OVAL Definitions Documents that match the specified query parameters
     * and returns their IDs.
     *
     * @param   params
     *  the query parameters.
     * @return
     *  the found Definition IDs.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public QueryResults<String> findOvalDefinitionsId( QueryParams params );



    /**
     * Returns the number of OVAL Definitions Documents in the repository.
     *
     * @return
     *  the number of Definitions.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public long countOvalDefinitions();



    /**
     * Returns the number of OVAL Definitions Documents that match the specified query parameters.
     *
     * @param   params
     *  the query parameters.
     * @return
     *  the number of Definitions.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public long countOvalDefinitions( QueryParams params );



    /**
     * Saves the OVAL Definition Document object and the entities
     * which are contained in that document.
     *
     * @param   oval_defs
     *  the OVAL Definition Document object.
     * @return
     *  the ID of the object.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public String saveOvalDefinitions( OvalDefinitions oval_defs );

}
//
