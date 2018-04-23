package com.model.testForm;

import java.util.Date;

public class Utente {

	private String tipologia,nome,cognome,username,password,email,codiceFiscale,codAtt;
	private int id,areaUtente;
	private boolean primoIngresso;
	private Date signupDate;
	
	public Utente() {
		
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


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public boolean isPrimoIngresso() {
		return primoIngresso;
	}


	public void setPrimoIngresso(boolean primoIngresso) {
		this.primoIngresso = primoIngresso;
	}


	public String getCodAtt() {
		return codAtt;
	}


	public void setCodAtt(String codAtt) {
		this.codAtt = codAtt;
	}


	public Date getSignupDate() {
		return signupDate;
	}


	public void setSignupDate(Date signupDate) {
		this.signupDate = signupDate;
	}


	public int getAreaUtente() {
		return areaUtente;
	}


	public void setAreaUtente(int areaUtente) {
		this.areaUtente = areaUtente;
	}

	
	
}
