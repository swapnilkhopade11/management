package com.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.model.User;
import com.management.model.UserRequest;
import com.management.service.UserDetailsService;



@RestController
public class UserController {
	
	@Autowired
	UserDetailsService userDetailsService;
	
	
	@RequestMapping("/getUserDetails")
	public List<User> getUserDetails(@RequestBody UserRequest userRequest) {
		
		System.out.println("Swapnilo "+ userRequest.getFirstName());
		return userDetailsService.listAllUsers();
	}

}
