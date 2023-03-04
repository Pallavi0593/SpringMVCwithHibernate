package com.Bikkadit.SpringMVCwithHibernate.dao;



import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Bikkadit.SpringMVCwithHibernate.model.Employee;

import jakarta.persistence.Query;

@Repository
public class Employeedaoimpl implements EmployeeDaoi  {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public int SaveEmployee(Employee emp) {
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		int save = (int) session.save(emp);
		
		session.getTransaction().commit();

		return save;
	}


	@Override
	public List<Employee> GetEmployeeLIst() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		String query="from Employee";
		
		Query q=session.createQuery(query);
		
		List<Employee> list=q.getResultList();
		return list;
	}

}
