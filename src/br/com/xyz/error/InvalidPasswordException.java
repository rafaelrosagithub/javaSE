package br.com.xyz.error;

public class InvalidPasswordException extends Exception {

	public InvalidPasswordException(String message) {
		super(message);
	}
	
}
