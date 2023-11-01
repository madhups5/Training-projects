package com.npci;

import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Comparable<Employee> {

	 private int id;
	 private String name;
	 private double salary;
	 private LocalDate dob;
	public Employee(int id, String name, double salary, LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dob = dob;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id;
	}

	@Override
	public int compareTo(Employee o) {
		return this.id-o.id;
		//return id-o.getId()
	}
	
	 
	 
}
