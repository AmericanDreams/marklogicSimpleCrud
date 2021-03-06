package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.PersonService;

@Controller
public class GetAllController {
	
	@Autowired
	private PersonService personService;
	
	
	
	@GetMapping("/getAll")
	public ModelAndView showAllPersons() {
		
		ModelAndView  mv  = new ModelAndView("getAll");
		mv.addObject("persons", personService.list());
		return mv;
	}

}
