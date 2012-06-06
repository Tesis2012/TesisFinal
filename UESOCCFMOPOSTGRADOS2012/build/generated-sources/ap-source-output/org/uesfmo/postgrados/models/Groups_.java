package org.uesfmo.postgrados.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.uesfmo.postgrados.models.Memberships;
import org.uesfmo.postgrados.models.People;
import org.uesfmo.postgrados.models.Postgroups;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-06-05T01:05:40")
@StaticMetamodel(Groups.class)
public class Groups_ { 

    public static volatile SingularAttribute<Groups, Integer> id;
    public static volatile SingularAttribute<Groups, Boolean> isactive;
    public static volatile SingularAttribute<Groups, People> peopleId;
    public static volatile CollectionAttribute<Groups, Postgroups> postgroupsCollection;
    public static volatile SingularAttribute<Groups, String> groupname;
    public static volatile CollectionAttribute<Groups, Memberships> membershipsCollection;

}