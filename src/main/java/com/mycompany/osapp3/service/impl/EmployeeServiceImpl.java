package com.mycompany.osapp3.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.osapp3.entity.Employee;
import com.mycompany.osapp3.repository.EmployeeRepository;
import com.mycompany.osapp3.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository repository;
	
	@Transactional
	public Long count() 
	{
		return repository.count();
	}

	@Transactional
	public List<Employee> findAll() 
	{
		return repository.findAll();
	}


}
