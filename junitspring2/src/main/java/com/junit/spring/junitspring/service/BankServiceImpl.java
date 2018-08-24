package com.junit.spring.junitspring.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;
import com.junit.spring.junitspring.dao.Bankdao;
import com.junit.spring.junitspring.pojo.Customer;

@Component
public class BankServiceImpl implements BankService {

	Bankdao dao;
//ArrayList<Customer>list=new ArrayList<>();
	@Override
	public void updateCustomerId(Customer customer, String customerId) {
		dao.save(customer);
	}

	@Override
	public List<Customer> viewAll() {

	return dao.findAll();
	}

	@Override
	public void addNewCustomer(Customer customer) {
		dao.save(customer);
	
	}

	@Override
	public Optional<Customer> getCustomerById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
