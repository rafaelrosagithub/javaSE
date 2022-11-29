package br.com.xyz.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import br.com.xyz.poo.Account;

public class File3 {

	private Path path = Paths.get("D:/Rafael/Projects/Courses/Java/JavaSE/xyz/files/accounts.txt");
	private Charset utf8 = StandardCharsets.UTF_8;

	public void storeAccounts(ArrayList<Account> accounts) {
		try (BufferedWriter writer = Files.newBufferedWriter(path, utf8)) {
			for (Account account : accounts) {
				writer.write(account.getClient() + ";" + account.getBalance() + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Account> recoveAccounts() {

		ArrayList<Account> accounts = new ArrayList<>();

		try (BufferedReader reader = Files.newBufferedReader(path, utf8)) {

			String line = null;
			while ((line = reader.readLine()) != null) {
				String[] t = line.split(";"); // Returns an array of tokens
				Account account = new Account(t[0], Double.parseDouble(t[1]));
				accounts.add(account);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return accounts;
	}

	public static void main(String[] args) {
		System.out.println("Writing reading challenge");

		ArrayList<Account> accounts = new ArrayList<>();
		accounts.add(new Account("Jhow", 2000.25));
		accounts.add(new Account("Maria", 3000.00));
		accounts.add(new Account("Peter", 5000.17));
		accounts.add(new Account("Lawrence", 7000.59));

		File3 operation = new File3();
		operation.storeAccounts(accounts);

		ArrayList<Account> recoverAccounts = operation.recoveAccounts();
		for (Account account : recoverAccounts) {
			account.displaysBalance();
		}
	}

}
