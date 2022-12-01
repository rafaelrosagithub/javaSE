package br.com.xyz.refined;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ ElementType.TYPE, ElementType.METHOD })
public @interface BugsFixed {

	String[] erros();
}
