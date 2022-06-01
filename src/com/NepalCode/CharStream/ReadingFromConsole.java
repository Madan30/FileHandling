package com.NepalCode.CharStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingFromConsole {
	public static void main(String[] args) throws IOException {
		
		InputStreamReader ir = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(ir);
		
		System.out.println("Enter your name");
		String name = br.readLine();
		
		System.out.println(name);
		
		
		System.out.println("-------------Reading from a console--------------------");
		

		
		
		
	}

}
