package com.npci;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.npci.beans.Employee;
import com.npci.service.EmployeeService;

@SpringBootApplication
public class SpringbootdbApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringbootdbApplication.class, args);
//		// the bean id of EmployeeServiceImpl is service
//		EmployeeService service=(EmployeeService)context.getBean("service");
//		//storing the employee
//		Employee employee=service.createEmployee(new Employee(0,"virat",70000.0));
//		System.out.println("Stored Employee is:"+employee.getId());
//		//retreive all the employees
//		List<Employee> employees=service.findEmployees();
//		employees.forEach(item->System.out.println(item.getId()));
		
	}

}
