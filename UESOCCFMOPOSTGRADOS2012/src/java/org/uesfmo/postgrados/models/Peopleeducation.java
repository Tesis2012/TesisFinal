/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uesfmo.postgrados.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 *
 * @author benjamin
 */
@Entity
@Table(name = "peopleeducation")
@NamedQueries({
    @NamedQuery(name = "Peopleeducation.findAll", query = "SELECT p FROM Peopleeducation p"),
    @NamedQuery(name = "Peopleeducation.findById", query = "SELECT p FROM Peopleeducation p WHERE p.id = :id"),
    @NamedQuery(name = "Peopleeducation.findByBegindate", query = "SELECT p FROM Peopleeducation p WHERE p.begindate = :begindate"),
    @NamedQuery(name = "Peopleeducation.findByStartdate", query = "SELECT p FROM Peopleeducation p WHERE p.startdate = :startdate")})
public class Peopleeducation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Column(name = "begindate")
    @Temporal(TemporalType.DATE)
    private Date begindate;
    @Column(name = "startdate")
    @Temporal(TemporalType.DATE)
    private Date startdate;
    @JoinColumn(name = "people_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private People peopleId;
    @JoinColumn(name = "education_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Education educationId;

    public Peopleeducation() {
    }

    public Peopleeducation(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getBegindate() {
        return begindate;
    }

    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public People getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(People peopleId) {
        this.peopleId = peopleId;
    }

    public Education getEducationId() {
        return educationId;
    }

    public void setEducationId(Education educationId) {
        this.educationId = educationId;
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
        if (!(object instanceof Peopleeducation)) {
            return false;
        }
        Peopleeducation other = (Peopleeducation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.uesfmo.postgrados.models.Peopleeducation[ id=" + id + " ]";
    }
    
}
