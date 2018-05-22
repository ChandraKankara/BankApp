package com.nisum.api.dao;


import java.util.Collection;

import com.nisum.api.model.Bank;

public interface BankDao {
	//Collection<Bank> searchATMsByZipcode(String name,String zipCode);
	Collection<Bank> searchATMsByZipcode(String zipCode);
}
