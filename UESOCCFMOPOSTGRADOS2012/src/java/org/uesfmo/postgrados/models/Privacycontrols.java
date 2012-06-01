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
@Table(name = "privacycontrols")
@NamedQueries({
    @NamedQuery(name = "Privacycontrols.findAll", query = "SELECT p FROM Privacycontrols p"),
    @NamedQuery(name = "Privacycontrols.findById", query = "SELECT p FROM Privacycontrols p WHERE p.id = :id"),
    @NamedQuery(name = "Privacycontrols.findByPrivacylevelId", query = "SELECT p FROM Privacycontrols p WHERE p.privacylevelId = :privacylevelId")})
public class Privacycontrols implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "privacylevel_id")
    private int privacylevelId;
    @JoinColumn(name = "people_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private People peopleId;

    public Privacycontrols() {
    }

    public Privacycontrols(Integer id) {
        this.id = id;
    }

    public Privacycontrols(Integer id, int privacylevelId) {
        this.id = id;
        this.privacylevelId = privacylevelId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getPrivacylevelId() {
        return privacylevelId;
    }

    public void setPrivacylevelId(int privacylevelId) {
        this.privacylevelId = privacylevelId;
    }

    public People getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(People peopleId) {
        this.peopleId = peopleId;
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
        if (!(object instanceof Privacycontrols)) {
            return false;
        }
        Privacycontrols other = (Privacycontrols) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.uesfmo.postgrados.models.Privacycontrols[ id=" + id + " ]";
    }
    
}
