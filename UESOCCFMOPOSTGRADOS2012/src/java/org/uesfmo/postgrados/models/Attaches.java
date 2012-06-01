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
@Table(name = "attaches")
@NamedQueries({
    @NamedQuery(name = "Attaches.findAll", query = "SELECT a FROM Attaches a"),
    @NamedQuery(name = "Attaches.findById", query = "SELECT a FROM Attaches a WHERE a.id = :id"),
    @NamedQuery(name = "Attaches.findByAttachName", query = "SELECT a FROM Attaches a WHERE a.attachName = :attachName")})
public class Attaches implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "attach_name")
    private String attachName;
    @OneToMany(mappedBy = "attachId", fetch = FetchType.LAZY)
    private Collection<Posts> postsCollection;
    @OneToMany(mappedBy = "attachId", fetch = FetchType.LAZY)
    private Collection<Postgroups> postgroupsCollection;
    @JoinColumn(name = "people_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private People peopleId;
    @JoinColumn(name = "attachtype_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Attachtypes attachtypeId;

    public Attaches() {
    }

    public Attaches(Integer id) {
        this.id = id;
    }

    public Attaches(Integer id, String attachName) {
        this.id = id;
        this.attachName = attachName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAttachName() {
        return attachName;
    }

    public void setAttachName(String attachName) {
        this.attachName = attachName;
    }

    public Collection<Posts> getPostsCollection() {
        return postsCollection;
    }

    public void setPostsCollection(Collection<Posts> postsCollection) {
        this.postsCollection = postsCollection;
    }

    public Collection<Postgroups> getPostgroupsCollection() {
        return postgroupsCollection;
    }

    public void setPostgroupsCollection(Collection<Postgroups> postgroupsCollection) {
        this.postgroupsCollection = postgroupsCollection;
    }

    public People getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(People peopleId) {
        this.peopleId = peopleId;
    }

    public Attachtypes getAttachtypeId() {
        return attachtypeId;
    }

    public void setAttachtypeId(Attachtypes attachtypeId) {
        this.attachtypeId = attachtypeId;
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
        if (!(object instanceof Attaches)) {
            return false;
        }
        Attaches other = (Attaches) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.uesfmo.postgrados.models.Attaches[ id=" + id + " ]";
    }
    
}
