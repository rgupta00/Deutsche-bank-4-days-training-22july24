package com.b.ex_handling;
//java defined ex: BL

//Account -> withdraw and deposit
//OverFundException , NotSufficentFundException, AccountCreationExcpetion

//Checked vs UncheckedEx
//compiler check		compiler dont check

//class NegativeRadiusEx extends Exception {
//	public NegativeRadiusEx(String message) {
//		super(message);
//	}
//}
//throw and throws try catch finally
//User define ex

//raj
//class Circle {
//	private int radius;
//
//	public Circle(int radius) throws NegativeRadiusEx {
//		if (radius <= 0)
//			throw new NegativeRadiusEx("radius is negative");
//
//		this.radius = radius;
//	}
//
//	public double getArea() {
//		return radius * radius * Math.PI;
//	}
//}
//
//public class D_UserDefineEx {
//	public static void main(String[] args) {
//
//		try {
//			Circle circle = new Circle(-4);
//
//			System.out.println(circle.getArea());
//		} catch (NegativeRadiusEx e) {
//			//e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
//
//	}
//}

class NegativeRadiusEx extends RuntimeException {
	public NegativeRadiusEx(String message) {
		super(message);
	}
}

class Circle {
	private int radius;

	//in 
	public Circle(int radius) {
		if (radius <= 0)
			throw new NegativeRadiusEx("radius is negative");

		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}
}

public class D_UserDefineEx {
	public static void main(String[] args) {

		try {
			Circle circle = new Circle(-4);

			System.out.println(circle.getArea());
		} catch (NegativeRadiusEx e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}
}