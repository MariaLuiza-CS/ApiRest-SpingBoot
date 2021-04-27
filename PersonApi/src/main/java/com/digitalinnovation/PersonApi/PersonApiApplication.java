package com.digitalinnovation.PersonApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class PersonApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonApiApplication.class, args);
	}

}
