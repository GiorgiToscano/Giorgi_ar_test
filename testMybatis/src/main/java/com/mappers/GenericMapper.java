package com.mappers;

public interface GenericMapper<T> {

	public void insert(T o);
	public void update(T o);
	public void remove(T o);
	public void select(int id);
	
}
