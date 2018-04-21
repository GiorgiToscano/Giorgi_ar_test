package com.model.testForm;

public class UtenteForm {

	private String tipologia,nome,cognome,username,password,ripetiPassword,email,codiceFiscale;
	
	public UtenteForm() {
		// TODO Auto-generated constructor stub
	}
	
	public Utente generaUtente() {
		Utente u = new Utente();
		u.setNome(nome);
		u.setCognome(cognome);
		u.setUsername(username);
		u.setPassword(password);
		u.setEmail(email);
		u.setCodiceFiscale(codiceFiscale);
		u.setTipologia(tipologia);
		return u;
	}

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRipetiPassword() {
		return ripetiPassword;
	}

	public void setRipetiPassword(String ripetiPassword) {
		this.ripetiPassword = ripetiPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	
	

}
