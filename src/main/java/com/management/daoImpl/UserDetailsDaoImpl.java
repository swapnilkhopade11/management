package com.management.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.management.dao.UserDetailsDao;
import com.management.model.User;

@Component
public class UserDetailsDaoImpl implements UserDetailsDao {

	@Override
	public List<User> listAllUsers() {
		List<User> userList = new ArrayList<>();
		User user = new User();
		user.setAddress("KoparKhairne");
		user.setAge(30);
		user.setFirstName("swapnil");
		user.setLastName("khopade");
		user.setRole("admin");
		userList.add(user);
		return userList;
	}

}
