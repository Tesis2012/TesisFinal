/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uesfmo.postgrados.models;

import java.io.Serializable;
import java.util.Date;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author benjamin
 */
@Named
@RequestScoped
@Entity
@Table(name = "logs")
@NamedQueries({
    @NamedQuery(name = "Logs.findAll", query = "SELECT l FROM Logs l"),
    @NamedQuery(name = "Logs.findById", query = "SELECT l FROM Logs l WHERE l.id = :id"),
    @NamedQuery(name = "Logs.findByDates", query = "SELECT l FROM Logs l WHERE l.dates = :dates"),
    @NamedQuery(name = "Logs.findByHour", query = "SELECT l FROM Logs l WHERE l.hour = :hour"),
    @NamedQuery(name = "Logs.findLastId", query = "SELECT max(l.id) FROM Logs l"),
    @NamedQuery(name = "Logs.findByJsessionid", query = "SELECT l FROM Logs l WHERE l.jsessionid = :jsessionid")
})
public class Logs implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Column(name = "dates")
    @Temporal(TemporalType.DATE)
    private Date dates;
    @Column(name = "hour")
    @Temporal(TemporalType.TIME)
    private Date hour;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "jsessionid")
    private String jsessionid;
    @JoinColumn(name = "people_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private People peopleId;

    public Logs() {
    }

    public Logs(Integer id) {
        this.id = id;
    }

    public Logs(Integer id, String jsessionid) {
        this.id = id;
        this.jsessionid = jsessionid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDates() {
        return dates;
    }

    public void setDates(Date dates) {
        this.dates = dates;
    }

    public Date getHour() {
        return hour;
    }

    public void setHour(Date hour) {
        this.hour = hour;
    }

    public String getJsessionid() {
        return jsessionid;
    }

    public void setJsessionid(String jsessionid) {
        this.jsessionid = jsessionid;
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
        if (!(object instanceof Logs)) {
            return false;
        }
        Logs other = (Logs) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.uesfmo.postgrados.models.Logs[ id=" + id + " ]";
    }
    
}
