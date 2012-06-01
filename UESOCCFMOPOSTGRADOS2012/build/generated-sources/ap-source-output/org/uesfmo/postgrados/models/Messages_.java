package org.uesfmo.postgrados.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.uesfmo.postgrados.models.People;
import org.uesfmo.postgrados.models.Validitystatus;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-05-31T03:05:44")
@StaticMetamodel(Messages.class)
public class Messages_ { 

    public static volatile SingularAttribute<Messages, Integer> id;
    public static volatile SingularAttribute<Messages, String> message;
    public static volatile SingularAttribute<Messages, Validitystatus> validitystatusId;
    public static volatile SingularAttribute<Messages, People> peoplesender;
    public static volatile SingularAttribute<Messages, People> peoplereceiver;

}