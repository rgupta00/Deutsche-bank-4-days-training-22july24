package com.b.overloading_overriding;

class Cal{
	public int add(int a, int b) {
		return a+b;
	}
	public int add(int a, int b,int c) {
		return a+b+c;
	}
}
public class B_Overloading {

	public static void main(String[] args) {
		
		Cal cal=new Cal();
		int sum=cal.add(3, 3);
		System.out.println(sum);
		
		sum=cal.add(2, 1, 1);
		System.out.println(sum);
		
		
		
	}
}
