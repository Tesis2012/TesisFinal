package org.uesfmo.postgrados.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.uesfmo.postgrados.models.Experiences;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-05-31T03:05:44")
@StaticMetamodel(Jobs.class)
public class Jobs_ { 

    public static volatile SingularAttribute<Jobs, Integer> id;
    public static volatile CollectionAttribute<Jobs, Experiences> experiencesCollection;
    public static volatile SingularAttribute<Jobs, String> job;

}