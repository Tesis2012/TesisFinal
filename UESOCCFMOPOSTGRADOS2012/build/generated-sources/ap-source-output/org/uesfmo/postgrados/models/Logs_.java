package org.uesfmo.postgrados.models;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.uesfmo.postgrados.models.People;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-06-05T01:05:40")
@StaticMetamodel(Logs.class)
public class Logs_ { 

    public static volatile SingularAttribute<Logs, Integer> id;
    public static volatile SingularAttribute<Logs, Date> dates;
    public static volatile SingularAttribute<Logs, People> peopleId;
    public static volatile SingularAttribute<Logs, String> jsessionid;
    public static volatile SingularAttribute<Logs, Date> hour;

}