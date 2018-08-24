package com.junit.spring.junitspring.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.junit.spring.junitspring.pojo.Customer;
@Repository
public interface Bankdao extends JpaRepository<Customer,Integer>{

}
