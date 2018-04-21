package com.model;

import java.util.Date;

public class Corso {

	private String descrizione,	articolazione, sigla;
	private boolean sospeso;
	private Date ultimaModifica;
	private int idUtente;
	
	public Corso() {
		super();
	}
	
	

	public Corso(String descrizione, String articolazione, String sigla, boolean sospeso, Date ultimaModifica,
			int idUtente) {
		this.descrizione = descrizione;
		this.articolazione = articolazione;
		this.sigla = sigla;
		this.sospeso = sospeso;
		this.ultimaModifica = ultimaModifica;
		this.idUtente = idUtente;
	}



	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getArticolazione() {
		return articolazione;
	}

	public void setArticolazione(String articolazione) {
		this.articolazione = articolazione;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public boolean isSospeso() {
		return sospeso;
	}

	public void setSospeso(boolean sospeso) {
		this.sospeso = sospeso;
	}

	public Date getUltimaModifica() {
		return ultimaModifica;
	}

	public void setUltimaModifica(Date ultimaModifica) {
		this.ultimaModifica = ultimaModifica;
	}

	public int getIdUtente() {
		return idUtente;
	}

	public void setIdUtente(int idUtente) {
		this.idUtente = idUtente;
	}
	
	
	
	
}
