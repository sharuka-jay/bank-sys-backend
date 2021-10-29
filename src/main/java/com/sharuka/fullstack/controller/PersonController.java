package com.sharuka.fullstack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharuka.fullstack.model.Bank;
import com.sharuka.fullstack.model.Person;
import com.sharuka.fullstack.model.Student;
import com.sharuka.fullstack.service.PersonService;

@RestController
@RequestMapping("/person")
@CrossOrigin(origins = "http://localhost:3000")
public class PersonController {
	@Autowired
	private PersonService personservice;
	
	@PostMapping("/add")
    public String add(@RequestBody Person person){
        personservice.savePerson(person);
        return "New person is added";
    }
	 @GetMapping("/getAll")
	    public List<Person> list(){
	        return personservice.getAllPerson();
	    }
}
