/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uesfmo.postgrados.persistence.dao;

import java.util.LinkedList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import org.uesfmo.postgrados.models.*;
import org.uesfmo.postgrados.persistence.Dao;
import javax.servlet.http.*;
import javax.faces.context.*;
/**
 *
 * @author benjamin
 */
@Stateless
@LocalBean
@Named
public class PeopleDao {

    @EJB
    private Dao dao;
    @PersistenceContext
    private EntityManager entityManager;

    public List<People> getbyquery(String email, String password) throws Exception {
        long i = 1l;
        List<People> a = entityManager.createNamedQuery("People.verificateLogin").setParameter("password", password).setParameter("email", email).getResultList();
        return a;
    }

    public int getNextLog() {
        try {
            int res = Integer.parseInt(entityManager.createNamedQuery("Logs.findLastId").getResultList().get(0).toString());
            return (res + 1);
        } catch (Exception ex) {
            ex.printStackTrace();
            return 1;
        }
    }

    public void SaveSession(People people) {
        LogsDao logsDao = null;
        Boolean resultado = false;
        try {
            int log_id = getNextLog();
            Logs logs = new Logs();
            logs.setId(log_id);
            logs.setPeopleId(people);
            logs.setJsessionid(getSession());
            dao.save(logs);
            GenerateCookie(log_id);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    protected void GenerateCookie(int log_id) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        Cookie iddUsuario = new Cookie("w32b889d", log_id + "");
        iddUsuario.setMaxAge (-10);
        iddUsuario.setPath("/");
        ((HttpServletResponse) facesContext.getExternalContext().getResponse()).addCookie(iddUsuario);
    }

    public static String getSession() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        String cookieName = null;
        Cookie cookie[] = ((HttpServletRequest) facesContext.getExternalContext().getRequest()).getCookies();

        if (cookie != null && cookie.length > 0) {
            for (int i = 0; i < cookie.length; i++) {
                cookieName = cookie[i].getName();
                if (cookieName.equals("JSESSIONID")) {
                    return (cookie[i].getValue());
                } else {
                    return "0";
                }
            }
        } else {
            return "0";
        }
        return "0";
    }

    public Boolean existSomeValidityAddress(int people_id) {
        try {
            People people = new People();
            people = dao.findById(People.class, people_id);
            if (people == null) {
                return false;
            }
            if (people != null) {
                return true;
            }
            return false;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public void GenerateCookieLogs(int people_id) {
        
    }
}
