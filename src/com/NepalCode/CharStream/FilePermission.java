package com.NepalCode.CharStream;

import java.io.File;

public class FilePermission {
	public static void main(String[] args) {
		
		File file = new File("/home/mrg1813/eclipse-workspace/CharacterStream/madanghale.tx");
		
		// check if the file exist
		
		boolean exitsts = file.exists();
		if(exitsts == true) {
			
			System.out.println("Executable file: " + file.canExecute());
			
			System.out.println("Readable file: " + file.canRead());
			
			System.out.println("Writable file: " + file.canWrite());
			
		}
		
		// file does not exist
		else {
			System.out.println("File not found");
		}
	}

}
