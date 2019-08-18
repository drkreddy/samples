package com.example.testing4;

import javafx.scene.layout.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Testing4Application {
	@Autowired
	PersonService personService;

	public static void main(String[] args) {
		SpringApplication.run(Testing4Application.class, args);

		PersonService te = (PersonService) context.getBean("PersonService");

	}

}
