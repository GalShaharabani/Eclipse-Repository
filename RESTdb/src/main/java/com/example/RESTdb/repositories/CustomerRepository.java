package com.example.RESTdb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RESTdb.beans.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
