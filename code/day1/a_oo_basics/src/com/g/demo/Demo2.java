package com.g.demo;

public class Demo2 {
 
	static int a1=10;
	static int a2=20;
	public static void main(String[] args) {
		
		int total=0;
		total= sum(a1, a2);
		System.out.println(total);
	}
	private static int sum(int a1, int a2) {
		int total=0;
		a1=a1+2;
		total= a1+a2;
		return total;
		
	}
}
