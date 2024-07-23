package demo.java8.session1.ex1.interface_evolution;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

//SAM: single abs method

@FunctionalInterface
interface Food{
	public void cook();
	
	public default  void fooDefault() {
		System.out.println("foo default method");
	}
	public static  void fooStatic() {
		System.out.println("foo stataic method");
	}
}
class FoodImp implements Food{

	@Override
	public void cook() {
		System.out.println("cook method");
	}
	
}

interface Cal{
	int add(int a, int b);
}
public class A_DemoFuncationalInterface {
	public static void main(String[] args) {
		//Funcational interface --> lamabda expression
		
		//Annonyous inner class
//		Food f=new Food() {
//			
//			@Override
//			public void cook() {
//				System.out.println("food impl");
//			}
//		};
		
		Cal cal=(int a, int b)-> a+b;
			
		int result = cal.add(2, 2);
		System.out.println(result);
		
		
		Food f=()-> System.out.println("food impl");
		
		f.cook();
		
//		Food f=new FoodImp();
//		f.fooDefault();
//		
//		Food.fooStatic();
		
		
		
	}
}


