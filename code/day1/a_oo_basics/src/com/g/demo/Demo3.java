package com.g.demo;

class A {
	private int i;
	A(int i) {
		this.i=i;
		System.out.println("ctr of class A");
	}

	void foo() {
		System.out.println("foo of class A, value of i: "+ i);
	}

	public int getI() {
		return i;
	}

}

class B extends A{
	private int j;
	B(int i, int j) {
		super(i);
		this.j=j;
		System.out.println("ctr of class B");
	}

	void foo() {
		System.out.println("foo of class B, value of i is "+ super.getI()+" and value of j is "+ j);
	}
}

public class Demo3 {

	public static void main(String[] args) {

		A a=new B(2,4);
		a.foo();
	}

}
