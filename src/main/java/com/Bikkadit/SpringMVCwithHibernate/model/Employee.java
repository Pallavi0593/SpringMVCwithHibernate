package com.Bikkadit.SpringMVCwithHibernate.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee_Details")
public class Employee 
{
	
	
	@Column(name = "EMPLOYEE_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;

	@Column(name = "EMPLOYEE_NAME")
	private String employeeName;

	@Column(name = "EMPLOYEE_ADDR")
	private String employeeAddr;

	@Column(name = "EMPLOYEE_EMAIL")
	private String employeeEmail;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddr() {
		return employeeAddr;
	}

	public void setEmployeeAddr(String employeeAddr) {
		this.employeeAddr = employeeAddr;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAddr="
				+ employeeAddr + ", employeeEmail=" + employeeEmail + "]";
	}
	

}
