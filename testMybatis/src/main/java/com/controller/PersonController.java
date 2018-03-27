package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.model.Person;
import com.service.PersonService;

@Controller
@SessionAttributes("person")
public class PersonController {

	@Autowired
	private PersonService personService;
	
	
	@RequestMapping(value= "/person", method=RequestMethod.GET)
	public String hello(Model model) {
		
		Person person = new Person();
		
		personService.insertPerson(person);
		
		return "failure";
		
	}

}
