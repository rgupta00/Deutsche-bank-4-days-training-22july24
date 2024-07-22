package com.a.oo_basics;

//POJO
public class Employee {
	private int id;// instance varaible
	private String name;// instance varaible
	private double salary;// instance varaible

	//What is the relevance of static data?
	// common to all objects
	private static int counter = 0;//Singleton dp*
	
	//init block
	//static init block
	// ctr

	//how to access static data outside the class
	public static int getCounter() {
		return counter;
	}
	public Employee(String name, double salary) {
		this.id = ++counter;
		this.name = name;
		this.salary = salary;
	}

	public Employee() {
	}

	// getter setters

	public void show() {
		System.out.println("id: " + id + "name: " + name + " salary: " + salary);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
