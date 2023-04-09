package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees/")
public class EmployeeController {

	public EmployeeController() {
		super();
	}

	@GetMapping("/hi")
	public String getHiii() {
		return "hiiiiii";
	}
	

}
