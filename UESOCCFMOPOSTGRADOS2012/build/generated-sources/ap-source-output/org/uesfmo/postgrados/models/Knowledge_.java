package org.uesfmo.postgrados.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.uesfmo.postgrados.models.People;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-06-05T01:05:40")
@StaticMetamodel(Knowledge.class)
public class Knowledge_ { 

    public static volatile SingularAttribute<Knowledge, Integer> id;
    public static volatile SingularAttribute<Knowledge, People> peopleId;
    public static volatile SingularAttribute<Knowledge, String> description;

}