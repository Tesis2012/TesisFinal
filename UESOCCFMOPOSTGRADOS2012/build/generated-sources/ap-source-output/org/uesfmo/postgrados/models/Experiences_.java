package org.uesfmo.postgrados.models;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.uesfmo.postgrados.models.Jobs;
import org.uesfmo.postgrados.models.People;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-06-05T01:05:40")
@StaticMetamodel(Experiences.class)
public class Experiences_ { 

    public static volatile SingularAttribute<Experiences, Integer> id;
    public static volatile SingularAttribute<Experiences, Jobs> jobId;
    public static volatile SingularAttribute<Experiences, People> peopleId;
    public static volatile SingularAttribute<Experiences, String> description;
    public static volatile SingularAttribute<Experiences, String> workplace;
    public static volatile SingularAttribute<Experiences, Date> begindate;
    public static volatile SingularAttribute<Experiences, Date> enddate;

}