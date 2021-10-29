package com.sharuka.fullstack.service;

import java.util.List;

import com.sharuka.fullstack.model.Bank;

public interface BankService {

	public Bank saveBank(Bank bank);
	public List<Bank>gettAllBanks();
}
