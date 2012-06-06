package org.uesfmo.postgrados.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.uesfmo.postgrados.models.Phones;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-06-05T01:05:40")
@StaticMetamodel(Phonestypes.class)
public class Phonestypes_ { 

    public static volatile SingularAttribute<Phonestypes, Integer> id;
    public static volatile SingularAttribute<Phonestypes, String> phonetype;
    public static volatile CollectionAttribute<Phonestypes, Phones> phonesCollection;

}