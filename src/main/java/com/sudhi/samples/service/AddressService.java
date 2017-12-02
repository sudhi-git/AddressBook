package com.sudhi.samples.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sudhi.samples.dto.PersonDto;
import com.sudhi.samples.model.Person;
import com.sudhi.samples.repository.PersonRepo;

@Service
public class AddressService{

	@PersistenceContext
	private EntityManager em;

	@Autowired
	private PersonRepo repo;
	
	public AddressService(PersonRepo repo) {
		super();
		this.repo = repo;
	}
	
	@Transactional
	public String CreatePerson(PersonDto person){
		Mapper mapper = new Mapper();
		Person personApi = mapper.PersonDto2Entity(person);
		repo.save(personApi);
		return personApi.getId();
	}
}