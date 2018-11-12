package com.mycompany.osapp3.rws;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.osapp3.dto.EmployeeDTO;

import com.mycompany.osapp3.service.EmployeeService;

@RestController
public class EmployeeRWS {
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeRWS.class);

	@Autowired
	EmployeeService service;
	
	@RequestMapping(value = "/employees/count", method = RequestMethod.GET)
	public ResponseEntity<Long> count() {
		logger.info("@count");
		return new ResponseEntity<Long>(service.count(), HttpStatus.OK);
	}

	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public ResponseEntity<List<EmployeeDTO>> findAll()	
	{		
		return new ResponseEntity<List<EmployeeDTO>>(service.findAll(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
	public ResponseEntity<EmployeeDTO> findOne(@PathVariable String id)
	{		
		return new ResponseEntity<EmployeeDTO>(service.findOne(id), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/employees/project/{id}", method = RequestMethod.GET)
	public ResponseEntity<List<EmployeeDTO>> findEmolyeesForProject(@PathVariable String id)
	{		
		return new ResponseEntity<List<EmployeeDTO>>(service.findEmolyeesForProject(id), HttpStatus.OK);
	}
	
	/*
	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public ResponseEntity<Employee> save(@RequestBody EmployeeDTO employeeDTO)
	{
		logger.info("Creating entity");
		return new ResponseEntity<Employee>(service.save(employeeDTO), HttpStatus.CREATED);
	}
	*/


}
