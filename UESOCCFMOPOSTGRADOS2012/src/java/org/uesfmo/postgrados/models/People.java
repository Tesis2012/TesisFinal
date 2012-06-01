/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uesfmo.postgrados.models;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
@Table(name = "people")
@NamedQueries({
    @NamedQuery(name = "People.findAll", query = "SELECT p FROM People p"),
    @NamedQuery(name = "People.findById", query = "SELECT p FROM People p WHERE p.id = :id"),
    @NamedQuery(name = "People.findByBirthday", query = "SELECT p FROM People p WHERE p.birthday = :birthday"),
    @NamedQuery(name = "People.findByEmail", query = "SELECT p FROM People p WHERE p.email = :email"),
    @NamedQuery(name = "People.findByGender", query = "SELECT p FROM People p WHERE p.gender = :gender"),
    @NamedQuery(name = "People.findByPassword", query = "SELECT p FROM People p WHERE p.password = :password"),
    @NamedQuery(name = "People.findByIsautogenerate", query = "SELECT p FROM People p WHERE p.isautogenerate = :isautogenerate"),
    @NamedQuery(name = "People.verificateLogin", query = "SELECT p FROM People p WHERE p.password = :password AND p.email = :email")
})
public class People implements Serializable {
    @Column(name =     "birthday")
    @Temporal(TemporalType.DATE)
    private Date birthday;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "email")
    private String email;
    @Column(name = "gender")
    private Integer gender;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Column(name = "isautogenerate")
    private boolean isautogenerate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "peopleId", fetch = FetchType.LAZY)
    private Collection<Experiences> experiencesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "peopleId", fetch = FetchType.LAZY)
    private Collection<Knowledge> knowledgeCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "peopleId", fetch = FetchType.LAZY)
    private Collection<Posts> postsCollection;
    @JoinColumn(name = "peopletype_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Peopletypes peopletypeId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "peoplereceiver", fetch = FetchType.LAZY)
    private Collection<Messages> messagesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "peoplesender", fetch = FetchType.LAZY)
    private Collection<Messages> messagesCollection1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "peopleId", fetch = FetchType.EAGER)
    private Collection<Phones> phonesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "friends", fetch = FetchType.LAZY)
    private Collection<Friendships> friendshipsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "friendr", fetch = FetchType.LAZY)
    private Collection<Friendships> friendshipsCollection1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "peopleId", fetch = FetchType.LAZY)
    private Collection<Peopleeducation> peopleeducationCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "peopleId", fetch = FetchType.LAZY)
    private Collection<Groups> groupsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "peoplereceiver", fetch = FetchType.LAZY)
    private Collection<Petitions> petitionsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "peoplesender", fetch = FetchType.LAZY)
    private Collection<Petitions> petitionsCollection1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "peopleId", fetch = FetchType.LAZY)
    private Collection<Logs> logsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "peopleId", fetch = FetchType.LAZY)
    private Collection<Attaches> attachesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "peopleId", fetch = FetchType.LAZY)
    private Collection<Commentsgroups> commentsgroupsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "postId", fetch = FetchType.LAZY)
    private Collection<Commentsgroups> commentsgroupsCollection1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "peopleId", fetch = FetchType.LAZY)
    private Collection<Names> namesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "peopleId", fetch = FetchType.LAZY)
    private Collection<Memberships> membershipsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "peopleId", fetch = FetchType.LAZY)
    private Collection<Privacycontrols> privacycontrolsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "peopleId", fetch = FetchType.LAZY)
    private Collection<Addresses> addressesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "peopleId", fetch = FetchType.LAZY)
    private Collection<Comments> commentsCollection;

    public People() {
    }

    public People(Integer id) {
        this.id = id;
    }

    public People(Integer id, String email, String password, boolean isautogenerate) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.isautogenerate = isautogenerate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getIsautogenerate() {
        return isautogenerate;
    }

    public void setIsautogenerate(boolean isautogenerate) {
        this.isautogenerate = isautogenerate;
    }

    public Collection<Experiences> getExperiencesCollection() {
        return experiencesCollection;
    }

    public void setExperiencesCollection(Collection<Experiences> experiencesCollection) {
        this.experiencesCollection = experiencesCollection;
    }

    public Collection<Knowledge> getKnowledgeCollection() {
        return knowledgeCollection;
    }

    public void setKnowledgeCollection(Collection<Knowledge> knowledgeCollection) {
        this.knowledgeCollection = knowledgeCollection;
    }

    public Collection<Posts> getPostsCollection() {
        return postsCollection;
    }

    public void setPostsCollection(Collection<Posts> postsCollection) {
        this.postsCollection = postsCollection;
    }

    public Peopletypes getPeopletypeId() {
        return peopletypeId;
    }

    public void setPeopletypeId(Peopletypes peopletypeId) {
        this.peopletypeId = peopletypeId;
    }

    public Collection<Messages> getMessagesCollection() {
        return messagesCollection;
    }

    public void setMessagesCollection(Collection<Messages> messagesCollection) {
        this.messagesCollection = messagesCollection;
    }

    public Collection<Messages> getMessagesCollection1() {
        return messagesCollection1;
    }

    public void setMessagesCollection1(Collection<Messages> messagesCollection1) {
        this.messagesCollection1 = messagesCollection1;
    }

    public Collection<Phones> getPhonesCollection() {
        return phonesCollection;
    }

    public void setPhonesCollection(Collection<Phones> phonesCollection) {
        this.phonesCollection = phonesCollection;
    }

    public Collection<Friendships> getFriendshipsCollection() {
        return friendshipsCollection;
    }

    public void setFriendshipsCollection(Collection<Friendships> friendshipsCollection) {
        this.friendshipsCollection = friendshipsCollection;
    }

    public Collection<Friendships> getFriendshipsCollection1() {
        return friendshipsCollection1;
    }

    public void setFriendshipsCollection1(Collection<Friendships> friendshipsCollection1) {
        this.friendshipsCollection1 = friendshipsCollection1;
    }

    public Collection<Peopleeducation> getPeopleeducationCollection() {
        return peopleeducationCollection;
    }

    public void setPeopleeducationCollection(Collection<Peopleeducation> peopleeducationCollection) {
        this.peopleeducationCollection = peopleeducationCollection;
    }

    public Collection<Groups> getGroupsCollection() {
        return groupsCollection;
    }

    public void setGroupsCollection(Collection<Groups> groupsCollection) {
        this.groupsCollection = groupsCollection;
    }

    public Collection<Petitions> getPetitionsCollection() {
        return petitionsCollection;
    }

    public void setPetitionsCollection(Collection<Petitions> petitionsCollection) {
        this.petitionsCollection = petitionsCollection;
    }

    public Collection<Petitions> getPetitionsCollection1() {
        return petitionsCollection1;
    }

    public void setPetitionsCollection1(Collection<Petitions> petitionsCollection1) {
        this.petitionsCollection1 = petitionsCollection1;
    }

    public Collection<Logs> getLogsCollection() {
        return logsCollection;
    }

    public void setLogsCollection(Collection<Logs> logsCollection) {
        this.logsCollection = logsCollection;
    }

    public Collection<Attaches> getAttachesCollection() {
        return attachesCollection;
    }

    public void setAttachesCollection(Collection<Attaches> attachesCollection) {
        this.attachesCollection = attachesCollection;
    }

    public Collection<Commentsgroups> getCommentsgroupsCollection() {
        return commentsgroupsCollection;
    }

    public void setCommentsgroupsCollection(Collection<Commentsgroups> commentsgroupsCollection) {
        this.commentsgroupsCollection = commentsgroupsCollection;
    }

    public Collection<Commentsgroups> getCommentsgroupsCollection1() {
        return commentsgroupsCollection1;
    }

    public void setCommentsgroupsCollection1(Collection<Commentsgroups> commentsgroupsCollection1) {
        this.commentsgroupsCollection1 = commentsgroupsCollection1;
    }

    public Collection<Names> getNamesCollection() {
        return namesCollection;
    }

    public void setNamesCollection(Collection<Names> namesCollection) {
        this.namesCollection = namesCollection;
    }

    public Collection<Memberships> getMembershipsCollection() {
        return membershipsCollection;
    }

    public void setMembershipsCollection(Collection<Memberships> membershipsCollection) {
        this.membershipsCollection = membershipsCollection;
    }

    public Collection<Privacycontrols> getPrivacycontrolsCollection() {
        return privacycontrolsCollection;
    }

    public void setPrivacycontrolsCollection(Collection<Privacycontrols> privacycontrolsCollection) {
        this.privacycontrolsCollection = privacycontrolsCollection;
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
        if (!(object instanceof People)) {
            return false;
        }
        People other = (People) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.uesfmo.postgrados.models.People[ id=" + id + " ]";
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    
}
