/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uesfmo.postgrados.jsf;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.ejb.EJB;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import org.uesfmo.postgrados.models.People;
import org.uesfmo.postgrados.models.Phonestypes;
import org.uesfmo.postgrados.persistence.dao.PeopleDao;

/**
 *
 * @author benjamin
 */
@ManagedBean
@ViewScoped
public class PeopleBean extends HttpServlet {

    @EJB
    private PeopleDao peoplesDao;
    private People people;
    private EntityManager entityManager;
    private Phonestypes phonetypes;

    /**
     * Creates a new instance of PeoplesBean
     */
    public PeopleBean() {
        //DATO CULTURAL: los ebj inyectados como el peopledao en esta clase, no se pueden ocupar en el constructor
    }

    @PostConstruct
    public void init() {
        //tiene q ser en un metodo q se llame luego del constructor, para eso le pones al metodo @PostConstruct
        //tiene q retornar void, y no recibir parametros
        //aca si ya podes ocupar los ebjs       
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }
    
    @Inject
    People injpeople;
    
    public void getbyquery() {
        //System.out.println("VALOR DE PHONTE TYPE"  + injpt.getId() );
        List<People> peoples = new LinkedList<People>();
        SecurityBean sb = new SecurityBean();
        try {
            peoples = peoplesDao.getbyquery(injpeople.getEmail(), injpeople.getPassword());
            if (peoples.size() == 1) {
                int people_id = peoples.get(0).getId();
                peoplesDao.SaveSession(peoples.get(0));
                
                
                

                
                //if(peoplesDao.existSomeValidityAddress(people_invasorsid) == false) {
                FacesContext.getCurrentInstance().getExternalContext().redirect("../binf/basicinformation.xhtml");
                //}
                //FacesContext.getCurrentInstance().getExternalContext().redirect("../binf/educationinformation.xhtml");

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
