package com.npci.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.npci.beans.Employee;
 import com.npci.exceptions.EmployeeNotFoundException;
import com.npci.service.EmployeeService;


public class TestControllerFromMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-orm-beans.xml");
		// Controller depends on service
		EmployeeService service = (EmployeeService) context.getBean("service");
		// call all the methods of service
		
		//creating employees
		List<Integer> ids = service.createEmployees(
				new Employee(0, "Madhu", 30000.0),
				new Employee(0, "Laxman", 40000.0),
				new Employee(0, "service", 50000.0));
		System.out.println(ids);
		
		//find employee by id
		try {
			service.findEmployee(2);
		} catch (EmployeeNotFoundException e) {
			e.printStackTrace();
		}
		
		//find employee by name
		service.findEmployeesByName("Madhu"); 
		
		//find all employees
		service.findEmployees();
		
		//delete employee
		try {
			service.deleteEmpoyee(5);
		} catch (EmployeeNotFoundException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
