package com.example.demo.controller;

import java.util.List;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

	@Autowired
	private UserService userService;


	@GetMapping(value = "/findby/{id}", produces = "application/json")
	public UserDto getUserById(@PathVariable int id) {
		return userService.findUserbyId(id);
	}


	@DeleteMapping("deletebyid/{id}")
	@ApiParam(value= "test value", required = true)
	public void deleteById(@PathVariable int id) {
		userService.deleteById(id);
	}

	@ApiOperation(value = "retrieves a list of all users", notes = "saves to h2 database which will be wiped clean if you restart the API")
	@GetMapping("/get/all/users")
	public List<UserDto> findAllUsers() {
		return userService.findAllUsers();
	}

	@GetMapping("/Number")
	@ApiOperation(value = "test value")
	public int doSomething(int a) {
		return 42;
	}

}
