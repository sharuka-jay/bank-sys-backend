package com.sharuka.fullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sharuka.fullstack.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer>{

}
