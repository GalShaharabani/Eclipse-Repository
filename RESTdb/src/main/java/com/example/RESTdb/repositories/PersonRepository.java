package com.example.RESTdb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RESTdb.beans.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
