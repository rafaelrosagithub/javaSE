package br.com.xyz.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import br.com.xyz.poo.Account;

public class Serialize2 {

	public void storeAccounts(ArrayList<Account> accounts) {

		try (FileOutputStream fos = new FileOutputStream(
				"D:/Rafael/Projects/Courses/Java/JavaSE/xyz/files/accounts.ser")) {
			try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
				oos.writeObject(accounts);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Account> recoveAccounts() {

		try (FileInputStream fis = new FileInputStream(
				"D:/Rafael/Projects/Courses/Java/JavaSE/xyz/files/accounts.ser")) {
			try (ObjectInputStream ois = new ObjectInputStream(fis)) {
				return (ArrayList<Account>) ois.readObject();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		System.out.println("Writing reading challenge");

		ArrayList<Account> accounts = new ArrayList<>();
		accounts.add(new Account("Jhow", 2000.25));
		accounts.add(new Account("Maria", 3000.00));
		accounts.add(new Account("Peter", 5000.17));
		accounts.add(new Account("Lawrence", 7000.59));

		Serialize2 operation = new Serialize2();
		operation.storeAccounts(accounts);

		ArrayList<Account> recoverAccounts = operation.recoveAccounts();
		for (Account account : recoverAccounts) {
			account.displaysBalance();
		}
	}

}
