package org.uesfmo.postgrados.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.uesfmo.postgrados.models.People;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-05-31T03:05:44")
@StaticMetamodel(Petitions.class)
public class Petitions_ { 

    public static volatile SingularAttribute<Petitions, Integer> id;
    public static volatile SingularAttribute<Petitions, People> peoplesender;
    public static volatile SingularAttribute<Petitions, People> peoplereceiver;
    public static volatile SingularAttribute<Petitions, Integer> statuspetitionId;

}