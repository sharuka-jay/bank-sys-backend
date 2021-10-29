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
import com.sharuka.fullstack.model.Student;
import com.sharuka.fullstack.service.BankService;



@RestController
@RequestMapping("/bank")
@CrossOrigin(origins = "http://localhost:3000")
public class BankController {
	@Autowired
	private BankService bankService;
	
	
	@PostMapping("/add")
    public String add(@RequestBody Bank bank){
        bankService.saveBank(bank);
        return "New bank is added";
    }
	
	@GetMapping("/getAll")
    public List<Bank> list(){
        return bankService.gettAllBanks();
    }
}
