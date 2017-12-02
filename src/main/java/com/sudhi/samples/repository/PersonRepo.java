package com.sudhi.samples.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sudhi.samples.model.Person;



public interface PersonRepo extends JpaRepository<Person, Long>{
	
}
