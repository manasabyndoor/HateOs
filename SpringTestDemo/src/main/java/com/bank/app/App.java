package com.bank.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.bank.app.pojo.Customer;
import com.bank.app.service.BankService;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
	 @Bean
	    public CommandLineRunner loadData(BankService service) {
	    	return(args) -> {
	    		
	    		service.addNewCustomer(new Customer(12,"mansa"));
	    		service.addNewCustomer(new Customer(13,"manasas"));
	    		service.addNewCustomer(new Customer(14,"naksha"));
	    		service.addNewCustomer(new Customer(15,"prathi"));
	    		service.addNewCustomer(new Customer(16,"manj"));
	    	};
	    }
}
