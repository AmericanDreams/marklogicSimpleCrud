package com.example.demo.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Person;
import com.example.demo.service.PersonService;
import com.marklogic.client.query.StructuredQueryBuilder;
import com.marklogic.client.query.StructuredQueryDefinition;

import io.github.malteseduck.springframework.data.marklogic.core.MarkLogicOperations;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private MarkLogicOperations ops;

	@Override
	public Person insert(Person p) {

		LocalDateTime time = LocalDateTime.now();
		Integer generatedId = Integer
				.valueOf(time.getDayOfMonth() + "" + time.getHour() + "" + time.getMinute() + "" + time.getSecond());
		p.setId(generatedId);

		Person write = ops.write(p);

		return write;
	}

	@Override
	public List<Person> list() {

		List<Person> search = ops.search(Person.class);

		return search;

	}

	@Override
	public Person getPersonById(int id) {

		
		Person read = ops.read(id, Person.class);

		return read;
	}

	@Override
	public Person update(Person p) {

		Person write = ops.write(p);

		return write;

	}

	@Override
	public void deleteById(int id) {
		
		ops.deleteById(id, Person.class);
		
	}

}
