package com.management.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.management.model.User;
import com.management.service.UserDetailsService;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Override
	public List<User> listAllUsers() {
		List<User> userList = new ArrayList<>();
		User user = new User();
		user.setAddress("dombivali");
		user.setAge(31);
		user.setFirstName("swapnil");
		user.setLastName("khopade");
		user.setRole("admin");
		userList.add(user);
		return userList;
	}

	
}
