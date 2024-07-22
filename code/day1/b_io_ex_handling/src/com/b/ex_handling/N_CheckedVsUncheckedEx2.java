package com.b.ex_handling;

import java.io.BufferedReader;
import java.io.*;

public class N_CheckedVsUncheckedEx2 {
	public static void main(String[] args) {

		// checked ex
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("demo2.txt")));
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} 
		catch (FileNotFoundException e) {
			System.out.println("file not found");
		} 
		catch (IOException e) {
			System.out.println("some io ex");
		}
		catch (Exception e) {
			System.out.println("some other ex");
		}
		
		

	}
}
