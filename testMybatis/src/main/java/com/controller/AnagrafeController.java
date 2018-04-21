package com.controller;

import java.sql.Date;
import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.model.AnagrafeDisciplina;
import com.model.Corso;
import com.model.testForm.Sede;
import com.service.AnagrafeService;

@Controller
@SessionAttributes("anagrafe")
public class AnagrafeController {

	@Autowired
	private AnagrafeService anagrafeService;

	@RequestMapping(value = "/addDisciplina", method = RequestMethod.GET)
	public String hello(Model model) {

		AnagrafeDisciplina dis = new AnagrafeDisciplina(0,(int)(Math.random()*100),"Disciplina test",false,Date.from(Instant.now()));

		anagrafeService.insertDisciplina(dis);

		return "success";

	}
	
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public String testJSP(@ModelAttribute("sedeForm") Sede sede, Model model) {

		//Corso c = new Corso("Recupero Informatica", "TLC", "RI", false, Date.from(Instant.now()), 0);

		//anagrafeService.aggiungiCorso(c);
		
		model.addAttribute("message", sede.getDescrizione());

		return "test";

	}
	
	@RequestMapping(value = "/sede/form", method  = RequestMethod.GET)
	public String showAddSedeForm(Model model) {
		Sede sede = new Sede();
		model.addAttribute("sedeForm", sede);
		System.out.println("Test!");
		return "test";
	}
	
	@RequestMapping(value = "/sede/form", method = RequestMethod.POST)
	public String saveSede(@ModelAttribute("sedeForm") Sede sede, Model model) {
		
		System.out.println(sede.getDescrizione());
		
		return "test";
	}

}
