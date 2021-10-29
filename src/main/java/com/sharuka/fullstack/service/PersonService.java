package com.sharuka.fullstack.service;

import java.util.List;

import com.sharuka.fullstack.model.Person;

public interface PersonService {
 public Person savePerson(Person person);
 public List<Person>getAllPerson();
}
