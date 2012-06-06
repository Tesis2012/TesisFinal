package org.uesfmo.postgrados.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.uesfmo.postgrados.models.Addresses;
import org.uesfmo.postgrados.models.Comments;
import org.uesfmo.postgrados.models.Commentsgroups;
import org.uesfmo.postgrados.models.Messages;
import org.uesfmo.postgrados.models.Names;
import org.uesfmo.postgrados.models.Postgroups;
import org.uesfmo.postgrados.models.Posts;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-06-05T01:05:40")
@StaticMetamodel(Validitystatus.class)
public class Validitystatus_ { 

    public static volatile SingularAttribute<Validitystatus, Integer> id;
    public static volatile CollectionAttribute<Validitystatus, Comments> commentsCollection;
    public static volatile CollectionAttribute<Validitystatus, Posts> postsCollection;
    public static volatile CollectionAttribute<Validitystatus, Names> namesCollection;
    public static volatile SingularAttribute<Validitystatus, String> status;
    public static volatile CollectionAttribute<Validitystatus, Postgroups> postgroupsCollection;
    public static volatile CollectionAttribute<Validitystatus, Addresses> addressesCollection;
    public static volatile CollectionAttribute<Validitystatus, Messages> messagesCollection;
    public static volatile CollectionAttribute<Validitystatus, Commentsgroups> commentsgroupsCollection;

}