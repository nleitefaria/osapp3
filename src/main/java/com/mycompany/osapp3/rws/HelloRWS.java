package com.mycompany.osapp3.rws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRWS 
{
	private static final Logger logger = LoggerFactory.getLogger(HelloRWS.class);
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ResponseEntity<String> hello() {
		logger.info("Saying Hello");
		return new ResponseEntity<String>("HI", HttpStatus.OK);
	}

}
