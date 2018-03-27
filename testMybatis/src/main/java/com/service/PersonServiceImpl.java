package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mappers.PersonMapper;
import com.model.Person;

@Service("personService")
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	PersonMapper personMapper;
	
	@Transactional
	public void insertPerson(Person person) {
		personMapper.insert(person);
	}


}
