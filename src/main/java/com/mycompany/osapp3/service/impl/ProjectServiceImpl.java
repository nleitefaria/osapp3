package com.mycompany.osapp3.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.osapp3.dto.EmployeeDTO;
import com.mycompany.osapp3.dto.ProjectDTO;
import com.mycompany.osapp3.entity.Employee;
import com.mycompany.osapp3.entity.EmployeeProject;
import com.mycompany.osapp3.entity.Project;
import com.mycompany.osapp3.repository.EmployeeRepository;
import com.mycompany.osapp3.repository.ProjectRepository;
import com.mycompany.osapp3.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService
{
	@Autowired
	private ProjectRepository repository;
	
	@Autowired
	private EmployeeRepository repository1;
	
	@Transactional
	public Long count() 
	{
		return repository.count();
	}

	@Transactional
	public List<ProjectDTO> findAll() 
	{
		List<ProjectDTO> ret = new ArrayList<ProjectDTO>();
		
		ProjectDTO projectDTO;
		for(Project p : repository.findAll())
		{
			projectDTO = new ProjectDTO(p.getId(), p.getName());
			ret.add(projectDTO);
		}
		
		return ret;
	}
	
	@Transactional
	public ProjectDTO findOne(String id)
	{
		Project p = repository.findOne(Integer.parseInt(id));
		ProjectDTO projectDTO = new ProjectDTO(p.getId(), p.getName());	  
		return projectDTO;		
	}
	
	@Transactional
	public List<ProjectDTO> findProjectsForEmolyee(String id)
	{
		List<ProjectDTO> ret = new ArrayList<ProjectDTO>();
		Employee employee = repository1.findOne(Integer.parseInt(id));		
		Iterator iterator = employee.getEmployeeProjects().iterator();
		while(iterator.hasNext())
		{
			EmployeeProject ep = (EmployeeProject) iterator.next();			
			ProjectDTO projectDTO = new ProjectDTO(ep.getProject().getId(), ep.getProject().getName());	  
			ret.add(projectDTO);			
		}		
		return ret;
	}

	@Transactional
	public ProjectDTO save(ProjectDTO projectDTO)
	{
		Project p = new Project(); 
		p.setName(projectDTO.getName());
		repository.save(p);
		return projectDTO;
	}
}
