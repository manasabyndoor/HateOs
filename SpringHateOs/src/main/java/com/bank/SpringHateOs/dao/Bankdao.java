package com.bank.SpringHateOs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.app.SpringHateOs.pojo.Customer;
@Repository
public interface Bankdao extends JpaRepository<Customer,Integer>{

}
