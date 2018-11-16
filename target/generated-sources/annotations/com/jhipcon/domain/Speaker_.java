package com.jhipcon.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Speaker.class)
public abstract class Speaker_ {

	public static volatile SingularAttribute<Speaker, String> firstName;
	public static volatile SingularAttribute<Speaker, String> lastName;
	public static volatile SingularAttribute<Speaker, String> twitter;
	public static volatile SetAttribute<Speaker, Session> sessions;
	public static volatile SingularAttribute<Speaker, String> bio;
	public static volatile SingularAttribute<Speaker, Long> id;
	public static volatile SingularAttribute<Speaker, String> email;

}

