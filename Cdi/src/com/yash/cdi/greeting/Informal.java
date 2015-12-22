package com.yash.cdi.greeting;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.enterprise.inject.Alternative;
import javax.inject.Qualifier;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Informal {
	
	enum type{
		winter , summer;
	}
	
	type season();
	
}
