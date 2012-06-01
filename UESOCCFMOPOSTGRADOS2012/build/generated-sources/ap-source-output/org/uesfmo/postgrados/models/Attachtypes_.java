package org.uesfmo.postgrados.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.uesfmo.postgrados.models.Attaches;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-05-31T03:05:44")
@StaticMetamodel(Attachtypes.class)
public class Attachtypes_ { 

    public static volatile SingularAttribute<Attachtypes, Integer> id;
    public static volatile CollectionAttribute<Attachtypes, Attaches> attachesCollection;
    public static volatile SingularAttribute<Attachtypes, String> type;

}