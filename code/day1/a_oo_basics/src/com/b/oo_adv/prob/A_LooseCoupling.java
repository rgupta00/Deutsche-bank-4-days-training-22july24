package com.b.oo_adv.prob;

import java.util.Scanner;
//abstract class Vehicle{
//	 public abstract void move(String s, String d);
//}
//class Metro extends Vehicle{
//    public void move(String s, String d){
//        System.out.println("passnager is moving from "+ s +" to "+ d +" using metro");
//    }
//}
//class Car extends Vehicle{
//    public void move(String s, String d){
//        System.out.println("passnager is moving from "+ s +" to "+ d +" using car");
//    }
//}
//class Bike extends Vehicle{
//    public void move(String s, String d){
//        System.out.println("passnager is moving from "+ s +" to "+ d +" using bike");
//    }
//}

interface  Vehicle{
	 public abstract void move(String s, String d);
}
class Metro implements Vehicle{
   public void move(String s, String d){
       System.out.println("passnager is moving from "+ s +" to "+ d +" using metro");
   }
}
class Car implements Vehicle{
   public void move(String s, String d){
       System.out.println("passnager is moving from "+ s +" to "+ d +" using car");
   }
}
class Bike implements Vehicle{
   public void move(String s, String d){
       System.out.println("passnager is moving from "+ s +" to "+ d +" using bike");
   }
}

//m1					abs					m2

//Passanger----------------->vehicle <---car
									//bike
									//metro
class Passanger{
    private String name;

    public Passanger(String name) {
        this.name = name;
    }
    public void travel(String s, String d, Vehicle vehicle){
        System.out.println("name of passanger is "+ name);
         vehicle.move(s, d);
    }
}
public class A_LooseCoupling {

    public static void main(String[] args) {

        //Change is the only constant in life or in programming!
        
//    	Car car=new Car();
    //	Metro metro=new Metro();
    	Vehicle vehicle=null;
    	Scanner scanner=new Scanner(System.in);
    	System.out.println("PE 1. car 2. Bike 3.Metro ");
    	int val=scanner.nextInt();
    	if(val==1) 
    		vehicle=new Car();
    	else if(val==2)
    		vehicle=new Bike();
    	else
    		vehicle=new Metro();
    	
        Passanger passanger=new Passanger("amit");
        passanger.travel("LN","Noida", vehicle);

    }
}


















