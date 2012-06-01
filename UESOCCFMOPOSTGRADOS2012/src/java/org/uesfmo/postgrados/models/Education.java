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
@Table(name = "education")
@NamedQueries({
    @NamedQuery(name = "Education.findAll", query = "SELECT e FROM Education e"),
    @NamedQuery(name = "Education.findById", query = "SELECT e FROM Education e WHERE e.id = :id"),
    @NamedQuery(name = "Education.findByCareername", query = "SELECT e FROM Education e WHERE e.careername = :careername")})
public class Education implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "careername")
    private String careername;
    @JoinColumn(name = "titletype_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Titletypes titletypeId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "educationId", fetch = FetchType.LAZY)
    private Collection<Peopleeducation> peopleeducationCollection;

    public Education() {
    }

    public Education(Integer id) {
        this.id = id;
    }

    public Education(Integer id, String careername) {
        this.id = id;
        this.careername = careername;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCareername() {
        return careername;
    }

    public void setCareername(String careername) {
        this.careername = careername;
    }

    public Titletypes getTitletypeId() {
        return titletypeId;
    }

    public void setTitletypeId(Titletypes titletypeId) {
        this.titletypeId = titletypeId;
    }

    public Collection<Peopleeducation> getPeopleeducationCollection() {
        return peopleeducationCollection;
    }

    public void setPeopleeducationCollection(Collection<Peopleeducation> peopleeducationCollection) {
        this.peopleeducationCollection = peopleeducationCollection;
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
        if (!(object instanceof Education)) {
            return false;
        }
        Education other = (Education) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.uesfmo.postgrados.models.Education[ id=" + id + " ]";
    }
    
}
