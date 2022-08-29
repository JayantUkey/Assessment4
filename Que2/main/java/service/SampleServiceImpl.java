package com.areyes1.jgc.junit.spring.service;

import java.util.Random;

import com.areyes1.jgc.unit.obj.Employee;

public class SampleServiceImpl implements SampleService {

	 public double getEmployeeSalary() {

		 Employee existingEmployee = new Employee();

		 existingEmployee.setEmployeeSal(5000);

		 return existingEmployee.getEmployeeSal();

		 }
	
	public Employee createEmployee(Employee employee) {

		Employee newEmployee = new Employee();

		newEmployee.setEmployeeId(new Random().nextInt());

		newEmployee.setEmployeeName("Sakshi");
		
		newEmployee.setEmployeeSal(5000);

		return newEmployee;

	}

	public Employee getEmployee(int id) {

		Employee newEmployee = new Employee();

		newEmployee.setEmployeeId(new Random().nextInt());

		newEmployee.setEmployeeName("Sakshi");
		
		newEmployee.setEmployeeSal(5000);

		return newEmployee;

	}


}
