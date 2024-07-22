package com.b.overloading_overriding;

import java.util.Scanner;


class Shape{
	void draw() {
		System.out.println("drawing shape");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("drawing Circle");
	}
}
class Square extends Shape{
	void draw() {
		System.out.println("drawing Square");
	}
}

public class C_Overriding {

	public static void main(String[] args) {
		Shape s=null;
		Scanner scanner=new Scanner(System.in);
		System.out.println("PE 1. Cirlce 2.Sq");
    	int val=scanner.nextInt();
    	if(val==1) 
    		s=new Circle();
    	else 
    		s=new Square();
    	
    	s.draw();
    	
	}
}
