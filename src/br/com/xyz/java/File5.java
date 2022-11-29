package br.com.xyz.java;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File5 {

	public static void main(String[] args) {
		System.out.println("List Directory and FilesSystem I/O");

		// List roots
		Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
		for (Path path : dirs) {
			System.out.println(path);
		}

		// List contents
		Path dir = Paths.get("D:/Rafael/Projects/Courses/Java/JavaSE/xyz");
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
			System.out.println("List Contents");
			for (Path path : stream) {
				System.out.println(path.getFileName());
			}
		} catch (IOException | DirectoryIteratorException e) {
			e.printStackTrace();
		}

		// List partitions
		FileSystem fs = FileSystems.getDefault();
		System.out.println("List Partitions");
		try {
			for (FileStore store : fs.getFileStores()) {
				System.out.println("Unity: " + store.toString());
				System.out.println("Total space: " + store.getTotalSpace());
				System.out.println("Available: " + store.getUsableSpace());
				System.out.println("Used: " + (store.getTotalSpace() - store.getUsableSpace()));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
