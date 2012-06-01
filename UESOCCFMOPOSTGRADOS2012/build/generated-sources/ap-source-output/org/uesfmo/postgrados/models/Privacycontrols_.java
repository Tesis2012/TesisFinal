package org.uesfmo.postgrados.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.uesfmo.postgrados.models.People;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-05-31T03:05:44")
@StaticMetamodel(Privacycontrols.class)
public class Privacycontrols_ { 

    public static volatile SingularAttribute<Privacycontrols, Integer> id;
    public static volatile SingularAttribute<Privacycontrols, Integer> privacylevelId;
    public static volatile SingularAttribute<Privacycontrols, People> peopleId;

}