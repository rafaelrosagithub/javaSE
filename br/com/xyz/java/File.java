package br.com.xyz.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File {
	public static void main(String[] args) throws IOException {
		System.out.println("Working with file");

		Path path = Paths.get("D:/Rafael/Projects/Courses/Java/JavaSE/xyz/files/text.txt");
		System.out.println(path.toAbsolutePath());
		System.out.println(path.getParent());
		System.out.println(path.getRoot());
		System.out.println(path.getFileName());

		// Directory creation
		Files.createDirectories(path.getParent());

		// Write and read files
		byte[] bytes = "My text text...".getBytes();
		Files.write(path, bytes); // Create, clean and write inside the file

		byte[] returnBytes = Files.readAllBytes(path);
		System.out.println(new String(returnBytes));
	}
}
