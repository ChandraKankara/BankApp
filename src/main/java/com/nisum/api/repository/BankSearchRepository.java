package com.nisum.api.repository;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.nisum.api.model.ATM;
import com.nisum.api.model.Bank;

@Repository
public class BankSearchRepository {

	@Autowired
	MongoTemplate mongoTemplate;
	
	public Collection<Bank> searchBanks(String text) {
		return mongoTemplate.find(Query.query(new Criteria()
						.orOperator(Criteria.where("name").regex(text, "i"))
						), Bank.class);
	}


	public Collection<ATM> searchATMsByZipcode(String zipCode, String bankId) {
		return mongoTemplate.find(Query.query(new Criteria()
						.orOperator(Criteria.where("zipCode").regex(zipCode, "i"))
						), ATM.class);
	}
}
