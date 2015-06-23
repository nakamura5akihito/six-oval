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

import io.opensec.six.oval.model.OvalObject;
import io.opensec.util.persist.Persistable;
import io.opensec.util.repository.QueryParams;
import java.util.List;



/**
 * A prescription for the low-level persistent storage operations
 * for the OVAL Domain Model objects.
 * Example storage systems are relational databases, NoSQL databases,
 * and file systems.
 * <p>
 * The classes of the objects that can be persisted MUST implement the
 * <code>Persistable</code> interface, in addition to the <code>OvalObject</code>.
 * That is, every object in the storage has a persistent identifier.
 * If a relational database is used as the storage,
 * the identifier corresponds to the primary key.
 * </p>
 *
 * @author  Akihito Nakamura, AIST
 */
public interface OvalDatabase
{

    /**
     * Loads the object of the specified identifier.
     * If no such object exists in the storage, this method returns null.
     *
     * @param   type
     *  the type of the object.
     * @param   id
     *  the identifier of the object.
     * @return
     *  the object if exists, or null otherwise.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public <K, T extends Persistable<K> & OvalObject>
    T findById( Class<T> type, K id );



    /**
     * Loads all the objects of the specified type.
     *
     * @param   type
     *  the type of the object.
     * @return
     *  all the objects of the specified type.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public <K, T extends Persistable<K> & OvalObject>
    List<T> find( Class<T> type );



    /**
     * Searches for the objects that match the specified query parameters.
     *
     * @param   type
     *  the type of the object.
     * @param   params
     *  the parameters to select the objects.
     * @return
     *  all the objects of the specified type.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public <K, T extends Persistable<K> & OvalObject>
    List<T> find( Class<T> type, QueryParams params );



    /**
     * Returns identifiers of all the objects of the specified type.
     *
     * @param   type
     *  the type of the object.
     * @return
     *  the identifiers of all the objects.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public <K, T extends Persistable<K> & OvalObject>
    List<K> findId( Class<T> type );



    /**
     * Searches for the identifiers of the objects that match the specified query parameters.
     *
     * @param   type
     *  the type of the object.
     * @param   params
     *  the parameters to select the objects.
     * @return
     *  the identifiers of all the objects.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public <K, T extends Persistable<K> & OvalObject>
    List<K> findId( Class<T> type, QueryParams params );



    /**
     * Counts the number of all the objects of the specified type.
     *
     * @param   type
     *  the type of the object.
     * @return
     *  the number of the objects.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public <K, T extends Persistable<K> & OvalObject>
    long count( Class<T> type );



    /**
     * Counts the number of the objects that match the specified query parameters.
     *
     * @param   type
     *  the type of the object.
     * @param   params
     *  the parameters to select the objects.
     * @return
     *  the number of the objects.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public <K, T extends Persistable<K> & OvalObject>
    long count( Class<T> type, QueryParams params );



    /**
     * Saves the object, either inserting or updating the existing one.
     *
     * @param   type
     *  the type of the object.
     * @param   object
     *  the object.
     * @return
     *  the identifier of the object.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public <K, T extends Persistable<K> & OvalObject>
    K save( Class<T> type, T object );



    /**
     * Removes the object of the specified identifier.
     * If no such object exists, this method returns immediately without any exception.
     *
     * @param   type
     *  the type of the object.
     * @param   id
     *  the identifier of the object.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public <K, T extends Persistable<K> & OvalObject>
    void deleteById( Class<T> type, K id );



    /**
     * Removes all the object of the specified type.
     *
     * @param   type
     *  the type of the object.
     * @throws  OvalRepositoryException
     *  when an exceptional condition occurred during the OVAL repository processing.
     */
    public <K, T extends Persistable<K> & OvalObject>
    void delete( Class<T> type );

}
//
