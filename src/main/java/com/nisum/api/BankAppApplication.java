package com.nisum.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.nisum.api.repository")
public class BankAppApplication {

	public static void main(String [] args) {
		SpringApplication.run(BankAppApplication.class);
	}
}
