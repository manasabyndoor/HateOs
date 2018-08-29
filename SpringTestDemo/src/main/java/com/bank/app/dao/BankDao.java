package com.bank.app.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.app.pojo.Customer;

@Repository
public interface BankDao extends JpaRepository <Customer,Integer>{
 
 
}
