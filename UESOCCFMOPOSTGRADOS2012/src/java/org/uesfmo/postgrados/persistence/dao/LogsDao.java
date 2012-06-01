/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uesfmo.postgrados.persistence.dao;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.uesfmo.postgrados.models.Logs;
import org.uesfmo.postgrados.models.People;
import org.uesfmo.postgrados.persistence.Dao;

/**
 *
 * @author benjamin
 */

@Stateless
@LocalBean
@Named
public class LogsDao {
    
    @EJB
    private Dao dao;
    
    @PersistenceContext
    private EntityManager entityManager;
       

}
