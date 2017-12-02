package com.sudhi.samples.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sudhi.samples.dto.PersonDto;
import com.sudhi.samples.service.AddressService;

@RestController
public class PersonController {
	@Autowired
	private AddressService personService;

	public AddressService getPersonService() {
		return personService;
	}

	public void setPersonService(AddressService personService) {
		this.personService = personService;
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/savePerson", headers="Accept=application/json")
	public ResponseEntity<Void> savePerson(@RequestBody PersonDto person){
		String personId = personService.CreatePerson(person);
		HttpHeaders http = new HttpHeaders();
		http.add("PersonID", personId);
		return new ResponseEntity<Void>(http, HttpStatus.CREATED);
	}

}
