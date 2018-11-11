package com.mycompany.osapp3.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.osapp3.entity.Platoon;
import com.mycompany.osapp3.repository.PlatoonRepository;
import com.mycompany.osapp3.service.PlatoonService;

@Service
public class PlatoonServiceImpl implements PlatoonService 
{
	@Autowired
	private PlatoonRepository repository;
	
	@Transactional
	public Long count() 
	{
		return repository.count();
	}

	@Transactional
	public List<Platoon> findAll() 
	{
		return repository.findAll();
	}


}
