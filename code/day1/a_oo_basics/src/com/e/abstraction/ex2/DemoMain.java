package com.e.abstraction.ex2;

public class DemoMain {

	public static void main(String[] args) {
		
		AmitStack stack=new AmitStack();
		
		someInternalLogic(stack);
	}

	private static void someInternalLogic(AmitStack stack) {
	
		stack.pushAmit(0);
		stack.pushAmit(3);
		stack.pushAmit(-33);
		
		System.out.println(stack.popAmit());
		System.out.println(stack.popAmit());
		System.out.println(stack.popAmit());
	}
	
	

}
