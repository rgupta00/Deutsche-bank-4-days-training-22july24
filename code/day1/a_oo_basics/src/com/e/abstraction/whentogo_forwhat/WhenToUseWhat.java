package com.e.abstraction.whentogo_forwhat;
//https://stackoverflow.com/questions/55445242/how-do-interfaces-break-dependencies-of-classes
interface Jumpable{
	public void jump();
}
class Monkey implements Jumpable{
	public void jump() {
		System.out.println("jump like anything!");
	}
	
	void stayOnTree() {
		System.out.println("stayOnTree");
	}
	
	void bite() {
		System.out.println("bite random peoples");
	}
}

class Kid implements Jumpable{
	public void jump() {
		System.out.println("jump better then monkey!");
	}
	void goToSchool() {
		System.out.println("goToSchool !");
	}
	void competiveEx() {
		System.out.println("competiveEx !");
	}
}

public class WhenToUseWhat {
	public static void main(String[] args) {
		
	}

}
