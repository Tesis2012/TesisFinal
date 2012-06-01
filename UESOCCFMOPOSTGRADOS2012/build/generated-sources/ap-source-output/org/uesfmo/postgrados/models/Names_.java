package org.uesfmo.postgrados.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.uesfmo.postgrados.models.People;
import org.uesfmo.postgrados.models.Validitystatus;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-05-31T03:05:44")
@StaticMetamodel(Names.class)
public class Names_ { 

    public static volatile SingularAttribute<Names, Integer> id;
    public static volatile SingularAttribute<Names, Validitystatus> validitystatusId;
    public static volatile SingularAttribute<Names, String> middlename;
    public static volatile SingularAttribute<Names, People> peopleId;
    public static volatile SingularAttribute<Names, String> lastname;
    public static volatile SingularAttribute<Names, String> firstname;

}