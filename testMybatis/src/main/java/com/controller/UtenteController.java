package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.model.testForm.UtenteForm;

@Controller
@SessionAttributes("utente")
public class UtenteController {

	public UtenteController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping(value = "/utente/new", method = RequestMethod.GET)
	public String showUserForm(Model model) {
		UtenteForm userForm = new UtenteForm();
		
		model.addAttribute("userForm", userForm);
		
		return "utenteform";
	}

}
