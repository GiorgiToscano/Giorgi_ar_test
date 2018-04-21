package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.model.testForm.UtenteForm;
import com.service.UtenteService;

@Controller
@SessionAttributes("utente")
public class UtenteController {

	@Autowired
	UtenteService utenteService;
	
	@Autowired
	@Qualifier("userValidator")
	private Validator userValidator;
	
	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(userValidator);
	}
	
	@RequestMapping(value = "/utente/new", method = RequestMethod.GET)
	public String showUserForm(Model model) {
		UtenteForm userForm = new UtenteForm();
		
		model.addAttribute("userForm", userForm);
		
		System.out.println("Showed form!");
		
		return "utenteform";
	}
	
	@RequestMapping(value = "/utente/new", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("userForm")UtenteForm uform,Model model, BindingResult result) {
		assert(utenteService != null);
		System.out.println(uform.getEmail());
		if (result.hasErrors() || utenteService.existEmail(uform.getEmail())) {
			System.out.println("Errors in the form!");
			return "utenteform";
		}
		System.out.println("Showed form! from POST");
		return "utenteform";
	}

}
