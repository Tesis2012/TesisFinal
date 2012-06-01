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
@Table(name = "postgroups")
@NamedQueries({
    @NamedQuery(name = "Postgroups.findAll", query = "SELECT p FROM Postgroups p"),
    @NamedQuery(name = "Postgroups.findById", query = "SELECT p FROM Postgroups p WHERE p.id = :id"),
    @NamedQuery(name = "Postgroups.findByPostgroup", query = "SELECT p FROM Postgroups p WHERE p.postgroup = :postgroup")})
public class Postgroups implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 400)
    @Column(name = "postgroup")
    private String postgroup;
    @JoinColumn(name = "validitystatus_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Validitystatus validitystatusId;
    @JoinColumn(name = "group_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Groups groupId;
    @JoinColumn(name = "attach_id", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Attaches attachId;

    public Postgroups() {
    }

    public Postgroups(Integer id) {
        this.id = id;
    }

    public Postgroups(Integer id, String postgroup) {
        this.id = id;
        this.postgroup = postgroup;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPostgroup() {
        return postgroup;
    }

    public void setPostgroup(String postgroup) {
        this.postgroup = postgroup;
    }

    public Validitystatus getValiditystatusId() {
        return validitystatusId;
    }

    public void setValiditystatusId(Validitystatus validitystatusId) {
        this.validitystatusId = validitystatusId;
    }

    public Groups getGroupId() {
        return groupId;
    }

    public void setGroupId(Groups groupId) {
        this.groupId = groupId;
    }

    public Attaches getAttachId() {
        return attachId;
    }

    public void setAttachId(Attaches attachId) {
        this.attachId = attachId;
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
        if (!(object instanceof Postgroups)) {
            return false;
        }
        Postgroups other = (Postgroups) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.uesfmo.postgrados.models.Postgroups[ id=" + id + " ]";
    }
    
}
