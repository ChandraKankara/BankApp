package com.nisum.api.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nisum.api.model.ATM;
import com.nisum.api.model.Bank;
import com.nisum.api.repository.BankRepository;
import com.nisum.api.repository.BankSearchRepository;

@Controller
public class BankAppController {
	@Qualifier("clientRepository")
	@Autowired 
	BankRepository bankRepository;
	
	@Autowired
	BankSearchRepository bankSearchRepository;
	
	@RequestMapping("/banks")
	public ResponseEntity<Iterable<Bank>> banks() {
		return new ResponseEntity<Iterable<Bank>>(bankRepository.findAll(), HttpStatus.OK);
	}
	
    @RequestMapping(value = "/banks", method = RequestMethod.POST)
    public ResponseEntity<?> createBank(@RequestBody Bank bank) {
		Bank savedBank = bankRepository.save(bank);
        return new ResponseEntity<Bank>(savedBank, HttpStatus.CREATED);
    }
    @RequestMapping(value = "/banks", method = RequestMethod.PUT)
    public ResponseEntity<?> updateBank(@RequestBody Bank bank) {
		Bank savedBank = bankRepository.save(bank);
        return new ResponseEntity<Bank>(savedBank, HttpStatus.OK);
    }
    @RequestMapping(value = "/banks", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteBank(@RequestBody Bank bank) {
		Bank savedBank = bankRepository.save(bank);
        return new ResponseEntity<Bank>(savedBank, HttpStatus.OK);
    }
	
	@RequestMapping(value = "/banks/search")
	public ResponseEntity<?> search(@RequestParam String zipcode, @RequestParam String bankId) {
		Collection<ATM> atms = bankSearchRepository.searchATMsByZipcode(zipcode, bankId);
		return new ResponseEntity<Collection<ATM>>(atms, HttpStatus.OK);
	}
	
}
