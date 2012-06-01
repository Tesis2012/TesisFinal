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
@Table(name = "comments")
@NamedQueries({
    @NamedQuery(name = "Comments.findAll", query = "SELECT c FROM Comments c"),
    @NamedQuery(name = "Comments.findById", query = "SELECT c FROM Comments c WHERE c.id = :id"),
    @NamedQuery(name = "Comments.findByComment", query = "SELECT c FROM Comments c WHERE c.comment = :comment")})
public class Comments implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "comment")
    private String comment;
    @JoinColumn(name = "validitystatus_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Validitystatus validitystatusId;
    @JoinColumn(name = "post_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Posts postId;
    @JoinColumn(name = "people_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private People peopleId;

    public Comments() {
    }

    public Comments(Integer id) {
        this.id = id;
    }

    public Comments(Integer id, String comment) {
        this.id = id;
        this.comment = comment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Validitystatus getValiditystatusId() {
        return validitystatusId;
    }

    public void setValiditystatusId(Validitystatus validitystatusId) {
        this.validitystatusId = validitystatusId;
    }

    public Posts getPostId() {
        return postId;
    }

    public void setPostId(Posts postId) {
        this.postId = postId;
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
        if (!(object instanceof Comments)) {
            return false;
        }
        Comments other = (Comments) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.uesfmo.postgrados.models.Comments[ id=" + id + " ]";
    }
    
}
