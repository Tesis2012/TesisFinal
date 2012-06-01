/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uesfmo.postgrados.jsf;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import org.uesfmo.postgrados.models.Logs;
import org.uesfmo.postgrados.models.People;
import org.uesfmo.postgrados.persistence.dao.LogsDao;
import org.uesfmo.postgrados.persistence.dao.PeopleDao;

/**
 *
 * @author benjamin
 */

@ManagedBean
@ViewScoped
public class SecurityBean extends HttpServlet {

    /**
     * Creates a new instance of SecurityBean
     */
    @EJB
    private LogsDao logsDao;
    @EJB
    private PeopleDao peopleDao;
    @PersistenceContext
    private EntityManager entityManager;
    
    public SecurityBean() {
    }
    
    

}
