/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uesfmo.postgrados.jsf;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import org.uesfmo.postgrados.models.*;
import org.uesfmo.postgrados.persistence.Dao;
import org.uesfmo.postgrados.persistence.dao.InformationDao;

/**
 *
 * @author benjamin
 */
@ManagedBean
@ViewScoped
public class InformationBean implements Serializable {

    /**
     * Creates a new instance of InformationBean
     */
    @EJB
    private InformationDao informationDao;
    
    private Names names;
    
    private Phones phones;

    public InformationBean() {
    }

    public Names getNames() {
        return names;
    }

    public void setNames(Names names) {
        this.names = names;
    }

    public Phones getPhones() {
        return phones;
    }

    public void setPhones(Phones phones) {
        this.phones = phones;
    }
    
    
    
    @EJB
    private Dao dao;
    @Inject
    Names injnames;
    @Inject
    Addresses injaddresses;
    @Inject
    Phones injphones;
    @Inject
    Phonestypes injphtypes;

    public void insertInfo() {
        try {
            //Obtener people_id de la cookie
            int people_id =3;
            informationDao.InsertInfo(people_id, injnames.getFirstname(), injnames.getMiddlename(), injnames.getLastname());
            informationDao.InsertAddress(people_id, injaddresses.getAddress());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public List<Phones> getphonesNumbersForPeople() {
        List<Phones> listOfPhones = new LinkedList<Phones>();
        try {
            //Leo la cookie y obtengo el peopleid
            int people_id = 3;
            listOfPhones = informationDao.getphonesNumbersForPeople(people_id);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return listOfPhones;
    }

    public void savePhoneNumber() {
        if(injphones.getPhone() != "" ) {
            informationDao.savePhoneNumber(3, injphones.getPhone(), injphtypes.getId());
            injphones.setPhone("");
        }
        else {
            
        }
    }
    
}
