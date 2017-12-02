package com.sudhi.samples.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.sudhi.samples.dto.AddressDto;
import com.sudhi.samples.dto.PersonDto;
import com.sudhi.samples.model.Address;
import com.sudhi.samples.model.Person;

public class Mapper {
	public Person PersonDto2Entity(PersonDto personRest){
		Person per = new Person();
		per.setId(UUID.randomUUID().toString());
		per.setFName(personRest.getFName());
		per.setMName(personRest.getMName());
		per.setLName(personRest.getLName());
		per.setAddress(mapAddress(per.getId(), personRest.getAddress()));
		return per;
	}
	
	protected List<Address> mapAddress(String personId, List<AddressDto> address){
		List<Address> addList = new ArrayList<>();
		for (AddressDto add : address) {
			Address addEntry = new Address();
			addEntry.setStreet1(add.getStreet1());
			addEntry.setStreet2(add.getStreet2());
			addEntry.setPostalCode(add.getPostalCode());
			addEntry.setCity(add.getCity());
			addEntry.setCountry(add.getCountry());
			addEntry.setCountryCode(add.getCountryCode());
			addEntry.setHouseNumber(add.getHouseNumber());
			addEntry.setEmailAddress(add.getEmailAddress());
			addEntry.setId(personId);
			addList.add(addEntry);
		}
		return addList;
	}

	
}