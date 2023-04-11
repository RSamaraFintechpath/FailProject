package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FailProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FailProjectApplication.class, args);
	}
    
	public int calculateSomething(int x) {
		return x + 3;
	}
}
