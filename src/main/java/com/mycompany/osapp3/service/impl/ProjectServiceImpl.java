package com.mycompany.osapp3.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	public List<Project> findAll() 
	{
		return repository.findAll();
	}

}
