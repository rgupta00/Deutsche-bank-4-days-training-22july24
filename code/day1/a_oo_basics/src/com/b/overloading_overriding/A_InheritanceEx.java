package com.b.overloading_overriding;

class A {
	private int i;
	
	A(int i) {
		this.i=i;
	}

}

class B extends A{
	private int j;
	B(int i, int j) {
		super(i);
		this.j=j;
	}

}
public class A_InheritanceEx {

	public static void main(String[] args) {
		
	}
}
