package com.tap.emloyeemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

//its a combination of @configuration,@AutoEnableSpringApplication
//@ComponentScan this is @SpringBootApplication

public class EmloyeemanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmloyeemanagementApplication.class, args);
	}

}
