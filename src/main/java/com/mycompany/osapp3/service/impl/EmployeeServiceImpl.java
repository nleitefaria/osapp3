package com.mycompany.osapp3.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.osapp3.dto.EmployeeDTO;
import com.mycompany.osapp3.entity.Employee;
import com.mycompany.osapp3.entity.Platoon;
import com.mycompany.osapp3.entity.Role;
import com.mycompany.osapp3.repository.EmployeeRepository;
import com.mycompany.osapp3.repository.PlatoonRepository;
import com.mycompany.osapp3.repository.RoleRepository;
import com.mycompany.osapp3.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository repository;
	
	@Autowired
	private PlatoonRepository repository1;
	
	@Autowired
	private RoleRepository repository2;
	
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
	
	@Transactional
	public Employee findOne(String id)
	{
		return repository.findOne(Integer.parseInt(id));
	}
	
	@Transactional
	public Employee save(EmployeeDTO employeeDTO)
	{	
		Platoon platoon = repository1.findOne(employeeDTO.getPlatoonId());
		Role role = repository2.findOne(employeeDTO.getRoleId());
		Employee employee = new Employee(platoon, role, employeeDTO.getName(), employeeDTO.getStartDate());
		return repository.save(employee);	
	}
}
