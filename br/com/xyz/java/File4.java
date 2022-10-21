package br.com.xyz.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File4 {

	// Check
	private static void check(Path path) {
		System.out.println("Check File");
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
		System.out.println("Delete File");
		try {
			Files.delete(path);
			Files.deleteIfExists(path);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Create
	private static void create(Path path) {
		System.out.println("Create File");
		try {
			Files.deleteIfExists(path);
			Files.createFile(path);
			Files.write(path, "Text1 Text2 Text3...".getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println("Check, Delete, Create, Copy and Move");

		Path path = Paths.get("D:/Rafael/Projects/Courses/Java/JavaSE/xyz/files/source.txt");

//		check(path);
//		delete(path);
		create(path);

	}

}
