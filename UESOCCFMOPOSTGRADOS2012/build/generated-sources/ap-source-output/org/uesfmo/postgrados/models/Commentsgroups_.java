package org.uesfmo.postgrados.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.uesfmo.postgrados.models.People;
import org.uesfmo.postgrados.models.Validitystatus;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-05-31T03:05:44")
@StaticMetamodel(Commentsgroups.class)
public class Commentsgroups_ { 

    public static volatile SingularAttribute<Commentsgroups, Integer> id;
    public static volatile SingularAttribute<Commentsgroups, Validitystatus> validitystatusId;
    public static volatile SingularAttribute<Commentsgroups, People> peopleId;
    public static volatile SingularAttribute<Commentsgroups, String> commentpostgroup;
    public static volatile SingularAttribute<Commentsgroups, People> postId;

}