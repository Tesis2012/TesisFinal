package org.uesfmo.postgrados.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.uesfmo.postgrados.models.People;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-06-05T01:05:40")
@StaticMetamodel(Friendships.class)
public class Friendships_ { 

    public static volatile SingularAttribute<Friendships, Integer> id;
    public static volatile SingularAttribute<Friendships, People> friendr;
    public static volatile SingularAttribute<Friendships, People> friends;

}