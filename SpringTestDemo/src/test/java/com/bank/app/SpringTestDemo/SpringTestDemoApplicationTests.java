package com.bank.app.SpringTestDemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootApplication
public class SpringTestDemoApplicationTests {

	/*@Test
	public void contextLoads() {
		
	}*/
	protected Logger logger = LoggerFactory.getLogger(this.getClass());

}
