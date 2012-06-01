/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uesfmo.postgrados.models;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 *
 * @author benjamin
 */
@Entity
@Table(name = "friendships")
@NamedQueries({
    @NamedQuery(name = "Friendships.findAll", query = "SELECT f FROM Friendships f"),
    @NamedQuery(name = "Friendships.findById", query = "SELECT f FROM Friendships f WHERE f.id = :id")})
public class Friendships implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "friends", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private People friends;
    @JoinColumn(name = "friendr", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private People friendr;

    public Friendships() {
    }

    public Friendships(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public People getFriends() {
        return friends;
    }

    public void setFriends(People friends) {
        this.friends = friends;
    }

    public People getFriendr() {
        return friendr;
    }

    public void setFriendr(People friendr) {
        this.friendr = friendr;
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
        if (!(object instanceof Friendships)) {
            return false;
        }
        Friendships other = (Friendships) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.uesfmo.postgrados.models.Friendships[ id=" + id + " ]";
    }
    
}
