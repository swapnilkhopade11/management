package com.management.dao;

import java.util.List;
import com.management.entity.EmployeeEntity;
import com.management.exception.RecordNotFoundException;

public interface EmployeeDetailsDao {
	
	public List<EmployeeEntity> getAllEmployees();

	public EmployeeEntity getEmployeeById(Long id) throws RecordNotFoundException;

	public EmployeeEntity createOrUpdateEmployee(EmployeeEntity entity) throws RecordNotFoundException;

	public void deleteEmployeeById(Long id) throws RecordNotFoundException;

}
