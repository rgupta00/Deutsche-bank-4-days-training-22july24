package com.f.abstraction.ex3;

public class Tester {

	public static void main(String[] args) {
		


		
		Employee employee=new PartTimeEmployee(1, "amit", 3000, 23, 5600);
		//System.out.println(employee);
		
		EmployeePaymentProceseingSystem.paymentProcessingSystem(employee);
	}

}
