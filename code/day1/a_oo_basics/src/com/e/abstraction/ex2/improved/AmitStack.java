package com.e.abstraction.ex2.improved;

public class AmitStack implements Stack{
	private int arr[];
	private int SIZE;
	private int top;
	
	
	public AmitStack() {
		SIZE=5;
		arr=new int[5];
		top=-1;
	}
	
	public void push(int data) {
		//let assume he is using LL(Link list)
		if(top==SIZE-1)
			System.out.println("cant insert");
		else
			arr[++top]=data;
	}
	
	public int pop() {
		if(top==-1) {
			System.out.println("stack is empty");
			return -999;
		}
		return arr[top--];
	}
}
