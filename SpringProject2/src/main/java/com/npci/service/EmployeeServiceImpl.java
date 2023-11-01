package com.npci.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.npci.beans.Employee;
import com.npci.dao.EmployeeDao;
import com.npci.exceptions.EmployeeNotFoundException;

@Service("service")//id=service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
	private EmployeeDao employeeDao;

	@Override
	@Transactional
	public List<Integer> createEmployees(Employee employee1, Employee... employees) {
		List<Integer> idList = new ArrayList<>();
		Employee e = employeeDao.save(employee1);
		idList.add(e.getId());
		for (Employee emp : employees) {
			Employee e2 = employeeDao.save(emp);
			idList.add(e2.getId());
		}
		return idList;
	}

	@Override
	@Transactional
	public Employee createEmployee(Employee employee) {

		return employeeDao.save(employee);
	}

	@Override
	public Employee findEmployee(int id) throws EmployeeNotFoundException {
		Employee employee=employeeDao.findById(id);
		if(employee!=null)
		return employee;
		throw new EmployeeNotFoundException("Employee ID"+id+"is Not Found");
	}
	
	@Override
	public List<Employee> findEmployees() {
		return employeeDao.findAll();
	}
	
	@Override
	public List<Employee> findEmployeesByName(String name) {
		List<Employee> employees=findEmployees();
		List<Employee> names=employees.stream()
				.filter(item->item.getName().equals(name)).collect(Collectors.toList());
		return names;
	}

	@Override
	@Transactional
	public void deleteEmpoyee(int id) throws EmployeeNotFoundException {
		Employee employee=findEmployee(id);
		employeeDao.delete(employee.getId());
	}

	

	
}
