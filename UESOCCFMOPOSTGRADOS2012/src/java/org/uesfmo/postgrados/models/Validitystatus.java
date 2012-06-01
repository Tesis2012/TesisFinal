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
@Table(name = "validitystatus")
@NamedQueries({
    @NamedQuery(name = "Validitystatus.findAll", query = "SELECT v FROM Validitystatus v"),
    @NamedQuery(name = "Validitystatus.findById", query = "SELECT v FROM Validitystatus v WHERE v.id = :id"),
    @NamedQuery(name = "Validitystatus.findByStatus", query = "SELECT v FROM Validitystatus v WHERE v.status = :status")})
public class Validitystatus implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "status")
    private String status;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "validitystatusId", fetch = FetchType.LAZY)
    private Collection<Posts> postsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "validitystatusId", fetch = FetchType.LAZY)
    private Collection<Messages> messagesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "validitystatusId", fetch = FetchType.LAZY)
    private Collection<Postgroups> postgroupsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "validitystatusId", fetch = FetchType.LAZY)
    private Collection<Commentsgroups> commentsgroupsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "validitystatusId", fetch = FetchType.LAZY)
    private Collection<Names> namesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "validitystatusId", fetch = FetchType.LAZY)
    private Collection<Addresses> addressesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "validitystatusId", fetch = FetchType.LAZY)
    private Collection<Comments> commentsCollection;

    public Validitystatus() {
    }

    public Validitystatus(Integer id) {
        this.id = id;
    }

    public Validitystatus(Integer id, String status) {
        this.id = id;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Collection<Posts> getPostsCollection() {
        return postsCollection;
    }

    public void setPostsCollection(Collection<Posts> postsCollection) {
        this.postsCollection = postsCollection;
    }

    public Collection<Messages> getMessagesCollection() {
        return messagesCollection;
    }

    public void setMessagesCollection(Collection<Messages> messagesCollection) {
        this.messagesCollection = messagesCollection;
    }

    public Collection<Postgroups> getPostgroupsCollection() {
        return postgroupsCollection;
    }

    public void setPostgroupsCollection(Collection<Postgroups> postgroupsCollection) {
        this.postgroupsCollection = postgroupsCollection;
    }

    public Collection<Commentsgroups> getCommentsgroupsCollection() {
        return commentsgroupsCollection;
    }

    public void setCommentsgroupsCollection(Collection<Commentsgroups> commentsgroupsCollection) {
        this.commentsgroupsCollection = commentsgroupsCollection;
    }

    public Collection<Names> getNamesCollection() {
        return namesCollection;
    }

    public void setNamesCollection(Collection<Names> namesCollection) {
        this.namesCollection = namesCollection;
    }

    public Collection<Addresses> getAddressesCollection() {
        return addressesCollection;
    }

    public void setAddressesCollection(Collection<Addresses> addressesCollection) {
        this.addressesCollection = addressesCollection;
    }

    public Collection<Comments> getCommentsCollection() {
        return commentsCollection;
    }

    public void setCommentsCollection(Collection<Comments> commentsCollection) {
        this.commentsCollection = commentsCollection;
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
        if (!(object instanceof Validitystatus)) {
            return false;
        }
        Validitystatus other = (Validitystatus) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.uesfmo.postgrados.models.Validitystatus[ id=" + id + " ]";
    }
    
}
