/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uesfmo.postgrados.jsf.home;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;
import org.uesfmo.postgrados.models.People;

/**
 *
 * @author benjamin
 */
@ManagedBean
@ViewScoped
public class HomeBean implements Serializable {

    @EJB
    private EntityManager entityManager;
    /**
     * Creates a new instance of HomeBean
     */
    public HomeBean() {
        
    }

    public Boolean getValidityLogin(String username, String password) throws Exception {
        Boolean res = false;
        try {
            List<People> a = (List<People>) entityManager.createNamedQuery("People.verificateLogin").setParameter("email", username).getResultList();
            if (a.size() == 1) {
                res = true;
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("-----------------------------------" + res.toString());
        return false;
    }
    
}
