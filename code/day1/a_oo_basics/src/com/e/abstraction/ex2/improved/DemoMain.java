package com.e.abstraction.ex2.improved;
import java.util.*;
public class DemoMain {

	public static void main(String[] args) {
		
		//"good dev is lazy" lazy in typing not in thinking
		
		//Vehicle c=new Car();
		
//		List<String> list=new ArrayList<>();
		
		Stack stack=new RaviStack();
		
		someInternalLogic(stack);
	}

	private static void someInternalLogic(Stack stack) {
	
		stack.push(0);
		stack.push(3);
		stack.push(-33);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
	
	

}
