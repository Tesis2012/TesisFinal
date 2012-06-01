/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uesfmo.postgrados.persistence;

import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;

/**
 *
 * @author benjamin
 */
public interface Dao {
    
      /**
     *
     * @return
     */
  
    
    EntityManager getEntityManager();

    /**
     * Guarda una instancia de la entidad
     *
     * @param entity instancia de la entidad
     * @throws Exception
     */
    void save(Object entity) throws Exception;

    /**
     * Actualiza una instancia de la entidad
     *
     * @param entity instancia de la entidad
     * @throws Exception
     */
    void update(Object entity) throws Exception;

    /**
     * Elimina una instancia de la entidad
     *
     * @param entity instancia de la entidad
     * @throws Exception
     */
    void delete(Object entity) throws Exception;

    /**
     * Busca una entidad por su llave primaria
     *
     * @param entityClass
     * @param id llave primaria
     * @return la instancia encontrada de la entidad o null si la entidad no
     * existe
     * @throws Exception
     */
    <T> T findById(Class<T> entityClass, Object id) throws Exception;

    /**
     * Busca entidades que sean como la entidad especificada
     *
     * @param entityClass
     * @param entity instancia "ejemplo" de la entidad
     * @return Las entidades que son como la instancia "ejemplo"
     * @throws Exception
     */
    <T> List<T> findByExample(T entity) throws Exception;

    /**
     * Obtiene todas las entidades de una clase especifica
     *
     * @param entityClass
     * @return
     * @throws Exception
     */
    <T> List<T> getAll(Class<T> entityClass) throws Exception;

    /**
     * Obtiene el resultado de la named query especificada
     *
     * @param namedQuery el nombre de la query
     * @param parameters los parametros nombrados de la query
     * @return La lista de objetos
     * @throws Exception
     */
    <T> List<T> getResultList(String namedQuery, Map<String, Object> parameters) throws Exception;

    /**
     * Chequea si la entidad ya existe
     *
     * @param entity
     * @return <code>true</code> si la entidad ya existe
     * @throws Exception
     */
    boolean checkByExample(Object entity) throws Exception;
}
