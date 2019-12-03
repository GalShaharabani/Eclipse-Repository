package com.example.RESTdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ResTdbApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(ResTdbApplication.class, args);
		System.out.println("yalla");
	}

}
