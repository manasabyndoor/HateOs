package com.bank.app.SpringHateOs.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bank.app.SpringHateOs.pojo.Customer;
import com.bank.app.SpringHateOs.service.BankServiceImpl;

@RestController
public class BankController {
	@Autowired
	BankServiceImpl service;

	@RequestMapping("/view")
	public List<Customer> viewAll() {
		System.out.println(service.viewAll());
		return service.viewAll();
	}
	

	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/view/{start}/{count}",method=RequestMethod.GET)
	public Resources getCustomerByPages(@PathVariable int start,@PathVariable int count) {
		
		List<Customer> tempCustomer=service.viewAll();
		List<Customer> customer=new ArrayList<>();
		for(int i=start;i<start+count;i++) {
			customer.add(tempCustomer.get(i));
		}

		Link nextLink=linkTo(methodOn(this.getClass()).getCustomerByPages(start+count,count)).withRel("nextlink");
		Link prevLink=linkTo(methodOn(this.getClass()).getCustomerByPages(start-count>=0?start-count:1,count)).withRel("prevlink");
		return new Resources<>(customer,nextLink,prevLink);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/add") 
	public void addNewCustomer(@RequestBody Customer customer) {
		service.addNewCustomer(customer);
	}

	@RequestMapping("/view/{customerId}")
	public Optional<Customer> getCustomerById(@PathVariable String customerId) {
		return service.getCustomerById((customerId));

	}
	@RequestMapping(method=RequestMethod.PUT,value="/update/{customerId}")
	public void updateById(@RequestBody Customer customer,@PathVariable String customerId) {
		service.updateCustomerId(customer,customerId);
	}
	
	

}
