package com.model.mail;

import com.model.testForm.Utente;

public class ConfirmRegistrationEmail extends Email {

	private static final EmailTemplate template = new EmailTemplate("Registrazione utente - Area Riservata GIORGI", "registrazione_utente");
	
	public ConfirmRegistrationEmail(Utente u, String linkAttivazione) {
		super(template);
		mapParameter("username", u.getUsername());
		mapParameter("password", u.getPassword());
		mapParameter("nominativo", u.getNome() + " " + u.getCognome());
		mapParameter("link", linkAttivazione);
	}
	

}
