package com.management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.management.model.User;

public interface UserDetailsService {

	public List<User> listAllUsers();
}
