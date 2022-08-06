package com.learn.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.learn.models.Users;
import com.learn.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	//all users
	@GetMapping("/")
	public List<Users> getAllUsers()
	{
		return this.userService.getAllUsers();
	}
	
	//return single user
	@GetMapping("/{username}")
	public Users getUser(@PathVariable("username") String username)
	{
		return this.userService.getUser(username);
	}
	
	//add method
	@PostMapping("/")
	public Users add(@RequestBody Users user)
	{
		return this.userService.addUser(user);
	}
	
	

}
