package com.sharuka.fullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sharuka.fullstack.model.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank,Integer> {

}
