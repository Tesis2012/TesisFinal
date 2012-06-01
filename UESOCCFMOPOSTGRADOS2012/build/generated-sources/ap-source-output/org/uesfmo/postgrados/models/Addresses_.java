package org.uesfmo.postgrados.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.uesfmo.postgrados.models.Addresstypes;
import org.uesfmo.postgrados.models.People;
import org.uesfmo.postgrados.models.Validitystatus;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-05-31T03:05:44")
@StaticMetamodel(Addresses.class)
public class Addresses_ { 

    public static volatile SingularAttribute<Addresses, Integer> id;
    public static volatile SingularAttribute<Addresses, Validitystatus> validitystatusId;
    public static volatile SingularAttribute<Addresses, Addresstypes> addresstypeId;
    public static volatile SingularAttribute<Addresses, String> address;
    public static volatile SingularAttribute<Addresses, People> peopleId;

}