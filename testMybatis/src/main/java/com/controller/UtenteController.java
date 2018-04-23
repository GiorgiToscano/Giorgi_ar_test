package com.controller;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.model.mail.ConfirmRegistrationEmail;
import com.model.mail.EmailManager;
import com.model.mail.EmailUtils;
import com.model.serio.DBConnect;
import com.model.testForm.Utente;
import com.model.testForm.UtenteForm;
import com.model.validator.UtenteValidator;
import com.service.UtenteService;

@Controller
@SessionAttributes("utente")
public class UtenteController {

	@Autowired
	UtenteService utenteService;
	
	@Autowired
	private UtenteValidator utenteValidator;
	
	@Autowired
	private EmailManager manager;
	
	@RequestMapping(value = "/utente/new", method = RequestMethod.GET)
	public String showUserForm(Model model) {
		UtenteForm userForm = new UtenteForm();
		
		model.addAttribute("userForm", userForm);
		model.addAttribute("errors", false);
		
		
		
		System.out.println("Showed form!");
		System.out.println(EmailUtils.textFromHTML("registrazione_utente"));
		return "utenteform";
	}
	
	@RequestMapping(value = "/utente/new", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("userForm")UtenteForm uform,Model model, BindingResult result, HttpServletRequest request) {

		utenteValidator.validate(uform, result);
		
		if (utenteService.existEmail(uform.getEmail())) {
			result.rejectValue("email", "duplicate.email", "Esiste già un account con questa e-mail");
		}
		
		if (result.hasErrors()) {
			model.addAttribute("errors", true);
			return "utenteform";
		}
		Utente u = uform.generaUtente();
		
		utenteService.registerUser(u);
		System.out.println("Registrato nuovo utente con id: " + u.getId());
		String code = generateActivationCode(u);
		
		//EMAIL
		ConfirmRegistrationEmail cre = new ConfirmRegistrationEmail(u, getActivationLink(code, request));
		manager.sendEmail(cre, u.getEmail());
		
		
		System.out.println("Showed form! from POST");
		return "utenteform";
	}	
	
//	@ModelAttribute("tipologie")
//	public Map<String,String> populateTipologie(){
//		Map<String,String> tipologieMap = new LinkedHashMap<String,String>();
//		tipologieMap.put("0", "");
//		return tipologieMap;
//	}
	
	private String getActivationLink(String activationCode,HttpServletRequest req) {
		String host = "";
		int port = -1;
		try {
			URL url = new URL(req.getRequestURL().toString());
			host = url.getHost();
			port = url.getPort();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		return host + ":" + port + "/attivazione_utente.htm?code=" + activationCode;
	}
	
	private String generateActivationCode(Utente u) {
		return (u.getId()+"").length() + DBConnect.getRandomString(32) + u.getId();
	}

}
