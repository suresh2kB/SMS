package com.example.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagmentProjectApplication{

	public static void main(String[] args) {
		System.out.println("Start the Application");
		
		SpringApplication.run(StudentManagmentProjectApplication.class, args);
		System.out.println("Close the Application");
	}
}
