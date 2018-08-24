package com.junit.spring.junitspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.junit.spring.junitspring.pojo.Customer;
import com.junit.spring.junitspring.service.BankServiceImpl;

@SpringBootApplication
public class JunitspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(JunitspringApplication.class, args);}
		
		@Bean
		public CommandLineRunner loadInitialData(BankServiceImpl service) {
			return (args) ->{service.addNewCustomer(new Customer("12","manasa"));
		
	};
}
}