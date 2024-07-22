package com.b.overloading_overriding;

class A {
	int i;

	public A(int i) {
		this.i = i;
	}

	void showI() {
		System.out.println("show of A: i" + i);
	}

	void display() {
		System.out.println("display of A");
	}
}

class B extends A {
	int j;

	public B(int i, int j) {
		super(i);
		this.j = j;
	}

	void showJ() {
		showI();
		System.out.println("show of B: j: " + j);
	}
	//overriden here : run time polymorphism: code flexiblity
	void display() {
		System.out.println("display of B");
	}

}

public class A_InheritanceEx {

	public static void main(String[] args) {
		A a = new B(4, 6);

		a.display();
	}
}
