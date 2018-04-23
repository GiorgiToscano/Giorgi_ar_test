package com.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mappers.UtenteMapper;
import com.model.testForm.Utente;

@Service("utenteService")
public class UtenteServiceImpl implements UtenteService{

	@Autowired
	UtenteMapper utenteMapper;
	
	@Transactional
	public boolean existEmail(String email) {
		HashMap<String,Object> result = utenteMapper.selectEmail(email);
		return result != null;
	}

	@Transactional
	public void registerUser(Utente utente) {
		utenteMapper.register(utente);
	}

}
