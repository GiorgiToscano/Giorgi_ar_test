package com.service;

import com.model.testForm.Utente;

public interface UtenteService {

	public boolean existEmail(String email);
	public void registerUser(Utente utente);
	
}
