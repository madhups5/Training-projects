package com.npci.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.npci.beans.Employee;

@Repository//id=employeeDaoORMImpl
public class EmployeeDaoORMImpl implements EmployeeDao {
	// DriverManagerDataSource>>LocalSessionFactoryBean>>HibernateTemplate>>EmployeeDaoORMImpl
	// spring container must create this Dao object & supply the HibernateTemplate
	// <bean id="dao" class="com.npci.dao.EmployeeDaoORMImpl>
	// <property name="template" ref="hibernateTemplateBean">
	@Autowired
	private HibernateTemplate template;// generate setter

	@Override
	public Employee save(Employee employee) {
		// save method returns a serializable id that is generated
		int id = (int) template.save(employee);// generates insert query
		// now using the id you can get the employee object
		return template.get(Employee.class, id);// generates query where id=?
		// return findById(id);//we can return by findById() also
	}

	@Override
	public Employee findById(int id) {
		// Internal Query-select * from employee where primarykey=idValue
		return template.get(Employee.class, id);
	}

	@Override
	public List<Employee> findAll() {
// loadAll()-> select * from employee-> each record is added as an employee in the list<T>.
		return template.loadAll(Employee.class);
	}

	@Override
	public void delete(int id) {
		Employee employee=findById(id);
		if(employee!=null)	
		{
			//delete(T t)-> delete from employee where id=employee.getId();
		 template.delete(employee);	
		}
	}

}
