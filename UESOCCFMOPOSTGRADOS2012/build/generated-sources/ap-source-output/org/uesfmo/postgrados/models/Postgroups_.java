package org.uesfmo.postgrados.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.uesfmo.postgrados.models.Attaches;
import org.uesfmo.postgrados.models.Groups;
import org.uesfmo.postgrados.models.Validitystatus;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-05-31T03:05:44")
@StaticMetamodel(Postgroups.class)
public class Postgroups_ { 

    public static volatile SingularAttribute<Postgroups, Integer> id;
    public static volatile SingularAttribute<Postgroups, String> postgroup;
    public static volatile SingularAttribute<Postgroups, Validitystatus> validitystatusId;
    public static volatile SingularAttribute<Postgroups, Groups> groupId;
    public static volatile SingularAttribute<Postgroups, Attaches> attachId;

}