package com.mycompany.osapp3.rws;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.osapp3.entity.Employee;
import com.mycompany.osapp3.service.EmployeeService;

@RestController
@CrossOrigin(origins = {"http://localhost:3000", "https://nleitefaria.github.io/ghp-app3/#/"}) 
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
	public ResponseEntity<List<Employee>> findAll()	
	{		
		return new ResponseEntity<List<Employee>>(service.findAll(), HttpStatus.OK);
	}


}
