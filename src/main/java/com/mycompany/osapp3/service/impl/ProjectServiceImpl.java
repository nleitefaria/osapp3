package com.mycompany.osapp3.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.osapp3.dto.EmployeeDTO;
import com.mycompany.osapp3.dto.ProjectDTO;
import com.mycompany.osapp3.entity.Employee;
import com.mycompany.osapp3.entity.Project;
import com.mycompany.osapp3.repository.ProjectRepository;
import com.mycompany.osapp3.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService
{
	@Autowired
	private ProjectRepository repository;
	
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
	public ProjectDTO save(ProjectDTO projectDTO)
	{
		Project p = new Project(); 
		p.setName(projectDTO.getName());
		repository.save(p);
		return projectDTO;
	}
}
