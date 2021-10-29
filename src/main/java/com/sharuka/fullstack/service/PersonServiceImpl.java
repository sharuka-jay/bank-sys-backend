package com.sharuka.fullstack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sharuka.fullstack.model.Person;
import com.sharuka.fullstack.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService{
	 @Autowired
	private PersonRepository personRepository;
	@Override
	public Person savePerson(Person person) {
		// TODO Auto-generated method stub
		return personRepository.save(person);
	}

	@Override
	public List<Person> getAllPerson() {
		// TODO Auto-generated method stub
		return personRepository.findAll();
	}

}
