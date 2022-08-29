package com.areyes1.jgc.junit.spring.service;

import com.areyes1.jgc.unit.obj.Employee;

public interface SampleService {

	 public double getEmployeeSalary();
	
	public Employee getEmployee(int id);

	public Employee createEmployee(Employee employee);

}
