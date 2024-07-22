package com.f.abstraction.ex3.solution;

public class PaymentProceseingSystem {

	public static void paymentProcessingSystem(Payable payable) {
		//add the details of salary to the the db
		//process it and put the taxation details to some other table
		//
		double value= payable.payment();
		System.out.println(value);
	}
}
