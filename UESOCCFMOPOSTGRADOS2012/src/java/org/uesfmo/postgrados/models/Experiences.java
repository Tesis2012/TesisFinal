/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uesfmo.postgrados.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author benjamin
 */
@Entity
@Table(name = "experiences")
@NamedQueries({
    @NamedQuery(name = "Experiences.findAll", query = "SELECT e FROM Experiences e"),
    @NamedQuery(name = "Experiences.findById", query = "SELECT e FROM Experiences e WHERE e.id = :id"),
    @NamedQuery(name = "Experiences.findByWorkplace", query = "SELECT e FROM Experiences e WHERE e.workplace = :workplace"),
    @NamedQuery(name = "Experiences.findByDescription", query = "SELECT e FROM Experiences e WHERE e.description = :description"),
    @NamedQuery(name = "Experiences.findByBegindate", query = "SELECT e FROM Experiences e WHERE e.begindate = :begindate"),
    @NamedQuery(name = "Experiences.findByEnddate", query = "SELECT e FROM Experiences e WHERE e.enddate = :enddate")})
public class Experiences implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "workplace")
    private String workplace;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "description")
    private String description;
    @Column(name = "begindate")
    @Temporal(TemporalType.DATE)
    private Date begindate;
    @Column(name = "enddate")
    @Temporal(TemporalType.DATE)
    private Date enddate;
    @JoinColumn(name = "people_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private People peopleId;
    @JoinColumn(name = "job_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Jobs jobId;

    public Experiences() {
    }

    public Experiences(Integer id) {
        this.id = id;
    }

    public Experiences(Integer id, String workplace, String description) {
        this.id = id;
        this.workplace = workplace;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getBegindate() {
        return begindate;
    }

    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public People getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(People peopleId) {
        this.peopleId = peopleId;
    }

    public Jobs getJobId() {
        return jobId;
    }

    public void setJobId(Jobs jobId) {
        this.jobId = jobId;
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
        if (!(object instanceof Experiences)) {
            return false;
        }
        Experiences other = (Experiences) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.uesfmo.postgrados.models.Experiences[ id=" + id + " ]";
    }
    
}
