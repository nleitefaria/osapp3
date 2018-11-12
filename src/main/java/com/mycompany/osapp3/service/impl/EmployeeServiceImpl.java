package com.mycompany.osapp3.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.osapp3.dto.EmployeeDTO;
import com.mycompany.osapp3.entity.Employee;
import com.mycompany.osapp3.entity.EmployeeProject;
import com.mycompany.osapp3.entity.Project;
import com.mycompany.osapp3.repository.EmployeeRepository;
import com.mycompany.osapp3.repository.PlatoonRepository;
import com.mycompany.osapp3.repository.ProjectRepository;
import com.mycompany.osapp3.repository.RoleRepository;
import com.mycompany.osapp3.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository repository;
	
	@Autowired
	private ProjectRepository repository1;
	
	@Transactional
	public Long count() 
	{
		return repository.count();
	}

	@Transactional
	public List<EmployeeDTO> findAll() 
	{
		List<EmployeeDTO> ret = new ArrayList<EmployeeDTO>();		
		EmployeeDTO empoyeeDTO;
		for(Employee e : repository.findAll())
		{
			empoyeeDTO = new EmployeeDTO(e.getId(), e.getName(), e.getStartDate().toString(), e.getPlatoon().getName(), e.getRole().getName());
			ret.add(empoyeeDTO);
		}		
		return ret;
	}
	
	@Transactional
	public EmployeeDTO findOne(String id)
	{
		Employee e = repository.findOne(Integer.parseInt(id));
		EmployeeDTO empoyeeDTO = new EmployeeDTO(e.getId(), e.getName(), e.getStartDate().toString(), e.getPlatoon().getName(), e.getRole().getName());	  
		return empoyeeDTO;
	}
	
	@Transactional
	public List<EmployeeDTO> findEmolyeesForProject(String id)
	{
		List<EmployeeDTO> ret = new ArrayList<EmployeeDTO>();
		Project project = repository1.findOne(Integer.parseInt(id));		
		Iterator iterator = project.getEmployeeProjects().iterator();
		while(iterator.hasNext())
		{
			EmployeeProject ep = (EmployeeProject) iterator.next();			
			EmployeeDTO empoyeeDTO = new EmployeeDTO(ep.getEmployee().getId(), ep.getEmployee().getName(), ep.getEmployee().getStartDate().toString(), ep.getEmployee().getPlatoon().getName(), ep.getEmployee().getRole().getName());	   			
			ret.add(empoyeeDTO);			
		}		
		return ret;
	}
	
	/*
	@Transactional
	public EmployeeDTO save(EmployeeDTO employeeDTO)
	{	
		Platoon platoon = repository1.findOne(employeeDTO.getPlatoonId());
		Role role = repository2.findOne(employeeDTO.getRoleId());
		Employee employee = new Employee(platoon, role, employeeDTO.getName(), employeeDTO.getStartDate());
		return repository.save(employee);	
	}
	*/
}
