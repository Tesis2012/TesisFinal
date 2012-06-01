/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uesfmo.postgrados.models;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author benjamin
 */
@Entity
@Table(name = "privacylevels")
@NamedQueries({
    @NamedQuery(name = "Privacylevels.findAll", query = "SELECT p FROM Privacylevels p"),
    @NamedQuery(name = "Privacylevels.findById", query = "SELECT p FROM Privacylevels p WHERE p.id = :id"),
    @NamedQuery(name = "Privacylevels.findByLevel", query = "SELECT p FROM Privacylevels p WHERE p.level = :level")})
public class Privacylevels implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "level")
    private String level;

    public Privacylevels() {
    }

    public Privacylevels(Integer id) {
        this.id = id;
    }

    public Privacylevels(Integer id, String level) {
        this.id = id;
        this.level = level;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
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
        if (!(object instanceof Privacylevels)) {
            return false;
        }
        Privacylevels other = (Privacylevels) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.uesfmo.postgrados.models.Privacylevels[ id=" + id + " ]";
    }
    
}
