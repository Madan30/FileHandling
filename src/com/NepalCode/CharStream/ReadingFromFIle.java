package com.NepalCode.CharStream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadingFromFIle {
	public static void main(String[] args) throws IOException {

		String filepath = "/home/mrg1813/eclipse-workspace/CharacterStream/madanghale.txt";

		Reader rd = new FileReader(filepath);

		try {
			char c = (char) rd.read();
			System.out.println("Data read from a file " + c + " ");

		} catch (Exception e) {
			System.out.println(e);
		}

		finally {
			rd.close();
		}
	}

}
