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
@Table(name = "messages")
@NamedQueries({
    @NamedQuery(name = "Messages.findAll", query = "SELECT m FROM Messages m"),
    @NamedQuery(name = "Messages.findById", query = "SELECT m FROM Messages m WHERE m.id = :id"),
    @NamedQuery(name = "Messages.findByMessage", query = "SELECT m FROM Messages m WHERE m.message = :message")})
public class Messages implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 400)
    @Column(name = "message")
    private String message;
    @JoinColumn(name = "validitystatus_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Validitystatus validitystatusId;
    @JoinColumn(name = "peoplereceiver", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private People peoplereceiver;
    @JoinColumn(name = "peoplesender", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private People peoplesender;

    public Messages() {
    }

    public Messages(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Validitystatus getValiditystatusId() {
        return validitystatusId;
    }

    public void setValiditystatusId(Validitystatus validitystatusId) {
        this.validitystatusId = validitystatusId;
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
        if (!(object instanceof Messages)) {
            return false;
        }
        Messages other = (Messages) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.uesfmo.postgrados.models.Messages[ id=" + id + " ]";
    }
    
}
