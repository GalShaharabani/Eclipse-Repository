package com.example.RESTdb.daos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.RESTdb.beans.Person;
import com.example.RESTdb.repositories.PersonRepository;

@Repository
public class PersonDAO {
	
	@Autowired
	private PersonRepository pRepo;
	
	public void addPerson(Person person) {
		pRepo.save(person);
	}
}
