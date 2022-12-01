package br.com.xyz.refined;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.TYPE)
public @interface Header {

	String institution();

	String project();

	String creationDate();

	String author();

	int revision() default 1;
}
