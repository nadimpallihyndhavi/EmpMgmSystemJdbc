package com.cg.ems.ui;

import java.util.HashSet;
import java.util.TreeSet;

import com.cg.ems.dto.Employee;

public class TestHashSetDemo {
	public static void main(String[] args){
		
/*		HashSet<Employee> emps = new HashSet<Employee>();
		
		emps.add(new Employee(111, "Hyndhavi", 1000.0F));
		emps.add(new Employee(222, "Alekhya", 2000.0F));
	    emps.add(new Employee(111, "Hyndhavi", 3000.0F));
		
		System.out.println(emps);
		*/
		System.out.println("*******************");
		TreeSet<String> cities=new TreeSet<String>();
		
		
		cities.add("Pune");
		cities.add("Noida");
		cities.add("Mumbai");
		cities.add("Sahibabad");
		cities.add("Pune");
		cities.add("Banglore");
		cities.add("Hyderabad");
		
		System.out.println(cities);
		
		System.out.println("*******************");
		
		TreeSet<Employee> emps=new TreeSet<Employee>();
		
		
		emps.add(new Employee(111, "Hyndhavi", 1000.0F));
		emps.add(new Employee(222, "Alekhya", 2000.0F));
	    emps.add(new Employee(111, "Hyndhavi", 3000.0F));
	    emps.add(new Employee(333, "Swetha", 4000.0F));
	    
	    System.out.println(emps);
		
		
	}

}