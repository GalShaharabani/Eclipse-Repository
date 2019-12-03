package com.example.RESTdb.daos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.RESTdb.beans.Customer;
import com.example.RESTdb.repositories.CustomerRepository;

@Repository
public class CustomerDAO {

	@Autowired
	private CustomerRepository cRepo;
	
	public void addCustomer(Customer c) {
		cRepo.save(c);
	}
}
