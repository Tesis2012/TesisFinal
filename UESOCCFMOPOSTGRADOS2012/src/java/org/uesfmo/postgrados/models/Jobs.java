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
@Table(name = "jobs")
@NamedQueries({
    @NamedQuery(name = "Jobs.findAll", query = "SELECT j FROM Jobs j"),
    @NamedQuery(name = "Jobs.findById", query = "SELECT j FROM Jobs j WHERE j.id = :id"),
    @NamedQuery(name = "Jobs.findByJob", query = "SELECT j FROM Jobs j WHERE j.job = :job")})
public class Jobs implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "job")
    private String job;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "jobId", fetch = FetchType.LAZY)
    private Collection<Experiences> experiencesCollection;

    public Jobs() {
    }

    public Jobs(Integer id) {
        this.id = id;
    }

    public Jobs(Integer id, String job) {
        this.id = id;
        this.job = job;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Collection<Experiences> getExperiencesCollection() {
        return experiencesCollection;
    }

    public void setExperiencesCollection(Collection<Experiences> experiencesCollection) {
        this.experiencesCollection = experiencesCollection;
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
        if (!(object instanceof Jobs)) {
            return false;
        }
        Jobs other = (Jobs) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.uesfmo.postgrados.models.Jobs[ id=" + id + " ]";
    }
    
}
