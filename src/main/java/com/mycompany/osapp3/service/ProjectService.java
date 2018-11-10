package com.mycompany.osapp3.service;

import java.util.List;

import com.mycompany.osapp3.entity.Project;

public interface ProjectService {
	
	Long count() ;
	List<Project> findAll();

}
