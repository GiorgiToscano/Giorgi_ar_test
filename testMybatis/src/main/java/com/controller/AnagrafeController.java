package com.controller;

import java.sql.Date;
import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.model.AnagrafeDisciplina;
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

}
