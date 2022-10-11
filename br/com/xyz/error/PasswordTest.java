package br.com.xyz.erros;

public class PasswordTest {

	static void authenticate(String password) throws InvalidPasswordException {
		if ("123".equals(password)) {
			System.out.println("Authenticated");
		} else {
			throw new InvalidPasswordException("Incorrect password");
		}
	}

	public static void main(String[] args) {
		System.out.println("Password Test");

		try {
			authenticate("1234567");
		} catch (InvalidPasswordException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
