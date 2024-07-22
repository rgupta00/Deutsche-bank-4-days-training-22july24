package com.f.abstraction.ex3.problem;

public class PaymentProceseingSystem {

	public static void paymentProcessingSystem(Employee employee) {
		//add the details of salary to the the db
		//process it and put the taxation details to some other table
		
		double value= employee.payment();
		System.out.println(value);
	}
}
