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
@Table(name = "attachtypes")
@NamedQueries({
    @NamedQuery(name = "Attachtypes.findAll", query = "SELECT a FROM Attachtypes a"),
    @NamedQuery(name = "Attachtypes.findById", query = "SELECT a FROM Attachtypes a WHERE a.id = :id"),
    @NamedQuery(name = "Attachtypes.findByType", query = "SELECT a FROM Attachtypes a WHERE a.type = :type")})
public class Attachtypes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "type")
    private String type;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "attachtypeId", fetch = FetchType.LAZY)
    private Collection<Attaches> attachesCollection;

    public Attachtypes() {
    }

    public Attachtypes(Integer id) {
        this.id = id;
    }

    public Attachtypes(Integer id, String type) {
        this.id = id;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Collection<Attaches> getAttachesCollection() {
        return attachesCollection;
    }

    public void setAttachesCollection(Collection<Attaches> attachesCollection) {
        this.attachesCollection = attachesCollection;
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
        if (!(object instanceof Attachtypes)) {
            return false;
        }
        Attachtypes other = (Attachtypes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.uesfmo.postgrados.models.Attachtypes[ id=" + id + " ]";
    }
    
}
