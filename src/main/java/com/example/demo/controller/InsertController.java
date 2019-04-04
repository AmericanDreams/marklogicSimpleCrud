package com.example.demo.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.Person;
import com.example.demo.service.PersonService;

import io.github.malteseduck.springframework.data.marklogic.core.MarkLogicOperations;

@Controller
public class InsertController {

	
	@Autowired
	private PersonService personService;
	

	@GetMapping("/insert")
	public ModelAndView getInsertPage(Model model) {

		return new ModelAndView("insert", "person", new Person());

	}
	

	@PostMapping("/insert")
	public String processInsertForm(@ModelAttribute("person") Person person, BindingResult result, ModelMap model) {

		personService.insert(person);
		
		return "insert";
	}

}
