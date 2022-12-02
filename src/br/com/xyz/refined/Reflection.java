package br.com.xyz.refined;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {

	@SuppressWarnings({ "unused", "rawtypes" })
	public static void main(String[] args)
			throws NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		System.out.println("Reflection");

		String name = "br.com.xyz.poo.Account";
		try {
			Class<?> classe = Class.forName(name);

			System.out.println(classe.getSimpleName());

			Field[] f = classe.getFields();
			for (Field field : f) {
				System.out.println(field);
			}

			Method[] m = classe.getDeclaredMethods();
			for (Method method : m) {
				System.out.println(method.getName());
			}

			Constructor[] c = classe.getConstructors();
			for (Constructor constructor : c) {
				System.out.println(constructor);
			}

			@SuppressWarnings({ "unused", "deprecation" })
			Object o = classe.newInstance();
			Method md = classe.getMethod("deposit", double.class);
			Method mdisplayBalance = classe.getMethod("displaysBalance");
			md.invoke(o, 120);
			mdisplayBalance.invoke(o);

			Constructor co = classe.getConstructor(String.class, double.class);
			Object obj = co.newInstance("Jhon", 123_543.987);
			mdisplayBalance.invoke(obj);

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}

}
