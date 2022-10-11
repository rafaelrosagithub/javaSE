package br.com.xyz.erros;

public class InvalidPasswordException extends Exception {

	public InvalidPasswordException(String message) {
		super(message);
	}
	
}
