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
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.uesfmo.postgrados.models.*;
import org.uesfmo.postgrados.persistence.Dao;

/**
 *
 * @author benjamin
 */
@Stateless
@LocalBean
@Named
public class InformationDao {

    @EJB
    private Dao dao;
    @PersistenceContext
    private EntityManager entityManager;

    public int getNextPhoneId() {
        try {
            int res = Integer.parseInt(entityManager.createNamedQuery("Phones.findLastId").getResultList().get(0).toString());
            return (res + 1);
        } catch (Exception ex) {
            ex.printStackTrace();
            return 1;
        }
    }

    public int getNextAddressId() {
        try {
            int res = Integer.parseInt(entityManager.createNamedQuery("Addresses.findLastId").getResultList().get(0).toString());
            return (res + 1);
        } catch (Exception ex) {
            ex.printStackTrace();
            return 1;
        }
    }
    
    public int getNextNameId() {
        try {
            int res = Integer.parseInt(entityManager.createNamedQuery("Names.findLastId").getResultList().get(0).toString());
            return (res + 1);
        } catch (Exception ex) {
            ex.printStackTrace();
            return 1;
        }
    }

    public void InsertInfo(int people_id, String fistname, String middlename, String lastname) {
        try {
            People people = (People) entityManager.createNamedQuery("People.findById").setParameter("id", people_id).getResultList().get(0);
            Validitystatus vstatus = (Validitystatus) entityManager.createNamedQuery("Validitystatus.findById").setParameter("id", 1).getResultList().get(0);
            Names name = new Names();
            name.setFirstname(fistname);
            name.setMiddlename(middlename);
            name.setLastname(lastname);
            name.setPeopleId(people);
            name.setValiditystatusId(vstatus);
            name.setId(getNextNameId());
            dao.save(name);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void InsertAddress(int people_id, String Address) {
        try {
            People people = (People) entityManager.createNamedQuery("People.findById").setParameter("id", people_id).getResultList().get(0);
            Validitystatus vstatus = (Validitystatus) entityManager.createNamedQuery("Validitystatus.findById").setParameter("id", 1).getResultList().get(0);
            Addresstypes atypes = (Addresstypes) entityManager.createNamedQuery("Addresstypes.findById").setParameter("id", 1).getResultList().get(0);
            Addresses address = new Addresses();
            address.setAddress(Address);
            address.setId(getNextAddressId());
            address.setPeopleId(people);
            address.setAddresstypeId(atypes);
            address.setValiditystatusId(vstatus);
            dao.save(address);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void savePhoneNumber(int people_id, String phoneNumer, int phonetype_id) {
        try {
            Phones phone = new Phones();
            People people = new People();
            people = dao.findById(People.class, people_id);
            Phonestypes phonestypes = new Phonestypes();
            phonestypes = dao.findById(Phonestypes.class, phonetype_id);
            phone.setPhone(phoneNumer);
            phone.setPeopleId(people);
            phone.setPhonetypeId(phonestypes);
            phone.setId(getNextPhoneId());
            dao.save(phone);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public List<Phones> getphonesNumbersForPeople(int people_id) {
        List<Phones> listOfPhones = new LinkedList<Phones>();
        try {
            People people = new People();
            people = dao.findById(People.class, people_id);
            listOfPhones = (List<Phones>) people.getPhonesCollection();
        } catch (Exception ex) {
        }
        return listOfPhones;
    }
}
