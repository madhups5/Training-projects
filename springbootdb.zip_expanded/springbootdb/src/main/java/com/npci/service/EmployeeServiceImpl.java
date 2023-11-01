package com.npci.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.npci.beans.Employee;
import com.npci.dao.EmployeeDao;
import com.npci.exceptions.EmployeeNotFoundException;

@Service("service") // id=service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;

	// in old EmployeeDao we had created our own methods which wont work

	@Transactional
	@Override
	public List<Integer> createEmployees(Employee employee1, Employee... employee) {

		return null;
	}

	@Transactional
	@Override
	public Employee createEmployee(Employee employee) {
		return employeeDao.save(employee);
	}

	@Override
	public Employee findEmployee(int id) throws EmployeeNotFoundException {
		Optional<Employee> op = employeeDao.findById(id);
		// below code either returns employee or throws EmployeeNotFoundException
		return op.orElseThrow(() -> new EmployeeNotFoundException("id " +id + " not found"));
	}

	@Override
	public void deleteEmpoyee(int id) throws EmployeeNotFoundException {

	}

	@Override
	public List<Employee> findEmployeesByName(String name) {
		return employeeDao.findByName(name);
	}

	@Override
	public List<Employee> findEmployees() {
		return employeeDao.findAll();
	}

}
