package com.learn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.learn.models.Users;

@Service
public class UserService {
	List<Users> list = new ArrayList<Users>();

	public UserService() {
		list.add(new Users ("abc", "abc" , "abc@gmail.com"));
		list.add(new Users ("ab", "ab" , "ab@gmail.com"));
		list.add(new Users ("a", "a" , "a@gmail.com"));
	}
	
	//get all users
	public List<Users> getAllUsers(){
		return this.list;
	}
	
	//get single user
	public Users getUser(String uname) {
		return this.list.stream().filter((user)->user.getUname().equals(uname)).findAny().orElse(null);
		
	}
	
	//add new user
	public Users addUser(Users user) {
		this.list.add(user);
		return user;
		
	}
	 

}
