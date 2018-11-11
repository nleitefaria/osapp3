package com.mycompany.osapp3.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.osapp3.entity.Role;
import com.mycompany.osapp3.repository.RoleRepository;
import com.mycompany.osapp3.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService 
{
	@Autowired
	private RoleRepository repository;
	
	@Transactional
	public Long count() 
	{
		return repository.count();
	}

	@Transactional
	public List<Role> findAll() 
	{
		return repository.findAll();
	}


}
