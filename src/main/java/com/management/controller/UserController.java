package com.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.management.service.EmployeeDetailsService;



@RestController
public class UserController {
	
	@Autowired
	EmployeeDetailsService userDetailsService;
	
	
	/*@RequestMapping("/getUserDetails")
	public List<User> getUserDetails(@RequestBody UserRequest userRequest) {
		
		System.out.println("Swapnilo "+ userRequest.getFirstName());
		return userDetailsService.listAllUsers();
	}*/

}
