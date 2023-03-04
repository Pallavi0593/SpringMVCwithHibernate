package com.Bikkadit.SpringMVCwithHibernate.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.Bikkadit.SpringMVCwithHibernate.model.Employee;
@Repository
public interface EmployeeDaoi {
	
	public int SaveEmployee(Employee emp);
	
	 public List<Employee> GetEmployeeLIst();
}
