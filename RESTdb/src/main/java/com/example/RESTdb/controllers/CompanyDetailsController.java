package com.example.RESTdb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.RESTdb.beans.Customer;
import com.example.RESTdb.daos.CustomerDAO;

@RestController
@RequestMapping("/companydetails")
public class CompanyDetailsController {
	
	
	private Customer customer;
	
	@Autowired
	private CustomerDAO cDAO;
	
	@PostMapping("/addcustomer")
	private ResponseEntity<?> addCustomer(@RequestParam(name = "name")String name, @RequestParam(name = "name")String id){
		customer.setName(name);
		int customerId= Integer.parseInt(id);
		customer.setId(customerId);
		cDAO.addCustomer(customer);
		return new ResponseEntity<>( "Customer: '"+customer.getId()+"'  has been added", HttpStatus.OK);
	}

}
