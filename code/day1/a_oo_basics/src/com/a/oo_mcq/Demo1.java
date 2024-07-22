package com.a.oo_mcq;
//till java 7
//interface Foo{
////	public static final int i;
//	int i=0;
//	void foo() ;
//}


//from java 8

interface Foo{
	
	//java 9: just a helper method in the default method
	private void fooPrivate() {
		System.out.println("it is a private method ");
	}
	public static void fooStatic() {
		System.out.println("static method inside interface");
	}
	default void foo() {
		fooPrivate();
		System.out.println("it is a defult method ");
	}
}


//class A{
//	static public void foo() {
//		System.out.println("foo method of class A");
//	}
//}
//
//class B extends A{
//	//overrding u can not reduce the scope of the method
//	
//	//static method can not be overriden by "shadowing"
//	static public void foo() {
//		System.out.println("foo method of class B");
//	}
//}

//final : ie constant

//final class M{
//	///
//}
//class N extends M{
//	
//}
public class Demo1 {

	public static void main(String[] args) {
//		B a =new B();
		//a.foo();
	}
}
