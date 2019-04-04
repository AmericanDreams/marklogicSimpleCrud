package com.example.demo.service;

import java.util.List;

import com.example.demo.dao.Person;

public interface PersonService {

	public Person insert(Person p);
	
	public List<Person> list();
	
	public Person getPersonById(int id);
	
	public Person update(Person p);
	
	public void deleteById(int id);
	
}
