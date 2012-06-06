package org.uesfmo.postgrados.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.uesfmo.postgrados.models.Peopleeducation;
import org.uesfmo.postgrados.models.Titletypes;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-06-05T01:05:40")
@StaticMetamodel(Education.class)
public class Education_ { 

    public static volatile SingularAttribute<Education, Integer> id;
    public static volatile SingularAttribute<Education, Titletypes> titletypeId;
    public static volatile CollectionAttribute<Education, Peopleeducation> peopleeducationCollection;
    public static volatile SingularAttribute<Education, String> careername;

}