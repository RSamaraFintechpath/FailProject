package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("api/v1/users/")
public class UserController {

	@Autowired
	private UserService userService;

	public UserController(UserService userService) {

		this.userService = userService;
	}

	
	@PostMapping(value = "/newUser", consumes = "application/json", produces = "application/json")
	public UserDto adduser(@RequestBody UserDto userDto) {
		return userService.addUser(userDto);
	}

	
	@ApiParam(value = "the id that you insterted previously in the add endpoint", required = true)
	@GetMapping(value = "/findby/{id}", produces = "application/json")
	public UserDto getUserById(@PathVariable int id) {
		return userService.findUserbyId(id);
	}

	@ApiOperation(value = "deletes a user by his id", notes = "saves to h2 database which will be wiped clean if you restart the API")
	@DeleteMapping("deletebyid/{id}")
	@ApiParam(value = "id that was previously insterted", required = true)
	public void deleteById(@PathVariable int id) {
		userService.deleteById(id);
	}

	@ApiOperation(value = "retrieves a list of all users", notes = "saves to h2 database which will be wiped clean if you restart the API")
	@GetMapping(value = "/getallUsers", produces = "application/json")
	public List<UserDto> findAllUsers() {
		return userService.findAllUsers();
	}

	

}
