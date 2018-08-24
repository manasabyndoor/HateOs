package com.junit.spring.junitspring;


import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.junit.spring.junitspring.pojo.Customer;
import com.junit.spring.junitspring.service.BankService;


@RestController

public class HelloResource {
	BankService service;
	@GetMapping
	public String Hello()
	{
		return "hello";
	}
	@GetMapping(value="/json" ,produces=MediaType.APPLICATION_JSON_VALUE)
	public Customer json() {
		return new Customer("12","manasa");
		
	}
	@GetMapping(value="/view",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> viewAll() {
		
		return service.viewAll();
	}
	

}
