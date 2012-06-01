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
@Table(name = "petitions")
@NamedQueries({
    @NamedQuery(name = "Petitions.findAll", query = "SELECT p FROM Petitions p"),
    @NamedQuery(name = "Petitions.findById", query = "SELECT p FROM Petitions p WHERE p.id = :id"),
    @NamedQuery(name = "Petitions.findByStatuspetitionId", query = "SELECT p FROM Petitions p WHERE p.statuspetitionId = :statuspetitionId")})
public class Petitions implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "statuspetition_id")
    private int statuspetitionId;
    @JoinColumn(name = "peoplereceiver", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private People peoplereceiver;
    @JoinColumn(name = "peoplesender", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private People peoplesender;

    public Petitions() {
    }

    public Petitions(Integer id) {
        this.id = id;
    }

    public Petitions(Integer id, int statuspetitionId) {
        this.id = id;
        this.statuspetitionId = statuspetitionId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getStatuspetitionId() {
        return statuspetitionId;
    }

    public void setStatuspetitionId(int statuspetitionId) {
        this.statuspetitionId = statuspetitionId;
    }

    public People getPeoplereceiver() {
        return peoplereceiver;
    }

    public void setPeoplereceiver(People peoplereceiver) {
        this.peoplereceiver = peoplereceiver;
    }

    public People getPeoplesender() {
        return peoplesender;
    }

    public void setPeoplesender(People peoplesender) {
        this.peoplesender = peoplesender;
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
        if (!(object instanceof Petitions)) {
            return false;
        }
        Petitions other = (Petitions) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.uesfmo.postgrados.models.Petitions[ id=" + id + " ]";
    }
    
}
