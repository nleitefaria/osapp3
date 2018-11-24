package com.mycompany.osapp3.rws;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.mycompany.osapp3.dto.ProjectDTO;
import com.mycompany.osapp3.service.ProjectService;

@RestController
public class ProjectRWS 
{
	private static final Logger logger = LoggerFactory.getLogger(ProjectRWS.class);
	
	@Autowired
	ProjectService service;
	
	@RequestMapping(value = "/projects/count", method = RequestMethod.GET)
	public ResponseEntity<Long> count() {
		logger.info("@count");
		return new ResponseEntity<Long>(service.count(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/projects", method = RequestMethod.GET)
	public ResponseEntity<List<ProjectDTO>> findAll()
	{		
		return new ResponseEntity<List<ProjectDTO>>(service.findAll(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/project/{id}", method = RequestMethod.GET)
	public ResponseEntity<ProjectDTO> findOne(@PathVariable String id)
	{		
		return new ResponseEntity<ProjectDTO>(service.findOne(id), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/projects/employee/{id}", method = RequestMethod.GET)
	public ResponseEntity<List<ProjectDTO>> findEmolyeesForProject(@PathVariable String id)
	{		
		return new ResponseEntity<List<ProjectDTO>>(service.findProjectsForEmolyee(id), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/project", method = RequestMethod.POST)
	public ResponseEntity<ProjectDTO> save(@RequestBody ProjectDTO projectDTO)
	{
		logger.info("Creating entity");
		return new ResponseEntity<ProjectDTO>(service.save(projectDTO), HttpStatus.CREATED);
	}

}
