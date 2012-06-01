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
@Table(name = "titletypes")
@NamedQueries({
    @NamedQuery(name = "Titletypes.findAll", query = "SELECT t FROM Titletypes t"),
    @NamedQuery(name = "Titletypes.findById", query = "SELECT t FROM Titletypes t WHERE t.id = :id"),
    @NamedQuery(name = "Titletypes.findByTitletype", query = "SELECT t FROM Titletypes t WHERE t.titletype = :titletype")})
public class Titletypes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "titletype")
    private String titletype;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "titletypeId", fetch = FetchType.LAZY)
    private Collection<Education> educationCollection;

    public Titletypes() {
    }

    public Titletypes(Integer id) {
        this.id = id;
    }

    public Titletypes(Integer id, String titletype) {
        this.id = id;
        this.titletype = titletype;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitletype() {
        return titletype;
    }

    public void setTitletype(String titletype) {
        this.titletype = titletype;
    }

    public Collection<Education> getEducationCollection() {
        return educationCollection;
    }

    public void setEducationCollection(Collection<Education> educationCollection) {
        this.educationCollection = educationCollection;
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
        if (!(object instanceof Titletypes)) {
            return false;
        }
        Titletypes other = (Titletypes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.uesfmo.postgrados.models.Titletypes[ id=" + id + " ]";
    }
    
}
