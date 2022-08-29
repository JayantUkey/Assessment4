package com.JunitSpringPractice.service;

import com.JunitSpringPractice.model.Employee;

public interface EmployeeService {

	 public String getEmployeeDescription();

	 public Employee getEmployee(int id);
	 
	 public Employee createEmployee(Employee employee);
	
}
