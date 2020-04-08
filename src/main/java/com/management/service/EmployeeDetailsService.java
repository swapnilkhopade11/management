package com.management.service;

import java.util.List;

import com.management.entity.EmployeeEntity;
import com.management.exception.RecordNotFoundException;

public interface EmployeeDetailsService {

	public List<EmployeeEntity> getAllEmployees();

	public EmployeeEntity getEmployeeById(Long id) throws RecordNotFoundException;

	public EmployeeEntity createOrUpdateEmployee(EmployeeEntity entity) throws RecordNotFoundException;

	public void deleteEmployeeById(Long id) throws RecordNotFoundException;
}
