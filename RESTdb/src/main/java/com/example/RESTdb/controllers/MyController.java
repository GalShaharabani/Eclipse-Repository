package com.example.RESTdb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.RESTdb.beans.Person;
import com.example.RESTdb.daos.PersonDAO;

@RestController
@RequestMapping("/welcome")
public class MyController {
	
	
	@GetMapping("/login")
	private ResponseEntity<?>tryToLogin(@RequestParam(name = "email") String email,@RequestParam(name = "password") String password,@RequestParam(name = "type") String type) {
		
		if (email.equals("gal@gmail.com") && password.equals("1234") && type.equalsIgnoreCase("Admin")) {
			return new ResponseEntity<>("Welcome admin!", HttpStatus.OK);
		}
		else if(email.equals("gal@mazda.com") && password.equals("1234") && type.equalsIgnoreCase("Company")) {
			return new ResponseEntity<>("Welcome company!", HttpStatus.OK);
		}
		else if(email.equals("moshe@gmail.com") && password.equals("1234") && type.equalsIgnoreCase("Customer")) {
			return new ResponseEntity<>("Welcome customer!", HttpStatus.OK);
		}
		
		return new ResponseEntity<>("User not found!", HttpStatus.NOT_FOUND);
		
	}
	
	

}
