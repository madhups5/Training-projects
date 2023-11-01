package com.npci;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

public class TestEmployee {

	public static void main(String[] args) {
		//TreeSet looks for comparable type of sort
		//String,Integer,Double,LocalDate and so on implements comparable,compareTo(T t)
		// TreeSet Uses Comparable to compare by default
		//sorting based on comparator using LocalDate		
		//Set<Employee> set= new TreeSet<>((a,b)->a.getDob().compareTo(b.getDob()));
		//sort the employee based on salary 
		Set<Employee> set= new TreeSet<>((a,b)->Double.compare(b.getSalary(), a.getSalary()));		
		set.add(new Employee(100,"Madhu",29000.0,LocalDate.parse("2001-04-05")));
		set.add(new Employee(200,"Ramu",40000.0,LocalDate.parse("1999-11-05")));
		set.add(new Employee(300,"Laxman",30000.0,LocalDate.parse("1998-11-05")));
		set.add(new Employee(400,"Virat",50000.0,LocalDate.parse("1987-11-05")));
		for(Employee e:set)
		{ 
			System.out.println(e);
		}

	}

}
