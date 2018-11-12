package com.mycompany.osapp3.service;

import java.util.List;

import com.mycompany.osapp3.dto.ProjectDTO;

public interface ProjectService 
{
	Long count() ;
	List<ProjectDTO> findAll();
	ProjectDTO findOne(String id);
	ProjectDTO save(ProjectDTO projectDTO);

}
