package br.com.xyz.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.xyz.poo.Account;

public class Serialize {

	public static void main(String[] args) {
		System.out.println("Serialize");

		String[] names = { "Rafael", "Jhon", "Peter" };

		Account account1 = new Account("Client A", 10000);

		// Object writing
		try {
			FileOutputStream fos = new FileOutputStream("D:/Rafael/Projects/Courses/Java/JavaSE/xyz/files/object.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(account1);
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Object reading
		try {
			FileInputStream fis = new FileInputStream("D:/Rafael/Projects/Courses/Java/JavaSE/xyz/files/object.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
//			String[] names1 = (String[]) ois.readObject();
			Account c1 = (Account) ois.readObject();
			ois.close();
//			System.out.println(Arrays.toString(names1));
			c1.displaysBalance();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
