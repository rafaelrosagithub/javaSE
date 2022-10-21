package br.com.xyz.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File4 {

	// Check
	private static void check(Path path) {
		try {
			System.out.println(Files.exists(path));
			System.out.println(Files.isDirectory(path));
			System.out.println(Files.isRegularFile(path));
			System.out.println(Files.isReadable(path));
			System.out.println(Files.size(path));
			System.out.println(Files.getLastModifiedTime(path));
			System.out.println(Files.getOwner(path));
			System.out.println(Files.probeContentType(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Delete
	private static void delete(Path path) {
		try {
			Files.delete(path);
			Files.deleteIfExists(path);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println("Check, Delete, Create, Copy and Move");

		Path path = Paths.get("D:/Rafael/Projects/Courses/Java/JavaSE/xyz/files/accounts.txt");

//		check(path);
//		delete(path);

	}

}
