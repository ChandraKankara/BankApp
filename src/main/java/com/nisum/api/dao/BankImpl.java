package com.nisum.api.dao;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.nisum.api.model.Bank;

@Repository
public class BankImpl implements BankDao{
	
	@Autowired
	MongoTemplate mongoTemplate;
	@Autowired
	MongoOperations mongoOperations;
	public Collection<Bank> searchBanks(String text) {
		return mongoTemplate.find(Query.query(new Criteria()
						.orOperator(Criteria.where("name").regex(text, "i"))
						), Bank.class);
	}

	/*public Collection<Bank> searchATMsByZipcode(String name,String zipCode) {
		Collection<Bank> query=null;
		query=mongoTemplate.find(Query.query(new Criteria()
						.orOperator(Criteria.where("name").is(name).and("atm").elemMatch(
						          Criteria.where("address.zipCode").is(zipCode)
							    ))
						), Bank.class);
		 return query;
	}*/
	public Collection<Bank> searchATMsByZipcode(String zipCode) {
		Collection<Bank> query=null;
		query=mongoTemplate.find(Query.query(new Criteria()
						.orOperator(Criteria.where("atm").elemMatch(
						          Criteria.where("address.zipCode").is(zipCode)
							    ))
						), Bank.class);
		 return query;
	}
/*	public List<ATM> searchATMsByZipcode(String zipCode, String bankId) {
	// Criteria between = Criteria.where("zipCode");
		Query query=new Query();
	query.addCriteria(Criteria.where("zipCode"));
     List<ATM> popBetween = mongoOperations.find(query, ATM.class);
	return popBetween;
}*/
}
