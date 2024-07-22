package com.b.ex_handling;

import java.io.BufferedReader;
import java.io.*;
class Dog2{
	void sound() {
		System.out.println("bho bho");
	}
}
public class B_CheckedVsUncheckedEx {
	public static void main(String[] args) {

		// checked ex
//		try {
//			BufferedReader br = new BufferedReader(new FileReader(new File("demo2.txt")));
//			String line = null;
//			while ((line = br.readLine()) != null) {
//				System.out.println(line);
//			}
//
//		} catch (FileNotFoundException e) {
//			System.out.println("file not found");
//		} catch (IOException e) {
//			System.out.println("some io ex");
//		}
		
		
		//unchecked ex: logical bugs
		try {
			Dog2 dog=null;
			dog.sound();
		}catch(NullPointerException e) {
			System.out.println("dog was null");
		}
		

	}
}
