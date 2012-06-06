package org.uesfmo.postgrados.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.uesfmo.postgrados.models.Attachtypes;
import org.uesfmo.postgrados.models.People;
import org.uesfmo.postgrados.models.Postgroups;
import org.uesfmo.postgrados.models.Posts;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-06-05T01:05:40")
@StaticMetamodel(Attaches.class)
public class Attaches_ { 

    public static volatile SingularAttribute<Attaches, Integer> id;
    public static volatile SingularAttribute<Attaches, String> attachName;
    public static volatile CollectionAttribute<Attaches, Posts> postsCollection;
    public static volatile SingularAttribute<Attaches, Attachtypes> attachtypeId;
    public static volatile SingularAttribute<Attaches, People> peopleId;
    public static volatile CollectionAttribute<Attaches, Postgroups> postgroupsCollection;

}