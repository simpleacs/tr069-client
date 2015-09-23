/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simpleacs.tr069.ejb;

import java.util.List;

/**
 * AbstractFacade for Simple ACS
 *
 * @author Vunb
 */
public interface EntityFacadeRemote<E> {

    void create(E entity);

    /**
     * Create an instance managed and persistent.
     *
     * @param entity entity instance
     * @return
     */
    E createPersitent(E entity);

    /**
     * Update the state of the given entity into the current persistence context
     *
     * @param entity
     * @return
     */
    E update(E entity);

    /**
     *
     * Find by primary key. Search for an entity of the specified class and
     * primary key. If the entity instance is contained in the persistence
     * context, it is returned from there.
     *
     * @param id primary key
     * @return the found entity instance or null if the entity does not exist
     */
    E findById(Object id);

    /**
     * Find an entity by unique name
     *
     * @param name
     * @return
     */
    E findByName(Object name);

    /**
     * Remove an entity
     *
     * @param entity
     */
    void remove(E entity);

    /**
     *
     * @return a number of the results
     */
    int count();

    /**
     *
     * Execute a SELECT query and return the query results as an untyped List.
     *
     * @return a list of the results
     */
    List<E> findAll();

    /**
     *
     * Execute a SELECT query and return the query results as an untyped List.
     *
     * @param startPosition position of the first result, numbered from 0
     * @param maxResults maximum number of results to retrieve
     * @return a list of the results
     */
    List<E> findRange(int startPosition, int maxResults);

}
