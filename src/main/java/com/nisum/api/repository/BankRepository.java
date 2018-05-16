package com.nisum.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.nisum.api.model.Bank;

public interface BankRepository extends CrudRepository<Bank, String>{}
