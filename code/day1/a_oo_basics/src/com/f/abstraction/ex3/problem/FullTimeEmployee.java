package com.f.abstraction.ex3.problem;

public class FullTimeEmployee extends Employee {

	private double tax;
	public FullTimeEmployee(int id, String name, double salary) {
		super(id, name, salary);
		tax=.20*getSalary();
	}
	
	@Override
	public String toString() {
		super.toString();
		StringBuilder builder = new StringBuilder();
		builder.append("FullTimeEmployee [tax=").append(tax).append("]");
		return builder.toString();
	}

	@Override
	public double payment() {
		return 4500000;
	}
	
	
	

}
