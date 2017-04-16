package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.PersonDAO;
import com.example.model.Person;

@Service
public class PersonService {

	private PersonDAO personDAO;

	public Person save(Person person) {

		return personDAO.save(person);
	}

	public Person find(Long id) {
		return personDAO.findOne(id);
	}

	@Autowired
	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}

}
