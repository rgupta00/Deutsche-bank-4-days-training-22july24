package com.d.abstraction.ex1;

//encapsulation = data hiding + business contstrants 
public class Account {
	public int id;
	public String name;
	public double balance;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public Account(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public double intrestCal() {
		return balance * 02;
	}
}
