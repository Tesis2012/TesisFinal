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
@Table(name = "commentsgroups")
@NamedQueries({
    @NamedQuery(name = "Commentsgroups.findAll", query = "SELECT c FROM Commentsgroups c"),
    @NamedQuery(name = "Commentsgroups.findById", query = "SELECT c FROM Commentsgroups c WHERE c.id = :id"),
    @NamedQuery(name = "Commentsgroups.findByCommentpostgroup", query = "SELECT c FROM Commentsgroups c WHERE c.commentpostgroup = :commentpostgroup")})
public class Commentsgroups implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "commentpostgroup")
    private String commentpostgroup;
    @JoinColumn(name = "validitystatus_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Validitystatus validitystatusId;
    @JoinColumn(name = "people_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private People peopleId;
    @JoinColumn(name = "post_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private People postId;

    public Commentsgroups() {
    }

    public Commentsgroups(Integer id) {
        this.id = id;
    }

    public Commentsgroups(Integer id, String commentpostgroup) {
        this.id = id;
        this.commentpostgroup = commentpostgroup;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommentpostgroup() {
        return commentpostgroup;
    }

    public void setCommentpostgroup(String commentpostgroup) {
        this.commentpostgroup = commentpostgroup;
    }

    public Validitystatus getValiditystatusId() {
        return validitystatusId;
    }

    public void setValiditystatusId(Validitystatus validitystatusId) {
        this.validitystatusId = validitystatusId;
    }

    public People getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(People peopleId) {
        this.peopleId = peopleId;
    }

    public People getPostId() {
        return postId;
    }

    public void setPostId(People postId) {
        this.postId = postId;
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
        if (!(object instanceof Commentsgroups)) {
            return false;
        }
        Commentsgroups other = (Commentsgroups) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.uesfmo.postgrados.models.Commentsgroups[ id=" + id + " ]";
    }
    
}
