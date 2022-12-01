package br.com.xyz.refined;

import java.io.Serializable;

@Header(institution = "ABC", project = "ABC", creationDate = "12/01/2022", revision = 2, author = "Rafael Rosa")
@BugsFixed(erros = { "0001", "0002" })
@BugsFiexd2("12345")
@SuppressWarnings("serial")
public class Annotation implements Serializable {

	@SuppressWarnings("unused")
	private int x;

	public static void main(String[] args) {
		System.out.println("Annotations");
	}

	@SuppressWarnings("unused")
	@Deprecated
	private void writeDown() {
	}

	@Override
	public String toString() {
		return null;
	}
}
