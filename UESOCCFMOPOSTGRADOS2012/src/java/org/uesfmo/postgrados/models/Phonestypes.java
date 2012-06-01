/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uesfmo.postgrados.models;

import java.io.Serializable;
import java.util.Collection;
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
@Table(name = "phonestypes")
@NamedQueries({
    @NamedQuery(name = "Phonestypes.findAll", query = "SELECT p FROM Phonestypes p"),
    @NamedQuery(name = "Phonestypes.findById", query = "SELECT p FROM Phonestypes p WHERE p.id = :id"),
    @NamedQuery(name = "Phonestypes.findByPhonetype", query = "SELECT p FROM Phonestypes p WHERE p.phonetype = :phonetype")})
public class Phonestypes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "phonetype")
    private String phonetype;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "phonetypeId", fetch = FetchType.LAZY)
    private Collection<Phones> phonesCollection;

    public Phonestypes() {
    }

    public Phonestypes(Integer id) {
        this.id = id;
    }

    public Phonestypes(Integer id, String phonetype) {
        this.id = id;
        this.phonetype = phonetype;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhonetype() {
        return phonetype;
    }

    public void setPhonetype(String phonetype) {
        this.phonetype = phonetype;
    }

    public Collection<Phones> getPhonesCollection() {
        return phonesCollection;
    }

    public void setPhonesCollection(Collection<Phones> phonesCollection) {
        this.phonesCollection = phonesCollection;
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
        if (!(object instanceof Phonestypes)) {
            return false;
        }
        Phonestypes other = (Phonestypes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.uesfmo.postgrados.models.Phonestypes[ id=" + id + " ]";
    }
    
}
