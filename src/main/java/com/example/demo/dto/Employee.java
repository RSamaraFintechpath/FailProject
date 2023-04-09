package com.example.demo.dto;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	private String firstName;
	private String lastName;
	private String email;
	private int phoneNumber;
	private int age;
	
}
