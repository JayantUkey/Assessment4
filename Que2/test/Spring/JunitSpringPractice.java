package com.JunitSpringPractice.Spring;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.JunitSpringPractice.main.AppConfig;
import com.JunitSpringPractice.model.Employee;
import com.JunitSpringPractice.service.EmployeeService;

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(classes = AppConfig.class, loader = AnnotationConfigContextLoader.class)

public class JunitSpringPractice {

	@Autowired
	private EmployeeService employeeService;

	@BeforeClass
	public static void setUp() {
		System.out.println("-----> SETUP <-----");
	}

	@Test
	public void testEmployeeService() {
		assertEquals("class com.JunitSpringPractice.service.EmployeeServiceImpl",
				this.employeeService.getClass().toString());

	}

	@Test
	public void testEmployeeServiceGetEmployeeDescription() {
		assertTrue(employeeService.getEmployeeDescription().contains("Description:"));
	}
	
	 @Test
	 public void testEmployeeServiceCreateNewEmployee() {
		 
		 Employee newEmployee = new Employee();
		 newEmployee.setDesignation("Software Engineer");
		 
		 if(newEmployee != null)
		 {
			 assertThat(employeeService.createEmployee(newEmployee), instanceOf(Employee.class));
			 assertNotNull("Designation isn't  null",newEmployee.getDesignation());
		 }
		 assertNotNull("New Employee is not null",newEmployee);
	 }
	 
	 
	 @Test
	 public void testEmployeeServiceCreateGetEmployee()
	 {
		 Employee existingEmployee = new Employee();
		 
		 if(existingEmployee != null)
		 {
			 assertThat(employeeService.getEmployee(0),instanceOf(Employee.class));
			 assertNotNull("Designation isn't  null",existingEmployee.getDesignation()); 
		 }
		 assertNotNull("Object is not null",existingEmployee);
	 }
	 

	@AfterClass
	public static void afterTest() {
		System.out.println("-----> DESTROY <-----");
	}

}
