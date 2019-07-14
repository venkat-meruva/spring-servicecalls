package com.mc1.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class SpringMicrocontroller1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicrocontroller1Application.class, args);
	}
	@RequestMapping("/getname")
	public Student display() {
	RestTemplate r1= new RestTemplate();
	Student s1 =r1.getForObject("http://localhost:8080/name",Student.class);
	System.out.println(s1.getName());
	return s1;


	}}