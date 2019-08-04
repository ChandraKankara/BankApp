package com.nisum.api.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nisum.api.dao.BankImpl;
import com.nisum.api.model.ATM;
import com.nisum.api.model.Bank;
import com.nisum.api.repository.BankRepository;

@Controller
public class BankAppController {
	//@Qualifier("clientRepository")
	@Autowired 
	BankRepository bankRepository;
	
	@Autowired
	BankImpl bankSearchRepository;
	
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
	public ResponseEntity<?> search(@RequestParam String zipcode) {
		Collection<Bank> bank = bankSearchRepository.searchATMsByZipcode(zipcode);
		return new ResponseEntity<Collection<Bank>>(bank, HttpStatus.OK);
	}
	
    @RequestMapping(value = "/banks/search")
	public ResponseEntity<?> search(@RequestParam String zipcode, @RequestParam String bankId) {
		List<ATM> bank = bankSearchRepository.searchATMsByZipcode(zipcode, bankId);
 		return new ResponseEntity<List<ATM>>(bank, HttpStatus.OK);
	}
	
}
