package com.JunitSpringPractice.service;

import java.util.Random;

import com.JunitSpringPractice.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	
	 public String getEmployeeDescription()
	 {
		 Employee newEmployee = new Employee();
		 newEmployee.setDesignation("About Software Engineer Role");
		 return "Description:"+newEmployee.getDesignation();
	 }
	 
	 
	 public Employee createEmployee(Employee employee)
	 {
		 Employee newEmployee = new Employee();
		 newEmployee.setEmpId(new Random().nextInt());
		 newEmployee.setName("Jayant");
		 newEmployee.setDesignation("Trainee Software Engg");
		 newEmployee.setSalary(40000);
		 
		 return newEmployee;
		 
	 }

	 public Employee getEmployee(int id)
	 {
		 Employee newEmployee = new Employee();
		 
		 newEmployee.setEmpId(new Random().nextInt());
		 newEmployee.setName("Jayant");
		 newEmployee.setDesignation("Associate Software Engg");
		 newEmployee.setSalary(50000);
		 
		 return newEmployee;
	 }
	 
}
