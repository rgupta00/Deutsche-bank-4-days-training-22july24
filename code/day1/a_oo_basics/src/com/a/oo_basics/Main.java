package com.a.oo_basics;

import java.util.*;
import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[] args) {

    	Employee employee=new Employee("raj",45000.00);

    	
    	System.out.println(employee.getId());
    	employee.setSalary(employee.getSalary()+1000);
    	employee.show();
    	
    	System.out.println(Employee.getCounter());
    	
//        Employee e1=new Employee("raj",5000);
//        Employee e2=new Employee("raj",5000);
//
//        //static method can be called with the name of the class we dnot object
      //  System.out.println(Employee.getCounter());

    }
}










