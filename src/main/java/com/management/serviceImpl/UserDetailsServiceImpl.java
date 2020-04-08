package com.management.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.dao.UserDetailsDao;
import com.management.model.User;
import com.management.service.UserDetailsService;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserDetailsDao userDetailsDao;
	
	@Override
	public List<User> listAllUsers() {
		return userDetailsDao.listAllUsers();
	}

	
}
