package com.model;

import java.util.Date;

public class AnagrafeDisciplina {

	private int id;
	private int idUtente;
	private String desc;
	private boolean sospeso;
	private Date data;
	
	public AnagrafeDisciplina() {
		
	}

	public AnagrafeDisciplina(int id, int idUtente, String desc, boolean sospeso, Date data) {
		this.id = id;
		this.desc = desc;
		this.sospeso = sospeso;
		this.data = data;
		this.idUtente = idUtente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public boolean isSospeso() {
		return sospeso;
	}

	public void setSospeso(boolean sospeso) {
		this.sospeso = sospeso;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getIdUtente() {
		return idUtente;
	}

	public void setIdUtente(int idUtente) {
		this.idUtente = idUtente;
	}

}
