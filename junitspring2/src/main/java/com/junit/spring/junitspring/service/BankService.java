package com.junit.spring.junitspring.service;

import java.util.List;
import java.util.Optional;

import com.junit.spring.junitspring.pojo.Customer;

public interface BankService {
	
	
	public List<Customer> viewAll();
	public void addNewCustomer(Customer customer);
	public Optional<Customer> getCustomerById(String id) ;
	public void updateCustomerId(Customer customer,String customerId) ;
}
