package com.npci;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class TestUnique {
	public static void main(String[] args) {
		
		// storing simple type of data in the set
		//int-Integer , double-Double,char-Character,boolean-Boolean
		//		Set<Integer> set= new HashSet<>();
		//		set.add(3);
		//		set.add(87);
		//		set.add(18);
		//		set.add(1);
		//		set.add(3);
		//		set.add(7);
		//		System.out.println("size:"+set.size());
		//		for(int value : set)
		//		{
		//			System.out.println(value);
		//		}
		
		//storing complex type in the set

		Set<Employee> employee = new HashSet<>();
		employee.add(new Employee(100,"Madhu",45000.0,LocalDate.parse("2001-05-04")));
		employee.add(new Employee(100,"Madhu",45000.0,LocalDate.parse("2001-05-04")));
		employee.add(new Employee(100,"Madhu",45000.0,LocalDate.parse("2001-05-04")));
		employee.add(new Employee(200,"Laxman",30000.0,LocalDate.parse("1999-11-05")));
		
		System.out.println("Size :"+employee.size());
		for (Employee emp: employee)
		{
			System.out.println(emp);
		}


	}


}
