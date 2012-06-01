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
@Table(name = "peopletypes")
@NamedQueries({
    @NamedQuery(name = "Peopletypes.findAll", query = "SELECT p FROM Peopletypes p"),
    @NamedQuery(name = "Peopletypes.findById", query = "SELECT p FROM Peopletypes p WHERE p.id = :id"),
    @NamedQuery(name = "Peopletypes.findByPeopletype", query = "SELECT p FROM Peopletypes p WHERE p.peopletype = :peopletype")})
public class Peopletypes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "peopletype")
    private String peopletype;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "peopletypeId", fetch = FetchType.LAZY)
    private Collection<People> peopleCollection;

    public Peopletypes() {
    }

    public Peopletypes(Integer id) {
        this.id = id;
    }

    public Peopletypes(Integer id, String peopletype) {
        this.id = id;
        this.peopletype = peopletype;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPeopletype() {
        return peopletype;
    }

    public void setPeopletype(String peopletype) {
        this.peopletype = peopletype;
    }

    public Collection<People> getPeopleCollection() {
        return peopleCollection;
    }

    public void setPeopleCollection(Collection<People> peopleCollection) {
        this.peopleCollection = peopleCollection;
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
        if (!(object instanceof Peopletypes)) {
            return false;
        }
        Peopletypes other = (Peopletypes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.uesfmo.postgrados.models.Peopletypes[ id=" + id + " ]";
    }
    
}
