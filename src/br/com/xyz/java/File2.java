package br.com.xyz.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File2 {

	public static void main(String[] args) {
		System.out.println("Working with file");

		Path path = Paths.get("D:/Rafael/Projects/Courses/Java/JavaSE/xyz/files/text.txt");
		Charset utf8 = StandardCharsets.UTF_8;

		// Writing
		try (BufferedWriter w = Files.newBufferedWriter(path, utf8)) {
			w.write("text\n");
			w.write("text\n");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Reading
		try (BufferedReader r = Files.newBufferedReader(path, utf8)) {
			String line = null;
			while ((line = r.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
