package org.uesfmo.postgrados.models;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.uesfmo.postgrados.models.Addresses;
import org.uesfmo.postgrados.models.Attaches;
import org.uesfmo.postgrados.models.Comments;
import org.uesfmo.postgrados.models.Commentsgroups;
import org.uesfmo.postgrados.models.Experiences;
import org.uesfmo.postgrados.models.Friendships;
import org.uesfmo.postgrados.models.Groups;
import org.uesfmo.postgrados.models.Knowledge;
import org.uesfmo.postgrados.models.Logs;
import org.uesfmo.postgrados.models.Memberships;
import org.uesfmo.postgrados.models.Messages;
import org.uesfmo.postgrados.models.Names;
import org.uesfmo.postgrados.models.Peopleeducation;
import org.uesfmo.postgrados.models.Peopletypes;
import org.uesfmo.postgrados.models.Petitions;
import org.uesfmo.postgrados.models.Phones;
import org.uesfmo.postgrados.models.Posts;
import org.uesfmo.postgrados.models.Privacycontrols;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-06-05T01:05:40")
@StaticMetamodel(People.class)
public class People_ { 

    public static volatile CollectionAttribute<People, Commentsgroups> commentsgroupsCollection1;
    public static volatile CollectionAttribute<People, Phones> phonesCollection;
    public static volatile SingularAttribute<People, Date> birthday;
    public static volatile CollectionAttribute<People, Privacycontrols> privacycontrolsCollection;
    public static volatile CollectionAttribute<People, Petitions> petitionsCollection1;
    public static volatile CollectionAttribute<People, Knowledge> knowledgeCollection;
    public static volatile CollectionAttribute<People, Friendships> friendshipsCollection;
    public static volatile SingularAttribute<People, String> password;
    public static volatile SingularAttribute<People, Integer> id;
    public static volatile CollectionAttribute<People, Comments> commentsCollection;
    public static volatile CollectionAttribute<People, Posts> postsCollection;
    public static volatile CollectionAttribute<People, Messages> messagesCollection1;
    public static volatile CollectionAttribute<People, Experiences> experiencesCollection;
    public static volatile CollectionAttribute<People, Groups> groupsCollection;
    public static volatile SingularAttribute<People, Boolean> isautogenerate;
    public static volatile SingularAttribute<People, Integer> gender;
    public static volatile CollectionAttribute<People, Friendships> friendshipsCollection1;
    public static volatile CollectionAttribute<People, Logs> logsCollection;
    public static volatile CollectionAttribute<People, Memberships> membershipsCollection;
    public static volatile CollectionAttribute<People, Commentsgroups> commentsgroupsCollection;
    public static volatile CollectionAttribute<People, Petitions> petitionsCollection;
    public static volatile CollectionAttribute<People, Names> namesCollection;
    public static volatile SingularAttribute<People, Peopletypes> peopletypeId;
    public static volatile CollectionAttribute<People, Attaches> attachesCollection;
    public static volatile CollectionAttribute<People, Addresses> addressesCollection;
    public static volatile SingularAttribute<People, String> email;
    public static volatile CollectionAttribute<People, Peopleeducation> peopleeducationCollection;
    public static volatile CollectionAttribute<People, Messages> messagesCollection;

}