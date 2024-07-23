package com.threads.session1.classical_threads;
//C_UsingAnnInnerClass vs labmbda

public class C_UsingAnnInnerClass {
    public static void main(String[] args) {
      //  Runnable runnable=() ->System.out.println("job of the thread...");
			
		
		
		Thread t=new Thread(() ->System.out.println("job of the thread..."));
		t.start();
    }
}
