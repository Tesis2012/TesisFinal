package org.uesfmo.postgrados.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.uesfmo.postgrados.models.Addresses;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-06-05T01:05:40")
@StaticMetamodel(Addresstypes.class)
public class Addresstypes_ { 

    public static volatile SingularAttribute<Addresstypes, Integer> id;
    public static volatile SingularAttribute<Addresstypes, String> addresstype;
    public static volatile CollectionAttribute<Addresstypes, Addresses> addressesCollection;

}