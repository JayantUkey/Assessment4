package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SbDockerAssessmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbDockerAssessmentApplication.class, args);
	}
	
	@GetMapping("/jayant")
	public String sayHi()
	{
		return " Docker Application Assessment No 4";
	}

}
