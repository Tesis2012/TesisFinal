package org.uesfmo.postgrados.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.uesfmo.postgrados.models.Attaches;
import org.uesfmo.postgrados.models.Comments;
import org.uesfmo.postgrados.models.People;
import org.uesfmo.postgrados.models.Validitystatus;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-06-05T01:05:40")
@StaticMetamodel(Posts.class)
public class Posts_ { 

    public static volatile SingularAttribute<Posts, Integer> id;
    public static volatile CollectionAttribute<Posts, Comments> commentsCollection;
    public static volatile SingularAttribute<Posts, Validitystatus> validitystatusId;
    public static volatile SingularAttribute<Posts, String> post;
    public static volatile SingularAttribute<Posts, People> peopleId;
    public static volatile SingularAttribute<Posts, Attaches> attachId;

}