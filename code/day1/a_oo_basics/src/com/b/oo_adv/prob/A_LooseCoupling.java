package com.b.oo_adv.prob;

import java.util.Scanner;

class Metro{
    public void move(String s, String d){
        System.out.println("passnager is moving from "+ s +" to "+ d +" using metro");
    }
}
class Car {
    public void move(String s, String d){
        System.out.println("passnager is moving from "+ s +" to "+ d +" using car");
    }
}
class Bike {
    public void move(String s, String d){
        System.out.println("passnager is moving from "+ s +" to "+ d +" using bike");
    }
}


class Passanger{
    private String name;

    public Passanger(String name) {
        this.name = name;
    }
    public void travel(String s, String d,Car car){
        System.out.println("name of passanger is "+ name);
         car.move(s, d);
    }
}
public class A_LooseCoupling {

    public static void main(String[] args) {

        //Change is the only constant in life or in programming!
        
    	Car car=new Car();
        Passanger passanger=new Passanger("amit");
        passanger.travel("LN","Noida", car);

    }
}


















