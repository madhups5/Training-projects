package com.npci.dao;

import java.util.ArrayList;
import java.util.List;

import java.util.Iterator;

import com.npci.beans.Employee;

public class EmployeeDaoListImpl implements EmployeeDao {
	private static List<Employee> inMemory;
	public EmployeeDaoListImpl()
	{
		inMemory=new ArrayList<>();
	}
	//auto generate the id using the size of the list
	@Override
	public Employee save(Employee employee) {
		employee.setId(inMemory.size()+1);//set the id based on the size
		inMemory.add(employee);
		return employee;
	}
//using id search employee in the list
	@Override
	public Employee findById(int id) {
		//return inMemory.stream().filter(item->item.getId()==id).findAny().get();
		for(Employee employee:inMemory)
		{
			if(employee.getId()==id)
			{
				return employee;
			}
		}
		return null;
	}

	@Override
	public List<Employee> findAll() {
		return inMemory;
	}

	@Override
	public void delete(int id) {
      Iterator<Employee> itr=inMemory.iterator();
      while(itr.hasNext())
      {
    	  Employee emp=itr.next();
    	  if(emp.getId()==id)
    	  {
    		  itr.remove();
    		  break;
    	  }
      }
	}

}
