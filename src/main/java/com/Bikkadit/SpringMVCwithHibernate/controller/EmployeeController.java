package com.Bikkadit.SpringMVCwithHibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Bikkadit.SpringMVCwithHibernate.model.Employee;
import com.Bikkadit.SpringMVCwithHibernate.service.EmployeeService;

@Controller
public class EmployeeController {
	
	
	
	public EmployeeController() {

		System.out.println("Employee class constructor");
		
	}
	@Autowired
 private EmployeeService employeeService;
	
	@GetMapping("/preRegister")
	public String preRegister() {

		return "UserReg";

	}
	
	@PostMapping("/saveEmployee")
	
	public String saveEmployee(Employee emp,Model model) {
		int empId = employeeService.SaveEmployee(emp);
		
		model.addAttribute("EMPID", empId);
		return "usersuccess";
}
	@GetMapping("/Resultdata")
public String getAllEmployee(Model md) {
	List<Employee> employeeLIst = employeeService.GetEmployeeLIst();
	
	md.addAttribute("EMPLOYEELIST", employeeLIst);
	
	return "Fetchdata";
	
}
	

}
