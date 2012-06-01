/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uesfmo.postgrados.models;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author benjamin
 */
@Entity
@Table(name = "addresstypes")
@NamedQueries({
    @NamedQuery(name = "Addresstypes.findAll", query = "SELECT a FROM Addresstypes a"),
    @NamedQuery(name = "Addresstypes.findById", query = "SELECT a FROM Addresstypes a WHERE a.id = :id"),
    @NamedQuery(name = "Addresstypes.findByAddresstype", query = "SELECT a FROM Addresstypes a WHERE a.addresstype = :addresstype")})
public class Addresstypes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "addresstype")
    private String addresstype;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "addresstypeId", fetch = FetchType.LAZY)
    private Collection<Addresses> addressesCollection;

    public Addresstypes() {
    }

    public Addresstypes(Integer id) {
        this.id = id;
    }

    public Addresstypes(Integer id, String addresstype) {
        this.id = id;
        this.addresstype = addresstype;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddresstype() {
        return addresstype;
    }

    public void setAddresstype(String addresstype) {
        this.addresstype = addresstype;
    }

    public Collection<Addresses> getAddressesCollection() {
        return addressesCollection;
    }

    public void setAddressesCollection(Collection<Addresses> addressesCollection) {
        this.addressesCollection = addressesCollection;
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
        if (!(object instanceof Addresstypes)) {
            return false;
        }
        Addresstypes other = (Addresstypes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.uesfmo.postgrados.models.Addresstypes[ id=" + id + " ]";
    }
    
}
