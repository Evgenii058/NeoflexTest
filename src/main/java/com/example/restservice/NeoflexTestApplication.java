package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class NeoflexTestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(NeoflexTestApplication.class, args);
	}

}
