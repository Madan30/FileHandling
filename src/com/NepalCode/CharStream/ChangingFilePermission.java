package com.NepalCode.CharStream;

import java.io.File;

public class ChangingFilePermission {
	public static void main(String[] args) {
		
		String filePath = "/home/mrg1813/eclipse-workspace/CharacterStream/madanghale.txt";
		File file = new File(filePath);
		
		boolean exists = file.exists();
		if(exists == true) {
			file.setExecutable(true);
			file.setReadable(true);
			file.setWritable(true);
			
			System.out.println("Chaging file permission");
			
			System.out.println("File executable: " + file.canExecute());
			System.out.println("File readable: " + file.canRead());
			System.out.println("File writable: " + file.canWrite());
		}
		
		else {
			System.out.println("File not found");
		}
	}

}
