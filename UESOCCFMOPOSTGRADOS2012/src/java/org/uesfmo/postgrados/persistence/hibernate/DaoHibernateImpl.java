/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uesfmo.postgrados.persistence.hibernate;

import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.hibernate.ejb.HibernateEntityManager;
import org.uesfmo.postgrados.persistence.Dao;
/**
 *
 * @author benjamin
 */
public class DaoHibernateImpl implements Dao {
    @PersistenceContext(unitName = "UESOCCFMOPOSTGRADOS2012PU")
    protected EntityManager entityManager;

    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public void save(Object entity) throws Exception {
        entityManager.persist(entity);
    }

    @Override
    public void update(Object entity) throws Exception {
        entityManager.merge(entity);
    }

    @Override
    public void delete(Object entity) throws Exception {
        entityManager.remove(entity);
    }

    @Override
    public <T> T findById(Class<T> entityClass, Object id) throws Exception {
        return entityManager.find(entityClass, id);
    }

    @Override
    public <T> List<T> getAll(Class<T> entityClass) throws Exception {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> cq = cb.createQuery(entityClass);
        cq.select(cq.from(entityClass));
        return entityManager.createQuery(cq).getResultList();
    }

    @Override
    public <T> List<T> findByExample(T entity) throws Exception {
        //este metodo incluye codigo propio de hibernate, fuera del estandar de JPA
//        Session session = ((EntityManagerImpl) getEntityManager().getDelegate()).getSession();
        Session session = entityManager.unwrap(HibernateEntityManager.class).getSession();  //obtener el session de hibernate
        List<T> results = session.createCriteria(entity.getClass()).add(Example.create(entity)).list();
        return results;
    }

    @Override
    public <T> List<T> getResultList(String namedQuery, Map<String, Object> parameters) throws Exception {
        Query query = entityManager.createNamedQuery(namedQuery);
        for (Map.Entry<String, Object> param : parameters.entrySet()) {
            query.setParameter(param.getKey(), param.getValue());
        }
        List resultList = query.getResultList();
        return resultList;
    }

    @Override
    public boolean checkByExample(Object entity) throws Exception {
        Session session = entityManager.unwrap(HibernateEntityManager.class).getSession();
        Criteria c = session.createCriteria(entity.getClass());
        c.add(Example.create(entity));
        c.setFetchSize(1);
        //c.setFirstResult(i)
        Object result = c.uniqueResult();
        if (result != null) {
            return true;
        } else {
            return false;
        }
    }
}
