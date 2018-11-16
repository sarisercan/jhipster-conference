package com.jhipcon.domain;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Session.class)
public abstract class Session_ {

	public static volatile SingularAttribute<Session, LocalDate> startDateTime;
	public static volatile SetAttribute<Session, Speaker> speakers;
	public static volatile SingularAttribute<Session, String> description;
	public static volatile SingularAttribute<Session, Long> id;
	public static volatile SingularAttribute<Session, String> title;
	public static volatile SingularAttribute<Session, LocalDate> endDateTime;

}

