package com.g.demo;

public class Demo1 {
	
	public static void main(String[] args) {
		System.out.println("start");
		int a=10;
		show();
		a=a++ + ++a - ++a + a++;
		if(a>55) {
			System.out.println("valid");
		}else {
			System.out.println("not valid");
		}
		
		System.out.println("end");		
	}
	private static void show() {
		System.out.println("from show method");
		int k=8;
		k=k-- + ++k + k++;
		System.out.println("data is : "+ k);
		System.out.println("about to exit");
	}

}
