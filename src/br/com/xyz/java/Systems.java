package br.com.xyz.java;

import java.io.Console;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Systems {
	public static void main(String[] args) throws IOException {
		System.out.println("System, Runtime, Properties and Console");

		Properties p = System.getProperties();
		System.out.println(p.getProperty("java.version"));
		p.setProperty("xyz.project.java.version", "1.0.0");
		System.out.println(p.getProperty("xyz.project.java.version"));

		Set<Object> pk = p.keySet();
		for (Object key : pk) {
			System.out.println(key + " = " + p.get(key));
		}

		Console c = System.console();
		System.out.println("User: ");
		String user = c.readLine();
		System.out.println("Password: ");
		char[] password = c.readPassword();
		System.out.println("User: " + user + "\n" + "Password: " + new String(password));
		
		Runtime.getRuntime().exec("notepad");
	}
}
