package com.mc.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringMicrocontrollerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicrocontrollerApplication.class, args);
	}
	
	@RequestMapping("/name")
	public Student display() {
		Student s1= new Student();
		s1.setName("Venkat Meruva");
		return s1;
	}
	
}
