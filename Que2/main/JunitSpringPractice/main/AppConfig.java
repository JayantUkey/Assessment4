package com.JunitSpringPractice.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.JunitSpringPractice.service.EmployeeService;
import com.JunitSpringPractice.service.EmployeeServiceImpl;

@Configuration
public class AppConfig {
	
	@Bean
	public EmployeeService getEmployeeService() {
		return new EmployeeServiceImpl();
	}

}
