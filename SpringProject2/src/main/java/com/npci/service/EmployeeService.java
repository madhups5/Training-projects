package com.npci.service;

import java.util.List;

import com.npci.beans.Employee;
import com.npci.exceptions.EmployeeNotFoundException;

public interface EmployeeService {
	//stores multiple employee objects-remove @TRansactional in DAO layer
 List<Integer> createEmployees(Employee employee1,Employee...employee);
 Employee createEmployee(Employee employee);
 Employee findEmployee(int id) throws EmployeeNotFoundException;
 void deleteEmpoyee(int id) throws EmployeeNotFoundException;
 List<Employee> findEmployeesByName(String name);
 List<Employee> findEmployees();
 
 /* implement this interface by supplying EmployeeDao*/
}
