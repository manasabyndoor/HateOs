package com.bank.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.bank.app.pojo.Customer;
import com.bank.app.service.BankServiceImpl;

@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class,args);
    }
    
    @Bean
    public CommandLineRunner initialer(BankServiceImpl service) {
    	return (arg)-> {
    		service.addNewCustomer(new Customer("12","fs"));
    		service.addNewCustomer(new Customer("13","sdf"));
    		service.addNewCustomer(new Customer("14","fs"));
    		service.addNewCustomer(new Customer("15","sdf"));
    		service.addNewCustomer(new Customer("16","fs"));
    		service.addNewCustomer(new Customer("17","sdf"));
    		service.addNewCustomer(new Customer("18","fs"));
    		service.addNewCustomer(new Customer("19","sdf"));
    		service.addNewCustomer(new Customer("10","fs"));
    		service.addNewCustomer(new Customer("1","sdf"));
    		service.addNewCustomer(new Customer("2","fs"));
    		service.addNewCustomer(new Customer("3","sdf"));
    		
    		
    	};
    }
}
