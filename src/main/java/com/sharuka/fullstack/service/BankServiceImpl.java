package com.sharuka.fullstack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sharuka.fullstack.model.Bank;
import com.sharuka.fullstack.repository.BankRepository;

@Service
public class BankServiceImpl  implements BankService{
	 @Autowired
	private BankRepository bankRepository;
	@Override
	public Bank saveBank(Bank bank) {
		// TODO Auto-generated method stub
		return bankRepository.save(bank);
	}

	@Override
	public List<Bank> gettAllBanks() {
		return bankRepository.findAll();
	}

}
