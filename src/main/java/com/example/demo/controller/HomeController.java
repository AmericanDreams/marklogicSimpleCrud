package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import com.marklogic.client.DatabaseClientFactory.DigestAuthContext;
import com.marklogic.client.query.StructuredQueryBuilder;
import io.github.malteseduck.springframework.data.marklogic.core.MarkLogicOperations;
import io.github.malteseduck.springframework.data.marklogic.core.MarkLogicTemplate;

import static com.marklogic.client.DatabaseClientFactory.newClient;

import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.dao.Person;

@Controller
public class HomeController {
	
	
	@Autowired
	private MarkLogicOperations ops;
	
	@GetMapping("/")
	public String homePage() {
		
//		Person p = new Person(1,"5555555555",34);
//		
//		ops.write(p);
		
				
		return "home";
	}

}
