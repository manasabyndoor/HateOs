package com.bank.app.SpringHateOs.service;

import java.util.List;
import java.util.Optional;

import com.bank.app.SpringHateOs.pojo.Customer;

public interface BankService {
	
	
	public List<Customer> viewAll();
	public void addNewCustomer(Customer customer);
	public Optional<Customer> getCustomerById(String id) ;
	public void updateCustomerId(Customer customer,String customerId) ;
}
