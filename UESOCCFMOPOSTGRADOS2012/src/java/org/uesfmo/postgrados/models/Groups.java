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
@Table(name = "groups")
@NamedQueries({
    @NamedQuery(name = "Groups.findAll", query = "SELECT g FROM Groups g"),
    @NamedQuery(name = "Groups.findById", query = "SELECT g FROM Groups g WHERE g.id = :id"),
    @NamedQuery(name = "Groups.findByGroupname", query = "SELECT g FROM Groups g WHERE g.groupname = :groupname"),
    @NamedQuery(name = "Groups.findByIsactive", query = "SELECT g FROM Groups g WHERE g.isactive = :isactive")})
public class Groups implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "groupname")
    private String groupname;
    @Basic(optional = false)
    @NotNull
    @Column(name = "isactive")
    private boolean isactive;
    @JoinColumn(name = "people_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private People peopleId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "groupId", fetch = FetchType.LAZY)
    private Collection<Postgroups> postgroupsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "groupId", fetch = FetchType.LAZY)
    private Collection<Memberships> membershipsCollection;

    public Groups() {
    }

    public Groups(Integer id) {
        this.id = id;
    }

    public Groups(Integer id, String groupname, boolean isactive) {
        this.id = id;
        this.groupname = groupname;
        this.isactive = isactive;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public boolean getIsactive() {
        return isactive;
    }

    public void setIsactive(boolean isactive) {
        this.isactive = isactive;
    }

    public People getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(People peopleId) {
        this.peopleId = peopleId;
    }

    public Collection<Postgroups> getPostgroupsCollection() {
        return postgroupsCollection;
    }

    public void setPostgroupsCollection(Collection<Postgroups> postgroupsCollection) {
        this.postgroupsCollection = postgroupsCollection;
    }

    public Collection<Memberships> getMembershipsCollection() {
        return membershipsCollection;
    }

    public void setMembershipsCollection(Collection<Memberships> membershipsCollection) {
        this.membershipsCollection = membershipsCollection;
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
        if (!(object instanceof Groups)) {
            return false;
        }
        Groups other = (Groups) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.uesfmo.postgrados.models.Groups[ id=" + id + " ]";
    }
    
}
