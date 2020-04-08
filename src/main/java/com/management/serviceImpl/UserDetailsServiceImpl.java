package com.management.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.dao.EmployeeDetailsDao;
import com.management.entity.EmployeeEntity;
import com.management.exception.RecordNotFoundException;
import com.management.service.EmployeeDetailsService;

@Service
public class UserDetailsServiceImpl implements EmployeeDetailsService {

	@Autowired
	EmployeeDetailsDao userDetailsDao;

	@Override
	public List<EmployeeEntity> getAllEmployees() {
		// TODO Auto-generated method stub
		return userDetailsDao.getAllEmployees();
	}

	@Override
	public EmployeeEntity getEmployeeById(Long id) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		return userDetailsDao.getEmployeeById(id);
	}

	@Override
	public EmployeeEntity createOrUpdateEmployee(EmployeeEntity entity) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		return userDetailsDao.createOrUpdateEmployee(entity);
	}

	@Override
	public void deleteEmployeeById(Long id) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		userDetailsDao.deleteEmployeeById(id);
		
	}
	
	

	
}
