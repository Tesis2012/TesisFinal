/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uesfmo.postgrados.models;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 *
 * @author benjamin
 */
@Entity
@Table(name = "memberships")
@NamedQueries({
    @NamedQuery(name = "Memberships.findAll", query = "SELECT m FROM Memberships m"),
    @NamedQuery(name = "Memberships.findById", query = "SELECT m FROM Memberships m WHERE m.id = :id")})
public class Memberships implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "people_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private People peopleId;
    @JoinColumn(name = "group_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Groups groupId;

    public Memberships() {
    }

    public Memberships(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public People getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(People peopleId) {
        this.peopleId = peopleId;
    }

    public Groups getGroupId() {
        return groupId;
    }

    public void setGroupId(Groups groupId) {
        this.groupId = groupId;
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
        if (!(object instanceof Memberships)) {
            return false;
        }
        Memberships other = (Memberships) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.uesfmo.postgrados.models.Memberships[ id=" + id + " ]";
    }
    
}
