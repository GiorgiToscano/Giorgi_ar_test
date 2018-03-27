package com.model;

import com.mappers.Mappable;

public class Person implements Mappable{
	
	int id;
	String name,surname;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getUniqueID() {
		return id;
	}
	
	
	
}
