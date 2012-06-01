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
@Table(name = "statuspetions")
@NamedQueries({
    @NamedQuery(name = "Statuspetions.findAll", query = "SELECT s FROM Statuspetions s"),
    @NamedQuery(name = "Statuspetions.findById", query = "SELECT s FROM Statuspetions s WHERE s.id = :id"),
    @NamedQuery(name = "Statuspetions.findByStatuspetition", query = "SELECT s FROM Statuspetions s WHERE s.statuspetition = :statuspetition")})
public class Statuspetions implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "statuspetition")
    private String statuspetition;

    public Statuspetions() {
    }

    public Statuspetions(Integer id) {
        this.id = id;
    }

    public Statuspetions(Integer id, String statuspetition) {
        this.id = id;
        this.statuspetition = statuspetition;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatuspetition() {
        return statuspetition;
    }

    public void setStatuspetition(String statuspetition) {
        this.statuspetition = statuspetition;
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
        if (!(object instanceof Statuspetions)) {
            return false;
        }
        Statuspetions other = (Statuspetions) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.uesfmo.postgrados.models.Statuspetions[ id=" + id + " ]";
    }
    
}
