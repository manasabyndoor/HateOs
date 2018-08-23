package com.bank.app.SpringHateOs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.core.io.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bank.SpringHateOs.dao.Bankdao;
import com.bank.app.SpringHateOs.pojo.Customer;
@Component
public class BankServiceImpl implements BankService{

	Bankdao dao;
	
	
/*	
public List<Customer> viewAll()
{
	
	return ((JpaRepository) dao).findAll();
	
}*/



@Override
public void addNewCustomer(Customer customer) {
	dao.save(customer);
	
}



@Override
public Optional<Customer> getCustomerById(String id) {
	
	return dao.findById(Integer.parseInt(id));
}



@Override
public void updateCustomerId(Customer customer, String customerId) {
	dao.save(customer);
}



@Override
public List<Customer> viewAll() {
	
	return dao.findAll();
}

/*
public void addNewCustomer(Customer customer) {
	 dao.save(customer);
}


public Optional getCustomerById(String customerId){
	return dao.findById(customerId);
}


public void updateCustomerId(Customer customer, String customerId) {
	 dao.updateCustomerId(customer,customerId);
}*/





	
}
