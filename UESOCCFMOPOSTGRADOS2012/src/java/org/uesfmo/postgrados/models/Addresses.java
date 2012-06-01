/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uesfmo.postgrados.models;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author benjamin
 */
@Named
@RequestScoped
@Entity
@Table(name = "addresses")
@NamedQueries({
    @NamedQuery(name = "Addresses.findAll", query = "SELECT a FROM Addresses a"),
    @NamedQuery(name = "Addresses.findById", query = "SELECT a FROM Addresses a WHERE a.id = :id"),
    @NamedQuery(name = "Addresses.findByAddress", query = "SELECT a FROM Addresses a WHERE a.address = :address"),
    @NamedQuery(name = "Addresses.findLastId", query = "SELECT max(a.id) FROM Addresses a")
})
public class Addresses implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "address")
    private String address;
    @JoinColumn(name = "validitystatus_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Validitystatus validitystatusId;
    @JoinColumn(name = "people_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private People peopleId;
    @JoinColumn(name = "addresstype_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Addresstypes addresstypeId;

    public Addresses() {
    }

    public Addresses(Integer id) {
        this.id = id;
    }

    public Addresses(Integer id, String address) {
        this.id = id;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Validitystatus getValiditystatusId() {
        return validitystatusId;
    }

    public void setValiditystatusId(Validitystatus validitystatusId) {
        this.validitystatusId = validitystatusId;
    }

    public People getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(People peopleId) {
        this.peopleId = peopleId;
    }

    public Addresstypes getAddresstypeId() {
        return addresstypeId;
    }

    public void setAddresstypeId(Addresstypes addresstypeId) {
        this.addresstypeId = addresstypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Addresses)) {
            return false;
        }
        Addresses other = (Addresses) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.uesfmo.postgrados.models.Addresses[ id=" + id + " ]";
    }
    
}
