package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Person;
import com.example.services.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {

	private PersonService personService;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Person> save(@RequestBody final Person person) {
		return ResponseEntity.ok(personService.save(person));
	}
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Person> list(@RequestParam("id") Long id) {
		return ResponseEntity.ok(personService.find(id));
	}

	@Autowired
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}

}
