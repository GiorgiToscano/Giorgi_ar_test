package com.model.testForm;

import java.util.Date;

public class Sede {

	private String descrizione;
	private boolean sospeso;
	private Date ultimaModifica;
	private int idUtente, id;
	
	public Sede() {
		// TODO Auto-generated constructor stub
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
