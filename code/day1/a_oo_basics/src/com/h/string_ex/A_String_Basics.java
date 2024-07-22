package com.h.string_ex;

import java.util.Random;


public class A_String_Basics {
    public static void main(String[] args) {
        
    	String s1=new String("foo");
    	
    	String s2="foo";//better
    	
    	//String are immutable
    	
    	String m="raja";
    	m=m+"baja";
    	System.out.println(m);
    	
    	String s="a"+"b"+"c";// good or bad code? ==> bad code ?
    	
    	String data= new StringBuilder().append("a").append("b").append("c").toString();
    	
    	
    	//how string stored in merory, basics interview questions
        //string vs string builder vs stringbuffer

//        System.out.println(Runtime.getRuntime().availableProcessors());


      //  String s="a"+"b"+"c";
        //vs

//        String data= new StringBuilder().append("a").append("b").append("c").toString();
//
//        String data2 = "raj";// can u reverse a string?
//
//        String data3=new StringBuilder().append("raj").reverse().toString();
//
//

//       int value= new StringBuilder("foo").toString().length();
//
//        System.out.printf("value:" + value);

//       int value2= new StringBuilder(new Random().nextInt(100)).append("raja").toString().length();
//        System.out.println("right now : "+value2);





//        String a=new String("foo");
//        a= a.toUpperCase();
//        System.out.printf("result "+ a);



//        String a1=new String("raja");
//        String a2="raja";
//        if(a1==a2){
//            System.out.println("same");
//        }else{
//            System.out.printf("not same");
//        }


    }
}
