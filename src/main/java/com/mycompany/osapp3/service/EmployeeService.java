package com.mycompany.osapp3.service;

import java.util.List;

import com.mycompany.osapp3.dto.EmployeeDTO;

public interface EmployeeService
{
	Long count() ;
	List<EmployeeDTO> findAll();
	EmployeeDTO findOne(String id);
	List<EmployeeDTO> findEmolyeesForProject(String id);
	//Employee save(Employee employe);

}
