package com.NepalCode.CharStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreatingFile {
	public static void main(String[] args) throws IOException {

		File file = new File("ghale.txt");
		file.createNewFile();

		if (!file.exists()) {
			System.out.println("Create a new file");
			// file.createNewFile();
		}

		else {
			System.out.println("File alreday exist");
		}

		System.out.println(file.getName()); // getting file name
		System.out.println(file.getAbsolutePath()); // getting file path

		System.out.println("------------------------------------------------------");
		System.out.println("------------------------------------------------------");

		System.out.println("Writing into file");

		// String filePath =
		// "/home/mrg1813/eclipse-workspace/CharacterStream/ghale.txt";

		try {
			FileWriter filewriter = new FileWriter("ghale.txt");

			filewriter.write("My name is Madan Ghale. I am From Nepal.");

			filewriter.close();
			System.out.println("File write successfully");

		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
