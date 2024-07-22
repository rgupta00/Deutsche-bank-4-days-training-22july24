package com.a.oo_basics;
//What is init block?
class Foo {
    //static init block
	private static double myval;
    static {
    	myval=Math.PI*3+9;
    	
        System.out.println("static init block");
    }
    //init block
	{
		System.out.println(" common code 1");
	}
	{
		System.out.println(" common code 2");
	}
	//DRY dont repeat yourself
    public Foo(){
        System.out.println("inside default ctr");
    }

    public Foo(int i){
        System.out.println("inside para ctr");
    }

}
public class C_static_block {
    public static void main(String[] args) {
        
        Foo foo=new Foo();
        Foo foo2=new Foo(7);

    }
}


