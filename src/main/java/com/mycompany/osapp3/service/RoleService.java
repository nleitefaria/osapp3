package com.mycompany.osapp3.service;

import java.util.List;

import com.mycompany.osapp3.entity.Role;

public interface RoleService 
{
	Long count() ;
	List<Role> findAll();

}
