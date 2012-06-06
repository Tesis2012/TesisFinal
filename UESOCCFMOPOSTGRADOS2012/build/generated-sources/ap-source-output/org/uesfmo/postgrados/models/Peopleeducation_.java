package org.uesfmo.postgrados.models;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.uesfmo.postgrados.models.Education;
import org.uesfmo.postgrados.models.People;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-06-05T01:05:40")
@StaticMetamodel(Peopleeducation.class)
public class Peopleeducation_ { 

    public static volatile SingularAttribute<Peopleeducation, Integer> id;
    public static volatile SingularAttribute<Peopleeducation, Date> startdate;
    public static volatile SingularAttribute<Peopleeducation, Education> educationId;
    public static volatile SingularAttribute<Peopleeducation, People> peopleId;
    public static volatile SingularAttribute<Peopleeducation, Date> begindate;

}