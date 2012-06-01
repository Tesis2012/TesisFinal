/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uesfmo.postgrados.models;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author benjamin
 */
@Named
@RequestScoped
@Entity
@Table(name = "phones")
@NamedQueries({
    @NamedQuery(name = "Phones.findAll", query = "SELECT p FROM Phones p"),
    @NamedQuery(name = "Phones.findById", query = "SELECT p FROM Phones p WHERE p.id = :id"),
    @NamedQuery(name = "Phones.findByPhone", query = "SELECT p FROM Phones p WHERE p.phone = :phone"),
    @NamedQuery(name = "Phones.findLastId", query = "SELECT max(p.id) FROM Phones p")
})
public class Phones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "phone")
    private String phone;
    @JoinColumn(name = "phonetype_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Phonestypes phonetypeId;
    @JoinColumn(name = "people_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private People peopleId;

    public Phones() {
    }

    public Phones(Integer id) {
        this.id = id;
    }

    public Phones(Integer id, String phone) {
        this.id = id;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Phonestypes getPhonetypeId() {
        return phonetypeId;
    }

    public void setPhonetypeId(Phonestypes phonetypeId) {
        this.phonetypeId = phonetypeId;
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
        if (!(object instanceof Phones)) {
            return false;
        }
        Phones other = (Phones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.uesfmo.postgrados.models.Phones[ id=" + id + " ]";
    }
    
}
