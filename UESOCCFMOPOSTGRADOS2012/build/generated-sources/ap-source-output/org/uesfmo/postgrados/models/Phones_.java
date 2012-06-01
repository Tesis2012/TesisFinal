package org.uesfmo.postgrados.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.uesfmo.postgrados.models.People;
import org.uesfmo.postgrados.models.Phonestypes;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-05-31T03:05:44")
@StaticMetamodel(Phones.class)
public class Phones_ { 

    public static volatile SingularAttribute<Phones, Integer> id;
    public static volatile SingularAttribute<Phones, String> phone;
    public static volatile SingularAttribute<Phones, People> peopleId;
    public static volatile SingularAttribute<Phones, Phonestypes> phonetypeId;

}