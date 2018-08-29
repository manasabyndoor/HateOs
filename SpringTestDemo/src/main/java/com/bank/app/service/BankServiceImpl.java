package com.bank.app.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bank.app.dao.BankDao;

import com.bank.app.pojo.Customer;
@Component
public class BankServiceImpl implements BankService{

   // private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    BankDao dao;
	@Override
	public List<Customer> viewAll() {
		return dao.findAll();
	}
	@Override
	public void addNewCustomer(Customer customer) {
	dao.save(customer);
		
	}
	@Override
	public Customer getCustomerById(Integer id) {
		return dao.findOne(id);
	}
	@Override
	public void updateCustomerId(Customer customer, String customerId) {
		dao.save(customer);
		
	}
	public void deleteCustomer(Customer customer) {
		dao.delete(customer);
		
	}
	
	
	




	
}
