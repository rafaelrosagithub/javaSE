package br.com.xyz.refined;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Recursion {

	public static int sum(int x) {
		if (x == 0) {
			return x;
		} else {
			System.out.println(x);
			return x + sum(x - 1);
		}
	}

	// power(3, 4) = 3 * 3 * 3 * 3
	public static int power(int x, int y) {
		if (y == 1) {
			System.out.println(x);
			return x;
		} else {
			int result = x * power(x, y - 1);
			System.out.println(result);
			return result;
		}
	}

	public static void listRecursively(Path path) {
		if (Files.isRegularFile(path)) {
			System.out.println(path.toAbsolutePath());
		} else {
			String s = "\n" + path.toAbsolutePath();
			System.out.println(s.toUpperCase());
			try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
				for (Path p : stream) {
					listRecursively(p);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Recursion");
//		System.out.println(sum(10));
//		System.out.println(power(3, 4));
		listRecursively(Paths.get("D:/Rafael/Projects/Courses/Java/JavaSE/xyz"));
	}
}
